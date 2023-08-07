package com.carnation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	@Autowired
	Student sample;
	
	public void msg() {
		sample.hello();
	}
}
