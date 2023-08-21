package com.carnation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carnation.dao.UserRepository;
import com.carnation.model.User;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User saveUser(User user) {
		User u = userRepository.save(user);
		return u;
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User getUser(Long id) {
		return userRepository.findById(id).get();
	}
}
