package com.boxCase3_2.boxCase3_2.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.boxCase3_2.boxCase3_2.entities.Users;
import com.boxCase3_2.boxCase3_2.repostoriy.IUserRepository;

@Service
public class UserServices {
	
	private IUserRepository userRepository;

	public UserServices(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<Users> getAllUsers(){
		
		return userRepository.findAll();
	}
	
	public Users saveOneUser(Users newUser) {
		
		return userRepository.save(newUser);
	}
	public Users getOneUser(Long userId) {
		
		//o idye ait kullanıcı yoksa hata fırlatması lazım 
		return userRepository.findById(userId).orElse(null);
	}
	
	

}
