package com.bridgeit.service;

import java.util.List;

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

	public UserModel singUp(String name, String password) {
		UserModel status = userDaoImp.signIn(name, password);
		return status;
	}
}
