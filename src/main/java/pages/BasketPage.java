package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BasketPage extends BasePage {
    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public void openBasketPage() {
        driver.get(Labels.urlPageOfBasket);
    }

    public By oneGoodInBasketVerifyIsDisplay() {
        return (Locators.oneGoodInBasketToVerify);
    }

    public By sectionYourPetWillLikeIsDisplay() {
        return (Locators.sectionYourPetWillLikeIbBasket);
    }

    public void clickOnButtonDelete() {
        elements.clickOnElementAfterWaitForClickable(Locators.buttonDeleteInBasket);
    }

    public void clickOnButtonPlus(int countOfNumber) {
        for (int i = 0; i < countOfNumber; i++) {
            elements.findElement(Locators.buttonPlusInBasket).click();
        }
    }

    public int getValueFromBoxOfNumbersAddedGoods() {
        return elements.getValueFromElement(Locators.boxOfNumbersAddedGoodInBasket);

    }

    public By buttonSubmitDisplay() {
        return (Locators.buttonSubmitInBasket);
    }

    public By informationEmptyShoppingCartIsDisplay() {
        return (Locators.informationEmptyShoppingCart);
    }

    public void clickOnButtonMinus(int countOfNumber) {
        for (int i = 0; i < countOfNumber; i++) {
            elements.findElement(Locators.buttonMinusInBasket).click();
        }
    }

    public By informationToLoginInBasketIsDisplay() {
        return (Locators.informationToLoginInBasket);
    }


    private static class Labels {
        private final static String urlPageOfBasket = "https://pethouse.ua/ua/basket/";
    }

    private static class Locators {
        private final static By oneGoodInBasketToVerify = By.xpath("//div[@class='header-cart']/a/span[text()='1']");
        private final static By sectionYourPetWillLikeIbBasket = By.id("basket-cross-wrapper-over");
        private final static By buttonDeleteInBasket = By.xpath("//a[@class='tpl-dell']");
        private final static By buttonSubmitInBasket = By.id("submit");
        private final static By buttonPlusInBasket = By.id("tpl_basket-num-inc");
        private final static By buttonMinusInBasket = By.id("tpl_basket-num-dec");
        private final static By boxOfNumbersAddedGoodInBasket = By.xpath("//input[@data-id='12385']");
        private final static By informationToLoginInBasket = By.xpath("//div[@class='basket-new-address-login']");
        private final static By informationEmptyShoppingCart = By.xpath("//div[@class='ph-big-cat-little-header']");

    }
}
