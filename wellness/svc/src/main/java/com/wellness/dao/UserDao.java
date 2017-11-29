package com.wellness.dao;

import com.wellness.dto.User;

public interface UserDao {

	public void addUser(User user);
	
	public User getUser(String userName, String password);
	
	public User deleteUser(String userName);
}