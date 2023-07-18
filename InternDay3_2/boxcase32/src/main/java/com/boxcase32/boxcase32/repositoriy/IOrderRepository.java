package com.boxcase32.boxcase32.repositoriy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boxcase32.boxcase32.entities.Order;

public interface IOrderRepository  extends JpaRepository<Order, Long>{

}
