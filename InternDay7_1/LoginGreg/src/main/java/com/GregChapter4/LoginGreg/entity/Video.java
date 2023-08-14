package com.GregChapter4.LoginGreg.entity;


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
@Table(name = "videos")
public class Video {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    Video(String username, String name, String description) {
        this.id = null;
        this.username = username;
        this.description = description;
        this.name = name;
    }
}
