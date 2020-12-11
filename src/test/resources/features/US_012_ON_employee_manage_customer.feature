@regression
@US10US12
@US12_ON
  Feature: US012 An Employee can manage Customer
    Background:
      Given go to "http://gmibank.com/login"
      And Valid employee data must be entered in User box and Password box and click Sign in button
      And Click the Manage Customers option from the My Operations dropdown.
    @US12TC01
    Scenario: TC01 All customers should show up on manage customers module populating the account information of the customer
      And The employee verifies that a list of all customers who have filled in their account information is seen.
    @US12TC02
    Scenario: TC02 "There should be a View option where customer can be navigated to all customer info and see.
    edit button there"
      And Employee sees View customer information button and clicked
      Then The employee verifies that sees the Edit button on the customer information page.
    @US12TC03
    Scenario: TC03 There should be an Edit button where all customer information can be populated
      And The Employee verifies that she sees the Edit button of customer information.
    @US12TC04
    Scenario: TC04 The Edit portal can allow user to update the user info
      And The employee clicks the Edit button of customer information
      And The employee makes changes in some part of the customer information and clicks the Save button.
      Then The employee verifies that it has seen the message -translation-not-found [gmiBankBackendApp.tPCustomer.updated]-
    @US12TC05
    Scenario: TC05 User can delete a customer, but seeing a message if the user is sure about deletion
      And The employee clicks the Delete button of customer information
      And The employee verifies that sees the -Confirm deletion- text in the pop-up.
      And The employee clicks the Delete button in the -Confirm delete operation- popup
      Then The employee verifies that has seen the -translation-not-found [gmiBankBackendApp.tPCustomer.deleted]- message.
