package com.carnation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carnation.model.User;
import com.carnation.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/save-user")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/get-users")
	public List<User> getUsr() {
		return userService.getUsers();
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable("id") Long id) {
		
		return userService.getUserById(id);
	}
}
