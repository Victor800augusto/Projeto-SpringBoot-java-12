package com.example.ProjetoAprendizado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjetoAprendizado.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	
}
