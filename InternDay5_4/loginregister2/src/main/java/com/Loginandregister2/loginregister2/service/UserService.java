package com.Loginandregister2.loginregister2.service;

import com.Loginandregister2.loginregister2.dto.UserDto;
import com.Loginandregister2.loginregister2.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
