package com.example.ProjetoAprendizado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjetoAprendizado.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
