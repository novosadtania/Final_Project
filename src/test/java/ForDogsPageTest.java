import org.testng.annotations.Test;

public class ForDogsPageTest extends BaseTest {
    @Test
    public void clickOnCheckBox() {
        forDogsPage.openPageForDogs();
        forDogsPage.clickOnCheckBoxBrit();
        forDogsPage.clickOnCheckBoxJosera();
        assertions.elementIsDisplay(forDogsPage.selectersIsDisplay());
        forDogsPage.clickOnCheckBoxBrit();
        forDogsPage.clickOnCheckBoxJosera();
    }

    @Test
    public void addToBasketOne() {
        forDogsPage.openPageForDogs();
        forDogsPage.clickOnButtonBuyOnOneElement();
        assertions.equalsInt(forDogsPage.basketAterOneClickBuy(), 1);
        basketPage.openBasketPage();
        basketPage.clickOnButtonDelete();
    }

    @Test
    public void addToBasketSecondAndThird() {
        forDogsPage.openPageForDogs();
        forDogsPage.clickOnButtonBuyOnSecondElement();
        forDogsPage.clickOnButtonBuyOnThirdElement();
        assertions.equalsInt(forDogsPage.basketAterSecondAndThirdClickBuy(), 2);
    }

    @Test
    public void addToCompareSection() {
        forDogsPage.openPageForDogs();
        forDogsPage.clickOnButtonAddToCompareSection();
        assertions.elementIsDisplay(forDogsPage.buttonGoToCompareisDisplay());
    }

    @Test
    public void openPageWithAllInformationOfGood() {
        forDogsPage.openPageForDogs();
        forDogsPage.clickOnNameOfGoodforOpen();
        assertions.elementIsDisplay(forDogsPage.descriptionTextisDisplay());
    }

}
