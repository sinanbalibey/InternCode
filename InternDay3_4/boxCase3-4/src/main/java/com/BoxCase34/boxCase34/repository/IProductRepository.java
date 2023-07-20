package com.BoxCase34.boxCase34.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BoxCase34.boxCase34.entities.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {

}
