package com.cydeo.balance;

import java.util.UUID;

public class GiftCardBalance extends Balance{

    public GiftCardBalance(UUID customerId, Double balance) {
        super(customerId, balance);
    }


    @Override
    public Double addBalance(Double additionalBalance) {
        setBalance(getBalance()+additionalBalance+(.10*additionalBalance));
        return getBalance();
    }
}
