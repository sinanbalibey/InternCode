package com.BoxCase34.boxCase34.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BoxCase34.boxCase34.entities.User;
import com.BoxCase34.boxCase34.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	public List<User> getAllUsers(){
		
		return userService.getAllUsers();
	}
	
	@PostMapping("/add")
	public User createUser(@RequestBody User newUser) {
		
		return userService.saveOneUser(newUser);
	}
	
	@GetMapping("/{userId}")
	public User getOneUser(@PathVariable Long userId) {
		
		return userService.getOneUser(userId);
	}
	
	@PutMapping("/update/{userId}")
	public User updateOneUser(@PathVariable Long userId,@RequestBody User newUser) {
		
		return userService.updateOneUser(userId, newUser);
	}
	
	@DeleteMapping("/delete/{userId}")
	public void deleteOneUser(@PathVariable Long userId) {
		userService.deleteById(userId);
	}
	
	
}
