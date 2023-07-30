package finalProjectTaniaNovosad;

import org.testng.annotations.Test;

public class BasketPageTest extends BaseTest {
    @Test (priority = 1)
    public void visibleSectionYourPetWillLikeItInBasket() {
        forDogsPage.openPageForDogs();
        forDogsPage.clickOnButtonBuyOnOneElement();
       assertions.elementIsDisplay(basketPage.oneGoodInBasketVerifyIsDisplay());
        basketPage.openBasketPage();
        assertions.elementIsDisplay(basketPage.sectionYourPetWillLikeIsDisplay());
        basketPage.clickOnButtonDelete();
        assertions.elementIsDisplay(basketPage.informationEmptyShoppingCartIsDisplay());
    }

    @Test (priority = 2)
    public void buttonSubmitInBasketIsDisplay() {
        forDogsPage.openPageForDogs();
        forDogsPage.clickOnButtonBuyOnOneElement();
        assertions.elementIsDisplay(basketPage.oneGoodInBasketVerifyIsDisplay());
        basketPage.openBasketPage();
        assertions.elementIsDisplay(basketPage.buttonSubmitDisplay());
        basketPage.clickOnButtonDelete();
        assertions.elementIsDisplay(basketPage.informationEmptyShoppingCartIsDisplay());
    }

    @Test (priority = 3)
    public void clickButtonPlus() {
        int countOfNumber = 3;
        forDogsPage.openPageForDogs();
        forDogsPage.clickOnButtonBuyOnOneElement();
        assertions.elementIsDisplay(basketPage.oneGoodInBasketVerifyIsDisplay());
        basketPage.openBasketPage();
        basketPage.clickOnButtonPlus(countOfNumber);
        assertions.equalsInt(basketPage.getValueFromBoxOfNumbersAddedGoods() - 1, countOfNumber);
        basketPage.clickOnButtonDelete();
        assertions.elementIsDisplay(basketPage.informationEmptyShoppingCartIsDisplay());

    }

    @Test(priority = 4)
    public void clickButtonMinus() {
        int countOfNumber = 3;
        forDogsPage.openPageForDogs();
        forDogsPage.clickOnButtonBuyOnOneElement();
        assertions.elementIsDisplay(basketPage.oneGoodInBasketVerifyIsDisplay());
        basketPage.openBasketPage();
        basketPage.clickOnButtonPlus(countOfNumber);
        basketPage.clickOnButtonMinus(countOfNumber);
        assertions.equalsInt(basketPage.getValueFromBoxOfNumbersAddedGoods(), 1);
        basketPage.clickOnButtonDelete();
        assertions.elementIsDisplay(basketPage.informationEmptyShoppingCartIsDisplay());
    }

    @Test (priority = 5)
    public void informationToLoginInBasketPresent() {
        forDogsPage.openPageForDogs();
        forDogsPage.clickOnButtonBuyOnOneElement();
        assertions.elementIsDisplay(basketPage.oneGoodInBasketVerifyIsDisplay());
        basketPage.openBasketPage();
        assertions.elementIsDisplay(basketPage.informationToLoginInBasketIsDisplay());
        basketPage.clickOnButtonDelete();
        assertions.elementIsDisplay(basketPage.informationEmptyShoppingCartIsDisplay());
    }

}

