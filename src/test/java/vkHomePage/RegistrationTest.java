package vkHomePage;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasicTests;
import utils.getProperties;
import webElements.WebElementsLoginPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static driver.getWebDriver.getDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegistrationTest extends BasicTests{

    @Test
    @DisplayName("Check number of days in dropdown")
    void step1_numberOfDaysTest(){
        WebElement dayDropdown = getDriver().findElement(By.id("container1"));
        dayDropdown.click();
        List<WebElement> dayList = dayDropdown.findElements(By.tagName("li"));
        Asserts.check(dayList.size()==32, "Invalid number of days in dropdown"); //
    }

    @Test
    @DisplayName("Check number of months in dropdown")
    void step2_numberOfMounthsTest(){
        WebElement mounthDropdown = getDriver().findElement(By.id("container2"));
        mounthDropdown.click();
        List<WebElement> mounthList = mounthDropdown.findElements(By.tagName("li"));
        Asserts.check(mounthList.size()==13, "Invalid number of months in dropdown"); //
    }

    @Test
    @DisplayName("Check number of years in dropdown")
    void step3_numberOfYearsTest(){
        WebElement yearDropdown = getDriver().findElement(By.id("container3"));
        yearDropdown.click();
        List<WebElement> yearList = yearDropdown.findElements(By.tagName("li"));
        Asserts.check(yearList.size()==104, "Invalid number of years in dropdown"); //
    }

    @Test
    @DisplayName("Registration check")
    void step4_registrationUserTest() throws Exception {
        WebElementsLoginPage.firstname().sendKeys("Evgeny");
        WebElementsLoginPage.lastname().sendKeys("Shchichilin");
        WebElementsLoginPage.day().click();
        WebElementsLoginPage.month().click();
        WebElementsLoginPage.year().click();
        WebElementsLoginPage.male().click();
        WebElementsLoginPage.continueRegistration().click();
        TimeUnit.SECONDS.sleep(2);
        boolean regUrl = getDriver().getCurrentUrl().equals(getProperties.getApplicationProperties("registrationURL"));

        if (regUrl){
            getDriver().findElement(By.id("top_reg_link")).click();
        } else {
            Assert.fail("Registration link isn't correct");
        WebElementsLoginPage.logOut().click();}
    }
}
