@regression
@US10_ON
  Feature: US_010_The employee's transactions at the customer address
    Background:
      Given go to "https://gmibank.com/login"
      And Valid employee data must be entered in User box and Password box and click Sign in button
      And  Click the Manage Customers option from the My Operations dropdown.
      Given The employee clicks the Edit button of customer information

    @US10TC01
    Scenario: TC_01_If "Zip Code" is left blank, "This field is required." the message should pop up
      Then The -Zip Code- box should be left blank and at the bottom of the box -This field is required.- should popup the alert
    @US10TC02
    Scenario: TC_02_If "Address" is left blank, "This field is required." the message should pop up
      Then The -Address- box should be left blank and at the bottom of the box -This field is required.- should popup the alert
    @US10TC03
    Scenario: TC_03_If "City" is left blank, "This field is required." the message should pop up
      Then The -City- box should be left blank and at the bottom of the box -This field is required.- should popup the alert
    @US10TC04
    Scenario: If "Country" is left blank, "This field is required." the message should pop up
      Given The Country box should be left blank and at the bottom of the box -This field is required.- should popup the alert
    @US10TC05
    Scenario: If "State" is left blank, "This field is required." the message should pop up
      Given The State box should be left blank and at the bottom of the box This field is required. should popup the alert
    @US10TC06
    Scenario: TC_06 When valid data is entered in the "Zip Code", "Address", "City", "Country", "State" fields, "This field is required." message should not pop up
      Given Valid data is entered into the Zip Code box "11764"
      And Valid data is entered into the Address box "Yeterikadar mah. Umitliler cd. Gelecekliler sk. no:5/2"
      And Valid data is entered into the City box "Bayburt"
      And Valid data is entered into the Country dropdown "USA"
      And Valid data is entered into the State box "New York"
      Then -This field is required.- It should be verified that the text is not popup.
