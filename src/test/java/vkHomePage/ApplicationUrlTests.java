package vkHomePage;

import org.apache.http.util.Asserts;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.BasicTests;
import utils.getProperties;

import java.util.concurrent.TimeUnit;

import static driver.getWebDriver.getDriver;

public class ApplicationUrlTests extends BasicTests{

    @Test
    @DisplayName("Check AndroidApplication URL")
    void androidAppURLTest() throws Exception {
        webElements.WebElementsLoginPage.androidAppURL().click();
        getDriver().close();
        switchToNewWindowTest();
        TimeUnit.SECONDS.sleep(3); // or webDriverWait method for example
        Asserts.check(getDriver().getCurrentUrl().equals(getProperties.getApplicationProperties("androidAppURL")),
                "Link androidAppURL incorrect");
    }

    @Test
    @DisplayName("Check IosApplication URL")
    void iosAppURLTest() throws Exception {
        webElements.WebElementsLoginPage.iosAppURL().click();
        getDriver().close();
        switchToNewWindowTest();
        TimeUnit.SECONDS.sleep(3); //
        Asserts.check(getDriver().getCurrentUrl().equals(getProperties.getApplicationProperties("iosAppURL")),
                "Link iosAppURL incorrect");
    }

    @Test
    @DisplayName("Check WpApplication URL")
    void wpAppURLTest() throws Exception {
        webElements.WebElementsLoginPage.wpAppURL().click();
        getDriver().close();
        switchToNewWindowTest();
        TimeUnit.SECONDS.sleep(10); //
        Asserts.check(getDriver().getCurrentUrl().equals(getProperties.getApplicationProperties("wpAppURL")),
                "Link to wpAppURL incorrect");
    }
}
