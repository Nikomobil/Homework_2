package demoqa.pages;

import demoqa.core.BasePage;
import demoqa.pages.alerts.AlertsPage;
import demoqa.pages.drodown.DropDownPage;
import demoqa.pages.frame.FramePage;
import demoqa.pages.hovers.HoversPage;
import demoqa.pages.slider.HorizontalSliderPage;
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

    @FindBy(css = "a[href='/javascript_alerts']")
    WebElement jsAlerts;

    public AlertsPage selectJsAlerts() {
        click(jsAlerts,0,200);
        return new AlertsPage(driver,wait);
    }

    @FindBy(css = "a[href='/horizontal_slider']")
    WebElement horizontalSlider;

    public HorizontalSliderPage selectHorizontalSlider() {
        click(horizontalSlider,0,200);
        return new HorizontalSliderPage(driver,wait);
    }
    @FindBy(css = "a[href='/hovers']")
    WebElement hovers;

    public HoversPage selectHovers() {
        click(hovers,0,200);
        return new HoversPage(driver,wait);
    }

    @FindBy(css = "a[href='/dropdown']")
    WebElement dropDown;

    public DropDownPage selectDropDown() {
        click(dropDown,0,200);
        return new DropDownPage(driver,wait);
    }
}
