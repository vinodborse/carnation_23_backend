package com.carnation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.carnation.entity.Document;
import com.carnation.entity.User;


public class App 
{
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(User.class)
				.addAnnotatedClass(Document.class);
		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.openSession();
		session.beginTransaction();
		// --------------
			
			User u2 = new User();
			
			u2.setUserId(110);
			u2.setName("Salmon Bhai");
			u2.setAddress("Mumbai");
			
			Document d1 = new Document();
			d1.setId(501);
			d1.setType("PAN");
			d1.setNumber("CDEF");
			
			
			u2.setDocuments(Arrays.asList(d1));
			



			User u3 = new User();
			
			u3.setUserId(111);
			u3.setName("Sanju baba");
			u3.setAddress("Mumbai");

			u3.setDocuments(Arrays.asList(d1));
			session.save(u2);
			session.save(u3);
		
		
		// -------------
		session.getTransaction().commit();
		session.close();
	}
}
