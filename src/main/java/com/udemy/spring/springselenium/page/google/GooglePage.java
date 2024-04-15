package com.udemy.spring.springselenium.page.google;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.udemy.spring.springselenium.page.BasePage;

@Component
public class GooglePage extends BasePage {

    @Autowired
    private SearchComponent searchComponent;

    @Autowired
    private SearchResultComponent searchResultComponent;

    @Value("${application.url}")
    private String url;

    public void goTo() {
        this.driver.get(url);
    }

    public SearchComponent getSearchComponent() {
        return searchComponent;
    }

    public SearchResultComponent getSearchResultComponent() {
        return searchResultComponent;
    }

    @Override
    public boolean isAt() {
        return this.searchComponent.isAt();
    }

}
