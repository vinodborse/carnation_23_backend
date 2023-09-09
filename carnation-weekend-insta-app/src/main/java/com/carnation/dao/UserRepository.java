package com.carnation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carnation.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{
	List<User> findByNameAndAddress(String name, String address);
	
	List<User> findByName(String name);
	
	List<User> findByAddress(String address);
}
