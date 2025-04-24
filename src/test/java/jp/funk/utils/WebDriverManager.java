package jp.funk.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private static WebDriver driver;

    public static void setUp() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static WebDriver getDriver() {
        return  driver;
    }
}
