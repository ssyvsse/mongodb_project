package com.ssyvsse.service;

import java.util.List;

import com.ssyvsse.pojo.JsonResult;
import com.ssyvsse.pojo.User;

/**
 * @author llb
 *
 * @Date 2018年2月4日 下午9:16:24
 */
public interface IUserService {

	public List<User> findAll();

	public User addUser(User user);

	public User findByUsername(String username);

	public JsonResult correlationUserAndRole(String username, String roleName);
}
