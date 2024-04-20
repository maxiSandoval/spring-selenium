package com.udemy.spring.springselenium.kelvin.config;

import org.springframework.context.annotation.Bean;

import com.github.javafaker.Faker;
import com.udemy.spring.springselenium.kelvin.annotations.LazyConfiguration;

@LazyConfiguration
public class FakerConfig {
    
    @Bean
    public Faker getFaker(){
        return new Faker();
    }

 

}
