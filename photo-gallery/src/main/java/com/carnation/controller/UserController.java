package com.carnation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.carnation.model.User;
import com.carnation.service.UserService;

@RestController
@CrossOrigin("*")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<String> register(	@RequestParam("name") String name,
							@RequestParam("email") String email,
							@RequestParam("password") String password,
							@RequestParam("image") MultipartFile image) {
		String res = userService.register(name, email, password, image);
		return ResponseEntity.ok(res);
	}
	
	@GetMapping("/user")
	public User getUser(@RequestParam("id")Long id) {
		return userService.getUser(id);
	}
}
