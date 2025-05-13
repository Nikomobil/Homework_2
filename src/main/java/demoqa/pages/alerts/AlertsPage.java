package demoqa.pages.alerts;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(css = "button[onclick='jsConfirm()']")
    WebElement jsConfirmButton;

    public AlertsPage selectResult(String result) {
        click(jsConfirmButton);
        if (result != null && result.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        } else if (result != null && result.equals("OK")) {
            driver.switchTo().alert().accept();

        }
        return this;
    }

    @FindBy(id = "result")
    WebElement confirmResult;

    public AlertsPage verifyResult(String text) {
        Assert.assertTrue(confirmResult.getText().contains(text));
        return this;
    }

    @FindBy(css = "button[onclick='jsPrompt()']")
    WebElement jsPromptButton;

    public AlertsPage sendMessageToPrompt(String message) {
        click(jsPromptButton);
        if(message != null) {
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }

    public AlertsPage verifyPromptMessage(String text) {
        Assert.assertTrue(confirmResult.getText().contains(text));
        return this;
    }
    @FindBy(css ="button[onclick='jsAlert()']")
    WebElement jsAlertButton;

    public AlertsPage selectResultAlertJs() {
        click(jsAlertButton);
        driver.switchTo().alert().accept();
        return this;
    }

    public AlertsPage verifyResultAlertJs(String text) {
        Assert.assertTrue(confirmResult.getText().equals("You successfully clicked an alert"));
        return this;

    }
}
