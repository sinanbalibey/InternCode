package com.boxcase32.boxcase32.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="seller")
@Data
public class Seller {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String surName;
	
	private String telefon;
	
	private String adress;
	
	private String email;
	
	
	
	
}
