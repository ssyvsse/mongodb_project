package com.ssyvsse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssyvsse.pojo.JsonResult;
import com.ssyvsse.pojo.User;
import com.ssyvsse.service.IUserService;

/**
 * @author llb
 *
 * @Date 2018年2月4日 下午9:20:33
 */
@Controller
public class UserController {

	@Autowired
	private IUserService userService;

	@RequestMapping("/findAllUsers")
	public @ResponseBody List<User> findAllUsers() {
		return userService.findAll();
	}

	@RequestMapping("/insertUser")
	public @ResponseBody User insert(User user) {
		return userService.addUser(user);
	}

	@RequestMapping("/findByUsername")
	public @ResponseBody User findByUsername(String username) {
		return userService.findByUsername(username);
	}

	@RequestMapping("/correlationUserAndRole")
	public @ResponseBody JsonResult correlationUserAndRole(String username, String roleName) {
		return userService.correlationUserAndRole(username, roleName);
	}

}
