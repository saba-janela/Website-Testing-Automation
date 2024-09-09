package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import static pages.HomePage.*;

public class HomePage {
    @Given("User has navigated to the website")
    public void UserHasNavigatedToTheWebsite() {
        assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/");
    }

    @Then("Home page should be visible")
    public void HomePageShouldBeVisible() {
        verifyHomePage();
    }

}
