@US25
Feature: Create new Country with api

  Scenario: TC_001 User create country with api
    Given 1.Use api end point  "https://www.gmibank.com/api/tp-countries"
    And 2.Get all customers' countries information as De-Serialization
    And 3.Create a new country "Switzerland"
    And 4.Validate the new country 1 by 1







