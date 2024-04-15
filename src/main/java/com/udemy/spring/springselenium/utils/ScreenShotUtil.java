package com.udemy.spring.springselenium.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

@Component
public class ScreenShotUtil {
    
    @Autowired
    private TakesScreenshot driver;

    @Value("${screenshot.path}")
    private Path path;

    public void takeScreenShot(final String imgName) throws IOException{
        File sourceFile = this.driver.getScreenshotAs(OutputType.FILE);
        FileCopyUtils.copy(sourceFile, this.path.resolve(imgName + ".png").toFile());
    }

}
