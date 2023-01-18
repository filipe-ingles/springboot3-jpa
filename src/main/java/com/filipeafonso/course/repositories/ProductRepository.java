package com.filipeafonso.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipeafonso.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
