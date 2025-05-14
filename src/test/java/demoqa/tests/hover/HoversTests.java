package demoqa.tests.hover;

import demoqa.core.TestBase;
import demoqa.pages.HomePage;
import demoqa.pages.hovers.HoversPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoversTests extends TestBase {

    @BeforeMethod
    public void preCondition() {
        new HomePage(app.driver, app.wait)
                .selectHovers();
    }

    @Test
    public void hoversTest() {
        new HoversPage(app.driver, app.wait)
                .selectHovers()
                .verifyTitle();
    }
}
