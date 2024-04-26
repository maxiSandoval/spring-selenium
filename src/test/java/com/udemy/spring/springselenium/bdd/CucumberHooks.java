package com.udemy.spring.springselenium.bdd;

import com.udemy.spring.springselenium.kelvin.annotations.LazyAutowired;
import com.udemy.spring.springselenium.kelvin.service.ScreenshotService;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

public class CucumberHooks {

    private static final Logger logger = LoggerFactory.getLogger(CucumberHooks.class);

    @LazyAutowired
    private ScreenshotService screenshotService;

    @LazyAutowired
    private ApplicationContext applicationContext;

    @AfterStep
    public void afterStep(Scenario scenario){
        
        if(scenario.isFailed()){
            scenario.attach(this.screenshotService.getScreenshot(), "image/png", scenario.getName());
            // scenario.embed(this.screenshotService.getScreenshot(), "image/png", scenario.getName());
        }
    }

    @After
    public void afterScenario(){
        this.applicationContext.getBean(WebDriver.class).quit();
    }
}
