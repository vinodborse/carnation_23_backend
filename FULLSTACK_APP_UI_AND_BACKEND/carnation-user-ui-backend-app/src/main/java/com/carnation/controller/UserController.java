package com.carnation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carnation.model.User;
import com.carnation.service.UserService;

@RestController
@CrossOrigin("*")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/save-user")
	public User saveUser(@RequestBody User user) {
		User u = userService.saveUser(user);
		return u;
	}
	
	@GetMapping("/get-all")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/get-user")
	public User getUser(@RequestParam("id") Long id) {
		return userService.getUser(id);
	}
	
	@DeleteMapping("/delete-user/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		userService.deleteUser(id);		
	}
}
