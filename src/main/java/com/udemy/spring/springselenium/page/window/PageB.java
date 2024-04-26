package com.udemy.spring.springselenium.page.window;

import com.udemy.spring.springselenium.kelvin.annotations.Window;
import com.udemy.spring.springselenium.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Window("Page B")
public class PageB  extends BasePage {

    @FindBy(id = "area")
    private WebElement textArea;

    public void addToArea(final String msg){
        this.textArea.sendKeys(msg);
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> this.textArea.isDisplayed());
    }

}
