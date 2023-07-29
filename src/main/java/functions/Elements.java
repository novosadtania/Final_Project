package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
    private final WebDriver driver;
    private final Waiters waiters;


    public Elements(WebDriver driver) {
        this.driver = driver;
        waiters = new Waiters(driver);
    }

    public WebElement findElement(By by) {
        try {
            waiters.waitForVisabilityOfWebElement(by);
            return driver.findElement(by);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void clickOnElement(By by) {
        WebElement element = findElement(by);
        element.click();
    }

    public void sendKeysToElement(By by, String message) {
        WebElement element = findElement(by);
        element.sendKeys(message);
    }

    public String getTextOnElement(By by) {
        return findElement(by).getText();
    }

    public String getTextOnElementString(String string) {
        return string;
    }

    public void clearAll(By by) {
        findElement(by).clear();
    }
    public void clickOnElementAfterWaitForClickable(By by){
        WebElement element = findElement(by);
        waiters.waitToBeClickableOfWebElement(element);
        element.click();
    }
    public int getValueFromElement(By by) {
        WebElement element = findElement(by);
      return Integer.parseInt(element.getAttribute("value"));
    }
public By elementIsClickable(By by){
        WebElement element = findElement(by);
        waiters.waitToBeClickableOfWebElement(element);
        return by;
}

}


