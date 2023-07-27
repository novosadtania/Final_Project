package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        private final static String showAll = "Показати усі";
        private final static String nothingString = "Нічого";

    }

    private static class Locators {
        private final static By lineDogs = By.xpath("//li[@id='tpl-top-menu-first-li-1']/a");
        private final static By dropdownForDogs = By.xpath("//ul[@style='display: block;']");
        private final static By languageUkr = By.xpath("//a[text() ='Укр']");
        private final static By languageRuss = By.xpath("//a[text() ='Рос']");
        private final static By textAfterTranslate = By.xpath("//div[@class='z-main-section-header']/h2");
        private final static By searchLine = By.id("search");
        private final static By dropdownResultFromSearchShopAll = By.xpath("//div[@class= 'itm-other']");
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

    public String textOnElementsAfterTranslateFromLocators() {
        return elements.getTextOnElement(Locators.textAfterTranslate);

    }

    public String textOnElementsAfterTranslateFromLables() {
        return elements.getTextOnElementString(Labels.textToTranslate);
    }

    public String textOnElementsAfterWritingBrends() {
        return elements.getTextOnElement(Locators.dropdownResultFromSearchShopAll);
    }
    public String textOnElementsAfterWritingBrendsLables() {
        return elements.getTextOnElementString(Labels.showAll);
    }
    public String textOnElementsAfterWritingGoods() {
        return elements.getTextOnElement(Locators.dropdownResultFromSearchShopAll);
    }
    public String textOnElementsAfterWritingGoodsLables() {
        return elements.getTextOnElementString(Labels.showAll);
    }
    public String textOnElementsAfterWritingRandom() {
        return elements.getTextOnElement(Locators.dropdownResultNothingFromSearch);
    }
    public String textOnElementsAfterWritingRandomLables() {
        return elements.getTextOnElementString(Labels.nothingString);}

    public By dropdownForDogsIsDisplay() {
         return (Locators.dropdownForDogs);
    }
    public By lineForDogs() {
        return (Locators.lineDogs);
    }

    public void clearLineSearch(){
        elements.clearAll(Locators.searchLine);
    }
}