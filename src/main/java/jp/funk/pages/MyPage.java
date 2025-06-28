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
    private final By membership = By.id("rank");
    private final By address = By.id("address");
    private final By tel = By.id("tel");
    private final By gender = By.id("gender");
    private final By dob = By.id("birthday");
    private final By notification = By.id("notification");

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

    public String getMembership() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(membership)).getText();
    }

    public String getAddress() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(address)).getText();
    }

    public String getTel() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(tel)).getText();
    }

    public String getGender() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(gender)).getText();
    }

    public String getDob() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(dob)).getText();
    }

    public String getNotification() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(notification)).getText();
    }
}
