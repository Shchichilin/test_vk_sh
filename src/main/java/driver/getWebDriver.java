package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWebDriver {
    static WebDriver driver;

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/evgenijsicilin/IdeaProjects/test_vk/src/main/resources/chromedriver");
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

}
