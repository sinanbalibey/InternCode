package com.LoginSecurityRole.LoginSecurityRole.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String showHome(){
        return "home";
    }
    //reques mapping for==>leaders
    @GetMapping("/leaders")
    public String showLeaders(){
        return "leaders";
    }
    //sadece adminler için
    @GetMapping("/systems")
    public String showSystems(){
        return "systems";
    }
}
