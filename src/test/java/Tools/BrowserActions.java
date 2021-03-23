package Tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class BrowserActions {

    static WebDriver driver;

    public static WebDriver returnDriver() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        return Objects.requireNonNullElseGet(driver, ChromeDriver::new);
    }

    public static void maximizeScreen(WebDriver driver) {
        driver.manage().window().maximize();
    }

}
