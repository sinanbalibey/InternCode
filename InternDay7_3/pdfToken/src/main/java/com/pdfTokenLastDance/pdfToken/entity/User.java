package com.pdfTokenLastDance.pdfToken.entity;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;


@Entity
@Table
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String fullName;

    private String mail;

    private String password;
}
