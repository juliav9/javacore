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
public class DropdownCatalogTest {
    private WebDriver driver;
    private String baseUrl;
    private By searchProject;
    private By searchStage;


    @Before
    public void setup() {
        driver = new FirefoxDriver();
        baseUrl = "https://dev.equerest.com/";
        searchProject = By.id("filter-selector");
        searchStage = By.id("filter-stage");
    }

    @Test
    public void myDropdownCatalogTest() {
        driver.get(baseUrl + "/catalog#/");
        Select oSelectProject = new Select(driver.findElement(searchProject));
        oSelectProject.selectByIndex(2);
        Select oSelectStage = new Select(driver.findElement(searchStage));
        oSelectStage.selectByVisibleText("Работающий бизнес");
        List<WebElement> linkList = driver.findElements(By.xpath("//div[@class='card-header']/h4"));
        Assert.assertTrue(linkList.get(0).getText().contains("Awesome gifts"));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
