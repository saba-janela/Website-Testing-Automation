package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static pages.HomePage.*;
import static pages.SignupPage.*;
import static pages.LoginPage.*;

public class SignupPage {
    @Given("User is on Signup-Login page")
    public void UserIsOnSignupLoginPage() {
        verifyHomePage();
        clickSignupLoginBtn();
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

    @Given("User is on registration page")
    public void UserGoesToRegistrationPage() {
        clickSignupLoginBtn();
        verifyLoginPage();
        enterNameAndEmail();
        clickSignUpBtn();
        verifySignUpPage();
    }

    @When("User fills details")
    public void UserFillsDetails() {
        fillDetails();
    }

    @When("User clicks Create Account Button")
    public void UserClicksCreateAccountButton() {
        clickCreateAccBtn();
    }

    @Then("Account should be created")
    public void AccountShouldBeCreated() {
        verifyAccountCreation();
    }
}
