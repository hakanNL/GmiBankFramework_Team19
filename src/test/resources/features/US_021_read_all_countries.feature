@Apii
Feature: US_021_Read all countries info using api end point

  Scenario: TC_2_System should allow to get all data using api end point
    Given User go to countries end point "https://www.gmibank.com/api/tp-countries"
    And Get all information for countries as De-Serialization

    Then User validate 7 th countries info

