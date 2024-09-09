package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static pages.LoginPage.*;
import static pages.LoginPage.clickSignupLoginBtn;
import static pages.SignupPage.*;

public class DeletePage {

    public static void verifyUserLogin(){
        clickSignupLoginBtn();
        verifyLoginPage();
        enterNameAndEmail();
        clickSignUpBtn();
        verifySignUpPage();
        fillDetails();
        clickCreateAccBtn();
        verifyAccountCreation();

        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a"));
    }

    public static void clickDeleteBtn(){
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
    }

    public static void verifyAccountDeletion(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")));

        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
    }
}
