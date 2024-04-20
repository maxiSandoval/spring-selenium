package com.udemy.spring.springselenium.page.flights;

import com.udemy.spring.springselenium.kelvin.annotations.Page;
import com.udemy.spring.springselenium.kelvin.annotations.TakeScreenshot;
import com.udemy.spring.springselenium.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

@Page
public class FlightPage extends BasePage {

    @FindBy(css = "nav span.VfPpkd-vQzf8d")
    private List<WebElement> elements;

    public void goTo(final String url){
        this.driver.get(url);
        this.driver.manage().window().maximize();
    }

    @TakeScreenshot
    public List<String> getLabels(){
       return this.elements
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .collect(Collectors.toList());
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> !this.elements.isEmpty());
    }

}
