package com.carnation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.carnation.entity.Marks;
import com.carnation.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration()
    									.configure()
    									.addAnnotatedClass(Student.class)
    									.addAnnotatedClass(Marks.class);
    	SessionFactory sf =  cfg.buildSessionFactory();
		
    	Session session = sf.openSession();
    	session.beginTransaction();
    	//--------------
    	//-------------
    	session.getTransaction().commit();
    	session.close();
    }
}
