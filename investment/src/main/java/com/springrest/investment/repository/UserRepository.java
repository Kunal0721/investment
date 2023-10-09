package com.springrest.investment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.investment.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}	
