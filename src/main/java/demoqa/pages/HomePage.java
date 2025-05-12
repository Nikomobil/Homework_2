package demoqa.pages;

import demoqa.core.BasePage;
import demoqa.pages.frame.FramePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(css = "a[href='/login']")
    WebElement formAuth;

    public LoginPage selectFormAuthentication() {
        click(formAuth,0,200);
        return new LoginPage(driver,wait);
    }
    @FindBy(css = "a[href='/nested_frames']")
    WebElement nestedFrames;

    public FramePage selectNestedFrames() {
        click(nestedFrames,0,300);
        return new FramePage(driver,wait);
    }
}
