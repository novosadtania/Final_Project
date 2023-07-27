import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{
    @Test
    public void test1(){
        homePage.openMainPage();
       homePage.clickOnRuss();
       homePage.clickOnUkr();
       assertions.equalsText(homePage.textOnElementsAfterTranslate(),homePage.textOnElementsAfterTranslate2());
    }
}
