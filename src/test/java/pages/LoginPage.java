package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import util.BrowserDriver;

public class LoginPage extends BrowserDriver {
    public static void clickLoginBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"))).click();
    }

    public static void verifyLoginPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2")));
    }

}
