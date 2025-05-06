package demoqa.pages;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SecurePage extends BasePage {


    public SecurePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(id = "flash")
    WebElement welcome;

    public SecurePage verifySecureArea() {
        Assert.assertTrue(welcome.getText().contains("secure area!"), "Error");
        System.out.println("Successful");
        return this;
    }
}
