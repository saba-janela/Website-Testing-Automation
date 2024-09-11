Feature: User Registration

  @Smoke
  Scenario: Successfully Load home page
    Given User has navigated to the website
    Then Home page should be visible

  @Smoke
  Scenario: Successfully open login page
    Given User is on home page
    When User clicks Signup-Login button
    Then login page should be visible

  @Smoke
  Scenario: Successfully enter name and email address
    Given User is on Signup-Login page
    When User enters their name and email address
    When User clicks Signup button
    Then Signup page should be visible

  @Registration
  Scenario: Successfully registering user account
    Given User is on registration page
    When User fills details
    When User clicks Create Account Button
    Then Account should be created

  @Registration_E2E
  Scenario: Successfully deleting user account
    Given User is logged in
    When User clicks Delete Account button
    Then Account should be deleted
