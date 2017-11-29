package com.wellness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wellness.dao.UserDao;
import com.wellness.dto.User;

@Service
@RequestMapping(path="/user")
public class UserService {
	
	@Autowired
	private UserDao userDao;

	@PostMapping(path="/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String addNewUser(@RequestBody User user) {
		userDao.addUser(user);
		return "Added User: " + user;
	}
		
	@GetMapping(path="/get")
	public @ResponseBody User getUser(@RequestParam String user, @RequestParam String password)  {
		return new User();
	}
}