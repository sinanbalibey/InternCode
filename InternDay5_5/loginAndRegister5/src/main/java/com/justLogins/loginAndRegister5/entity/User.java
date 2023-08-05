package com.justLogins.loginAndRegister5.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String  email;

    @Column(nullable = false)
    private String password;
    @Column(name="first_name",nullable = false)
    private String firstName;
    @Column(name="last_name",nullable = false)
    private String lastName;
}
