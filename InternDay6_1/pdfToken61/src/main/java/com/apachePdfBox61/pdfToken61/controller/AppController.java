package com.apachePdfBox61.pdfToken61.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class AppController {

    @GetMapping("/")
    public String anasayfa(){
        return "anasayfa";
    }
}
