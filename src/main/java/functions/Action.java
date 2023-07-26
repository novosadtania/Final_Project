package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
    private final WebDriver driver;
    private final Elements elements;
    private final Actions actions;

    public Action(WebDriver driver){
        this.driver = driver;
        elements = new Elements(driver);
        actions = new Actions(driver);
    }

    public void moveTo(By forDogsLocator){
        actions.moveToElement(elements.findElement(forDogsLocator)).perform();
    }
}
