package com.BoxCase34.boxCase34.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BoxCase34.boxCase34.entities.Seller;
import com.BoxCase34.boxCase34.repository.ISellerRepository;

@Service
public class SellerService {
	
	private ISellerRepository sellerRepository;

	@Autowired
	public SellerService(ISellerRepository sellerRepository) {
		this.sellerRepository = sellerRepository;
	}
	
	public List<Seller> getAllSellers(){
		
		return sellerRepository.findAll();
	}
	
	public Seller saveOneSeller(Seller newSeller) {
		
		return sellerRepository.save(newSeller);
	}
	
	public Seller getOneSeller(Long sellerId) {
		
		return sellerRepository.findById(sellerId).orElse(null);
	}
	
	public Seller updateOneSeller(Long sellerId,Seller newSeller) {
		Optional<Seller> seller=sellerRepository.findById(sellerId);
		
		if(seller.isPresent()) {
			Seller foundSeller=seller.get();
			
			foundSeller.setName(newSeller.getName());
			foundSeller.setSurName(newSeller.getSurName());
			foundSeller.setTelefon(newSeller.getTelefon());
			foundSeller.setAdress(newSeller.getAdress());
			foundSeller.setEmail(newSeller.getEmail());
			sellerRepository.save(foundSeller);
			
			return foundSeller;

		}
		else {
			return null;
		}
		
	}
	
	public void deleteById(Long sellerId) {
		sellerRepository.deleteById(sellerId);
	}
	
	

}
