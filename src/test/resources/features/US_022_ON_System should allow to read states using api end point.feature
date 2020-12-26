@api @gmibank
@api22
  Feature: US_22_ON_System should allow to read states using api end point

    Scenario: TC_01_Read all states you created and validate them from your data set
    Given User go to states end point "https://www.gmibank.com/api/tp-states"
    And User content type and status code verifies
    And User does the deserilazition operation
    And User create one state and verifies
    And User gets all state data from the system and prints to .csv file
    Then User reads the printed files and verifies that the data created is in the .csv file.

    Scenario: TC_02_Read all states you created and validate them 1 by 1
    Given User go to states end point "https://www.gmibank.com/api/tp-states"
    And User content type and status code verifies
    And User does the deserilazition operation
    And User create one state and verifies
    Then User verifies the state created 1 by 1
