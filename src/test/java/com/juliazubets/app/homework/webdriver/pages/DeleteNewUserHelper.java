package com.juliazubets.app.homework.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Julia Zubets on 1/3/2017.
 */
public class DeleteNewUserHelper extends AbstractPage {

    public By logoutButton = By.id("logout");

    public DeleteNewUserHelper(WebDriver driver) {
        super(driver);
    }

    public DeleteNewUserHelper clickOnLogoutButon() {
        driver.findElement(logoutButton).click();
        return new DeleteNewUserHelper(driver);
    }
}
