package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForDogsPage extends BasePage {

    public ForDogsPage(WebDriver driver) {
        super(driver);
    }
    private static class Labels {
        private final static String urlPageForDogs = "https://pethouse.ua/ua/shop/sobakam/suhoi-korm/";
        private final static String nameOfPageBrit = "Brit Care";
        private final static String nameOfPageDryFeed = "Сухий корм";
        private final static String buttonGoToComparison = "перейти до порівняння";
        private final static String stringDescription = "Опис";

    }

    private static class Locators {
        private final static By selectBrit = By.xpath("//div[@class='ph-new-cat-brand-block'][2]");
        private final static By selectJosera = By.xpath("//div[@class='ph-new-cat-brand-block'][3]");
        private final static By nameOfPageLocator = By.xpath("//h1[@class='results-cat-title']");
        private final static By selectorsIsDisplay = By.xpath("//div[@class='z2-selected-filters-wrapper']");
    /*    private final static By textAfterTranslate = By.xpath("//div[@class='z-main-section-header']/h2");
        private final static By searchLine = By.id("search");
        private final static By dropdownResultFromSearchShopAll = By.xpath("//div[@class= 'itm-other']");
        private final static By dropdownResultNothingFromSearch = By.xpath("//div[@id='search-box']/div/span");*/

    }
    public void openPageForDogs() {
        driver.get(Labels.urlPageForDogs);
    }
}
