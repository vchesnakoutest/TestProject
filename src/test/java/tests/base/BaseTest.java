package tests.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import steps.GoogleSteps;
import utils.CapabilitiesGenerator;

@Log4j2
@Listeners(TestListener.class)
public class BaseTest {
    
    public WebDriver driver;
    protected GoogleSteps steps;
    
    @BeforeMethod(description = "Opening Chrome Driver")
    public void createDriver(ITestContext context) {
        try {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(CapabilitiesGenerator.getChromeOptions());
        } catch (SessionNotCreatedException ex) {
            Assert.fail("Браузер не был открыт. Проверьте, что используется корректная версия драйвера");
            log.fatal(ex.getLocalizedMessage());
        }
        steps = new GoogleSteps(driver);
        String variable = "driver";
        System.out.println("Setting driver into context with variable name " + variable);
        context.setAttribute(variable, driver);
    }
    
    @AfterMethod (alwaysRun = true)
    public void closeDriver() {
        if(driver != null) {
            driver.quit();
        }
    }
}
