package com.systemmanage.controller;

import com.springcloud.commonapi.entities.SysUserEntity;
import com.systemmanage.common.util.ResultUtil;
import com.springcloud.commonapi.entities.SysMenuEntity;
import com.systemmanage.core.service.SysMenuService;
import com.systemmanage.core.service.SysUserService;
import com.systemmanage.security.entity.SelfUserEntity;
import com.systemmanage.security.service.SelfUserDetailsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 普通用户
 * @Author CAPLIGHT
 */
@RestController
@RequestMapping("/system/user")
public class UserController {

    @Autowired
    private SysMenuService sysMenuService;

    @Autowired
    private SysUserService sysUserService;

    /**
     * 用户端信息
     * @Author Sans
     * @CreateTime 2019/10/2 14:52
     * @Return Map<String,Object> 返回数据MAP
     */
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public Map<String,Object> userLogin(){
        Map<String,Object> result = new HashMap<>();
        SelfUserEntity userDetails = (SelfUserEntity) SecurityContextHolder.getContext().getAuthentication() .getPrincipal();
        result.put("title","用户端信息");
        result.put("data",userDetails);
        return ResultUtil.resultSuccess(result);
    }

    /**
     * 拥有USER角色和sys:user:info权限可以访问
     * @Author Sans
     * @CreateTime 2019/10/2 14:22
     * @Return Map<String,Object> 返回数据MAP
     */
    @PreAuthorize("hasRole('USER') and hasPermission('/user/menuList','sys:user:info')")
    @RequestMapping(value = "/menuList",method = RequestMethod.GET)
    public Map<String,Object> sysMenuEntity(){
        Map<String,Object> result = new HashMap<>();
        List<SysMenuEntity> sysMenuEntityList = sysMenuService.list();
        result.put("title","拥有USER角色和sys:user:info权限可以访问");
        result.put("data",sysMenuEntityList);
        return ResultUtil.resultSuccess(result);
    }

    @PostMapping(value = "/register")
    public Map<String,Object> registerUser(@Param("username") String username,@Param(value = "password") String password){
        BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
        SysUserEntity sysUserEntity=new SysUserEntity();
        sysUserEntity.setPassword(bCryptPasswordEncoder.encode(password));
        sysUserEntity.setUsername(username);
        int flag=sysUserService.addUser(sysUserEntity);
        Map<String,Object> result = new HashMap<>();
        if (flag==1){
            result.put("mes","注册成功请登录");
            return ResultUtil.resultSuccess(result);
        }else {
            result.put("mes","注册失败");
            return ResultUtil.resultError(result);
        }
    }
}
