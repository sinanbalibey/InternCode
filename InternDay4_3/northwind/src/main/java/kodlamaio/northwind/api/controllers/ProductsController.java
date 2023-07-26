package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.IProductService;
import kodlamaio.northwind.entity.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

	
	private IProductService productService;
	
	@Autowired
	public ProductsController(IProductService productService) {
		super();
		this.productService = productService;
	}



	@GetMapping("/getall")
	public List<Product> getAll(){
		return this.productService.getAll();
	}
}
