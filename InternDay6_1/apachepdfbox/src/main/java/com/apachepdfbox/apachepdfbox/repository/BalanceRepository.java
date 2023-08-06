package com.apachepdfbox.apachepdfbox.repository;

import com.apachepdfbox.apachepdfbox.entity.Balance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceRepository  extends JpaRepository<Balance,Long> {
}
