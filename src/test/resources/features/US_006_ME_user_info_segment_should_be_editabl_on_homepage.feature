@gmibank1
 Feature: US_006_ME User info segment (User Settings) should be editable on Homepage

  Background: User is on the info segment of own account
    Given user is on the gmibank homepage
    And user clicks on account-menu button
    And user clicks on sing in button
    When user enters "Mehmet1Customer" to Username field
    When user enters "Mn.04092015" to password field
    And user clicks on second sing in button
    And click User Name button
    And clicks User Info button

  Scenario: TC_01 There should be user info being populated when navigating to user info firstname, lastname

    Then Verify on First Name field "Mehmet1Customer"
    Then Verify on Last Name field "Ekinci"
    Then Verify on Email field "izmirsh12@gmail.com"
    Then Verify on Language field "English"



