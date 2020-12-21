@gmibank1
Feature: US_026_UpdateCountries using api end point

  Background: System should allow to get all data using api end point
    Given User go to end point "https://www.gmibank.com/api/tp-states"
    Then Get all information for "states" as De-Serialization

  Scenario: User can just delete each state 1 by 1
    And User can delete just created states
    Then Assert to delete
