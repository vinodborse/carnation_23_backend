package com.carnation;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class);
    	
    	SessionFactory sf =  cfg.buildSessionFactory();
    		
    	Session session = sf.openSession();
    	session.beginTransaction();
    	//----------
    	
    	
    	
    	Employee e1 = new Employee();
    	e1.setName("Aliya");
    	e1.setAddress("Hamare dil se");
    	e1.setDept("UI");
    	e1.setDob(new Date());
    	
    	session.save(e1);
    	
    	Employee e2 = new Employee();
    	e2.setName("Hritik");
    	e2.setAddress("Dhule");
    	e2.setDept("Fullstack");
    	e2.setDob(new Date());
    	
    	session.save(e2);
    	
    	
    	

    	/*
    	Employee e2 = session.get(Employee.class, 1);
    	
    	System.out.println("BEFORE DATA ---> " + e2.toString());
    	*/

    	//    	session.delete(e2);
    	
    	/*
    	e2.setName("Don DADA"); 	
    	session.update(e2);

    	Employee e3 = session.get(Employee.class, 1);    	
    	System.out.println("AFTER DATA ---> " + e3.toString());
    	*/
    	
    	//---------
    	
    	
    	
		session.getTransaction().commit();
    	session.close();
    }
}
