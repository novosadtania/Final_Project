package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage() {
        driver.get(Labels.url);
    }

    public void clickOnButtonLanguageUkr() {
        elements.clickOnElement(Locators.buttonLanguageUkr);
    }

    public void clickOnButtonLanguageRuss() {
        elements.clickOnElement(Locators.buttonLanguageRuss);
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

    public String textOnElementsAfterTranslateFromLocators() {
        return elements.getTextOnElementWithWaiters(Locators.textAfterTranslate);

    }

    public String textOnElementsAfterTranslateFromLables() {
        return elements.getTextOnElementString(Labels.textToTranslate);
    }

    public String textOnElementsAfterWritingBrends() {
        return elements.getTextOnElementWithWaiters(Locators.dropdownResultShopAllFromSearch);
    }

    public String textOnElementsAfterWritingBrendsLables() {
        return elements.getTextOnElementString(Labels.textShowAll);
    }

    public String textOnElementsAfterWritingGoods() {
        return elements.getTextOnElementWithWaiters(Locators.dropdownResultShopAllFromSearch);
    }

    public String textOnElementsAfterWritingGoodsLables() {
        return elements.getTextOnElementString(Labels.textShowAll);
    }

    public String textOnElementsAfterWritingRandom() {
        return elements.getTextOnElementWithWaiters(Locators.dropdownResultNothingNotFoundFromSearch);
    }

    public String textOnElementsAfterWritingRandomLables() {
        return elements.getTextOnElementString(Labels.stringNothing);
    }

    public By dropdownForDogsIsDisplay() {
        return (Locators.dropdownForDogs);
    }
    public By dropdownAfterWritingAnythingInLineSearchIsDisplay() {
        return (Locators.dropdownAfterWritingAnythingInLineSearch);
    }

    public By lineForDogs() {
        return (Locators.sectionLineForDogs);
    }

    public void clearLineSearch() {
        elements.clearAll(Locators.searchLine);
    }

    private static class Labels {
        private final static String url = "https://pethouse.ua/";
        private final static String textToTranslate = "Кошик";
        private final static String nameOfBrends = "Natural";
        private final static String nameOfGoods = "Канат";
        private final static String notVariableText = "qwerty";
        private final static String textShowAll = "Показати усі";
        private final static String stringNothing = "Нічого";

    }

    private static class Locators {
        private final static By sectionLineForDogs = By.xpath("//li[@id='tpl-top-menu-first-li-1']/a");
        private final static By dropdownForDogs = By.xpath("//ul[@style='display: block;']");
        private final static By buttonLanguageUkr = By.xpath("//a[text() ='Укр']");
        private final static By buttonLanguageRuss = By.xpath("//a[text() ='Рос']");
        private final static By textAfterTranslate = By.xpath("//span[@class='hide-for-tablet']");
        private final static By searchLine = By.id("search");
        private final static By dropdownResultShopAllFromSearch = By.xpath("//div[@class= 'itm-other']");
        private final static By dropdownResultNothingNotFoundFromSearch = By.xpath("//div[@id='search-box']/div/span");
        private final static By dropdownAfterWritingAnythingInLineSearch = By.id("search-box");

    }
}