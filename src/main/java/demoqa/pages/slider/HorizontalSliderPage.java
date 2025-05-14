package demoqa.pages.slider;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HorizontalSliderPage extends BasePage {

    public HorizontalSliderPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(css = "input[value='0']")
    WebElement sliderInput;

    public HorizontalSliderPage moveSliderToTheEnd() {
        pause(1000);
        moveWithJS(0,100);
        new Actions(driver).dragAndDropBy(sliderInput, 60,0).perform();

        return this;
    }
    @FindBy(id = "range")
    WebElement result;

    public HorizontalSliderPage verifySliderValue(String number) {
        Assert.assertEquals(result.getText(),number);
        return this;
    }
}
