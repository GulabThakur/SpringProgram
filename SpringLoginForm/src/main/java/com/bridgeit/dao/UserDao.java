package com.bridgeit.dao;

import com.bridgeit.model.UserModel;

public interface UserDao {
			public void signUp(UserModel user);
			public String signIn(String Email,String password);
}
