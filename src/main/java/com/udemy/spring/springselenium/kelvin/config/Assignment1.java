package com.udemy.spring.springselenium.kelvin.config;

import java.util.List;

import org.springframework.context.annotation.Bean;

import com.udemy.spring.springselenium.kelvin.annotations.LazyConfiguration;

@LazyConfiguration
public class Assignment1 {
    
    @Bean
    public List<String> list(){
        return List.of("a", "b", "c");
    }
}
