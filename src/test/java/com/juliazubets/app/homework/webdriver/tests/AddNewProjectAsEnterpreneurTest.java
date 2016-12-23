package com.juliazubets.app.homework.webdriver.tests;

import com.juliazubets.app.homework.webdriver.pages.AddProjectAsEntrepreneurStepOnePage;
import com.juliazubets.app.homework.webdriver.pages.AddProjectAsEntrepreneurStepTwoPage;
import com.juliazubets.app.homework.webdriver.pages.EntrepreneurPage;
import org.junit.Test;

/**
 * Created by Julia Zubets on 12/23/2016.
 */
public class AddNewProjectAsEnterpreneurTest  extends BaseTest{

    @Test
    public void testNewEmail(){
        EntrepreneurPage entrepreneurPage = new EntrepreneurPage(driver);

        AddProjectAsEntrepreneurStepOnePage addProjectAsEntrepreneurStepOnePage = entrepreneurPage.clickOnSubmitProjectButton();
        AddProjectAsEntrepreneurStepOnePage refs = new AddProjectAsEntrepreneurStepOnePage(driver);
        addProjectAsEntrepreneurStepOnePage

                .fillField(refs.name,"Juli")
                .fillField(refs.city, "Kyiv")
                .fillField(refs.phone, "+380630000000")
                .fillField(refs.email, "test11@mail.ru")
                .fillField(refs.password, "Dev12345")
                .clickOnGoToStep2();

        AddProjectAsEntrepreneurStepTwoPage secondPage = new AddProjectAsEntrepreneurStepTwoPage(driver);
        addProjectAsEntrepreneurStepOnePage
                .fillField(secondPage.projectName,"Test")
                .fillField(secondPage.projectDescription, "Test");
        secondPage.selectBusinessForSale();


    }

}