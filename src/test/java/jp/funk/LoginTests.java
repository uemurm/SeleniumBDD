package jp.funk;

import jp.funk.pages.LoginPage;
import jp.funk.pages.DashboardPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTests extends BaseTests {
    private LoginPage thePage;

    @BeforeEach
    public void loadPage() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        thePage = new LoginPage(driver);
    }

    @Test
    public void successfulLogin() {
        thePage.inputPassword("admin123");
        thePage.inputUsername("Admin");

        DashboardPage dashboardPage = thePage.clickLoginBtn();

        assertEquals("Dashboard", dashboardPage.getTopBarBreadcrumb());

    }
}
