package com.filipeafonso.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipeafonso.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
