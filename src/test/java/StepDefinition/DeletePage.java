package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static pages.DeletePage.*;
import static pages.SignupPage.*;

public class DeletePage {

    @Given("User is logged in")
    public void user_is_logged_in() {
        verifyUserLogin();
    }
    @When("User clicks Delete Account button")
    public void user_clicks_delete_account_button() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
    }
    @Then("Account should be deleted")
    public void account_should_be_deleted() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")));

        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
    }
}
