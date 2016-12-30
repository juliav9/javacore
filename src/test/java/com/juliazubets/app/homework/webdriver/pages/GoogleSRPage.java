package com.juliazubets.app.homework.webdriver.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Julia Zubets on 12/24/2016.
 */
public class GoogleSRPage {
    @FindBy(how = How.NAME, using = "q")

    private WebElement searchBox;
    public void searchFor(String text) {
        searchBox.sendKeys(text);
        searchBox.submit();
    }
}
