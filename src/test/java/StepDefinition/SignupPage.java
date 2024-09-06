package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.SignupPage.*;
import static pages.LoginPage.*;

public class SignupPage {

    @Given("User goes to Signup-Login page")
    public void UserIsOnSignupLoginPage() {
        clickLoginBtn();
        verifyLoginPage();
    }
    @When("User enters their name and email address")
    public void UserEntersTheirNameAndEmailAddress() {
        enterNameAndEmail();
    }
    @When("User clicks Signup button")
    public void UserClicksSignupButton() {
        clickSignUpBtn();
    }
    @Then("Signup page should be visible")
    public void SignupPageShouldBeVisible() {
        verifySignUpPage();
    }


    @Given("User goes to registration page")
    public void user_goes_to_signup_page() {
        clickLoginBtn();
        verifyLoginPage();
        enterNameAndEmail();
        clickSignUpBtn();
        verifySignUpPage();
    }
    @When("User fills details")
    public void user_fills_details() {
        fillDetails();
    }
    @When("User clicks Create Account Button")
    public void user_clicks_create_account_button() {
        clickCreateAccBtn();
    }
    @Then("Account should be created")
    public void account_should_be_created() {
        verifyAccountCreation();
    }
}
