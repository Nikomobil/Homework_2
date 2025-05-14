package demoqa.pages.drodown;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DropDownPage extends BasePage {

    public DropDownPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(id = "dropdown")
    WebElement dropDown;

    public DropDownPage selectOpton(String option) {
        Select select = new Select(dropDown);
        select.selectByVisibleText(option);
        return this;
    }

    public DropDownPage verifySelectedOption() {
//        new Select(dropDown).getFirstSelectedOption();
//        Assert.assertTrue(new Select(dropDown)
//                .getFirstSelectedOption().getText().contains(option));
        String firstSelectedOption = new Select(dropDown).getFirstSelectedOption().getText();
        Assert.assertTrue(shoouldHaveText(dropDown, firstSelectedOption,5));
        return this;
    }
}
