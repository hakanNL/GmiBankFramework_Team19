@US29
Feature: US_29_All data validation based on DB

  Background: create a connection with DB
    Given user create connection with using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"

    Scenario Outline: Read all customer info

      Given user gets all customer column data using "<query>" and "<columnName>"
      And user sets all customer info to correspondedd files
      Then user validates all db customer info

      Examples: all customer data sets
      |query|columnName|
      |SELECT * FROM tpaccount_registration|last_name|

  Scenario Outline: Read all countries info

    Given user gets all countries info using "<query>" and "<columnName>"
    Then user validates all db countries info

    Examples: all country data sets
      |query|columnName|
      |SELECT * FROM tp_country|name|

  Scenario Outline: Read all states info

    Given user gets all states info using "<query>" and "<columnName>"
    Then user validates all db states info

    Examples: all states data sets
      |query|columnName|
      |SELECT * FROM tp_state|name|




