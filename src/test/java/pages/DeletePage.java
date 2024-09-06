package pages;

import org.openqa.selenium.By;

import static pages.LoginPage.clickLoginBtn;
import static pages.LoginPage.verifyLoginPage;
import static pages.SignupPage.*;

public class DeletePage {

    public static void verifyUserLogin(){
        clickLoginBtn();
        verifyLoginPage();
        enterNameAndEmail();
        clickSignUpBtn();
        verifySignUpPage();
        fillDetails();
        clickCreateAccBtn();
        verifyAccountCreation();

        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a"));
    }
}
