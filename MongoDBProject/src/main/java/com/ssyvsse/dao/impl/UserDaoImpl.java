package com.ssyvsse.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.ssyvsse.dao.IUserDao;
import com.ssyvsse.pojo.User;

/**
 * @author llb
 *
 * @Date 2018年2月3日
 */
@Component
public class UserDaoImpl implements IUserDao{

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public List<User> findAll() {
		Query query = new Query();
		List<User> userList = mongoTemplate.find(query, User.class);
		return null;
	}

	@Override
	public User saveAndFlush(User user) {
		return null;
	}

}
