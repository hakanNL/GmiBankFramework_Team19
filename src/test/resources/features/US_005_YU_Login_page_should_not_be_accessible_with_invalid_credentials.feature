@US_005
Feature: US_005_YU_Login_page_should_not_be_accessible_with_invalid_credentials.feature

  Background: User is on the gmibank homepage
    Given user is on the gmibank homepage
    And user clicks on account-menu button
    And user clicks on sing in button

  Scenario: TC01 User cannot login with invalid username validating the error message
    When user enters a invalid username "Abcde"
    When user enters a valid password "yvz.FB1907"
    And user clicks on second sing in button
    Then verify if there is an error message on the screen

  Scenario: TC02 User cannot login with invalid password validating the error message
    When user enters a valid username "uluturk"
    When user enters a invalid password "gs.1905"
    And user clicks on second sing in button
    Then verify if there is an error message on the screen

  Scenario: TC03 User cannot login with invalid username and password validating the error message
    When user enters a invalid username "cimbom1"
    When user enters a invalid password "gs.1905a"
    And user clicks on second sing in button
    Then verify if there is an error message on the screen

  Scenario: TC04 User with invalid credentials should be given an option to reset their password
    When user enters a invalid username "cimbom2"
    When user enters a invalid password "gs.1905b"
    And user clicks on second sing in button
    Then verify if there is an option to reset their password on the page

  Scenario: TC05 User should be given the option to navigate to registration page if they did not register yet
    When user enters a invalid username "cimbom3"
    When user enters a invalid password "gs.1905c"
    And user clicks on second sing in button
    Then verify if there is an option to registration on the page

