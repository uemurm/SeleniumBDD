package jp.funk.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jp.funk.pages.LoginPage;
import jp.funk.pages.MyPage;
import jp.funk.utils.WebDriverManager;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyPageSteps {
    private MyPage myPage;

    @When("I login as {string} with {string} as password")
    public void iLoginAs(String email, String password) {
        String url = "https://hotel-example-site.takeyaqa.dev/en-US/login.html";
        WebDriver driver = WebDriverManager.getDriver();
        driver.get(url);
        LoginPage loginPage = new LoginPage(driver);

        myPage = loginPage.doLogin(email, password);
    }

    @Then("I should see the email {string}")
    public void iShouldSeeTheEmail(String email) {
        assertEquals(email, myPage.getEmail(), "Email address does not match.");
    }

    @Then("I should see the name {string}")
    public void iShouldSeeTheName(String name) {
        assertEquals(name, myPage.getName(), "Name does not match.");
    }
}