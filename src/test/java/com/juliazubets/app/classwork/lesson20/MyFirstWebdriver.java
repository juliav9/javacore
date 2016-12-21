package com.juliazubets.app.classwork.lesson20;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by Julia Zubets on 12/7/2016.
 */
public class MyFirstWebdriver {

    By searchField = By.name("q");
    //By searchResultElementsLink = By.xpath("//*[@class='g']//a");

    @Test
    public void myFirstWebDriverTest(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        WebElement searchInput = driver.findElement(searchField);
        searchInput.sendKeys("Monkey");
        searchInput.submit();

        try {
        Thread.sleep(7000);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }

        List<WebElement> linkList = driver.findElements(By.xpath("//*[@id='rso']//a"));
        System.out.println(linkList.size());
        Assert.assertTrue(linkList.get(0).getText().contains("Monkey"));




        //try {
           // Thread.sleep(100000);
        //} catch (InterruptedException e) {
         //   e.printStackTrace();
       // }

    }
}
//обязательно close, before after