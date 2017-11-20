package com.bridgeit.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgeit.dao.UserDaoImp;
import com.bridgeit.model.UserModel;
@Service
public class UserServiceImp implements UserService{
	@Autowired
	private UserDaoImp userDaoImp;
	
	public void ragistre(UserModel user) {
		userDaoImp.signUp(user);
	}
}
