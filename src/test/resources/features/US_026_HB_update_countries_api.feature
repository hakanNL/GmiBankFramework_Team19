@apih @gmibank

Feature: System should allow to update countries data using api end point
    Scenario: TC_01_User read all countries just created and validate
       Given User go to end point "https://www.gmibank.com/api/tp-countries"
       And User must verify content type and status code
      And Get all information for all countries as De-Serialization
      And User create one country and verify it
      And User gets all countries data from the system and prints to .csv file
      Then User read the printed files and verifies that the data created is in the .csv file.

    Scenario: TC_02_User can update each country that just created 1 by 1
      Given User go to end point "https://www.gmibank.com/api/tp-countries"
      And Get all information for all countries as De-Serialization
      And User create one country and verify it
      And User gets one country that just created
      Then User update these countries and verify it

