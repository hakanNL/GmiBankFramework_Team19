
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

  Scenario: TC_01 There should be user info being populated when navigating to user info firstname, lastname , email and language
    Then Verify on First Name field "Mehmet1Customer"
    Then Verify on Last Name field "Ekinci"
    Then Verify on Email field "izmirsh12@gmail.com"
    Then Verify on Language field "English"


    Scenario: TC_02 There should be 2 languages available "English and Turkish"
    Then Verify Language
    And click Languages Row button
    Then select Türkish
     Then click Save button
    Then Verify Dil


  Scenario: TC_03 There should be an option to update firstname
    And Clear First Name field
    When Send "MehmetCustomer" to First Name field
    And click Save button
    Then Verify Settings saved!


  Scenario: TC_04 There should be an option to update lastname
    And Clear Last Name field
    When Send "Ekici" to Last Name field
    And click Save button
    Then Verify Settings saved!


   Scenario: TC_05  There should be an option to update email id adding "@" sign and "." extension
   And Clear Email field
   When Send "izmir@gmail.net" to Email field
   And click Save button
   Then Verify Settings saved!













