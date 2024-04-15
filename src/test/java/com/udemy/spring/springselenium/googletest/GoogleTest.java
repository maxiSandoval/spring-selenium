package com.udemy.spring.springselenium.googletest;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

import com.udemy.spring.springselenium.SpringBaseTestNGTest;
import com.udemy.spring.springselenium.page.google.GooglePage;
import com.udemy.spring.springselenium.utils.ScreenShotUtil;

public class GoogleTest extends SpringBaseTestNGTest {

    @Autowired
    private GooglePage googlePage;

    @Autowired
    private ScreenShotUtil screenShotUtil;

    @Test
    public void googleTest() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());
        this.googlePage.getSearchComponent().search("enviroment ");
        Assert.assertTrue(this.googlePage.getSearchResultComponent().isAt());
        Assert.assertTrue(this.googlePage.getSearchResultComponent().getCount() > 2);
        this.screenShotUtil.takeScreenShot("googleTest");
    }

}
