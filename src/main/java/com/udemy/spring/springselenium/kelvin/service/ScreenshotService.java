package com.udemy.spring.springselenium.kelvin.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import com.github.javafaker.Faker;

@Lazy
@Service
public class ScreenshotService {
    /*
     * @Autowired
     * private TakesScreenshot driver;
     * instead than use scope prototype , we are using the context
     */

    @Autowired
    private ApplicationContext ctx;

    @Value("${screenshot.path}")
    private Path path;

    @Autowired
    private Faker faker;

    public void takeScreenshot() throws IOException {
        File sourceFile = this.ctx.getBean(TakesScreenshot.class).getScreenshotAs(OutputType.FILE);
        FileCopyUtils.copy(sourceFile, this.path.resolve(faker.name().firstName() + ".png").toFile());
    }

    public byte[] getScreenshot() {
        return this.ctx.getBean(TakesScreenshot.class).getScreenshotAs(OutputType.BYTES);
    }
}
