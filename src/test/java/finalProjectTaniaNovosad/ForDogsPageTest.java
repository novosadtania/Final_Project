package finalProjectTaniaNovosad;

import org.testng.annotations.Test;

public class ForDogsPageTest extends BaseTest {
    @Test(priority = 1)
    public void clickOnCheckBox() {
        forDogsPage.openPageForDogs();
        forDogsPage.clickOnCheckBoxBrit();
        forDogsPage.clickOnCheckBoxJosera();
        assertions.elementIsDisplay(forDogsPage.selectersIsDisplay());
        forDogsPage.clickOnCheckBoxBrit();
        forDogsPage.clickOnCheckBoxJosera();
    }

    @Test(priority = 2)
    public void addToBasketOne() {
        forDogsPage.openPageForDogs();
        forDogsPage.clickOnButtonBuyOnOneElement();
        assertions.equalsInt(forDogsPage.basketAterOneClickBuy(), 1);
        basketPage.openBasketPage();
        basketPage.clickOnButtonDelete();
        assertions.elementIsDisplay(basketPage.informationEmptyShoppingCartIsDisplay());
    }

    @Test (priority = 3)
    public void addToBasketSecondAndThird() {
        forDogsPage.openPageForDogs();
        assertions.elementIsDisplay(forDogsPage.sortFormOnPageForDogsIsDisplay());

    }

    @Test (priority = 4)
    public void addToCompareSection() {
        forDogsPage.openPageForDogs();
        forDogsPage.clickOnButtonAddToCompareSection();
        assertions.elementIsDisplay(forDogsPage.buttonGoToCompareisDisplay());
    }

    @Test (priority = 5)
    public void openPageWithAllInformationOfGood() {
        forDogsPage.openPageForDogs();
        forDogsPage.clickOnNameOfGoodforOpen();
        assertions.elementIsDisplay(forDogsPage.descriptionTextisDIsplay());
    }

}
