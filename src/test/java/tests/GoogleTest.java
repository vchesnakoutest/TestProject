package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class GoogleTest extends BaseTest {
    
    @Test(description = "Search in Google")
    @Description("Validation of search functionality in Google")
    @Link("https://instagram.com/dmitryrak11")
    @Issue("dmitryrak11")
    @TmsLink("dmitryrak11")
    public void googleTest() {
        steps.searchForKeyWord("teachmeskills");
    }
}
