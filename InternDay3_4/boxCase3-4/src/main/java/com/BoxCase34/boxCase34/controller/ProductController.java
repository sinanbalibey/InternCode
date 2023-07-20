package com.BoxCase34.boxCase34.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BoxCase34.boxCase34.entities.Product;
import com.BoxCase34.boxCase34.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	private ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping
	public List<Product> getAllProduct(){
		return productService.getAllProduct();
	}
	
	@PostMapping("/add")
	public Product createOneProd(@RequestBody Product newProd) {
		
		return productService.saveOneProd(newProd);
	}
	
	@GetMapping("/{prodId}")
	public Product getOneProduct(@PathVariable Long prodId) {
		
		return productService.getOneProd(prodId);
	}
	
	@PutMapping("/update/{prodId}")
	public Product updateOneProd(@PathVariable Long prodId,@RequestBody Product newProd) {
		
		return productService.updateOneProduct(prodId, newProd);
		
	}
	
	@DeleteMapping("/delete/{prodId}")
	public void deleteOneProd(@PathVariable Long prodId) {
		
		productService.deleteById(prodId);
	}
	
	
}
