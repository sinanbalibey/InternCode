package com.BoxCase34.boxCase34.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BoxCase34.boxCase34.entities.Box;
import com.BoxCase34.boxCase34.repository.IBoxRepository;

@Service
public class BoxService {

	private IBoxRepository boxRepository;

	@Autowired
	public BoxService(IBoxRepository boxRepository) {
		this.boxRepository = boxRepository;
	}
	
	public List<Box> getAllBoxes(){
		
		return boxRepository.findAll();
	}
	
	public Box saveOneBox(Box newBox) {
		return boxRepository.save(newBox);
	}
	
	public Box getOneBox(Long boxId) {
		
		return boxRepository.findById(boxId).orElse(null);
	}
	
	public Box updateOneBox(Long boxId,Box newBox) {
		
		Optional<Box> box=boxRepository.findById(boxId);
		
		if(box.isPresent()) {
			Box foundBox=box.get();
			
			foundBox.setSize(newBox.getSize());
			foundBox.setTotalAmount(newBox.getTotalAmount());
			foundBox.setOrder(newBox.getOrder());
			
			boxRepository.save(foundBox);
			return foundBox;
		}else {
			return null;
		}
	}
	
	public void deleteById(Long boxId) {
		boxRepository.deleteById(boxId);
	}
	
	
}
