package com.ssyvsse.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.ssyvsse.dao.IRoleDao;
import com.ssyvsse.pojo.Role;

/**
 * @author llb
 *
 * @Date 2018年2月4日 下午9:34:32
 */
@Component
public class RoleDaoImpl implements IRoleDao {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<Role> findAll() {
		return mongoTemplate.findAll(Role.class);
	}

	@Override
	public void insertRole(Role role) {
		mongoTemplate.save(role);
	}

	@Override
	public Role findByRoleName(String roleName) {
		return mongoTemplate.findOne(Query.query(Criteria.where("roleName").is(roleName)), Role.class);
	}

}
