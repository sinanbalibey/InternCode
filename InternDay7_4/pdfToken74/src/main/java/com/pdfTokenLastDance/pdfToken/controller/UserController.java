package com.pdfTokenLastDance.pdfToken.controller;

import com.pdfTokenLastDance.pdfToken.service.UserServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    private final UserServiceImp userServiceImp;


    public UserController(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
