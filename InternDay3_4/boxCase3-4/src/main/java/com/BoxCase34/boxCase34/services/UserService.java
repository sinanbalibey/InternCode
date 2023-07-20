package com.BoxCase34.boxCase34.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BoxCase34.boxCase34.entities.User;
import com.BoxCase34.boxCase34.repository.IUserRepository;

@Service
public class UserService {

	
	private IUserRepository userRepository;
	
	@Autowired
	public UserService(IUserRepository userRepository) {
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
			foundUser.setAddress(newUser.getAddress());
			foundUser.setEmail(newUser.getEmail());

			userRepository.save(foundUser);
			
			return foundUser;
			
		}else {
			return null;

		}
	}
	
	public void deleteById(Long userId) {
		userRepository.deleteById(userId);
	}
	
}
