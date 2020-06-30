package com.systemmanage.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.systemmanage.common.handler.AdminControllerHandler;
import com.systemmanage.common.util.ResultUtil;
import com.systemmanage.common.util.SecurityUtil;
import com.springcloud.commonapi.entities.SysMenuEntity;
import com.springcloud.commonapi.entities.SysRoleEntity;
import com.springcloud.commonapi.entities.SysUserEntity;
import com.systemmanage.core.service.SysMenuService;
import com.systemmanage.core.service.SysRoleService;
import com.systemmanage.core.service.SysUserService;
import com.systemmanage.security.entity.SelfUserEntity;
import com.systemmanage.security.service.SelfUserDetailsService;
import java.io.File;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 管理端
 * @Author CAPLIGHT
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private SysMenuService sysMenuService;

    @Autowired
    private SelfUserDetailsService selfUserDetailsService;

    /**
     * 管理端信息
     * @Author CAPLIGHT
     */
    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public Map<String,Object> userLogin(){
        Map<String,Object> result = new HashMap<>();
        SelfUserEntity userDetails = SecurityUtil.getUserInfo();
        result.put("title","管理端信息");
        result.put("data",userDetails);
        return ResultUtil.resultSuccess(result);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping(value = "/delete")
    public Map<String,Object> deleteUser(@Param(value = "username")String username){
        if ("error".equals(username)){
            throw new NullPointerException();
        }
        Map<String,Object> result=new HashMap<>();
        // 查询用户是否存在
        SelfUserEntity userInfo = selfUserDetailsService.loadUserByUsername(username);
        if (userInfo == null) {
            result.put("mes","无此账户");
            return ResultUtil.resultError(result);
        }
        int flag=sysUserService.deleteUserByUsername(username);
        if (flag==1){
        result.put("mes","删除成功");
        return ResultUtil.resultSuccess(result);
        }else{
            result.put("mes","请联系管理员");
            return ResultUtil.resultError(result);
        }
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping(value = "/empower")
    public Map<String,Object> empowerByUserName(@Param(value = "username")String username,@Param(value = "role")String role){
        Map<String,Object> result=new HashMap<>();
        Long roleId= 0L;
        if ("普通用户".equals(role)){
            roleId=2L;
        }else if ("管理员".equals(role)){
            roleId=1L;
        }
        // 查询用户是否存在
        SelfUserEntity userInfo = selfUserDetailsService.loadUserByUsername(username);
        if (userInfo == null) {
            result.put("mes","无此账户");
            return ResultUtil.resultError(result);
        }else {
            Long userId=userInfo.getUserid();
            int flag=sysUserService.empowerUser(userId,roleId);
            if (flag==1){
                result.put("mes","授权成功");
                return ResultUtil.resultSuccess(result);
            }else {
                result.put("mes","授权失败");
                return ResultUtil.resultError(result);
            }
        }
    }
    /**
     * 拥有ADMIN或者USER角色可以访问
     * @Author CAPLIGHT
     */
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Map<String,Object> list(){
        Map<String,Object> result = new HashMap<>();
        List<SysUserEntity> sysUserEntityList = sysUserService.list();
        result.put("title","拥有用户或者管理员角色都可以查看");
        result.put("data",sysUserEntityList);
        return ResultUtil.resultSuccess(result);
    }

    /**
     * 拥有ADMIN和USER角色可以访问
     * @Author CAPLIGHT
     */
    @PreAuthorize("hasRole('ADMIN') and hasRole('USER')")
    @RequestMapping(value = "/menuList",method = RequestMethod.GET)
    public Map<String,Object> menuList(){
        Map<String,Object> result = new HashMap<>();
        List<SysMenuEntity> sysMenuEntityList = sysMenuService.list();
        result.put("title","拥有用户和管理员角色都可以查看");
        result.put("data",sysMenuEntityList);
        return ResultUtil.resultSuccess(result);
    }


    /**
     * 拥有sys:user:info权限可以访问
     * hasPermission 第一个参数是请求路径 第二个参数是权限表达式
     * @Author CAPLIGHT
     */
    @PreAuthorize("hasPermission('/admin/userList','sys:user:info')")
    @RequestMapping(value = "/userList",method = RequestMethod.GET)
    @SentinelResource(value = "userList",blockHandlerClass = AdminControllerHandler.class,blockHandler = "userListHandler")
    public Map<String,Object> userList(){
        Map<String,Object> result = new HashMap<>();
        List<SysUserEntity> sysUserEntityList = sysUserService.list();
        result.put("title","拥有sys:user:info权限都可以查看");
        result.put("data",sysUserEntityList);
        return ResultUtil.resultSuccess(result);
    }


    /**
     * 拥有ADMIN角色和sys:role:info权限可以访问
     * @Author CAPLIGHT
     */
    @PreAuthorize("hasRole('ADMIN') and hasPermission('/admin/adminRoleList','sys:role:info')")
    @RequestMapping(value = "/adminRoleList",method = RequestMethod.GET)
    public Map<String,Object> adminRoleList(){
        Map<String,Object> result = new HashMap<>();
        List<SysRoleEntity> sysRoleEntityList = sysRoleService.list();
        result.put("title","拥有ADMIN角色和sys:role:info权限可以访问");
        result.put("data",sysRoleEntityList);
        return ResultUtil.resultSuccess(result);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/saveDateBase")
    public Map<String,Object> saveDateBase(){
        Map<String,Object> result=new HashMap<>();
        String filePath="D:\\saveDateBase";
        String dbName="kyz";
        String username="root";
        String password="dearlover1";
        File uploadDir = new File(filePath);
        logger.info("==========正在备份数据库！===========");
        if (!uploadDir.exists()) {
            uploadDir.mkdirs();
        }
        String cmd = "cmd /c mysqldump" +  " -u " + username + " -p" + password + " " + dbName  + " -r "
                + filePath + "/" + dbName+ ".sql";
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            logger.info("备份数据库成功!!!");
            logger.info("时间:"+new Date());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        result.put("mes","备份数据库成功!!!");
        return ResultUtil.resultSuccess(result);
    }
}