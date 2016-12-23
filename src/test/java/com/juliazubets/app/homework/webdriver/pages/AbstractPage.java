package com.juliazubets.app.homework.webdriver.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Julia Zubets on 12/21/2016.
 */
public abstract class AbstractPage {
    WebDriver driver;
    public static final String BASE_URL = "https://dev.equerest.com/";

    public AbstractPage(WebDriver driver, String url){
        this.driver = driver;
        driver.navigate().to(url);
    }
    public AbstractPage(WebDriver driver){
        this.driver = driver;
    }
}