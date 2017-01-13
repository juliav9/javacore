package com.juliazubets.app.homework.webdriver.tests;

import com.juliazubets.app.homework.webdriver.pages.EntrepreneurPage;
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
public class NewProjectButtonTest extends BaseTest {


    @Test
    public void myDropdownCatalogTest() {
        EntrepreneurPage entrepreneurPage = new EntrepreneurPage(driver);
        entrepreneurPage.clickOnSubmitProjectButton()
        .clickOnGoToStep2();
    }

}
