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
    public void iLoginAsEmailWithPasswordAsPassword(String email, String password) {
        String url = "https://hotel-example-site.takeyaqa.dev/en-US/login.html";
        WebDriver driver = WebDriverManager.getDriver();
        driver.get(url);
        LoginPage loginPage = new LoginPage(driver);

        myPage = loginPage.doLogin(email, password);
    }

    @Then("I should see {string} {string} {string} {string} {string} {string} {string} {string}")
    public void iShouldSee(String email, String name, String membership, String address, String tel, String gender, String dob, String notification) {
        assertEquals(email, myPage.getEmail(), "Email address does not match.");
        assertEquals(name, myPage.getName(), "Name does not match.");
        assertEquals(membership, myPage.getMembership(), "Membership does not match.");
        assertEquals(address, myPage.getAddress(), "Address does not match.");
        assertEquals(tel, myPage.getTel(), "Telephone number does not match.");
        assertEquals(gender, myPage.getGender(), "Gender does not match.");
        assertEquals(dob, myPage.getDob(), "DoB does not match.");
        assertEquals(notification, myPage.getNotification(), "Notification setting does not match.");
    }
}