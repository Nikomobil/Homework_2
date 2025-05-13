package demoqa.tests.alerts;

import demoqa.core.TestBase;
import demoqa.pages.HomePage;
import demoqa.pages.alerts.AlertsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase {

    @BeforeMethod
    public void preCondition() {
        new HomePage(app.driver, app.wait)
                .selectJsAlerts();
    }

    @Test
    public void alertJsTest() {
        new AlertsPage(app.driver, app.wait)
                .selectResultAlertJs()
                .verifyResultAlertJs("You successfully clicked an alert")
        ;
    }

    @Test
    public void confirmJsTest() {
        new AlertsPage(app.driver, app.wait)
                .selectResult("OK")
                .verifyResult("Ok");
    }

    @Test
    public void promptJsTest() {
        new AlertsPage(app.driver, app.wait)
                .sendMessageToPrompt("Hello")
                .verifyPromptMessage("Hello");
    }
}
