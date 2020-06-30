package com.systemmanage.core.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springcloud.commonapi.entities.SysMenuEntity;
import com.springcloud.commonapi.entities.SysRoleEntity;
import com.springcloud.commonapi.entities.SysUserEntity;
import com.systemmanage.core.dao.SysUserDao;
import com.systemmanage.core.service.SysUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * @Description 系统用户业务实现
 * @Author Sans
 * @CreateTime 2019/9/14 15:57
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUserEntity> implements SysUserService {

    @Resource
    private SysUserDao sysUserDao;

    /**
     * 根据用户名查询实体
     * @Author Sans
     * @CreateTime 2019/9/14 16:30
     * @Param  username 用户名
     * @Return SysUserEntity 用户实体
     */
    @Override
    public SysUserEntity selectUserByName(String username) {
        QueryWrapper<SysUserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(SysUserEntity::getUsername,username);
        return this.baseMapper.selectOne(queryWrapper);
    }
    /**
     * 通过用户ID查询角色集合
     * @Author Sans
     * @CreateTime 2019/9/18 18:01
     * @Param  userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    @Override
    public List<SysRoleEntity> selectSysRoleByUserId(Long userId) {
        return this.baseMapper.selectSysRoleByUserId(userId);
    }

    /**
     * 根据用户ID查询权限集合
     * @Author Sans
     * @CreateTime 2019/9/18 18:01
     * @Param userId 用户ID
     * @Return List<SysMenuEntity> 角色名集合
     */
    @Override
    public List<SysMenuEntity> selectSysMenuByUserId(Long userId) {
        return this.baseMapper.selectSysMenuByUserId(userId);
    }

    @Override
    public int addUser(SysUserEntity sysUserEntity) {
        return sysUserDao.addUser(sysUserEntity);
    }

    @Override
    public int deleteUserByUsername(String username) {
        return sysUserDao.deleteUserByUsername(username);
    }

    @Override
    public int empowerUser(Long userId, Long roleId) {
        return sysUserDao.empowerUser(userId,roleId);
    }
}