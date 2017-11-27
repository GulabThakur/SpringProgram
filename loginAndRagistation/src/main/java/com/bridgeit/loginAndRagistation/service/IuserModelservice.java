package com.bridgeit.loginAndRagistation.service;

import com.bridgeit.loginAndRagistation.model.UserModel;

/**
 * @author GulabThakur
 *
 */
public interface IuserModelservice {
	/**
	 * @param user
	 * @user is model class type
	 * @this method use for sinIn
	 */
	public void singUp(UserModel user);

	/**
	 * @param email
	 * @param password
	 * @return this method return user that is belong to this account
	 */
	public String logIn(String email, String password);
}
