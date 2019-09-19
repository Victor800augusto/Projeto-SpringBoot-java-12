package com.example.ProjetoAprendizado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjetoAprendizado.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
