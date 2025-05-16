package jp.funk.pages.admin;

import jp.funk.pages.DashboardPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ViewSystemUsersPage {
    private final WebDriver driver;
    WebDriverWait wait;

    private final By usernameField = By.name("username");
    private final By passwordField = By.name("password");
    private final By loginBtn = By.cssSelector("button[type='submit']");
    private final By errorMessage = By.xpath("//div[contains(@class, 'oxd-alert-content')]");
    private final By errorForUsername = By.cssSelector("span.oxd-text.oxd-text--span");
    private final By errorForPassword = By.cssSelector("span.oxd-text.oxd-text--span");

    public ViewSystemUsersPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    }

    public void inputUsername(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(username);
    }

    public void inputPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
    }

    public DashboardPage clickLoginBtn() {
        driver.findElement(loginBtn).click();
        return new DashboardPage(driver);
    }

    public String getErrorMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage)).getText();
    }

    public String getErrorMessageForUsername() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorForUsername)).getText();
    }

    public String getErrorMessageForPassword() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorForPassword)).getText();
    }
}
