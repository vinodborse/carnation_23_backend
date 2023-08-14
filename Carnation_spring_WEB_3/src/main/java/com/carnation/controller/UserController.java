package com.carnation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carnation.model.User;
import com.carnation.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/get-user/{rn}")
	public User getUser(@PathVariable("rn") int rollno) {
		
		return userService.getUser(rollno);
	}

	
	@GetMapping("/get-user1")
	public User getUser1(@RequestParam("rn") int rollno) {
		
		return userService.getUser(rollno);
	}
	
	@PostMapping("/set-user")
	public User setUser(@RequestBody User user) {
		
		User u = user;
		
		return u;
	}

}
