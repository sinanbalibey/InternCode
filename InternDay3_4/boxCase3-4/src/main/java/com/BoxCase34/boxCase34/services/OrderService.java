package com.BoxCase34.boxCase34.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.BoxCase34.boxCase34.entities.Order;
import com.BoxCase34.boxCase34.repository.IOrderRepository;

@Service
public class OrderService {

	private IOrderRepository orderRepository;

	public OrderService(IOrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}
	
	public List<Order> getAllOrders(){
		
		return orderRepository.findAll();
	}
	
	public Order saveOneOrder(Order newOrder) {
		
		return orderRepository.save(newOrder);
	}
	
	public Order getOneOrder(Long orderId) {
		
		return orderRepository.findById(orderId).orElse(null); 
	}
	
	public Order updateOneOrder(Long orderId,Order newOrder) {
		
		Optional<Order> order=orderRepository.findById(orderId);
		
		if(order.isPresent()) {
			Order foundOrder=order.get();
			
			foundOrder.setBoxes(newOrder.getBoxes());
			foundOrder.setUser(newOrder.getUser());
			
			orderRepository.save(foundOrder);
			
			return foundOrder;
		}else {
			return null;
		}
		
	}
	
	public void deleteById(Long orderId) {
		orderRepository.deleteById(orderId);
	}
	
	
}
