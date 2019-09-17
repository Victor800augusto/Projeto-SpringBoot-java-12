package com.example.ProjetoAprendizado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjetoAprendizado.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
