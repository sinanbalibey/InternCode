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

import com.boxcase32.boxcase32.entities.Order;
import com.boxcase32.boxcase32.services.OrderServices;

@RestController
@RequestMapping("/order")
public class OrderController {

	
	private OrderServices orderServices;

	public OrderController(OrderServices orderServices) {
		this.orderServices = orderServices;
	}
	
	@GetMapping
	public List<Order> getAllOrder(){
		return orderServices.getAllOrder();
	}
	
	@PostMapping("/add")
	public Order createOrder(@RequestBody Order newOrder) {
		return orderServices.saveOneOrder(newOrder);
	}
	
	@GetMapping("/{orderId}")
	public Order getOneOrder(@PathVariable Long orderId) {
		
		return orderServices.getOneOrder(orderId);
	}
	
	@PutMapping("/update/{orderId}")
	public Order updateOneOrder(@PathVariable Long orderId,@RequestBody Order newOrder) {
		
		return orderServices.updateOneOrder(orderId, newOrder);
	}
	
	@DeleteMapping("/delete/{orderId}")
	public void deleteOneOrder(@PathVariable Long orderId) {
		orderServices.deleteById(orderId);
	}
	
	
}
