package com.carnation.service;

import org.springframework.stereotype.Service;

import com.carnation.model.Employee;

@Service
public class EmployeeService {

	public Employee emp() {

		Employee e = new Employee(1, "HELLO ANARKALI", "BORSE", "DISCO", 120, 7676);
		
		return e;

	}
}
