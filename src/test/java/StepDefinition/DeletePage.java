package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static pages.DeletePage.*;

public class DeletePage {
    @Given("User is logged in")
    public void UserIsLoggedIn() {
        verifyUserLogin();
    }

    @When("User clicks Delete Account button")
    public void UserClicksDeleteAccountButton() {
        clickDeleteBtn();
    }

    @Then("Account should be deleted")
    public void AccountShouldBeDeleted() {
        verifyAccountDeletion();
    }
}
