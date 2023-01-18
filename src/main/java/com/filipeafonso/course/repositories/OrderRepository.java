package com.filipeafonso.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipeafonso.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
