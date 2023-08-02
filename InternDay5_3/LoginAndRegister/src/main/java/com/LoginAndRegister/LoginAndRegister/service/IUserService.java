package com.LoginAndRegister.LoginAndRegister.service;

import java.util.List;

import com.LoginAndRegister.LoginAndRegister.dto.UserDto;
import com.LoginAndRegister.LoginAndRegister.entity.User;

public interface IUserService {
	
	void saveUser(UserDto userDto);
	

	 User findUserByEmail(String email);

	    List<UserDto> findAllUsers();
}
