package com.bridgeit.service;

import com.bridgeit.model.UserModel;

public interface UserService {
	public void ragistre(UserModel user);

	public String singUp(String name, String password);
}
