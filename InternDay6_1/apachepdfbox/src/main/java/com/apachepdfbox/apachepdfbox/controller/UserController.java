package com.apachepdfbox.apachepdfbox.controller;

import com.apachepdfbox.apachepdfbox.entity.User;
import com.apachepdfbox.apachepdfbox.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @GetMapping("/{id}")
    public User getOneUser(@PathVariable Long id){
        return userService.getOneUser(id);
    }
    @PutMapping("/update/{userId}")
    public User updateUser(@PathVariable Long userId,@RequestBody User newUser){
        return userService.updateOneUser(userId,newUser);
    }

    @DeleteMapping("/delete/{userId}")
    public void deleteUser(@RequestParam Long userId){
        userService.deleteById(userId);
    }
}
