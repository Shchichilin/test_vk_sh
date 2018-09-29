package vkHomePage;

import org.apache.http.util.Asserts;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.BasicTests;
import utils.getProperties;
import webElements.WebElementsLoginPage;

import static driver.getWebDriver.getDriver;

class AuthorizationTests extends BasicTests {

    @Test
    @DisplayName("Valid login/password")
    void login() throws Exception {
        Asserts.check(loginTest("login","password").equals("https://vk.com/feed"),
                "Authorization check is not successful");
    }

    @Test
    @DisplayName("Invalid login/password")
    void invalidLogin() throws Exception {
        String login = getProperties.getApplicationProperties("login");
        Asserts.check(loginTest("login","password").equals("https://vk.com/login?m=1&email=" + login),
                "Authorization check is not successful");
    }

    @Test
    @DisplayName("Restore password")
    void restoreData() throws Exception {
        WebElementsLoginPage.restore().click();
        getDriver().close();
        switchToNewWindowTest();
        Asserts.check(getDriver().getCurrentUrl().equals(getProperties.getApplicationProperties("restoreURL")),
                "Restore link isn't correct");
    }
}

