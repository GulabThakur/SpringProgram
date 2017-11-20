package com.bridgeit.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgeit.dao.UserDao;
import com.bridgeit.model.User;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	UserDao personDAO;

	public void setUserDao(UserDao userDao1) {
		this.personDAO = userDao1;
	}

	@Transactional
	public void addUser(User user) {
		this.personDAO.addUser(user);
	}

	@Transactional
	public void update(User user) {
		this.personDAO.update(user);
	}

	@Transactional
	public List<User> listUser() {

		return this.personDAO.getUsers();
	}

	@Transactional
	public User getUser(int id) {
		return this.personDAO.getUser(id);
	}

	@Transactional
	public void deleteUser(int id) {
		this.personDAO.delete(id);
	}

}
