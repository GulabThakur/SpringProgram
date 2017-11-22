package com.bridgeit.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bridgeit.dao.UserDao;
import com.bridgeit.model.UserModel;

@Service
@Transactional
public class UserServiceImp implements UserService {
	@Autowired
	private UserDao userDaoImp;

	public void ragistre(UserModel user) {
	
		userDaoImp.signUp(user);
	}

	public String singUp(String name, String password) {
		String status = userDaoImp.signIn(name, password);
		return status;
	}
}
