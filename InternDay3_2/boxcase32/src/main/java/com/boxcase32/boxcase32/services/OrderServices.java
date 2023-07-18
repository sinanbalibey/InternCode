package com.boxcase32.boxcase32.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.boxcase32.boxcase32.entities.Order;
import com.boxcase32.boxcase32.repositoriy.IOrderRepository;

@Service
public class OrderServices {

	
	private IOrderRepository orderRepository;

	public OrderServices(IOrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}
	
	public List<Order> getAllOrder(){
		
		return orderRepository.findAll();
	}
	
	public Order saveOneOrder(Order order) {
		return orderRepository.save(order);
	}
	
	public Order getOneOrder(Long orderId) {
		
		return orderRepository.findById(orderId).orElse(null);
	}
	
	public Order updateOneOrder(Long orderId,Order newOrder) {
		
		Optional<Order> order=orderRepository.findById(orderId);
		
		if(order.isPresent()) {
			
			Order foundOrder=order.get();
			
			foundOrder.setOrderAdress(newOrder.getOrderAdress());
			
			foundOrder.setOrderPrice(newOrder.getOrderPrice());
			
			orderRepository.save(foundOrder);
			
			return foundOrder;
		}
		else {
			return null;
		}
	}
	
	public void deleteById(Long orderId) {
		orderRepository.deleteById(orderId);
	}
	
	
}
