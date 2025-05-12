package demoqa.pages.frame;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class FramePage extends BasePage {

    public FramePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(css = "frame[name='frame-top']")
    List<WebElement> frames;

    public FramePage returnListOfFrames() {
        System.out.println("Number of frames: " + frames.size());
        Integer numberOfFrames = Integer.parseInt(js.executeScript("return window.length").toString());
        System.out.println("Total number of frames: " + numberOfFrames);

        return this;
    }

    @FindBy(css = "frame[name='frame-left']")
    WebElement frameLeft;

    public FramePage switchToFrameByIndex(int index) {
        driver.switchTo().frame(index);
        return this;
    }


}
