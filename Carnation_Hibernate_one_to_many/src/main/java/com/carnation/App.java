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
			
			User u1 = new User();
			u1.setUserId(101);
			u1.setName("Vinod");
			u1.setAddress("Pune");
			
			User u2 = new User();
			u2.setUserId(102);
			u2.setName("Don");
			u2.setAddress("Pune");
			
			
			
			
			session.save(u1);
			session.save(u2);
			
			Document d1 = new Document();
			
			d1.setId(501);
			d1.setType("PAN");
			d1.setNumber("QWERTY");
			
			
			Document d2 = new Document();
			
			d2.setId(502);
			d2.setType("AADHAR");
			d2.setNumber("1234");
			
			session.save(d1);
			session.save(d2);
			
			User u3 = new User();
			u3.setUserId(103);
			u3.setName("Aliya");
			u3.setAddress("Mumbai");
			
			List<Document> docs = new ArrayList<Document>();
			docs.add(d1);
			docs.add(d2);
			
			u3.setDocuments(docs);
			
			session.save(u3);
		
		// -------------
		session.getTransaction().commit();
		session.close();
	}
}
