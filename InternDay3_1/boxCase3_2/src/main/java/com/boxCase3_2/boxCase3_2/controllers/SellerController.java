package com.boxCase3_2.boxCase3_2.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boxCase3_2.boxCase3_2.entities.Sellers;

import com.boxCase3_2.boxCase3_2.services.SellerServices;

@RestController
@RequestMapping("/seller")
public class SellerController {
	
	private SellerServices sellerServices;

	public SellerController(SellerServices sellerServices) {
		this.sellerServices = sellerServices;
	}
	
	@GetMapping
	public List<Sellers> getAllSellers(){
		return sellerServices.getAllSellers();
	}
	
	@PostMapping
	public Sellers createSellers(@RequestBody Sellers newSeller) {
		return sellerServices.saveOneSellers(newSeller);
	}
	
	@GetMapping("/{sellerId}")
	public Sellers getOneSellers(@PathVariable Long sellerId) {
		
		return sellerServices.getOneSeller(sellerId);
	}
	
	

}
