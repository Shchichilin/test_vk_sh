package webElements;

import com.sun.org.glassfish.gmbal.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static driver.getWebDriver.getDriver;

public class WebElementsLoginPage {
    @Description("Search")
    public static WebElement searchField(){
        return getDriver().findElement(By.id("ts_input"));
    }

    @Description("Phone or email")
    public static WebElement login(){
        return getDriver().findElement(By.id("index_email"));
    }

    @Description("Password")
    public static WebElement password(){
        return getDriver().findElement(By.id("index_pass"));
    }

    @Description("Log in")
    public static WebElement login_button(){
        return getDriver().findElement(By.id("index_login_button"));
    }

    @Description("VK for Android")
    public static WebElement androidAppURL(){
        return getDriver().findElement(By.cssSelector("#content > div.login_mobile_promo_wrap.clear_fix " +
                "> div.login_mobile_apps > div.login_app_devices > a.login_app_device.login_app_device_android"));
    }

    @Description("VK for Iphone")
    public static WebElement iosAppURL(){
        return getDriver().findElement(By.cssSelector("#content > div.login_mobile_promo_wrap.clear_fix " +
                "> div.login_mobile_apps > div.login_app_devices > a.login_app_device.login_app_device_ios"));
    }

    @Description("VK for WP")
    public static WebElement wpAppURL(){
        return getDriver().findElement(By.cssSelector("#content > div.login_mobile_promo_wrap.clear_fix " +
                "> div.login_mobile_apps > div.login_app_devices > a.login_app_device.login_app_device_wp"));
    }

    @Description("Forgot your password?")
    public static WebElement restore(){
        return getDriver().findElement(By.id("index_forgot"));
    }

    @Description("Your last name")
    public static WebElement firstname(){
        return getDriver().findElement(By.id("ij_first_name"));
    }

    @Description("Your dirst name")
    public static WebElement lastname(){
        return getDriver().findElement(By.id("ij_last_name"));
    }

    @Description("Date of birth")
    public static WebElement day(){
        getDriver().findElement(By.id("dropdown1")).click();
        return getDriver().findElement(By.xpath("//*[@id=\"option_list_options_container_1_5\"]"));
    }

    @Description("Date of birth")
    public static WebElement month(){
        getDriver().findElement(By.id("dropdown2")).click();
        return getDriver().findElement(By.xpath("//*[@id=\"option_list_options_container_2_7\"]"));
    }

    @Description("Date of birth")
    public static WebElement year(){
        getDriver().findElement(By.id("dropdown3")).click();
        return getDriver().findElement(By.xpath("//*[@id=\"option_list_options_container_3_14\"]"));
    }

    @Description("Your gender female")
    public static WebElement female(){
        return getDriver().findElement(By.cssSelector("#ij_sex_row > div:nth-child(2)"));
    }

    @Description("Your gender male")
    public static WebElement male(){
        return getDriver().findElement(By.cssSelector("#ij_sex_row > div:nth-child(3)"));
    }

    @Description("Continue registration")
    public static WebElement continueRegistration(){
        return getDriver().findElement(By.id("ij_submit"));
    }

    @Description("Log out")
    public static WebElement logOut(){
        return getDriver().findElement(By.id("top_reg_link"));
    }

}
