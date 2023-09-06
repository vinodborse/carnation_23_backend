package com.carnation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carnation.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
