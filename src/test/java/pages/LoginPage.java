package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import util.BrowserDriver;

public class LoginPage extends BrowserDriver {

    public static void clickLoginBtn(){
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    }

    public static void verifyLoginPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'New User Signup!')]")));
    }

}
