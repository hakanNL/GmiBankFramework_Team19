api
Feature: US_026_UpdateCountries using api end point

  Background: System should allow to get all data using api end point

    Given User go to end point "https://www.gmibank.com/api/tp-countries"
    Then Get all information for countries as De-Serialization

    Scenario: User can just update each country 1 by 1
      Given User gets newly created countries
      And User update these countries
