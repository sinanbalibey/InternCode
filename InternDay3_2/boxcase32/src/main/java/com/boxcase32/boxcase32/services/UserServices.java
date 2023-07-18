package com.boxcase32.boxcase32.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.boxcase32.boxcase32.entities.User;
import com.boxcase32.boxcase32.repositoriy.IUserRepository;

@Service
public class UserServices {

	
	private IUserRepository userRepository;

	public UserServices(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> getAllUsers(){
		
		return userRepository.findAll();
	}
	
	public User saveOneUser(User newUser) {
		
		return userRepository.save(newUser);
	}
	
	public User getOneUser(Long userId) {
		
		return userRepository.findById(userId).orElse(null);
	}
	
	public User updateOneUser(Long userId,User newUser) {
		
		Optional<User> user=userRepository.findById(userId);
		
		if(user.isPresent()) {
			User foundUser=user.get();
			foundUser.setName(newUser.getName());
			foundUser.setSurName(newUser.getSurName());
			foundUser.setTelefon(newUser.getTelefon());
			foundUser.setAdress(newUser.getAdress());
			foundUser.setEmail(newUser.getEmail());
			userRepository.save(foundUser);
			
			return foundUser;
		}
		else {
			return null;
		}
	}
	
	public void deleteById(Long userId) {
		userRepository.deleteById(userId);
	}
	
	
}
