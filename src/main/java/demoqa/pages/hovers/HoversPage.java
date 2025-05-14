package demoqa.pages.hovers;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static com.google.common.io.Files.move;

public class HoversPage extends BasePage {

    public HoversPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(xpath = "//div[@class='example']//div[1]//img[1]")
    WebElement image1;

    public HoversPage selectHovers() {
        pause(1000);
        moveWithJS(0,200);
        Actions actions = new Actions(driver);
        actions.moveToElement(image1).perform();
        return this;
    }

    public HoversPage verifyTitle() {
        Assert.assertTrue(isElementDisplayed(image1));
        return this;
    }
}
