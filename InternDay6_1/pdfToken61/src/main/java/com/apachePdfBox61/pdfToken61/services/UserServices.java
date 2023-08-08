package com.apachePdfBox61.pdfToken61.services;

import com.apachePdfBox61.pdfToken61.entity.User;
import com.apachePdfBox61.pdfToken61.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServices {
    private final UserRepository userRepository;

    @Autowired
    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User saveUser(User user){
        return userRepository.save(user);
    }
    public User getOneUser(Long userId){

        return userRepository.findById(userId).orElse(null);
    }
    public User updateOneUser(Long userId,User newUser){
        Optional<User> user=userRepository.findById(userId);

        if(user.isPresent()){
            User foundUser=user.get();

            foundUser.setFullName(newUser.getFullName());
            foundUser.setMail(newUser.getMail());
            foundUser.setPassword(newUser.getPassword());

            userRepository.save(foundUser);
            return foundUser;
        }
        else {
            return null;
        }
    }
    public void deleteById(Long userId){
        userRepository.deleteById(userId);
    }

}
