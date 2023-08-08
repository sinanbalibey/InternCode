package com.apachePdfBox61.pdfToken61.controller;

import com.apachePdfBox61.pdfToken61.entity.User;
import com.apachePdfBox61.pdfToken61.services.UserServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    private final UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }
    @PostMapping("/add")
    public User saveUser(@RequestBody User user){
        return userServices.saveUser(user);
    }
    @GetMapping("/{id}")
    public User getOneUser(@PathVariable Long id){
        return userServices.getOneUser(id);
    }
    @PutMapping("/update/{userId}")
    public User updateUser(@PathVariable Long userId,@RequestBody User newUser){
        return userServices.updateOneUser(userId,newUser);
    }

    @DeleteMapping("/delete/{userId}")
    public void deleteUser(@RequestParam Long userId){
        userServices.deleteById(userId);
    }
}
