package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage  extends BasePage {
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
        private final static By lineDogs = By.xpath("//li[@id='tpl-top-menu-first-li-1']/a");
        private final static By dropdownForDogs = By.xpath("//ul[@style='display: block;']");
        private final static By languageUkr = By.xpath("//a[text() ='Укр']");
        private final static By languageRuss = By.xpath("//a[text() ='Рос']");
        private final static By textAfterTranslate = By.xpath("//div[@class='z-main-section-header']/h2");
        private final static By searchLine = By.id("search");
        private final static By dropdownResultFromSearch = By.xpath("//div[@id='search-box']/div/a");
        private final static By dropdownResultNothingFromSearch = By.xpath("//div[@id='search-box']/div/span");

    }

    public void openMainPage() {
        driver.get(Labels.url);
    }

    public void clickOnUkr() {
        elements.clickOnElement(Locators.languageUkr);
    }

    public void clickOnRuss() {
        elements.clickOnElement(Locators.languageRuss);
    }

    public void sendKeysToElementNameOfBrends() {
        elements.sendKeysToElement(Locators.searchLine, Labels.nameOfBrends);
    }

    public void sendKeysToElementNameOfGoods() {
        elements.sendKeysToElement(Locators.searchLine, Labels.nameOfGoods);
    }

    public void sendKeysToElementNotVariableText() {
        elements.sendKeysToElement(Locators.searchLine, Labels.notVariableText);
    }

    public void presentDropdownForDogs() {
        elements.presentElement(Locators.dropdownForDogs);
    }

    public void presentDropdownResultNothingFromSearch() {
        elements.presentElement(Locators.dropdownResultNothingFromSearch);
    }

    public void presentDropdownResultFromSearch() {
        elements.presentElement(Locators.dropdownResultFromSearch);
    }

    public String textOnElementsAfterTranslate() {
        return elements.getTextOnElement(Locators.textAfterTranslate);

    }

    public String textOnElementsAfterTranslate2() {
        return elements.getTextOnElementString(Labels.textToTranslate);
    }
}