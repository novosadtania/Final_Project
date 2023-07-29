package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForDogsPage extends BasePage {

    public ForDogsPage(WebDriver driver) {
        super(driver);
    }

    public void openPageForDogs() {
        driver.get(Labels.urlPageForDogs);
    }

    public void clickOnCheckBoxBrit() {
        elements.clickOnElement(Locators.selectBrit);
    }

    public void clickOnCheckBoxJosera() {
        elements.clickOnElement(Locators.selectJosera);
    }
    public By selectersIsDisplay() {
        return (Locators.selectorsIsDisplay);
    }
    public void clickOnButtonBuyOnOneElement() {
        elements.clickOnElement(Locators.buttonBuyInFirstElement);
    }
    public int basketAterOneClickBuy() {
        return Integer.parseInt(elements.getTextOnElement(Locators.basketAfterAddOneGood));
    }
    public void clickOnButtonBuyOnSecondElement() {
        elements.clickOnElement(Locators.buttonBuyInSecondElement);
    }
    public void clickOnButtonBuyOnThirdElement() {
        elements.clickOnElement(Locators.buttonBuyInThirdElement);
    }
    public int basketAterSecondAndThirdClickBuy() {
        return Integer.parseInt(elements.getTextOnElement(Locators.basketAfterAddSecondAndThirdGoods));
    }
    public void clickOnButtonAddToCompareSection() {
        elements.clickOnElement(Locators.buttonAddToCompareSection);
    }

    public By buttonGoToCompareisDisplay() {
        return (Locators.buttonGoToCompare);
    }

    public void clickOnNameOfGoodforOpen() {
        elements.clickOnElement(Locators.nameOfGoodforOpen);
    }
    public By descriptionTextisDisplay() {
        return (Locators.descriptionText);
    }

    private static class Labels {
        private final static String urlPageForDogs = "https://pethouse.ua/ua/shop/sobakam/suhoi-korm/";
        private final static String nameOfPageBrit = "Brit Care";
        private final static String nameOfPageDryFeed = "Сухий корм";
        private final static String buttonGoToComparison = "перейти до порівняння";
        private final static String stringDescription = "Опис";

    }

    private static class Locators {
        private final static By selectBrit = By.xpath("//span[text()='Brit Care']");
        private final static By selectJosera = By.xpath("//span[text()='Josera']");
        private final static By nameOfPageLocator = By.xpath("//h1[@class='results-cat-title']");
        private final static By selectorsIsDisplay = By.xpath("//div[@class='z2-selected-filters-wrapper']");
        private final static By buttonBuyInFirstElement = By.xpath("//a[@rel='1153,73']");
        private final static By basketAfterAddOneGood = By.xpath("//span[@class='quantity large-int'][text()=1]");
        private final static By buttonBuyInSecondElement = By.xpath("//a[@rel='256,50']");
        private final static By buttonBuyInThirdElement = By.xpath("//a[@rel='219,56']");
        private final static By basketAfterAddSecondAndThirdGoods = By.xpath("//span[@class='quantity large-int'][text()=2]");

        private final static By buttonAddToCompareSection= By.xpath("//div[@data-id='000008596']//span");
        private final static By buttonGoToCompare = By.xpath("//span[text()='Перейти до порівняння']");
        private final static By nameOfGoodforOpen = By.xpath("//div[@data-brand='Acana']/a");
        private final static By descriptionText = By.xpath("//span[text()='Опис']");
    }
}
