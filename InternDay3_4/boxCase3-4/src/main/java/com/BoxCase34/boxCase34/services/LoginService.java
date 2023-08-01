package com.BoxCase34.boxCase34.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BoxCase34.boxCase34.entities.User;
import com.BoxCase34.boxCase34.repository.IUserRepository;

@Service
public class LoginService {

	@Autowired
	private IUserRepository userRepository;
	
	public LoginService(IUserRepository userRepository) {
		this.userRepository=userRepository;
	}
	 public User login(String email, String password) {
		    User user = userRepository.findByEmail(email);
		    if (user != null && user.getPassword().equals(password)) {
		      return user;
		    } else {
		      return null;
		    }
		  }
}
