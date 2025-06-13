package jp.funk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private final WebDriver driver;
    WebDriverWait wait;

    private final By emailField = By.id("email");
    private final By passwordField = By.id("password");
    private final By loginBtn = By.id("login-button");
    private final By errorForUsername = By.id("email-message");
    private final By errorForPassword = By.id("password-message");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    }

    public void inputEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).sendKeys(email);
    }

    public void inputPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
    }

    public MyPage clickLoginBtn() {
        driver.findElement(loginBtn).click();
        return new MyPage(driver);
    }

//    public String getEmailMessage() {
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(emailMessage)).getText();
//    }
//
//    public String getPasswordMessage() {
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(passwordMessage)).getText();
//    }
//
    public String getErrorMessageForUsername() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorForUsername)).getText();
    }

    public String getErrorMessageForPassword() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorForPassword)).getText();
    }
}
