@US19
Feature: System should allow Admin to create a new Account


  @US18TC01
  Scenario: Admin should create a description for the new account and it cannot be blank
    Given Go to gmibank.com home page
    And Click to User Account Menu and Click to SignIn
    And the user_name enters
    And the user_password enters
    And user click signIn button
    Then user clicks myOperations
    And Manage  Account is safe
    And admin open the manage account page