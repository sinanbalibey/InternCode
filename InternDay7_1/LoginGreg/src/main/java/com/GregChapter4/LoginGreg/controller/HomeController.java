package com.GregChapter4.LoginGreg.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class HomeController {


    @PostMapping("/new-video")
    public String newVideo(@ModelAttribute NewVideo newVideo,
                           Authentication authentication) {
        videoService.create(newVideo,authentication.getName());
        return "redirect:/";
    }
}
