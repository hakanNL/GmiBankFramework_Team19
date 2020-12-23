@api
Feature: US_022_Read STATES using api end point
  Background: System should allow to read STATES using api end point
    Given User go to end point "https://www.gmibank.com/api/tp-states"
    Then Get all information for "STATES" as De-Serialization
  Scenario: Read all states you created and validate them from your data set
    And User can update just created country