@gmibank
Feature: User_account_manage
  Background: User check account
    Given Go to the web address: "http://www.gmibank.com/login"
    And Type the name of the valid customer "salih" in the Username box.
    And Type the current password in the password "Salih123." box.

  @US_16_TC_0001_User
  Scenario: TC_0001_Money transfer should be available
    And Click on the My Operations button
    And Click on the Transfer Money button
    And Select an "Investing" account from the To section
    And Select another "Saving" account from the To section
    And Write the amount of money "5" in the Balance section
    And Write a description "Grant" in the Description section
    And Click on the Make Transfer button
    Then It should be checked that "Transfer is successfull" is displayed.