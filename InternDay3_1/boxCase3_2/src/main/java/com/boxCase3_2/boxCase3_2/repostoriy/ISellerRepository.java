package com.boxCase3_2.boxCase3_2.repostoriy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boxCase3_2.boxCase3_2.entities.Sellers;

public interface ISellerRepository extends JpaRepository<Sellers, Long> {

}
