package com.bridgeit.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bridgeit.bean.User;

public class UserDaoImp implements UserDao{
   JdbcTemplate template;
	public void ragistermethod(User usr) {
			usr.setName(name);
	}

	public void login(User login) {
		// TODO Auto-generated method stub
		
	}

	public User store(User user) {
		user.setName("");
		user.setPassword("password");
		user.setUserId(null);
		String query="select * from user1 value";
		return user;
	}

}
