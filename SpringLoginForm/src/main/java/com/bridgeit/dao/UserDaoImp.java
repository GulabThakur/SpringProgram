package com.bridgeit.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bridgeit.model.UserModel;
@Repository
public class UserDaoImp implements UserDao{
	@Autowired
	private SessionFactory sessionFactrory;
	 @RequestMapping(value="/")
	 @Transactional
	public void signUp(UserModel user) {
		System.out.println("value of sessin"+sessionFactrory);
		sessionFactrory.getCurrentSession().save(user);
	}

	public UserModel signIn(String Email, String password) {
		UserModel user=(UserModel) sessionFactrory.getCurrentSession().get(Email, password);
		return user;
	}

}
