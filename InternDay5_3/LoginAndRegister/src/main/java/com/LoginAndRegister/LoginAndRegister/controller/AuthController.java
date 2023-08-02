package com.LoginAndRegister.LoginAndRegister.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.LoginAndRegister.LoginAndRegister.dto.UserDto;
import com.LoginAndRegister.LoginAndRegister.service.UserService;
import com.boxCase2.boxCase2.Entities.User;

import jakarta.validation.Valid;

@Controller
public class AuthController {

	private UserService userService;
	
	 public AuthController(UserService userService) {
	        this.userService = userService;
	    }
	
	@GetMapping("/index")
	public String home() {
		return "index";
	}
	 @GetMapping("/register")
	 public String showRegistrationForm(Model model){
	        
	  UserDto user = new UserDto();
	  model.addAttribute("user", user);
	  return "register";
	 }
	 
	   
	 public String registration(@Valid @ModelAttribute("user") UserDto userDto,BindingResult result,Model model) {
		
		 User existingUser=userService.findUserByEmail(userDto.getEmail());
		 
		 if(existingUser!=null&& existingUser)
		 
		 return "a";
	 }
}
