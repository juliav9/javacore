package com.juliazubets.app.homework.webdriver.tests.equerest;

import com.juliazubets.app.homework.webdriver.pages.AddProjectAsEntrepreneurStepOnePage;
import com.juliazubets.app.homework.webdriver.pages.AddProjectAsEntrepreneurStepTwoPage;
import com.juliazubets.app.homework.webdriver.pages.EntrepreneurPage;
import com.juliazubets.app.homework.webdriver.tests.BaseTest;
import org.junit.Test;

/**
 * Created by Julia Zubets on 12/23/2016.
 */
public class AddNewProjectAsEnterpreneurTest  extends BaseTest {

    @Test
    public void testNewEmail() {
        EntrepreneurPage entrepreneurPage = new EntrepreneurPage(driver);

        AddProjectAsEntrepreneurStepOnePage addProjOnePage = entrepreneurPage.clickOnSubmitProjectButton();

        AddProjectAsEntrepreneurStepTwoPage secondPage = addProjOnePage
                .fillField(addProjOnePage.name,"Juli")
                .fillField(addProjOnePage.city, "Kyiv")
                .fillField(addProjOnePage.phone, "+380630000000")
                .fillField(addProjOnePage.email, "test113@mail.ru")
                .fillField(addProjOnePage.password, "Dev12345")
                .clickOnGoToStep2();

        secondPage
                .fillField(secondPage.projectName,"Test")
                .fillField(secondPage.projectDescription, "Test");
        secondPage.fillStage();
        secondPage
                .fillField(secondPage.advantages,"Test")
                .fillField(secondPage.monetizationModel,"Test");

        secondPage
                .fillField(secondPage.requiredAmount, "444");
        secondPage.clickOnCheckboxAgree();
        secondPage.endRegistration();
    }

}