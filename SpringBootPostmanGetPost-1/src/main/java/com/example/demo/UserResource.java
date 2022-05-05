package com.example.demo;
import java.util.List;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ksj.controller.CandidateController;


@RestController
public class UserResource {
	@Autowired
	private UserDaoService service;
	
	
	@GetMapping("/users")
	public List<User> retriveAllUser(){
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retriveUser(@PathVariable int id)
	{
		return service.findOne(id);
	}
	
	@PostMapping("/users")
	public void createUser(@RequestBody User User)
	{
		User savedUser=service.save(User);
	}
	
}
