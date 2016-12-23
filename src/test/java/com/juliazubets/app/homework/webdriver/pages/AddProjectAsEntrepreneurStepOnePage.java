package com.juliazubets.app.homework.webdriver.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Julia Zubets on 12/23/2016.
 */
public class AddProjectAsEntrepreneurStepOnePage extends AbstractPage {

    public By name = By.id("fio");
    public By city = By.id("city");
    public By phone = By.id("tel");
    public By email = By.id("mail");
    public By password = By.id("pass");
    public By step2Button = By.xpath("//*[@class = 'button button-blue button-next']");
    public By toastMessage = By.xpath("//*[@class='toast-message']");

    public AddProjectAsEntrepreneurStepOnePage(WebDriver driver) {
        super(driver);
    }

    public AddProjectAsEntrepreneurStepOnePage fillField(By name, String text) {
        WebElement webElement = driver.findElement(name);
        webElement.clear();
        webElement.sendKeys(text);
        Assert.assertEquals(text, driver.findElement(name).getAttribute("value"));
        return this;
    }

    public AddProjectAsEntrepreneurStepTwoPage clickOnGoToStep2() {
        driver.findElement(step2Button).click();
        return new AddProjectAsEntrepreneurStepTwoPage(driver);
    }

    public void assertValidationMessage(String alertText) {
        WebElement em = driver.findElement(toastMessage);
        String actualEm = em.getAttribute("aria-label");
        Assert.assertEquals(alertText, actualEm);
    }
}