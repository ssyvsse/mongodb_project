package com.ssyvsse.dao;

import java.util.List;

import com.ssyvsse.pojo.Role;

/**
 * @author llb
 *
 * @Date 2018年2月4日 下午9:33:16
 */
public interface IRoleDao {

	List<Role> findAll();

	void insertRole(Role role);

	Role findByRoleName(String roleName);

}
