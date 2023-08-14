package com.carnation.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.carnation.model.User;

@Repository
public class UserRepository {
	
	public List<User> users() {
		
		User u1 = new User(1, "Vinod", "Pune", 1234);
		User u2 = new User(2, "Rahul", "Mumbai", 222);
		User u3 = new User(3, "Anarkali", "Hum sab ke dil me", 7777);
		User u4 = new User(4, "Aliya", "Charu ke dil me", 434343);
		User u5 = new User(5, "Don", "Faltu gali", 100);
		
		List<User> users = Arrays.asList(u1, u2, u3, u4, u5);
		
		
		return users;
	}
	
//	public User getUser() {
//		
//		
//	}

}
