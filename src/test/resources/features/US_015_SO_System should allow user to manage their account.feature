@gmibank
Feature: User_account_manage
  Background: User check account
  Given Go to the web address: "http://www.gmibank.com/login"
  And Type the name of the valid customer "dcostumer19" in the Username box.
  And Type the current password in the password "Dc145314" box.

@US_15_TC_0001_User
  Scenario: TC_0001_User should see all account types and balance populated
  And Click on the My Operations button
  And Click on the My Accounts button
  And Click on the View Transaction button
  And Get the Account Type01, Account Balance01 information of the first account.
  Then Get the Account Type02, Account Balance02 information of the second account.
  @US_15_TC_0002_User
  Scenario: TC_0002_User should see all account types and balance populated
    And Click on the My Operations button
    And Click on the My Accounts button
    And Click on the View Transaction button
    And Get the ID, Account ID, Description, Date, Amount, New Balance information of the first account.
    And Click on the View Transaction second button
    And Get the ID, Account ID, Description, Date, Amount, New Balance information of the second account.

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
