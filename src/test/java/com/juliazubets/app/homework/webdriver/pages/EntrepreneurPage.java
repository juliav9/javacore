package com.juliazubets.app.homework.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Julia Zubets on 12/21/2016.
 */
public class EntrepreneurPage extends AbstractPage{
    public static final String URL = BASE_URL + "info/entrepreneur";
    private static final By ADD_PROJECT_BUTTON = By.xpath("//*[@href = \"/equerest#/entrepreneur\"]");

    public EntrepreneurPage(WebDriver driver){
        super(driver, URL);
    }

    public AddProjectAsEntrepreneurStepOnePage clickOnSubmitProjectButton() {
        driver.findElement(ADD_PROJECT_BUTTON).click();
        return new AddProjectAsEntrepreneurStepOnePage(driver);
    }
}