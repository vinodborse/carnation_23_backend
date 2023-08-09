package com.carnation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carnation.model.Employee;
import com.carnation.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService es;
	
	@PostMapping("/emp")
	public Employee emp() {
		Employee e = es.emp();
		return e;
	}
}
