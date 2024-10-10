package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BrowserDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public BrowserDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saba.Janelidze\\Downloads\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://automationexercise.com");
    }

    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}
