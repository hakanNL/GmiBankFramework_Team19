@gmibank
Feature: An Employee can create a new Account

  Background: Employee gmibank homepage
    Given Go to gmibank.com home page
    And Click to User Account Menu and Click to SignIn



  @US13TC01
  Scenario:US13TC01 User should create a description for the new account and it cannot be blank

    And Enter the username with valid credentail
    And Enter the pasword with valid credentail
    And Click to Sign in button
    And Click to My Operations drop down menu and Click to Manage Accounts then click to Create New Account
    And Click for explanations Do not write data to TextBox
    And verify the error message
    Then user signOut from Website

  @US13TC02
  Scenario:US13TC02 User should provide a balance for the first time account creation as Dollar
    Given Go to gmibank.com home page
    And Click to User Account Menu and Click to SignIn
    And Enter the username with valid credentail
    And Enter the pasword with valid credentail
    And Click to Sign in button
    And Click to My Operations drop down menu and Click to Manage Accounts then click to Create New Account
    And Enter a number be dollar to Balance textbox
    Then user signOut from Website

  @US13TC03
  Scenario:US13TC03 User can select an account type as CHECKING, SAVING, CREDIT_CARD or INVESTING
    Given Go to gmibank.com home page
    And Click to User Account Menu and Click to SignIn
    And Enter the username with valid credentail
    And Enter the pasword with valid credentail
    And Click to Sign in button
    And Click to My Operations drop down menu and Click to Manage Accounts then click to Create New Account
    Then User can select an account type as CHECKING, SAVING, CREDIT_CARD or INVESTING
    Then user signOut from Website

  @US13TC04
  Scenario:US13TC04 Account status should be defined as ACTIVE, SUSPENDED or CLOSED
    Given Go to gmibank.com home page
    And Click to User Account Menu and Click to SignIn
    And Enter the username with valid credentail
    And Enter the pasword with valid credentail
    And Click to Sign in button
    And Click to My Operations drop down menu and Click to Manage Accounts then click to Create New Account
    Then Account status should be defined as ACTIVE, SUSPENDED or CLOSED
    Then user signOut from Website

  @US13TC05
  Scenario:US13TC05 User can select an employee from the drop-down
    Given Go to gmibank.com home page
    And Click to User Account Menu and Click to SignIn
    And Enter the username with valid credentail
    And Enter the pasword with valid credentail
    And Click to Sign in button
    And Click to My Operations drop down menu and Click to Manage Accounts then click to Create New Account
    Then User can select an employee from the drop-down
    Then user signOut from Website