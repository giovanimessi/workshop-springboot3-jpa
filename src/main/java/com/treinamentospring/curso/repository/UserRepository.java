package com.treinamentospring.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamentospring.curso.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
