package tests.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.GoogleSteps;

public class BaseTest {
    
    private WebDriver driver;
    protected GoogleSteps steps;
    
    @BeforeMethod(description = "Opening Chrome Driver")
    public void createDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/linux/chromedriver");
        driver = new ChromeDriver();
        steps = new GoogleSteps(driver);
    }
    
    @AfterMethod
    public void closeDriver() {
        driver.quit();
    }
}
