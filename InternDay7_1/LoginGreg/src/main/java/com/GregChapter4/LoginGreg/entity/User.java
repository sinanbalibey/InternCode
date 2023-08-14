package com.GregChapter4.LoginGreg.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import org.springframework.security.core.userdetails.UserDetails;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<GrantedAuthority> authorities=new ArrayList<>();


    public UserDetails asUser(){
        return org.springframework.security.core.userdetails.User.withDefaultPasswordEncoder()
                .username(getUsername())
                .password(getPassword())
                .authorities(getAuthorities())
                .build();
    }
}
