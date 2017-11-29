package com.wellness.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wellness.dto.User;

public class UserRowMapper implements RowMapper<User> {
	
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setUserId(rs.getInt("userId"));
		user.setInsuranceId(rs.getInt("insuranceId"));
		user.setAddressId(rs.getInt("addressId"));
		user.setContactId(rs.getInt("contactId"));
		user.setEmergencyContactId(rs.getInt("emergencyContactId"));
		user.setHealthId(rs.getInt("healthId"));
		user.setUserNameStr(rs.getString("userNameStr"));
		user.setPasswordStr(rs.getString("passwordStr"));
		user.setFirstName(rs.getString("firstName"));
		user.setLastName(rs.getString("lastName"));
		user.setGender(rs.getString("gender"));
		user.setDateOfBirth(rs.getDate("dateOfBirth"));
		return user;
	}
}