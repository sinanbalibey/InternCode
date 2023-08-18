package com.pdfTokenLastDance.pdfToken.repository;

import com.pdfTokenLastDance.pdfToken.entity.User;

public interface UserDao {

    User findByMail(String mail);
}
