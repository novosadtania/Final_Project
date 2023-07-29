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

    public void containtsText(String actual, String excepted) {
        assertTrue(excepted.contains(actual));
    }

    public void elementIsDisplay(By by) {
        assertTrue(elements.findElement(by).isDisplayed());
    }



    public void equalsInt(int actual, int expected) {
        assertEquals(actual, expected,
                "Очікувалося отримати таку цифру: " + expected + ". А отримано :  " + actual + ".");
}
}

