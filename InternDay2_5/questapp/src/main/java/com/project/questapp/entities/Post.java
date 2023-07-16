package com.project.questapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="post")
@Data
public class Post {
	
	Long id;
	Long userId;
	String tittle;
	@Lob
	@Column(columnDefinition = "text")
	String text;
}
