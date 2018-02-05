package com.ssyvsse.pojo;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author llb
 *
 * @Date 2018年2月4日 下午9:31:31
 */
@TypeAlias("Role")
@Document(collection = "role")
public class Role {

	private String _id;

	private String roleName;

	private String roleDesc;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

}
