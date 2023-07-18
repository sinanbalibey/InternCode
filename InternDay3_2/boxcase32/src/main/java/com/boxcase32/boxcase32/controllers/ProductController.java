package com.boxcase32.boxcase32.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boxcase32.boxcase32.entities.Product;
import com.boxcase32.boxcase32.services.ProductServices;

@RestController
@RequestMapping("/prod")
public class ProductController {
	
	private ProductServices productServices;

	public ProductController(ProductServices productServices) {
		this.productServices = productServices;
	}
	
	@GetMapping
	public List<Product> getAllProduct(){
		
		return productServices.getAllProduct();
	}
	
	@PostMapping("/add")
	public Product createProduct(@RequestBody Product newProd) {
		
		return productServices.saveOneProduct(newProd);
	}
	
	@GetMapping("/{prodId}")
	public Product getOneProduct(@PathVariable Long prodId) {
		
		return productServices.getOneProd(prodId);
	}
	
	@PutMapping("/update/{prodId}")
	public Product updateOneProduct(@PathVariable Long prodId,@RequestBody Product newProd) {
		
		return productServices.updateOneProduct(prodId, newProd);
	}
	
	@DeleteMapping("/delete/{prodId}")
	public void deleteOneProduct(@PathVariable Long prodId) {
		
		productServices.deleteById(prodId);
	}
	
	
	

}
