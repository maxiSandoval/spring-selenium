package com.udemy.spring.springselenium.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Assignment1 {
    
    @Bean
    public List<String> list(){
        return List.of("a", "b", "c");
    }
}
