
Feature: US_007_ME System should not allow to make updates with invalid credentials

  Background: User is on the info segment of own account
    Given user is on the gmibank homepage
    And user clicks on account-menu button
    And user clicks on sing in button
    When user enters "Mehmet1Customer" to Username field
    When user enters "Mn.04092015" to password field
    And user clicks on second sing in button
    And click User Name button
    And clicks User Info button


  Scenario: Email id cannot contain just digits or chars without '@' extension
    And Clear Email field
    When Send invalid "izmirgmail.net" to Email field
    Then Verify This field is invalid
    And click User Name button
    And click Sign out button


  Scenario: Email id cannot contain just digits or chars without  '.' extension
    And Clear Email field
    When Send invalid without . "izmir@gmailnet" to Email field
    Then Verify This field is invalid
    And click User Name button
    And click Sign out button


  Scenario:  Email id cannot contain just digits or chars without '@' sign and '.' extension
    And Clear Email field
    When Send invalid without . and @ "izmirgmailnet" to Email field
    Then Verify This field is invalid
    And click User Name button
    And click Sign out button

  @gmibank1
  Scenario: There should not be an option of any other language other than English or Turkish
    Then Verify just English and Turkish option in the language list
    And click User Name button
    And click Sign out button


