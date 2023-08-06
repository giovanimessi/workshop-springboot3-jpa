package com.treinamentospring.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.treinamentospring.curso.entities.User;
import com.treinamentospring.curso.repository.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		
		return repository.findAll();
		
	}
	
	public User findBYd(Long id) {
		
		Optional<User> ob = repository.findById(id);
		
		return ob.get();
 
	}
	

	
}
