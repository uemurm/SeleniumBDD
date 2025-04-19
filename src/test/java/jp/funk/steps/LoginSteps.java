package jp.funk.steps;

import io.cucumber.java.en.*;
import jp.funk.pages.DashboardPage;
import jp.funk.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage = new LoginPage(driver);
    }

    @When("I enter {string} as username and {string} as password")
    public void iEnterCredentials(String username, String password) {
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        dashboardPage = loginPage.clickLoginBtn();
    }

    @Then("I should see {string} in the top bar breadcrumb")
    public void iShouldSeeInTheTopBarBreadcrumb(String expectedText) {
        assertEquals(expectedText, dashboardPage.getTopBarBreadcrumb());
        driver.quit();
    }
}