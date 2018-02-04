package com.ssyvsse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssyvsse.dao.IRoleDao;
import com.ssyvsse.pojo.JsonResult;
import com.ssyvsse.pojo.Role;

/**
 * @author llb
 *
 * @Date 2018年2月4日 下午9:40:03
 */
@Controller
public class RoleController {

	@Autowired
	private IRoleDao roleDao;

	@RequestMapping("/findAllRoles")
	public @ResponseBody JsonResult findAllRoles() {
		List<Role> roleList = roleDao.findAll();
		if (roleList != null && roleList.size() > 0) {
			return JsonResult.success(roleList);
		} else {
			return JsonResult.failure("暂无数据");
		}
	}

	@RequestMapping("/insertRole")
	public @ResponseBody JsonResult insertRole(Role role) {
		Role dbRole = roleDao.findByRoleName(role.getRoleName());
		if (dbRole != null) {
			return JsonResult.failure("角色已存在");
		}
		roleDao.insertRole(role);
		return JsonResult.success(dbRole);
	}

}