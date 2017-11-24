package com.bridgeit.loginAndRagistation.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeit.loginAndRagistation.model.UserModel;

public class UserModelDaoImp implements IuserModelDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void singUp(UserModel user) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
	}

	@Override
	public String singIn(String email, String password) {
		Session session=sessionFactory.openSession();
		String persion=null;
		Criteria criteria=session.createCriteria(UserModel.class);
		Criterion emial1=Restrictions.eq("email", email);
		criteria.add(emial1);
		UserModel user=(UserModel) criteria.uniqueResult();
		Transaction transaction=session.beginTransaction();
		session.close();
		if(user!=null) 
		{
			if(password.equals(user.getPassword())) 
			{
				persion=user.getfName();
				return persion;
			}
			else 
			{
				persion="password wrong";
				return persion;
			}
		}
		return persion;
	}

}
