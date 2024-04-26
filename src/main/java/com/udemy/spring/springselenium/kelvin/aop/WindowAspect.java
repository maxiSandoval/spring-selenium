package com.udemy.spring.springselenium.kelvin.aop;

import com.udemy.spring.springselenium.kelvin.annotations.Window;
import com.udemy.spring.springselenium.kelvin.service.WindowSwitchService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class WindowAspect {

    @Autowired
    private WindowSwitchService switchService;

    // PointCut expressions
    // any window tag class within that package, when a method within that class is invoked
    // called this method
    @Before("@target(window) && within(com.udemy.spring.springselenium..*)")
    public void before(Window window) {
        this.switchService.switchByTitle(window.value());
    }

    // switch back to main page
    @After("@target(window) && within(com.udemy.spring.springselenium..*)")
    public void after(Window window) {
        this.switchService.switchByIndex(0);
    }

}
