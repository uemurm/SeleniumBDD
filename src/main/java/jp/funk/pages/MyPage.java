package jp.funk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyPage {
    private final WebDriver driver;
    private final By header = By.tagName("h2");

    public MyPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(header)).getText();
    }
}
