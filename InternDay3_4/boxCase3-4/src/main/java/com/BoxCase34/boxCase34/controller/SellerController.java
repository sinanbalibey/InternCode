package com.BoxCase34.boxCase34.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BoxCase34.boxCase34.entities.Seller;
import com.BoxCase34.boxCase34.services.SellerService;

@RestController
@RequestMapping("/seller")
public class SellerController {

	
	private SellerService sellerServices;

	public SellerController(SellerService sellerServices) {
		this.sellerServices = sellerServices;
	}
	
	@GetMapping
	public List<Seller> getAllSeller(){
		
		return sellerServices.getAllSellers();
	}
	
	@PostMapping("/add")
	public Seller createSeller(@RequestBody Seller newSeller) {
		
		return sellerServices.saveOneSeller(newSeller);
	}
	
	@GetMapping("/{sellerId}")
	public Seller getOneSeller(@PathVariable Long sellerId) {
		
		return sellerServices.getOneSeller(sellerId);
	}
	
	@PutMapping("/update/{sellerId}")
	public Seller updateOneSeller(@PathVariable Long sellerId,@RequestBody Seller newSeler) {
		
		return sellerServices.updateOneSeller(sellerId, newSeler);
	}
	@DeleteMapping("/delete/{sellerId}")
	public void deleteOneSeller(@PathVariable Long sellerId) {
		
		sellerServices.deleteById(sellerId);
	}
}
