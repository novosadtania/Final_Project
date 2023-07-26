package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage  extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private static class Labels {
        private final static String url = "https://pethouse.ua/";
        private final static String textToTranslate = "Акції та знижки";
        private final static String nameOfBrends = "Natural";
        private final static String nameOfGoods = "Канат";
        private final static String notVariableText = "qwerty";

    }
    private static class Locators {
        private final static By dropdownForDogs = By.xpath("//ul[@style='display: block;']");
        private final static By languageUkr = By.xpath("//a[text() ='Укр']");
        private final static By languageRuss = By.xpath("//a[text() ='Рос']");
        private final static By searchLine = By.id("search");
        private final static By lineResultFromSearch = By.xpath("//div[@class = 'search-title']");
        private final static By dropdownForDogs = By.xpath("//ul[@style='display: block;']");
        private final static By languageUkr = By.xpath("//a[text() ='Укр']");
        private final static By languageRuss = By.xpath("//a[text() ='Рос']");
        private final static By searchLine = By.id("search");
    }
}
