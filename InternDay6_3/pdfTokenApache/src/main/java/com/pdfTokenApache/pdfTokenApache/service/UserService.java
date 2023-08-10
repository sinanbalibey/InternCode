package com.pdfTokenApache.pdfTokenApache.service;

import com.pdfTokenApache.pdfTokenApache.entity.User;
import com.pdfTokenApache.pdfTokenApache.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    public void saveUser(User user);
    public List<Object> isUserPresent(User user);


}
