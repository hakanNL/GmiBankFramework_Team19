@api
Feature: US_020_Read all countries info using api end point

  Scenario: System should allow to get all data using api end point
    Given User go to countries end point "https://www.gmibank.com/api/tp-countries"
    And Get all information for countries as De-Serialization

    Then User validate 5 th countries info