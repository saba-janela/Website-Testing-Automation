package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import static pages.HomePage.*;

public class Registration {
    @Given("User has navigated to the website")
    public void user_navigates_to_the_website() throws Throwable {
        System.out.println(driver.getCurrentUrl());
        assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/");
    }
    @Then("home page should be visible")
    public void home_page_should_be_visible() {
        checkSearch();
    }

}
