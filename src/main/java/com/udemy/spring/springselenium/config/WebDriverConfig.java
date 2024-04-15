package com.udemy.spring.springselenium.config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;

@Configuration
public class WebDriverConfig {

    @Value("${default.timeout:30}")
    private int timeout;

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "edge")
    public WebDriver edgeDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
    
    @Bean
    @ConditionalOnMissingBean
    public WebDriver chromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @Bean
    public WebDriverWait webDriverWait(WebDriver driver){
        return new WebDriverWait(driver, Duration.ofSeconds(timeout));
    }
}
