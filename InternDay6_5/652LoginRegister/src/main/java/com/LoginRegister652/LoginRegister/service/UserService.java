package com.LoginRegister652.LoginRegister.service;

import com.LoginRegister652.LoginRegister.entity.User;

public interface UserService {
    User findByUsername(String username);

    void saveUser(User user);
}
