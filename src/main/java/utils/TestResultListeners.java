package utils;

import driver.DriverFactory;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestResultListeners implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        var srcFile = ((TakesScreenshot) DriverFactory.startChromeDriver()).getScreenshotAs(OutputType.BYTES);
        saveScreenshort(srcFile);

    }

    @Attachment(value = "Page screenshot", type = "image/png")
    private byte[] saveScreenshort(byte[] screenshot) {
        return screenshot;
    }
}
