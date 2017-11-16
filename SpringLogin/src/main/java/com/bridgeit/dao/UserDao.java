package com.bridgeit.dao;

import com.bridgeit.bean.User;

public interface UserDao {
		public void ragistermethod(User usr) ;
		public void login(User login);
		public User store(User user);
}
