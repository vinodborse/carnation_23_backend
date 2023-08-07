package com.carnation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teacher {
	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
	Student s = ac.getBean("std", Student.class);
	
	public void m1() {
		System.out.println("WE ARE IN TEACHER CLASS");
		s.m2();
	}
	
	public void t1() {
		System.out.println("WE ARE IN T1 METHOD");
		s.m2();
	}
}
