package com.juliazubets.app.homework.webdriver.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by Julia Zubets on 12/20/2016.
 */
public class NewProjectButtonTest {
    private WebDriver driver;
    private String baseUrl;
    private By searchButton;
    private By nextStepButton;


    @Before
    public void setup() {
        driver = new FirefoxDriver();
        baseUrl = "https://dev.equerest.com/";
        searchButton = By.xpath(".//*[@id='banner']//a");
        nextStepButton = By.xpath(".//*[@id='entrepreneur-equerest-form']//button");
    }

    @Test
    public void myDropdownCatalogTest() {
        driver.get(baseUrl + "info/entrepreneur");
        WebElement searchInput = driver.findElement(searchButton);
        searchInput.click();
        List<WebElement> linkList = driver.findElements(nextStepButton);
        Assert.assertTrue(linkList.get(0).getText().contains("Перейти к шагу 2"));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
