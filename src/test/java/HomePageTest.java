import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{
    @Test
    public void translateLanguageToUkraine(){
       homePage.clickOnButtonLanguageRuss();
       homePage.clickOnButtonLanguageUkr();
       assertions.equalsText(homePage.textOnElementsAfterTranslateFromLocators(),homePage.textOnElementsAfterTranslateFromLables());
    }
    @Test
    public void writeNameOfBrends(){
        homePage.sendKeysToElementNameOfBrends();
        assertions.containtsText(homePage.textOnElementsAfterWritingBrendsLables(),homePage.textOnElementsAfterWritingBrends());
        homePage.clearLineSearch();
    }
    @Test
    public void writeNameOfGoods(){
        homePage.sendKeysToElementNameOfGoods();
        assertions.containtsText(homePage.textOnElementsAfterWritingGoodsLables(),homePage.textOnElementsAfterWritingGoods());
        homePage.clearLineSearch();
    }
    @Test
    public void writeNotVariableText(){
        homePage.sendKeysToElementNotVariableText();
        assertions.containtsText(homePage.textOnElementsAfterWritingRandomLables(),homePage.textOnElementsAfterWritingRandom());
        homePage.clearLineSearch();
    }

    @Test
    public void dropDownForDogsIsDisplayed(){
       action.moveTo(homePage.lineForDogs());
        assertions.elementIsDisplay(homePage.dropdownForDogsIsDisplay());
    }
}
