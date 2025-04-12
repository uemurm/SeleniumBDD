package jp.funk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;

    private final By searchBox = By.id("gh-ac");
    private final By searchBtn = By.id("gh-search-btn");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputSearchKeyWords(String keyWords) {
        driver.findElement(searchBox).sendKeys(keyWords);
    }

    public void clickSearchBtn() {
        driver.findElement(searchBtn).click();
    }
}
