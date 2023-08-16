package com.GregChapter4.LoginGreg;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class VideoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private  Long id;
    private String username;
    private String name;
    private String description;

    protected VideoEntity() {
        this(null, null, null);
    }

    VideoEntity(String username, String name, String description) {
        this.id = null;
        this.username = username;
        this.description = description;
        this.name = name;
    }
}
