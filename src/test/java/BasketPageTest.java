import org.testng.annotations.Test;

public class BasketPageTest extends BaseTest {
    @Test
    public void visibleSectionYourPetWillLikeItInBasket() {
        forDogsPage.openPageForDogs();
        forDogsPage.clickOnButtonBuyOnOneElement();
        basketPage.openBasketPage();
        assertions.elementIsDisplay(basketPage.sectionYourPetWillLikeIsDisplay());
        basketPage.clickOnButtonDelete();
    }

    @Test
    public void buttonSubmitInBasketIsDisplay() {
        forDogsPage.openPageForDogs();
        forDogsPage.clickOnButtonBuyOnOneElement();
        assertions.elementIsDisplay(basketPage.oneGoodInBasketVerifyIsDisplay());
        basketPage.openBasketPage();
        assertions.elementIsDisplay(basketPage.buttonSubmitDisplay());
        basketPage.clickOnButtonDelete();
    }

    @Test
    public void clickButtonPlus() {
        int countOfNumber = 3;
        forDogsPage.openPageForDogs();
        forDogsPage.clickOnButtonBuyOnOneElement();
        assertions.elementIsDisplay(basketPage.oneGoodInBasketVerifyIsDisplay());
        basketPage.openBasketPage();
        basketPage.clickOnButtonPlus(countOfNumber);
        assertions.equalsInt(basketPage.getValueFromBoxOfNumbersAddedGoods() - 1, countOfNumber);
        basketPage.clickOnButtonDelete();

    }

    @Test
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
    }

    @Test
    public void informationToLoginInBasketPresent() {
        forDogsPage.openPageForDogs();
        forDogsPage.clickOnButtonBuyOnOneElement();
        assertions.elementIsDisplay(basketPage.oneGoodInBasketVerifyIsDisplay());
        basketPage.openBasketPage();
        assertions.elementIsDisplay(basketPage.informationToLoginInBasketIsDisplay());
        basketPage.clickOnButtonDelete();
    }

}

