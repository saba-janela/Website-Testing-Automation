package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.HomePage.*;
import static pages.LoginPage.*;

public class LoginPage {
    @Given("User is on home page")
    public void UserIsOnHomePage() {
        verifyHomePage();
    }
    @When("User clicks Signup-Login button")
    public void UserClicksSignupLoginButton() {
        clickLoginBtn();
    }
    @Then("login page should be visible")
    public void LoginPageShouldBeVisible() {
        verifyLoginPage();
    }
}
