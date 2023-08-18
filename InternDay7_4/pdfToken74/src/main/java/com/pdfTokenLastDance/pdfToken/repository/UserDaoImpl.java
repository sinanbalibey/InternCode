package com.pdfTokenLastDance.pdfToken.repository;

import com.pdfTokenLastDance.pdfToken.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Type;

@Repository
public class UserDaoImpl implements UserDao{

    private EntityManager entityManager;

    public UserDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public User findByMail(String mail) {
        TypedQuery<User> theQuery=entityManager.createQuery("from User where mail=:mail",User.class);
        theQuery.setParameter("mail",mail);
        User theMail=null;
        try {
            theMail=theQuery.getSingleResult();
        }catch (Exception e){
            theMail=null;
        }
        return theMail;
    }
}
