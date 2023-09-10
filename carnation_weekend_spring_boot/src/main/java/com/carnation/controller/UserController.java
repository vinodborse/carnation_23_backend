package com.carnation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/usr")
	public String usr() {
		return "Hello USer";
	}
}
