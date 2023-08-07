package com.carnation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Common {

/*
	@Before("execution(public void *Mt())")
	public void m1() {
		System.out.println("----WELCOME----");
	}
	
	
	@After("execution(public void studentMt())")
	public void m2() {
		System.out.println("----END----");
	}
*/	
	@Around("execution(public void teacherMt())")
	public void m3(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("--- WELCOME USER -----");
		pjp.proceed();
		System.out.println("--- END USER ---------");
	}
	

}

