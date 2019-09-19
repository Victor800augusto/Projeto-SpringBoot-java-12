package com.example.ProjetoAprendizado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjetoAprendizado.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}
