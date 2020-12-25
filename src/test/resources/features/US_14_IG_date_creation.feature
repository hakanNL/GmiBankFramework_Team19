@gmbank @US14
Feature: US14 test
  Background: user enters gmibank homepage then reaches create new costomers link
    Given Go to gmibank.com home page
    And Click to User Account Menu and Click to SignIn
    And enters  username
    And enters  password
    And user click signIn button
    Then user clicks myOperations


  @US14TC01
  Scenario: US14TC01 manage accounts date selection today test
    Given user clicks manageAccounts
    And user clicks createANewAccount
    And user sends an earlier date
    And user verifies date is an early date
    Then user signOut from Website

  @US14TC02
  Scenario: US14TC02 manage accounts date selection positive test
    Given user clicks manageAccounts
    And user clicks createANewAccount
    And user account send a date
    Then user signOut from Website

  @US14TC03
  Scenario: US14TC03  manage customers date selection positive test
    Given user clicks manageCustomers
    And user clicks createANewCustome
    And user customer send a date "12122020" and click tab
    And user customer send a time "1000" and user click tab
    And user customer click tab
    And user customer verifies valid data entry to Create Date box
    Then user signOut from Website
  @US14TC04
  Scenario: US14TC04 manage customers user selection positive test
    Given user clicks manageCustomers
    And user clicks createANewCustome
    And user customer click user box and select a user
    And user customer verifies valid selection of user
    Then user signOut from Website
  @US14TC05
  Scenario: US14TC05 manage customers Zelle box selection test
    Given user clicks manageCustomers
    And user clicks createANewCustome
    And user customer click Zelle Enrolled box
    Then user signOut from Website