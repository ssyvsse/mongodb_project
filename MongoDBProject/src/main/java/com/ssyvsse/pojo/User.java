package com.ssyvsse.pojo;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author llb
 *
 * @Date 2018年2月3日
 */
@TypeAlias("User")
@Document(collection = "user")
public class User {

	private String _id;

	private String username;

	private String password;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
