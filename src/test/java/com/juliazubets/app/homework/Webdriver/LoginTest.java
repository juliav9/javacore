package com.juliazubets.app.homework.Webdriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by Julia Zubets on 12/20/2016.
 */
public class LoginTest {
    private WebDriver driver;
    private String baseUrl;
    private By searchEmail;
    private By searchPassword;


    @Before
    public void setup() {
        driver = new FirefoxDriver();
        baseUrl = "https://dev.equerest.com/";
        searchEmail = By.id("email");
        searchPassword = By.id("password");
    }

    @Test
    public void myDropdownCatalogTest() throws InterruptedException {
        driver.get(baseUrl + "register#/");
        WebElement searchInput = driver.findElement(searchEmail);
        searchInput.sendKeys("ss@s.ss");
        WebElement searchInput2 = driver.findElement(searchPassword);
        searchInput2.sendKeys("12345678Q");
        searchInput.submit();
        Thread.sleep(7000);
        List<WebElement> linkList = driver.findElements(By.xpath("//div[@class='title']/h1/span"));
        Assert.assertTrue(linkList.get(0).getText().contains("Test"));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
