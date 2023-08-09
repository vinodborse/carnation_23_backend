package com.carnation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Student {

	@GetMapping("/std")
	public void std() {
		System.out.println("WE ARE STUDENTS....., hahahahaha");
	}
	
	@PostMapping("/pst")
	public void std1() {
		System.out.println("WE ARE USING POST METHOD");
	}
}
