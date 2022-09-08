package com.cydeo.balance;

import java.util.UUID;

public abstract class Balance {


    private UUID customerId;
    private Double balance;

    public Balance(UUID customerId, Double balance) {
        this.customerId = customerId;
        this.balance = balance;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public Double getBalance() {
        return balance;
    }

    public abstract Double addBalance(Double additionalBalance);

}
