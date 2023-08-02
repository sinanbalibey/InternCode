package com.exampleAdminUser.adminUser.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exampleAdminUser.adminUser.Entity.User;
import com.exampleAdminUser.adminUser.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/add")
	public User saveOneUser(@RequestBody User user) {
		
		return userService.addUser(user);
	}
	
	@GetMapping
	public List<User> getAllUser(){
		
		return userService.getAllUsers();
	}
	
	
}
