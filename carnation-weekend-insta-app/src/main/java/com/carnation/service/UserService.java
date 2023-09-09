package com.carnation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.carnation.dao.UserRepository;
import com.carnation.model.User;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User saveUser(User user) {
		//......
		return userRepository.save(user);
	}
	
	public User getUser(Long id) {
		User u = userRepository.findById(id).get();
		if(userRepository.findById(id).isPresent()) {
			return u;
		} else {
			User us = new User();
			return us;
		}
	}
	
	
	public List<User> getUserByName(String name) {
		return userRepository.findByName(name);
	}
}
