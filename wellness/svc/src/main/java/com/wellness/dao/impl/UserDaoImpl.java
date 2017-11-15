package com.wellness.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wellness.dao.UserDao;
import com.wellness.dto.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addUser(User user) {
		jdbcTemplate.update("INSERT INTO user(firstname) VALUES (?)", user.getFirstName());
	}
}