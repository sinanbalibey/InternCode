package com.pdfTokenApache.pdfTokenApache.service;

import com.pdfTokenApache.pdfTokenApache.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


}
