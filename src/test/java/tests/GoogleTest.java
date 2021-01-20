package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class GoogleTest extends BaseTest {

    @Test(description = "Search in Google")
    @Description("Validation of search functionality in Google")
    @Link("https://github.com/vchesnakoutest")
    @Issue("vchesnakoutest")
    @TmsLink("vchesnakoutest")
    public void googleTest() {
        steps.searchForKeyWord("teachmeskills");
    }
}
