package com.BoxCase34.boxCase34.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="sellers")
@Data
public class Seller {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String surName;
	private String telefon;
	private String adress;
	private String email;
	
	
	@OneToMany(mappedBy="seller")
	private List<Product> products;
	
	
	
}
