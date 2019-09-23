package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.AllureUtils;

public class GooglePage extends BasePage{
    
    public GooglePage(WebDriver driver) {
        super(driver);
    }
    
    public GooglePage openPage() {
        driver.get("http://google.com");
        AllureUtils.takeScreenshot(driver);
        return this;
    }
    
    public GooglePage inputKeyWord(String keyword) {
        driver.findElement(By.name("q")).sendKeys(keyword);
        AllureUtils.takeScreenshot(driver);
        return this;
    }
    
    public GooglePage search() {
        driver.findElement(By.name("btnK")).click();
        AllureUtils.takeScreenshot(driver);
        return this;
    }
}
