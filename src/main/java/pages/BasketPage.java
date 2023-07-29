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
        return (Locators.oneGoodInBasketVerify);
    }
    public By sectionYourPetWillLikeIsDisplay() {
        return (Locators.sectionYourPetWillLike);
    }
    public void clickOnButtonDelete() {
        elements.clickOnElementAfterWaitForClickable(Locators.buttonDeleteInBasket);
    }
    public By textFirstNameErrorIsDisplay() {
        return (Locators.textFirstNameError);
    }
    public By moveToButtonDelete() {
        return (Locators.buttonDeleteInBasket);
    }

    public void clickOnPlus(int countOfNumber) {
                for (int i = 0; i < countOfNumber; i++) {
                    elements.findElement(Locators.buttonPlus).click();
                }
    }
    public int getValueFromBoxOfNumbersAddedGoods() {
     return elements.getValueFromElement(Locators.boxOfNumbersAddedGoods);

    }
    public By buttonSubmitDisplay() {
        return (Locators.buttonSubmit);
    }
    public void clickOnMinus(int countOfNumber) {
        for (int i = 0; i < countOfNumber; i++) {
            elements.findElement(Locators.buttonMinus).click();
        }
    }
    public By informationToLoginInBasketIsDisplay() {
        return (Locators.informationToLoginInBasket);
    }


    private static class Labels {
        private final static String urlPageOfBasket = "https://pethouse.ua/ua/basket/";
    }

    private static class Locators {
        private final static By oneGoodInBasketVerify = By.xpath("//div[@class='header-cart']/a/span[text()='1']");
        private final static By sectionYourPetWillLike = By.id("basket-cross-wrapper-over");
        private final static By buttonDeleteInBasket = By.xpath("//a[@class='tpl-dell']");
        private final static By buttonSubmit = By.id("submit");
        private final static By textFirstNameError = By.id("firstname-error");
        private final static By buttonPlus = By.id("tpl_basket-num-inc");
        private final static By buttonMinus = By.id("tpl_basket-num-dec");
        private final static By boxOfNumbersAddedGoods = By.xpath("//input[@data-id='12385']");
        private final static By informationToLoginInBasket = By.xpath("//div[@class='basket-new-address-login']");

    }
}
