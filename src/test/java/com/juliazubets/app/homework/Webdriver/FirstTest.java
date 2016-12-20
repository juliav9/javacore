package com.juliazubets.app.homework.Webdriver;

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
public class FirstTest {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setup() {
        driver = new FirefoxDriver();
        baseUrl = "https://dev.equerest.com/";
        }

    @Test
    public void myFirstTest(){
                driver.get(baseUrl);

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> linkList = driver.findElements(By.xpath(".//*[@id='banner']//a"));
        Assert.assertTrue(linkList.get(0).getText().contains("Подать проект"));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}

