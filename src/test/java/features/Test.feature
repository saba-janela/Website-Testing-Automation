Feature: User Registration
  Scenario: Successfully Load home page
    Given User has navigated to the website
    Then Home page should be visible

  Scenario: Successfully open login page
    Given User is on home page
    When User clicks Signup-Login button
    Then login page should be visible
