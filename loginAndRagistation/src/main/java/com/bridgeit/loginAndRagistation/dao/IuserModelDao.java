package com.bridgeit.loginAndRagistation.dao;

import com.bridgeit.loginAndRagistation.model.UserModel;

/**
 * @author GulabThakur
 */
public interface IuserModelDao {
	/**
	 * @param user
	 * @sinIn account method
	 */
	public void singUp(UserModel user);

	/**
	 * @param email
	 * @param password
	 * @return after login return userFastName
	 */
	public String singIn(String email, String password);
}
