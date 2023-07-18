package com.boxcase32.boxcase32.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boxcase32.boxcase32.entities.User;
import com.boxcase32.boxcase32.services.UserServices;

@RestController
@RequestMapping("/user")
public class UserController {

	
	private UserServices userServices;

	public UserController(UserServices userServices) {
		this.userServices = userServices;
	}
	
	@GetMapping
	public List<User> getAllUsers(){
		
		return userServices.getAllUsers();
	}
	
	@PostMapping("/add")
	public User createUser(@RequestBody User newUser) {
		
		return userServices.saveOneUser(newUser);
	}
	
	@GetMapping("/{userId}")
	public User getOneUser(@PathVariable Long userId) {
		
		return userServices.getOneUser(userId);
	}
	
	@PutMapping("/update/{userId}")
	public User updateOneUser(@PathVariable Long userId,@RequestBody User newUser) {
		
		return userServices.updateOneUser(userId, newUser);
	}
	
	@DeleteMapping("/delete/{userId}")
	public void deleteOneUser(@PathVariable Long userId) {
		userServices.deleteById(userId);
	}
	
	
	
	
}
