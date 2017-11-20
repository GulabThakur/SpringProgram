package com.bridgeit.dao;

import java.util.List;
import org.jboss.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bridgeit.model.User;

@Repository
public class UserDaoImp implements UserDao {
	private static final Logger logger = LoggerFactory.logger(UserDaoImp.class);

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addUser(User user) {
		Session session = sessionFactory.openSession();
		session.persist(user);
		session.close();
		logger.info("Person updated successfully, Person Details=" + user);
	}

	public void update(User user) {
		System.out.println(sessionFactory);
		Session session = sessionFactory.getCurrentSession();
		session.update(user);
	}

	public List<User> getUsers() {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<User> userList = session.createQuery("from user1").list();
		for (User user : userList) {
			logger.info("Persion List : :" + user);
		}
		return userList;
	}

	public User getUser(int id) {
		Session session = sessionFactory.getCurrentSession();
		User user = session.load(User.class, new Integer(id));
		return user;
	}

	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		User user = session.load(User.class, new Integer(id));
		if (null != user) {
			session.delete(user);
		}
		logger.info("Persion Delated Successfully , person detail =" + user);
	}

}
