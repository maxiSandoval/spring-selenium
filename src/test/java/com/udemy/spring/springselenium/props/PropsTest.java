package com.udemy.spring.springselenium.props;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.testng.annotations.Test;

import com.udemy.spring.springselenium.SpringBaseTestNGTest;

public class PropsTest extends SpringBaseTestNGTest {

    @Autowired
    private ResourceLoader loader;

    @Test
    public void propsTest() throws IOException {
        Properties properties = PropertiesLoaderUtils.loadProperties(loader.getResource("classpath:properties/my.properties"));
        System.out.println(
                properties);
    }

}