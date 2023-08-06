package com.apachepdfbox.apachepdfbox.services;

import com.apachepdfbox.apachepdfbox.entity.Balance;
import com.apachepdfbox.apachepdfbox.repository.BalanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BalanceServices {

    private final BalanceRepository balanceRepository;

    @Autowired
    public BalanceServices(BalanceRepository balanceRepository) {
        this.balanceRepository = balanceRepository;
    }

    public void buyToken(Balance balance){
        balanceRepository.save(balance);
    }
}
