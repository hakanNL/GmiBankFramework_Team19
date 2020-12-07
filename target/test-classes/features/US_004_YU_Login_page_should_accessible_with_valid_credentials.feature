@gmibank
Feature: US_004_YU_Login_page_should_accessible_with_valid_credentials

  Background: User is on the gmibank homepage
    Given user is on the gmibank homepage

  Scenario: TC01 User should be able to login with valid credentials
    And user clicks on account-menu button
    And user selects on "Sign in" button on the dropdown menu
    When user enters a valid username "valid_username"
    When user enters a valid password "valid_password"
    And user clicks on -sing in- button
    Then verify there should be a "sign out" button on the account-menu



