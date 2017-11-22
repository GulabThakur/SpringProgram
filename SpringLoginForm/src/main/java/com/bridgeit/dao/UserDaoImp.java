package com.bridgeit.dao;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
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

	public String signIn(String Email, String password) {
		System.out.println("In Check login");
		String persion = null;
		Session session = sessionFactrory.openSession();
		Criteria criteria=session.createCriteria(UserModel.class);
		Criterion email=Restrictions.eq("Email", Email);
		criteria.add(email);
		UserModel user=(UserModel) criteria.uniqueResult();
		Transaction transaction=session.beginTransaction();
		session.close();
		if(user!=null) 
		{
			if(password.equals(user.getPassword())) 
			{
				persion=user.getfName();
				System.out.println("Welcome"+persion);
			}
			else 
			{
				persion="password is wrong";
				System.out.println(persion);
			}
		 }
		System.out.println("Nicejkhh...........");
		
		
			return persion;
			
	}

}
