package jp.funk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {
    private final WebDriver driver;
    private final By topBarBreadcrumb = By.cssSelector("span[class=\"oxd-topbar-header-breadcrumb\"] > h6");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTopBarBreadcrumb() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(topBarBreadcrumb)).getText();
    }
}
