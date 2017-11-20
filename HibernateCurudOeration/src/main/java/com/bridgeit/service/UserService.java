package com.bridgeit.service;

import java.util.List;

import com.bridgeit.model.User;

/**
 * @author GulabThakur
 *
 */
public interface UserService {
	public void addUser(User user);

	public void update(User user);

	public List<User> listUser();

	public User getUser(int id);

	public void deleteUser(int id);
}
