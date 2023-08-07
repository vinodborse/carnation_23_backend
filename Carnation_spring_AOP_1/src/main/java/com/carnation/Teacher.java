package com.carnation;

import org.springframework.beans.factory.annotation.Autowired;

public class Teacher {
	
	@Autowired
	Student s;
	
	public void teacherMt() {
		System.out.println("We are int Teacher's method");
		s.studentMt();
	}
}
