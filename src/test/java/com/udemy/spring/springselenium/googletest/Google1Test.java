package com.udemy.spring.springselenium.googletest;

import java.io.IOException;

import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

import com.udemy.spring.springselenium.SpringBaseTestNGTest;
import com.udemy.spring.springselenium.kelvin.service.ScreenshotService;
import com.udemy.spring.springselenium.page.google.GooglePage;

public class Google1Test extends SpringBaseTestNGTest {

    @Autowired
    private GooglePage googlePage;

    @Autowired
    private ScreenshotService screenShotUtil;

    @Test
    public void googleTest1() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());
        this.googlePage.getSearchComponent().search("enviroment ");
        Assert.assertTrue(this.googlePage.getSearchResultComponent().isAt());
        Assert.assertTrue(this.googlePage.getSearchResultComponent().getCount() > 2);
        this.screenShotUtil.takeScreenShot("googleTest");
        this.googlePage.close();
    }

}
