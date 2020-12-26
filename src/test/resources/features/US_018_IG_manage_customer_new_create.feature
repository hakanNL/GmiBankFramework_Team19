@US18 @gmibank
Feature: System should allow Admin to manage a customer


  @US18TC01
  Scenario: Admin All customers should show up on manage customers module populating
    Given Go to gmibank.com home page
    And Click to User Account Menu and Click to SignIn
    And the user_name enters
    And the user_password enters
    And user click signIn button
    Then user clicks myOperations
    And Manage  Customer is safe
    And admin open the manage customer page