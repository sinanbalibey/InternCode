package com.boxCase2.boxCase2.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boxCase2.boxCase2.Business.IUserManager;
import com.boxCase2.boxCase2.Entities.Kutu;

@RestController
@RequestMapping("/api")
public class BoxController {
	
	private IUserManager userManager;
	
	@Autowired
	public BoxController(IUserManager userManager) {
		this.userManager=userManager;
	}
	
	@GetMapping("/boxes")
	public List<Kutu> get(){
		return userManager.getall();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Kutu kutu) {
		userManager.add(kutu);
	}

}
