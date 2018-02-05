package com.ssyvsse.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssyvsse.dao.IRoleDao;
import com.ssyvsse.dao.IUserDao;
import com.ssyvsse.pojo.JsonResult;
import com.ssyvsse.pojo.Role;
import com.ssyvsse.pojo.User;
import com.ssyvsse.service.IUserService;

/**
 * @author llb
 *
 * @Date 2018年2月4日 下午9:16:56
 */
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Autowired
	private IRoleDao roleDao;

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public User addUser(User user) {
		return userDao.save(user);
	}

	@Override
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}

	@Override
	public JsonResult correlationUserAndRole(String username, String roleName) {
		User user = userDao.findByUsername(username);
		if(user==null){
			return JsonResult.failure("找不到该用户");
		}
		Role role = roleDao.findByRoleName(roleName);
		if(role==null){
			return JsonResult.failure("角色不存在");
		}
		user.setRoleId(role.get_id());
		userDao.save(user);
		return JsonResult.success(user);
	}

}
