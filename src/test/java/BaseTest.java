import driver.DriverFactory;
import functions.Action;
import functions.Assertions;
import functions.Elements;
import functions.Waiters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.BasePage;
import pages.BasketPage;
import pages.ForDogsPage;
import pages.HomePage;

public class BaseTest {
    protected WebDriver driver = DriverFactory.startChromeDriver();

    protected Action action = new Action(driver);
    protected Assertions assertions = new Assertions(driver);
    protected Elements elements = new Elements(driver);
    protected Waiters waiters = new Waiters(driver);

    protected BasePage basePage = new BasePage(driver);
    protected HomePage homePage = new HomePage(driver);
    protected ForDogsPage forDogsPage = new ForDogsPage(driver);
    protected BasketPage basketPage = new BasketPage (driver);
    @AfterSuite
    public void closeDriver(){
        driver.quit();
    }
    @BeforeSuite
    public void openHomePage(){
        homePage.openMainPage();
    }


}
