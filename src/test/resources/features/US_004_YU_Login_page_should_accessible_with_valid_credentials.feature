@gmibank
Feature: US_004_YU_Login_page_should_accessible_with_valid_credentials

  Background: User is on the gmibank homepage
    Given user is on the gmibank homepage
  @US_004
  Scenario: TC01 User should be able to login with valid credentials
    Given user clicks on account-menu button
    And user clicks on sing in button
    When user enters a valid username "uluturk"
    When user enters a valid password "yvz.FB1907"
    And user clicks on second sing in button
    Then verify there should be a sign out button on the account-menu

  @US_004
  Scenario: TC02 User should be able to cancel to login
    Given user clicks on account-menu button
    And user clicks on sing in button
    And user clicks on cancel button
    Then verify if the user cancel to sign in