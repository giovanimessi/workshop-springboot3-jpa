package com.treinamentospring.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinamentospring.curso.entities.User;
import com.treinamentospring.curso.services.UserServices;

//Controller

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@Autowired
	private UserServices services;
	
	
	@GetMapping
	  public ResponseEntity<List<User>> findAll(){
		  List<User> p = services.findAll();
		  
		  return ResponseEntity.ok().body(p);
		  
	  }
	@GetMapping(value = "/{id}")
	public ResponseEntity<User>findById(@PathVariable Long id){
		
		User obj = services.findBYd(id);
		
		
		return ResponseEntity.ok().body(obj);
		
		
	}

}
