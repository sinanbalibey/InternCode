package com.boxcase32.boxcase32.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.boxcase32.boxcase32.entities.Product;
import com.boxcase32.boxcase32.repositoriy.IProductRepository;

@Service
public class ProductServices {

	
	private IProductRepository productRepository;

	public ProductServices(IProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public List<Product> getAllProduct(){
		
		return productRepository.findAll();
	}
	
	public Product saveOneProduct(Product product) {
		
		return productRepository.save(product);
	}
	
	
	public Product getOneProd(Long prodId) {
		
		return productRepository.findById(prodId).orElse(null);
	}
	
	public Product updateOneProduct(Long prodId,Product newProd) {
		
		Optional<Product> prod=productRepository.findById(prodId);
		
		if(prod.isPresent()) {
			Product foundProd=prod.get();
			
			foundProd.setProdName(newProd.getProdName());
			foundProd.setDescription(newProd.getDescription());
			foundProd.setPrice(newProd.getPrice());
			productRepository.save(foundProd);
			
			return foundProd;
			
		}
		else {
			return null;
		}
	}
	public void deleteById(Long prodId) {
		productRepository.deleteById(prodId);
	}
	
}
