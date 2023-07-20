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

import com.BoxCase34.boxCase34.entities.Order;
import com.BoxCase34.boxCase34.services.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	
	private OrderService orderService;
	
	@Autowired
	public OrderController(OrderService orderService) {
		this.orderService=orderService;
	}
	
	@GetMapping
	public List<Order> getAllOrder(){
		return orderService.getAllOrders();
	}
	
	@PostMapping("/add")
	public Order createOrder(@RequestBody Order newOrder) {
		
		return orderService.saveOneOrder(newOrder);
	}
	
	@GetMapping("/{orderId}")
	public Order getOneOrder(@PathVariable Long orderId) {
		
		return orderService.getOneOrder(orderId);
	}
	
	@PutMapping("/update/{orderId}")
	public Order updateOneOrder(@PathVariable Long orderId,@RequestBody Order newOrder) {
		
		return orderService.updateOneOrder(orderId, newOrder);
	}
	
	@DeleteMapping("/delete/{orderId}")
	public void deleteOneOrder(@PathVariable Long orderId) {
		orderService.deleteById(orderId);
	}
	
}
