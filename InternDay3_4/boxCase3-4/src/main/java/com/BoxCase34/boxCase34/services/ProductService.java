package com.BoxCase34.boxCase34.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BoxCase34.boxCase34.entities.Product;
import com.BoxCase34.boxCase34.repository.IProductRepository;

@Service
public class ProductService {

	
	private IProductRepository productRepository;

	@Autowired
	public ProductService(IProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public List<Product> getAllProduct(){
		
		return productRepository.findAll();
		
	}
	
	public Product saveOneProd(Product newProd) {
		
		return productRepository.save(newProd);
	}
	
	public Product getOneProd(Long prodId) {
		
		return productRepository.findById(prodId).orElse(null);
	}
	
	public Product updateOneProduct(Long prodId,Product newProd) {
		
		Optional<Product> prod=productRepository.findById(prodId);
		
		if(prod.isPresent()) {
			Product foundProd=prod.get();
			
			foundProd.setName(newProd.getName());
			foundProd.setPrice(newProd.getPrice());
			foundProd.setSeller(newProd.getSeller());
			
			
			productRepository.save(foundProd);
			
			return foundProd;
		}else {
			return null;
		}
	}
	
	public void deleteById(Long prodId) {
		productRepository.deleteById(prodId);
	}
	
	
	
}
