package com.juliazubets.app.homework.webdriver.tests;

import com.juliazubets.app.homework.webdriver.pages.GoogleSRPage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Julia Zubets on 12/24/2016.
 */
public class GoogleSRPageTest extends BaseTest{

    @Test
    public void searchForQ() {
        driver.get("http://www.google.com/");
        GoogleSRPage page = PageFactory.initElements(driver, GoogleSRPage.class);
        page.searchFor("Cheese");
    }
}