package com.pdfTokenLastDance.pdfToken.service;


import com.pdfTokenLastDance.pdfToken.entity.Role;
import com.pdfTokenLastDance.pdfToken.entity.User;
import com.pdfTokenLastDance.pdfToken.repository.RoleDao;
import com.pdfTokenLastDance.pdfToken.repository.UserDao;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService{

    private UserDao userDao;

    private RoleDao roleDao;

    public UserServiceImp(UserDao userDao, RoleDao roleDao) {
        this.userDao = userDao;
        this.roleDao = roleDao;
    }

    @Override
    public User findByMail(String mail) {

        return  userDao.findByMail(mail);
    }

    @Override
    public UserDetails loadUserByUsername(String mail) throws UsernameNotFoundException {

        User user=userDao.findByMail(mail);
        if(user==null){
            throw new UsernameNotFoundException("Şifre ya da mail hatalı");
        }
        return new org.springframework.security.core.userdetails.User(user.getMail(),user.getPassword(),mapRolesToAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }
}
