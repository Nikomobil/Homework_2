package demoqa.tests.dropdown;

import demoqa.core.TestBase;
import demoqa.pages.HomePage;
import demoqa.pages.drodown.DropDownPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dropDownTest extends TestBase {

    @BeforeMethod
    public void preCondition() {
        new HomePage(app.driver, app.wait)
                .selectDropDown();
    }

    @Test
    public void dropDownTest() {
        new DropDownPage(app.driver,app.wait)
                .selectOpton("Option 1")
                .verifySelectedOption();
    }
}
