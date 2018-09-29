package vkHomePage;

import com.sun.org.glassfish.gmbal.Description;
import org.apache.http.util.Asserts;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import utils.BasicTests;
import webElements.WebElementsLoginPage;

import static driver.getWebDriver.getDriver;

class SearchFieldTests extends BasicTests{

    @Test
    @Description("Check search field")
    void searchField() throws Exception {
        WebElementsLoginPage.searchField().sendKeys("shchichilin evgeny");
        WebElementsLoginPage.searchField().sendKeys(Keys.ENTER);
        Asserts.check(getDriver().getCurrentUrl().equals(utils.getProperties.getApplicationProperties("searchExampleURL")),
                "Search field doesn't work correctly");
    }
}
