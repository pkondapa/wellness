package com.wellness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wellness.dao.AddressDao;
import com.wellness.dto.Address;
import com.wellness.dto.User;

@Service
@RequestMapping(path="/address")
public class AddressService {
	
	@Autowired
	private AddressDao addressDao;

	@PostMapping(path="/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String addAddress(@RequestBody Address address) {
		addressDao.addAddress(address);
		return "Added Address: " + address;
	}
		
	@GetMapping(path="/get")
	public @ResponseBody User getAddress()  {
		return new User();
	}
}