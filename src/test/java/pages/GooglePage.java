package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.AllureUtils;

@Log4j2
public class GooglePage extends BasePage {

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
        By searchInput = By.name("q");
        log.debug("Input of word " + keyword + " into element with locator" + searchInput);
        findElement(searchInput).sendKeys(keyword);
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    @Step("Click to search button")
    public GooglePage search() {
        By searchInput = By.name("q");
        findElement(searchInput).sendKeys(Keys.ENTER);
        AllureUtils.takeScreenshot(driver);
        return this;
    }
}
