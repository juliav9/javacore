package com.juliazubets.app.homework.webdriver.tests.equerest;

import com.juliazubets.app.homework.webdriver.pages.AddProjectAsEntrepreneurStepOnePage;
import com.juliazubets.app.homework.webdriver.pages.EntrepreneurPage;
import com.juliazubets.app.homework.webdriver.tests.BaseTest;
import org.junit.Test;

/**
 * Created by Julia Zubets on 12/23/2016.
 */
public class AddProjectAsEntrepreneurTests extends BaseTest {

    @Test
    public void testExistingEmail(){
        EntrepreneurPage entrepreneurPage = new EntrepreneurPage(driver);
        AddProjectAsEntrepreneurStepOnePage addProjectAsEntrepreneurStepOnePage = entrepreneurPage.clickOnSubmitProjectButton();
        AddProjectAsEntrepreneurStepOnePage refs = new AddProjectAsEntrepreneurStepOnePage(driver);
        addProjectAsEntrepreneurStepOnePage
                .fillField(refs.name,"Vlady2")
                .fillField(refs.city, "Kyiv")
                .fillField(refs.phone, "+380630000000")
                .fillField(refs.email, "test@mail.ru")
                .fillField(refs.password, "Dev12345")
                .clickOnGoToStep2();
        addProjectAsEntrepreneurStepOnePage.assertValidationMessage("Пользователь с таким e-mail уже зарегестрирован.");
    }

}
