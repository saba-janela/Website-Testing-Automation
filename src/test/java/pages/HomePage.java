package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import util.BrowserDriver;

public class HomePage extends BrowserDriver {

    public static void verifyHomePage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")));

    }

}
