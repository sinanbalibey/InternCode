package kodlama.io.rentACar.wepApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.IBrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController 
@RequestMapping("/api/brands")
public class BrandsController {
	
	private IBrandService brandService;

	@Autowired
	public BrandsController(IBrandService brandService) {
		super();
		this.brandService = brandService;
	}
	
	@GetMapping("/getall")
	public List<Brand> getall(){
		
		return brandService.getall();
	}
	

}
