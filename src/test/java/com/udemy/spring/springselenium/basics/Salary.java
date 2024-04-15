package com.udemy.spring.springselenium.basics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {
    
    @Value("${amount:500}")
    private int amount;

/* 
    public Salary(){
        this.amount = 1000;
    }
 */
    public int getAmount(){
        return amount;
    }
}
