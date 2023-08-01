package com.BoxCase34.boxCase34.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/girisYap")
    public String girisYap() {
        
        return "girisYap.html";
    }
}
