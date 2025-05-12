package demoqa.tests.frame;

import demoqa.core.TestBase;
import demoqa.pages.HomePage;
import demoqa.pages.frame.FramePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFrame extends TestBase {

    @BeforeMethod
    public void preCondition() {
        new HomePage(app.driver, app.wait)
                .selectNestedFrames();
    }

    @Test
    public void iFrameTest() {
        new FramePage(app.driver, app.wait)
                .returnListOfFrames()
                .switchToFrameByIndex(1);

    }
}
