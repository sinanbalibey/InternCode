package com.boxCase3_2.boxCase3_2.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.boxCase3_2.boxCase3_2.entities.Sellers;
import com.boxCase3_2.boxCase3_2.repostoriy.ISellerRepository;

@Service
public class SellerServices {
	
	private ISellerRepository  sellerRepository;

	public SellerServices(ISellerRepository sellerRepository) {
		this.sellerRepository = sellerRepository;
	}
	
	public List<Sellers> getAllSellers(){
		
		return sellerRepository.findAll();
	}
	
	public Sellers saveOneSellers(Sellers sellers) {
		
		return sellerRepository.save(sellers);
	}
	
	public Sellers getOneSeller(Long userId) {
		
		return sellerRepository.findById(userId).orElse(null);
	}
	
	
}
