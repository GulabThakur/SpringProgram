package com.bridgeit.loginAndRagistation.service;

import com.bridgeit.loginAndRagistation.model.UserModel;

public interface IuserModelservice {
	public void singUp(UserModel user);

	public String logIn(String email, String password);
}
