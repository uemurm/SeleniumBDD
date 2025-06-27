package jp.funk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyPage {
    WebDriverWait wait;

    private final By header = By.tagName("h2");
    private final By email = By.id("email");
    private final By name = By.id("username");

    public MyPage(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    }

    public String getHeader() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(header)).getText();
    }

    public String getEmail() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(email)).getText();
    }

    public String getName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(name)).getText();
    }
}
