package com.juliazubets.app.homework.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Julia Zubets on 12/23/2016.
 */
public class AddProjectAsEntrepreneurStepTwoPage extends AbstractPage{

    public By projectName = By.id("title");
    public By projectDescription = By.id("full_description");
    public By radiobutton = By.id("radio_2");

    public AddProjectAsEntrepreneurStepTwoPage(WebDriver driver){
        super(driver);
    }


    public void selectBusinessForSale() {

        WebElement radioBtn = driver.findElement(radiobutton);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);", radioBtn);

        Actions actions = new Actions(driver);
        actions.moveToElement(radioBtn).click().perform();
        //boolean result = radioBtn.isSelected();



        //driver.findElement(radiobutton).click();
      //  driver.findElement(By.id("radio_2")).click();
    }
}