package com.udemy.spring.springselenium.kelvin.aop;

import java.io.IOException;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.udemy.spring.springselenium.kelvin.annotations.TakeScreenshot;
import com.udemy.spring.springselenium.kelvin.service.ScreenshotService;

@Aspect
@Component
public class ScreenshotAspect {
    
    @Autowired
    public ScreenshotService screenshotService;

    @After("@annotation(takeScreenshot)")
    public void after(TakeScreenshot takeScreenshot) throws IOException {
        this.screenshotService.takeScreenshot();
    } 
}
