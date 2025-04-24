package jp.funk.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import jp.funk.pages.DashboardPage;
import jp.funk.pages.LoginPage;
import jp.funk.utils.WebDriverManager;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSteps {
    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    @Before
    public void setUp() {
        WebDriverManager.setUp();
    }

    @After
    public void tearDown() {
        WebDriverManager.tearDown();
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        WebDriver driver = WebDriverManager.getDriver();
        driver.get(url);
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
    }

    @Then("I should see {string} in the error message")
    public void iShouldSeeInTheErrorMessage(String expectedText) {
        assertEquals(expectedText, loginPage.getErrorMessage());
    }

    @Then("I should see {string} message for the username field")
    public void iShouldSeeMessageForUsername(String expectedText) {
        assertEquals(expectedText, loginPage.getErrorMessageForUsername());
    }

    @Then("I should see {string} message for the password field")
    public void iShouldSeeMessageForPassword(String expectedText) {
        assertEquals(expectedText, loginPage.getErrorMessageForPassword());
    }
}