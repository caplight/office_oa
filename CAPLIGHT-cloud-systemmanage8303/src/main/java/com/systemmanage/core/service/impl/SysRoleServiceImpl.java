package com.systemmanage.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springcloud.commonapi.entities.SysRoleEntity;
import com.systemmanage.core.dao.SysRoleDao;
import com.systemmanage.core.service.SysRoleService;
import org.springframework.stereotype.Service;

/**
 * @Description 角色业务实现
 * @Author Sans
 * @CreateTime 2019/9/14 15:57
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleDao, SysRoleEntity> implements SysRoleService {

}