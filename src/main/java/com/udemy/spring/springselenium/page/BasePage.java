package com.udemy.spring.springselenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public abstract class BasePage {
    
    @Autowired
    protected WebDriver driver;
    
    @Autowired
    protected WebDriverWait wait;

    @PostConstruct
    private void init(){
        PageFactory.initElements(this.driver, this);
    }

    @PreDestroy
    private void closeDriver(){
        this.driver.quit();
    }
    
    public abstract boolean isAt();

}
