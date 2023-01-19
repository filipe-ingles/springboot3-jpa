package com.filipeafonso.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipeafonso.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
