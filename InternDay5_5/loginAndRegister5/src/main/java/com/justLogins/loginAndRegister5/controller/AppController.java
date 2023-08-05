package com.justLogins.loginAndRegister5.controller;

import com.justLogins.loginAndRegister5.entity.User;
import com.justLogins.loginAndRegister5.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public String viewHomePage(){
        return "anasayfa";
    }
    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        model.addAttribute("user",new User());

        return "kayitol";
    }
    public String processRegister(User user){
        BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
        String encodedPassword=passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        return "anasayfa";

    }
}
