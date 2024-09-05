package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver {
    public static WebDriver driver;

    public BrowserDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saba.Janelidze\\Downloads\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://automationexercise.com");
    }

    public void close(){
        driver.close();
    }

}
