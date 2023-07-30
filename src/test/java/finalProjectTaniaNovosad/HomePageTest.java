package finalProjectTaniaNovosad;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    @Test(priority = 2)
    public void translateLanguageToUkraine() {
        homePage.openHomePage();
        homePage.clickOnButtonLanguageRuss();
        homePage.clickOnButtonLanguageUkr();
        assertions.equalsText(homePage.textOnElementsAfterTranslateFromLocators(), homePage.textOnElementsAfterTranslateFromLables());
    }

    @Test(priority = 3)
    public void writeNameOfBrends() {
        homePage.openHomePage();
        homePage.sendKeysToElementNameOfBrends();
        assertions.elementIsDisplay(homePage.dropdownAfterWritingAnythingInLineSearchIsDisplay());
        assertions.containtsText(homePage.textOnElementsAfterWritingBrendsLables(), homePage.textOnElementsAfterWritingBrends());
        homePage.clearLineSearch();
    }

    @Test(priority = 4)
    public void writeNameOfGoods() {
        homePage.openHomePage();
        homePage.sendKeysToElementNameOfGoods();
        assertions.elementIsDisplay(homePage.dropdownAfterWritingAnythingInLineSearchIsDisplay());
        assertions.containtsText(homePage.textOnElementsAfterWritingGoodsLables(), homePage.textOnElementsAfterWritingGoods());
        homePage.clearLineSearch();
    }

    @Test (priority = 5)
    public void writeNotVariableText() {
        homePage.openHomePage();
        homePage.sendKeysToElementNotVariableText();
        assertions.elementIsDisplay(homePage.dropdownAfterWritingAnythingInLineSearchIsDisplay());
        assertions.containtsText(homePage.textOnElementsAfterWritingRandomLables(), homePage.textOnElementsAfterWritingRandom());
        homePage.clearLineSearch();
    }

    @Test (priority = 1)
    public void dropDownForDogsIsDisplayed() {
        homePage.openHomePage();
        action.moveTo(homePage.lineForDogs());
        assertions.elementIsDisplay(homePage.dropdownForDogsIsDisplay());
    }
}
