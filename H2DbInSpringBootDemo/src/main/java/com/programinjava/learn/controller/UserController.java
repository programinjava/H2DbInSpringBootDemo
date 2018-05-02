package com.programinjava.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programinjava.learn.model.User;
import com.programinjava.learn.respository.UserRepository;

@RestController
@RequestMapping("/")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	
	public ResponseEntity<User> createUser(@RequestBody User user){
		
		User u1 = userRepository.save(user);
		
		return ResponseEntity.ok(u1);
	}
}
