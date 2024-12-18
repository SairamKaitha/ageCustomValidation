package com.tt.customvalidaton.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tt.customvalidaton.model.User;
import com.tt.customvalidaton.repo.AgeCustValidRepo;

import jakarta.validation.Valid;

@RestController
public class AgeCustomValidController {

	@Autowired
	private AgeCustValidRepo repo;
	
	@PostMapping("/createUser")
	public User createUser(@Valid @RequestBody User user) {
		return repo.save(user);
	}
	
	@GetMapping("/fetchUsers")
	public List<User> getAllUsers(){
		return repo.findAll();
	}
}
