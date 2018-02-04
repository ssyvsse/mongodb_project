package com.ssyvsse.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ssyvsse.pojo.Customer;

/**
 * @author llb
 *
 * @Date 2018年2月4日
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

	
	Customer findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);
}
