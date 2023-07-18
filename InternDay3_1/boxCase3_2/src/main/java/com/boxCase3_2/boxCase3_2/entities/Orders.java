package com.boxCase3_2.boxCase3_2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="orders")
@Data
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String orderNumber;
	
	private double totalAmount;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private Users users;
	
	
	
	
	
}
