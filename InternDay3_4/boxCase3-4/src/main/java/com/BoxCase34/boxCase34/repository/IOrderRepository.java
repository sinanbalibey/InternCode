package com.BoxCase34.boxCase34.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BoxCase34.boxCase34.entities.Order;

@Repository
public interface IOrderRepository extends JpaRepository<Order, Long> {

}
