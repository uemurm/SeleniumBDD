package jp.funk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTests {
    @BeforeEach
    public void loadPage() {
        driver.get("https://www.ebay.com.au/");
    }

    @Test
    public void successfulLogin() {
        System.out.println("HELLO");
    }
}
