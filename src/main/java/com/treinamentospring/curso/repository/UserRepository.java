package com.treinamentospring.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.treinamentospring.curso.entities.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

}
