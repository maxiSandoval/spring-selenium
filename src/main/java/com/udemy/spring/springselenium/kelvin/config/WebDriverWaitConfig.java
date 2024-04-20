package com.udemy.spring.springselenium.kelvin.config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.udemy.spring.springselenium.kelvin.annotations.LazyConfiguration;

@LazyConfiguration
public class WebDriverWaitConfig {
    
    @Value("${default.timeout:30}")
    private int timeout;

    @Bean
    @Scope("prototype")
    public WebDriverWait webDriverWait(WebDriver driver){
        return new WebDriverWait(driver, Duration.ofSeconds(timeout));
    }

}
