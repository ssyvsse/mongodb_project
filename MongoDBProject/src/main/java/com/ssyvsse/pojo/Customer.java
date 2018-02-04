package com.ssyvsse.pojo;

import org.springframework.data.annotation.Id;

/**
 * @author llb
 *
 * @Date 2018年2月4日
 */
public class Customer {
	@Id
	public String id;

	public String firstName;
	public String lastName;

	public Customer() {
	}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%s, firstName='%s', lastName='%s']", id, firstName, lastName);
	}
}
