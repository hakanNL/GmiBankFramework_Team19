@gmibank   @smoketest
Feature: US_004_YU_Login_page_should_accessible_with_valid_credentials

  Background: User is on the gmibank homepage
    Given user is on the gmibank homepage

  Scenario: TC01 User should be able to login with valid credentials
    Given user clicks on account-menu button
    And user clicks on sing in button
    When user enters a valid username "uluturk"
    When user enters a valid password "yvz.FB1907"
    And user clicks on second sing in button
    Then verify if there a success message to login on the page
    And user clicks on sing out button

  Scenario: TC02 User should be able to cancel to login
    Given user clicks on account-menu button
    And user clicks on sing in button
    Then verify if there is an option to cancel on the sign in page