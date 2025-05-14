package demoqa.tests.slider;

import demoqa.core.TestBase;
import demoqa.pages.HomePage;
import demoqa.pages.slider.HorizontalSliderPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderTests extends TestBase {

    @BeforeMethod
    public void preCondition() {
        new HomePage(app.driver, app.wait)
                .selectHorizontalSlider();
    }

    @Test
    public void sliderTest() {
        new HorizontalSliderPage(app.driver, app.wait)
                .moveSliderToTheEnd()
                .verifySliderValue("5");
    }

}
