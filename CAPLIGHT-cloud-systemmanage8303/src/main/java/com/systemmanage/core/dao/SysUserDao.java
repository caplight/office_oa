package com.systemmanage.core.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springcloud.commonapi.entities.SysMenuEntity;
import com.springcloud.commonapi.entities.SysRoleEntity;
import com.springcloud.commonapi.entities.SysUserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {

    @Select("SELECT sr.* FROM sysrole sr LEFT JOIN sysuserrole se ON se.roleid = sr.roleid WHERE se.userid = #{userId}")
    List<SysRoleEntity> selectSysRoleByUserId(@Param(value = "userId") Long userId);

    @Select("SELECT DISTINCT m.* FROM sysuserrole ur LEFT JOIN sysrolemenu rm ON ur.roleid = rm.roleid LEFT JOIN sysmenu m ON rm.menuid = m.menuid WHERE ur.userid = #{userId}")
    List<SysMenuEntity> selectSysMenuByUserId(@Param(value = "userId") Long userId);

    @Insert("INSERT INTO sysuser(username,`password`,`status`) VALUES('${username}','${password}','NORMAL');")
    int addUser(SysUserEntity sysUserEntity);

    @Delete("DELETE FROM sysuser WHERE username='${username}'")
    int deleteUserByUsername(@Param("username") String username);

    @Insert("INSERT INTO sysuserrole(userid,roleid)VALUES(${userId},${roleId})")
    int empowerUser(@Param("userId") Long userId,@Param("roleId") Long roleId);
}
