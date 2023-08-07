package com.carnation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	//Common c1 = ac.getBean("st", Common.class);
    	
    	
    	Common c1 = new Student();
    	System.out.println(c1);
    	Common c2 = new Student();
    	System.out.println(c2);
    	Common c3 = new Student();
    	System.out.println(c3);
    	
    	System.out.println("====================");
    	
    	Common c4 = ac.getBean("st", Common.class);
    	System.out.println(c4);
    	Common c5 = ac.getBean("st", Common.class);
    	System.out.println(c5);
    	Common c6 = ac.getBean("st", Common.class);
    	System.out.println(c6);
    	
    }
}
