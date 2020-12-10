Feature:US_008 Password segment on Homepage should be editable
  Background:
    When 1Go to "https://gmibank.com/" link
    And 2Click to User drop down menu
    And 3Click to Sign in
    And 4Enter the username with valid credentials
    And 5Enter the password with valid credentials
    And 6Click to Sign in button
    And 7Click to User drop down menu2
    And 8Click to Password

  @US_008_TC_01
  Scenario:The old password should not be used
    And 9Enter to Current Password
    And 10Enter the Current Password in New password Box.
    And 11Enter to Current Password in New password confirmation Box.
    And 12Click to Save Button.
    Then 13Assert that Save Alert Negative.

  @US_008_TC_02
  Scenario:There should be at least 1 lowercase char for stronger password and
  see the level chart change accordingly
    And 9Enter the Basic Password to New password box.
    And 10Enter the Password with one uppercase adding to New password box.
    And 11Assert that level chart1.
    And 12Enter the Password with more one digit adding to New password box.
    And 13Assert that level chart2
    And 14Enter to Password with more special char adding to New password box.
    And 15Assert that level chart3
    And 16Enter the valid Password has least 7 chars to New password box.
    And 17Assert that level chart4
    And 18Enter the valid  Password  has least 7 chars to New password confirmation box.
    And 19Click to Save button.
    Then 20Assert that Save Alert.