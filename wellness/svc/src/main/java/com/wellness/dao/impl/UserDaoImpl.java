package com.wellness.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
		jdbcTemplate.update("INSERT INTO User (insuranceId, addressId, contactId, emergencyContactId, "
				+ "healthId, userNameStr, passwordStr, firstName, lastName, gender, dateOfBirth) VALUES (?,?,?,?,?,?,?,?,?,?,?)", 
				user.getInsuranceId(), user.getAddressId(), user.getContactId(), user.getEmergencyContactId(), user.getHealthId(),
				user.getUserNameStr(), user.getPasswordStr(), user.getFirstName(), user.getLastName(), user.getGender(), user.getDateOfBirth());
	}
	
	@Override
	public User getUser(String userName, String password)  {
		return (User) jdbcTemplate.queryForObject(
				"SELECT * FROM USER WHERE userNameStr=?, passwordStr=?", new Object[] { userName, password },
				new BeanPropertyRowMapper<User>(User.class));
	}

	@Override
	public User deleteUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
	
}