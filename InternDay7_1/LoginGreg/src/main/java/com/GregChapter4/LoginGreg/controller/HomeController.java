package com.GregChapter4.LoginGreg.controller;

public class HomeController {


    @PostMapping("/new-video")
    public String newVideo(@ModelAttribute NewVideo newVideo,
                           Authentication authentication) {
        videoService.create(newVideo,authentication.getName());
        return "redirect:/";
    }
}
