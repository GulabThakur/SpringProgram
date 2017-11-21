package com.bridgeit.service;

import com.bridgeit.model.UserModel;

public interface UserService {
	public void ragistre(UserModel user);

	public UserModel singUp(String name, String password);
}
