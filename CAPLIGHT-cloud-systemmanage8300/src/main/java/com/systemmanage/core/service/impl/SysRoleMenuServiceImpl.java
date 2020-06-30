package com.systemmanage.core.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springcloud.commonapi.entities.SysRoleMenuEntity;
import com.systemmanage.core.dao.SysRoleMenuDao;
import com.systemmanage.core.service.SysRoleMenuService;
import org.springframework.stereotype.Service;

/**
 * @Description 角色与权限业务实现
 * @Author Sans
 * @CreateTime 2019/9/14 15:57
 */
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuDao, SysRoleMenuEntity> implements SysRoleMenuService {

}