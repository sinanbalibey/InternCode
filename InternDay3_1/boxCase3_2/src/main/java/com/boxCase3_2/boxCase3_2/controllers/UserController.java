package com.boxCase3_2.boxCase3_2.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boxCase3_2.boxCase3_2.entities.Users;
import com.boxCase3_2.boxCase3_2.services.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {

	private UserServices userServices;

	public UserController(UserServices userServices) {
		this.userServices = userServices;
	}
	
	@GetMapping
	public List<Users> getAllUsers(){
		
		return userServices.getAllUsers();
	}
	
	@PostMapping
	public Users createUser(@RequestBody Users newUser) {
		return userServices.saveOneUser(newUser);
	}
	
	@GetMapping("/{userId}")
	public Users getOneUser(@PathVariable Long userId) {
		//hata yakala!!! 
		return userServices.getOneUser(userId);
	}
	
	
}
