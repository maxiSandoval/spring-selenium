package com.udemy.spring.springselenium.scope;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// singleton (default) one instance | prototype more than one
@Lazy
@Component
@Scope("prototype")
public class Salary {
    
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
