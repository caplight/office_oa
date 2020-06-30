package com.springcloud.commonapi.entities;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @Description 角色实体
 * @Author Sans
 * @CreateTime 2019/9/14 15:57
 */
@Data
@TableName("sysrole")
public class SysRoleEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 角色ID
	 */
	@TableId
	private Long roleid;
	/**
	 * 角色名称
	 */
	private String rolename;
}
