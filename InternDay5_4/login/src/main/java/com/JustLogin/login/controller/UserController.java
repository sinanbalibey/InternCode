package com.JustLogin.login.controller;

import com.JustLogin.login.entity.User;
import com.JustLogin.login.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class UserController {
    private final UserRepository userRepository;


    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String showSignupForm(Model model){

        return"kayitol";
    }
}
