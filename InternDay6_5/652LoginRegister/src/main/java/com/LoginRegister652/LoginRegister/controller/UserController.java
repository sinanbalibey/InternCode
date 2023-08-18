package com.LoginRegister652.LoginRegister.controller;


import com.LoginRegister652.LoginRegister.entity.User;
import com.LoginRegister652.LoginRegister.service.UserService;
import com.LoginRegister652.LoginRegister.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserServiceImp userService;

    @Autowired
    public UserController(UserServiceImp userService) {
        this.userService=userService;
    }

/*
    @GetMapping("/register")
    public String showRegistration(Model model){
        model.addAttribute("user",new User());
        return  "register";
    }
    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/login";
    }*/


    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
