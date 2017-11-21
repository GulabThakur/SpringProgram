package com.bridgeit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bridgeit.model.UserModel;
@Repository
@Transactional
public class UserDaoImp implements UserDao{
	@Autowired
	private SessionFactory sessionFactrory;
	 @RequestMapping(value="/")
	 
	public void signUp(UserModel user) {
		System.out.println("value of sessin");
		
		Session session=sessionFactrory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
		
	}

	public UserModel signIn(String Email, String password) {
		System.out.println("In Check login");
		Session session = sessionFactrory.openSession();
		Transaction transaction=session.beginTransaction();
		//boolean userFound = false;
		String SQL_QUERY =" from users where Email=? and password=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,Email);
		query.setParameter(1,password);
		List<UserModel> user=query.list();
		transaction.commit();
		session.close();
		return (UserModel) user;
	}

}
