package com.carnation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
		return userService.saveUser(user);
	}
	
	@GetMapping("/get-user")
	public User getUser(@RequestParam("id")Long id) {
		return userService.getUser(id);
	}
	
	@GetMapping("/get-user-name")
	public List<User> getUserByName(@RequestParam("name")String name) {
		return userService.getUserByName(name);
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/nap")
	public List<User> findByNameOrAddressOrPassword(@RequestParam("dat")String data) {
		return userService.findByNameOrAddressOrPassword(data);
	}
}
