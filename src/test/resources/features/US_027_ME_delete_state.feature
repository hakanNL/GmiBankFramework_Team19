@gmibank @gmibank
Feature: US_027_System should allow to delete states using api end point

  Scenario: TC_01_User can just delete each state 1 by 1
   Given User read all state at the endpoint "https://www.gmibank.com/api/tp-states"
   And Get all information of state as De_Serilization
   And Create states and validation
   Then Delete state we created and Assert deletion
