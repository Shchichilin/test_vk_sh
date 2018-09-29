package utils;

import org.junit.jupiter.api.BeforeEach;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import webElements.WebElementsLoginPage;

import java.util.concurrent.TimeUnit;

import static driver.getWebDriver.getDriver;

public class BasicTests {
    @BeforeEach
    public void startWebTest() throws Exception {
        getDriver().get(getProperties.getApplicationProperties("url"));
        if (getDriver().getCurrentUrl().equals(utils.getProperties.getApplicationProperties("url"))){
            Assert.fail("Start page isnt available");
        }
    }

    protected static String loginTest(String login, String password) throws Exception {
        WebElementsLoginPage.login().sendKeys(utils.getProperties.getApplicationProperties(login));
        WebElementsLoginPage.password().sendKeys(utils.getProperties.getApplicationProperties(password));
        WebElementsLoginPage.login_button().click();
        return getDriver().getCurrentUrl();
    }

    protected static void switchToNewWindowTest(){
        for(String winHandle : getDriver().getWindowHandles()){
            getDriver().switchTo().window(winHandle);
        }
    }

    @AfterSuite
    public void closeWebTest() {
        getDriver().quit();
    }
}
