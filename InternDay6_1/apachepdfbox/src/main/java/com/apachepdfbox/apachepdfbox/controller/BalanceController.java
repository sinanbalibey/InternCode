package com.apachepdfbox.apachepdfbox.controller;


import com.apachepdfbox.apachepdfbox.entity.Balance;
import com.apachepdfbox.apachepdfbox.services.BalanceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/balance")
public class BalanceController {

    private final BalanceServices balanceServices;


    @Autowired
    public BalanceController(BalanceServices balanceServices) {
        this.balanceServices = balanceServices;
    }

    @PostMapping("/buy")
    public void buyTokens(@RequestBody Balance balance){
        balanceServices.buyToken(balance);
    }
}
