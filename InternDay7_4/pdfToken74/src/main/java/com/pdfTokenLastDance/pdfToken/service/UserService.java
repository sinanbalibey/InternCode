package com.pdfTokenLastDance.pdfToken.service;

import com.pdfTokenLastDance.pdfToken.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService  extends UserDetailsService {
    public User findByMail(String mail);
}
