package com.treinamentospring.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinamentospring.curso.entities.User;

//Controller

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	
	@GetMapping
	  public ResponseEntity<User> findAll(){
		  
		  User p = new User(1L, "Maria", "emalL@EMAIL.COM" , "88776676" , "12233");
		  
		  return ResponseEntity.ok().body(p);
		  
	  }

}
