package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import util.BrowserDriver;
import static pages.SignupPage.testEmail;
import static pages.SignupPage.testPassword;

public class LoginPage extends BrowserDriver {

    public static void clickSignupLoginBtn(){
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    }

    public static void verifyLoginPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'New User Signup!')]")));
    }

    public static void enterLoginInfo(){
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys(testEmail);
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys(testPassword);
    }

    public static void clickLoginBtn(){
        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();
    }

    public static void verifyAccountLogin(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")));
    }

}
