package com.udemy.spring.springselenium.googletest;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.udemy.spring.springselenium.SpringBaseTestNGTest;
import com.udemy.spring.springselenium.kelvin.annotations.LazyAutowired;
import com.udemy.spring.springselenium.kelvin.service.ScreenshotService;
import com.udemy.spring.springselenium.page.google.GooglePage;

public class Google2Test extends SpringBaseTestNGTest {

    @LazyAutowired
    private GooglePage googlePage;

    @LazyAutowired
    private ScreenshotService screenShotUtil;

    @Test
    public void googleTest2() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());
        this.googlePage.getSearchComponent().search("selenium ");
        Assert.assertTrue(this.googlePage.getSearchResultComponent().isAt());
        Assert.assertTrue(this.googlePage.getSearchResultComponent().getCount() > 2);
        this.screenShotUtil.takeScreenshot();
        this.googlePage.close();
    }

}
