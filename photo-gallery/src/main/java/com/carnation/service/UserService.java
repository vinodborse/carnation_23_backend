package com.carnation.service;

import java.io.IOException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.carnation.dao.UserRepository;
import com.carnation.model.User;


@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public String register(String name, String email, String password, MultipartFile image) {
		
		User u = new User();
		u.setName(name);
		u.setEmail(email);
		u.setPassword(password);
		try {
			u.setImage(Base64.getEncoder().encodeToString(image.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		userRepository.save(u);
		return u.getName() + " has been registered";
	}
	
	public User getUser(Long id) {
		return userRepository.findById(id).get();
	}
}
