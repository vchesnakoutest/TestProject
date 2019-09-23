package tests.base;

import io.qameta.allure.Attachment;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class TestListener implements ITestListener {
    
    public void onTestStart(ITestResult iTestResult) {
    }
    
    public void onTestSuccess(ITestResult iTestResult) {
    }

    public void onTestFailure(ITestResult iTestResult) {
       //takeScreenshot();
    }

    public void onTestSkipped(ITestResult iTestResult) {
        //takeScreenshot();
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }

    @Attachment(value = "Last screen state", type = "image/png")
    private byte[] takeScreenshot(WebDriver driver) {
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
