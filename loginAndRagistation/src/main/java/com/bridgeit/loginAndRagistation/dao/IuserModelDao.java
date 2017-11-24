package com.bridgeit.loginAndRagistation.dao;

import com.bridgeit.loginAndRagistation.model.UserModel;

public interface IuserModelDao {
		public void singUp(UserModel user);
		public String singIn(String email,String password);
}
