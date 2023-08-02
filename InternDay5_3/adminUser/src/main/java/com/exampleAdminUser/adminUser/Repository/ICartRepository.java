package com.exampleAdminUser.adminUser.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exampleAdminUser.adminUser.Entity.Cart;

@Repository
public interface ICartRepository extends JpaRepository<Cart, Integer> {

}
