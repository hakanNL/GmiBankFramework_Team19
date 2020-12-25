@createStates
  Feature: create states
    Scenario: TC_001 User create states with api
      Given go to end point "https://www.gmibank.com/api/tp-states"
      And  user system should be all data response
      And  user created states
      And  user install all data
      And  user compare created data and install data and verify