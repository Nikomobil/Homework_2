package demoqa.tests.auth;

import demoqa.core.TestBase;
import demoqa.pages.BasicAuth;
import demoqa.pages.HomePage;
import org.testng.TestNG;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(app.driver,app.wait).getBasicAuth();

    }

    @Test
    public void basicAuthPositiveTest(){
        new BasicAuth(app.driver, app.wait)
                .isAlertDisplayed()
                .enterPersonalData("","")
                .clickSignIn()
                .verifyUserName();
    }
}
