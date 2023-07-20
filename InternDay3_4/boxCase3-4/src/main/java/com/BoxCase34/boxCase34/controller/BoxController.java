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

import com.BoxCase34.boxCase34.entities.Box;
import com.BoxCase34.boxCase34.services.BoxService;

@RestController
@RequestMapping("/box")
public class BoxController {
	
	private BoxService boxService;

	@Autowired
	public BoxController(BoxService boxService) {
		this.boxService = boxService;
	}
	
	@GetMapping
	public List<Box> getAllBoxes(){
		
		return boxService.getAllBoxes();
	}
	
	@PostMapping("/add")
	public Box createBox(@RequestBody Box newBox) {
		
		return boxService.saveOneBox(newBox);
	}
	
	
	@GetMapping("/{boxId}")
	public Box getOneBox(@PathVariable Long boxId) {
		
		return boxService.getOneBox(boxId);
	}
	
	@PutMapping("/update/{boxId}")
	public Box updateOneBox(@PathVariable Long boxId,@RequestBody Box newBox) {
		return boxService.updateOneBox(boxId, newBox); 
	}
	
	@DeleteMapping("/delete/{boxId}")
	public void deleteOneBox(@PathVariable Long boxId) {
		boxService.deleteById(boxId);
	}

}
