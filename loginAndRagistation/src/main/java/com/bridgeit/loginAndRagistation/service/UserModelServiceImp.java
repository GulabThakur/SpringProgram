package com.bridgeit.loginAndRagistation.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeit.loginAndRagistation.dao.IuserModelDao;
import com.bridgeit.loginAndRagistation.model.UserModel;

/**
 * @author GulabThakur
 * @implements IuserModelInterface
 */
public class UserModelServiceImp implements IuserModelservice {

	@Autowired
	private IuserModelDao userModelDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bridgeit.loginAndRagistation.service.IuserModelservice#singUp(com.
	 * bridgeit.loginAndRagistation.model.UserModel)
	 */
	public void singUp(UserModel user) {

		userModelDao.singUp(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bridgeit.loginAndRagistation.service.IuserModelservice#logIn(java.lang.
	 * String, java.lang.String)
	 */
	public String logIn(String email, String password) {
		return userModelDao.singIn(email, password);
	}

}
