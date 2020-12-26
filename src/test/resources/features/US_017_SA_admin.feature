@admin_user_management @gmibank
Feature: US_17_SO_Admin_user_account_manage
  Background: User check account
    Given Go to the web address: "http://www.gmibank.com/login"
    And Type the name of the valid admin "nadminUS17" in the Username box.
    And Type the current password in the password1 "nadminUS18+" box.
  @US_17_TC_0001_User
  Scenario: TC_0001_Admin can activate a role as User
    And Click on the Adminisration button
    And Click on the User management button
    And Click on once the Login button
    And Click on once the Edit button
    And Select Profiles as User
    And Click on once the Save button
    And Click on once the Login button
    And Click on the Activate button for first User
    And It should be checked that "A user is updated with identifier" is displayed."
    And Click on twice the Login button
    Then Click on the Deactivate button for first User
  @US_17_TC_0002_User
  Scenario: TC_0002_Admin can activate a role as Employee
    And Click on the Adminisration button
    And Click on the User management button
    And Click on once the Login button
    And Click on once the Edit button
    And Select Profiles as Employee
    And Click on once the Save button
    And Click on once the Login button
    And Click on the Activate button for first Employee
    And It should be checked that "A user is updated with identifier" is displayed."
    And Click on twice the Login button
    Then Click on the Deactivate button for first User
  @US_17_TC_0003_User
  Scenario: TC_0003_Admin can activate a role as Manager
    And Click on the Adminisration button
    And Click on the User management button
    And Click on once the Login button
    And Click on once the Edit button
    And Select Profiles as Manager
    And Click on once the Save button
    And Click on once the Login button
    And Click on the Activate button for first Manager
    And It should be checked that "A user is updated with identifier" is displayed."
    And Click on twice the Login button
    Then Click on the Deactivate button for first User
  @US_17_TC_0004_User
  Scenario: TC_0004_Admin can activate a role as Admin
    And Click on the Adminisration button
    And Click on the User management button
    And Click on once the Login button
    And Click on once the Edit button
    And Select Profiles as Admin
    And Click on once the Save button
    And Click on once the Login button
    And Click on the Activate button for first Admin
    And It should be checked that "A user is updated with identifier" is displayed."
    And Click on twice the Login button
    Then Click on the Deactivate button for first User
  @US_17_TC_0005_User
  Scenario: TC_0005_Admin can view all user info
    And Click on the Adminisration button
    And Click on the User management button
    And Click on once the Login button
    And Click on the View button for first User
    Then It should be checked that All user info is displayed.
  @US_17_TC_0006_User
  Scenario: TC_0006_Admin can edit all user info
    And Click on the Adminisration button
    And Click on the User management button
    And Click on once the Login button
    And Click on the Edit button for first User
    And Change the "ZazxAhmet" in the First name box.
    And Change the "Zazxahmet" in the Last name box.
    And Change the "Zxzaxhmet@gmail.com" in the Email box.
    And Click on the Save button
    Then It should be checked that "A user is updated with identifier" is displayed."
  @US_17_TC_0007_User
  Scenario: TC_0007_Admin can delete all user info
    And Click on the Adminisration button
    And Click on the User management button
    And Click on the Create a new user button
    And Type the new username in the Login box.
    And Type the First name in the First name box.
    And Type the Last name in the Last name box.
    And Type the Email in the Email box.
    And Select the Profile as "User" in the Profiles box.
    And Click on the Created date button
    And Click on the Delete button for first User
    And Confirm delete operation
    Then It should be checked that "A user is deleted with identifier" is displayed."