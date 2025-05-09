package jp.funk.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Files;
import java.nio.file.Path;

public class WebDriverManager {
    private static WebDriver driver;

    public static void setUp() {
        ChromeOptions options = new ChromeOptions();

        if (driver == null) {
            try {
                Path tmpDir = Files.createTempDirectory("chrome-user-data");
                options.addArguments("--user-data-dir=" + tmpDir.toAbsolutePath());
            } catch (Exception e) {
                throw new RuntimeException("Failed to create temporary user data directory", e);
            }

            options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
            driver = new ChromeDriver(options);
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
