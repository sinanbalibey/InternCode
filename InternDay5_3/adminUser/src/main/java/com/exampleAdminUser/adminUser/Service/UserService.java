package com.exampleAdminUser.adminUser.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleAdminUser.adminUser.Entity.User;
import com.exampleAdminUser.adminUser.Repository.IUserRepository;

@Service
public class UserService {

	@Autowired
	private IUserRepository userRepository;

	public UserService(IUserRepository userRepository) {
		
		this.userRepository = userRepository;
	}
	
	public List<User> getAllUsers(){
		
		return userRepository.findAll();
	}
	
	public User addUser(User user) {
		
		return userRepository.save(user);
	}
	
	public User checkLogin(String username,String password) {
		
		User user=userRepository.findby
	}
	
	
}
