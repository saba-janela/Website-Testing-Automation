Feature: User Login with correct email and password

  Scenario: Successfully Load home page
    Given User has navigated to the website
    Then Home page should be visible

  Scenario: Successfully open login page
    Given User is on home page
    When User clicks Signup-Login button
    Then login page should be visible

  @Login
  Scenario: Successfully login user account
    Given User is on Signup-Login page
    When User enters correct email address and password
    When User clicks login button
    Then Account should be logged in