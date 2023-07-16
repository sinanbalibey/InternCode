package com.boxCase2.boxCase2.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="boxes")
@Data
public class Kutu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int kisaKenar;
	private int uzunKenar;
	private int yukseklik;
	
	private int hacim=kisaKenar*uzunKenar*yukseklik;
	
	
	public Kutu() {
		kisaKenar=10;
		uzunKenar=10;
		yukseklik=10;
	}
	
	
	@ManyToOne
	@JoinColumn(name="seller_id")
	private Satici satici;


}
