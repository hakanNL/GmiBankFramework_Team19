@US_23
Feature: US_23_YU_System_should_allow_to_read_all_applicants_using_api_end_point.feature

  Background: Use api end point
    Given user go to end point "https://www.gmibank.com/api/tp-account-registrations"
    And Get all applicants' info as De-serialization

  Scenario: TC_01 Read all applicants
    And Read all applicants
    And User saves the all applicants' SSN to files

  Scenario: TC_02 Validate all applicants you created
    And verify is there are all applicant's from team19



