package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Assertions {
    private final WebDriver driver;
    private final Elements elements;
    private final Waiters waiters;
    private final Action action;

    public Assertions(WebDriver driver) {
        this.driver = driver;
        elements = new Elements(driver);
        waiters = new Waiters(driver);
        action = new Action(driver);
    }

    public void equalsText(String actual, String expected) {
        assertEquals(actual, expected,
                "Очікувалося отримати такий текст: " + expected + ". А отримано :  " + actual + ".");

    }
public void elementIsLocated(By by){
        assertTrue(elements.presentElement(by));
}
}
