package com.bridgeit.dao;

import java.util.List;

import com.bridgeit.model.User;

/**
 * @author GulabThakur
 *
 */
public interface UserDao {
	public void addUser(User user);

	public void update(User user);

	public List<User> getUsers();

	public User getUser(int id);

	public void delete(int id);
}
