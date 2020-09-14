package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.AllureUtils;

@Log4j2
public class GooglePage extends BasePage{

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    @Step("Opening Google")
    public GooglePage openPage() {
        String URL = "http://google.com";
        log.debug("HELLO WORLDS");
        driver.get(URL);
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    @Step("Input {keyword} into search window")
    public GooglePage inputKeyWord(String keyword) {
        By blabla = By.name("asd");
        log.debug("Input of word " + keyword + " into element with locator" + blabla);
        findElement(blabla).sendKeys(keyword);
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    @Step("Click to search button")
    public GooglePage search() {
        findElement(By.name("btnK")).click();
        AllureUtils.takeScreenshot(driver);
        return this;
    }
}
