package demoqa.core;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;
    public JavascriptExecutor js;

    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    public void click(WebElement element) {
        element.click();
    }

    public void click(WebElement element, int x, int y) {
        js.executeScript("window.scrollBy(" + x + "," + y + ")");
        click(element);
    }

    public void type(WebElement element, String text) {
        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }
    public void pause(int millis){
        try {
            Thread.sleep(millis);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
    public void moveWithJS(int x,int y){
        js.executeScript("window.scrollBy(" + x + "," + y + ")");
    }

    public boolean isElementDisplayed(WebElement element){
        try{
            element.isDisplayed();
            return true;
        }catch (NoSuchElementException ex){
            ex.getMessage();
            return false;

        }
    }
    public boolean shoouldHaveText(WebElement element,String text,int time){
        return new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.textToBePresentInElement(element,text));
    }
}
