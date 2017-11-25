package com.bridgeit.loginAndRagistation.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeit.loginAndRagistation.dao.IuserModelDao;
import com.bridgeit.loginAndRagistation.model.UserModel;

public class UserModelServiceImp  implements IuserModelservice{

	@Autowired
	private IuserModelDao userModelDao;
	
	
	public void singUp(UserModel user) {

		userModelDao.singUp(user);
	}

	
	public String logIn(String email, String password) {
		return userModelDao.singIn(email, password);
	}

}
