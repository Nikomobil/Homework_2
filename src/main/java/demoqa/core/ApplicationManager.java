package demoqa.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ApplicationManager {

    public WebDriver driver;
    public WebDriverWait wait;

    protected void init() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// неявное ожидание
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));// страница прогружается полностью
        driver.get("https://the-internet.herokuapp.com/");
    }

    protected void stop() {
        driver.quit();
    }
}
