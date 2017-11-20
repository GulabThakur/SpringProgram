package com.bridgeit.dao;


import org.springframework.orm.hibernate4.HibernateTemplate;

import com.bridgeit.model.User;


public class UserDaoImp implements UserDao{
	HibernateTemplate template;
	public void setTemplate(HibernateTemplate temp) 
	{
		 this.template=temp;
	}
	public void ragistermethod(User usr) {
		template.save(usr);
	}


	
}
