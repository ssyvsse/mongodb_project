package com.ssyvsse.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ssyvsse.pojo.User;

/**
 * @author llb
 *
 * @Date 2018年2月3日
 */
@Repository
public interface IUserDao extends MongoRepository<User, Integer> {

	User findByUsername(String username);
	
}
