package com.ssyvsse.dao;

import java.util.List;

import com.ssyvsse.pojo.User;

/**
 * @author llb
 *
 * @Date 2018年2月3日
 */
public interface IUserDao {

	List<User> findAll();

	User saveAndFlush(User user);

}
