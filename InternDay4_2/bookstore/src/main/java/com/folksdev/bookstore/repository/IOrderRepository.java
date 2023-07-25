package com.folksdev.bookstore.repository;

import com.folksdev.bookstore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository  extends JpaRepository<Order,Integer> {

}
