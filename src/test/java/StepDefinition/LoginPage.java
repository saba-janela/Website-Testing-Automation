package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static pages.DeletePage.*;
import static pages.HomePage.*;
import static pages.LoginPage.*;

public class LoginPage {
    @Given("User is on home page")
    public void UserIsOnHomePage() {
        verifyHomePage();
    }
    @When("User clicks Signup-Login button")
    public void UserClicksSignupLoginButton() {
        clickSignupLoginBtn();
    }

    @Then("login page should be visible")
    public void LoginPageShouldBeVisible() {
        verifyLoginPage();
    }

    @When("User enters correct email address and password")
    public void UserEntersCorrectEmailAddressAndPassword() {
        enterLoginInfo();
    }
    @When("User clicks login button")
    public void UserClicksLoginButton() {
        clickLoginBtn();
    }
    @Then("Account should be logged in")
    public void AccountShouldBeLoggedIn() {
        verifyAccountLogin();
        clickDeleteBtn();
        verifyAccountDeletion();
    }

}
