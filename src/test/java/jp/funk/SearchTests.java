package jp.funk;

import jp.funk.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SearchTests extends BaseTests {
    private HomePage thePage;

    @BeforeEach
    public void loadPage() {
        driver.get("https://www.ebay.com.au/");
        thePage = new HomePage(driver);
    }

    @Test
    public void searchReturnsResults() {
        thePage.inputSearchKeyWords("iPhone");
        thePage.clickSearchBtn();
    }
}
