package com.carnation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.carnation.model.User;

@RestController // Combination of @Controller + @ResponseBody
public class CommonController {

	@GetMapping("/msg")
	public String msg() {
		System.out.println("WELCOME USER");
		String s = new String();
		s = "WELCOME USER hahahaha";
		return s;
	}
	
	@GetMapping("/user")
	public User usr() {
		User u = new User();
		u.setId(1);
		u.setName("VINOD");
		u.setAddress("PUNE");
		
		return u;
	}
}
