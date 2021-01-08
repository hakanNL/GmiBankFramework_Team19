@api @gmibank
Feature: US_020_Read all customers info using api end point
  Scenario: System should allow to get all data using api end point
    Given User go to customers end point "https://www.gmibank.com/api/tp-customers"
    And Get all information for customers as De-Serialization
    Then User validate 5 th customers info

 @CreateRead
 Scenario:Read all customers you created and validate them 1 by 1
   And  user created states