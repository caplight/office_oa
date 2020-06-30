package com.springcloud.commonapi.entities;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @Description 用户与角色关系实体
 * @Author Sans
 * @CreateTime 2019/9/14 15:57
 */
@Data
@TableName("sysuserrole")
public class SysUserRoleEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 用户ID
	 */
	private Long userid;
	/**
	 * 角色ID
	 */
	private Long roleid;
}
