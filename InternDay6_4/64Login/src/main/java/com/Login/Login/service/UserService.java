package com.Login.Login.service;
import com.Login.Login.dto.UserDto;
import com.Login.Login.entity.User;
import java.util.List;
public interface UserService   {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
