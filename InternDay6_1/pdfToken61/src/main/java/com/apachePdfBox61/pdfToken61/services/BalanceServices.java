package com.apachePdfBox61.pdfToken61.services;

import com.apachePdfBox61.pdfToken61.entity.Balance;
import com.apachePdfBox61.pdfToken61.repository.BalanceRepository;
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
