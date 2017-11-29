package com.wellness.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wellness.dao.AddressDao;
import com.wellness.dto.Address;

@Repository
public class AddressDaoImpl implements AddressDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void addAddress(Address address) {
		jdbcTemplate.update("INSERT INTO Address (zipCode, stateAbbr, city, building) VALUES (?, ?, ?, ?)",
				address.getZipCode(), address.getState(), address.getCity(), address.getBuilding());
		
	}
}
