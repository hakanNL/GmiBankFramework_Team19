@EndT0End
  Feature: Team Tiger And to And test

    Scenario: Team_19 End To End Tek seferde registration
  #register
      Given Kullanici gmibank_register sayfasina gider
      And Kullanici SSN text box una gecerli bir gecerli_SSN girer
      And Kullanici First Name kutusuna gecerli bir first_Name girer
      And Kullanici Last Name kutusuna gecerli bir last_Name girer
      And Kullanici Address kutusuna gecerli bir address girer
      And Kullanici Mobile Phone Number kutusuna gecerli bir mobile_Phone_Number girer
      And Kullanici Username kutusuna gecerli bir username girer
      And Kullanici Email kutusuna gecerli bir Email girer
      And Kullanici New password kutusuna karakter ve digid den olusan gecerli bir new_Password girer
      And Kullanici New password confirmation kutusuna tekrar new_Password girer
      And Kullanici Register butonuna tiklar
  #userRoleCostumer
      Given Go to the web address: "http://www.gmibank.com/login"
      And Type the name of the valid admin "nadminUS17" in the Username box.
      And Type the current password in the password1 "nadminUS18+" box.
      And Click on the Adminisration button
      And Click on the User management button
      And Click on once the Login button
      And Click on once the Edit button
      And Select Profiles as User
      And Click on once the Save button
      And Click on the Activate button for first User
      And It should be checked that "A user is updated with identifier" is displayed."
      And Click on twice the Login button
      Then Click on the Deactivate button for first User
  #employeeCtreateAccount
      Given Go to gmibank.com home page
      And Click to User Account Menu and Click to SignIn
      And Enter the username with valid credentail
      And Enter the pasword with valid credentail
      And Click to Sign in button
      And Click to My Operations drop down menu and Click to Manage Accounts then click to Create New Account
      Then User can select an account type as CHECKING, SAVING, CREDIT_CARD or INVESTING
      Then user signOut from Website
  #sendMoney
      And Go to the web address: "http://www.gmibank.com/login"
      And Type the name of the valid customer "salih" in the Username box.
      And Type the current password in the password "Salih123." box.
      And Click on the My Operations button
      And Click on the My Accounts button
      And Click on the View Transaction button
      And Click on the My Operations button
      And Click on the Transfer Money button
      And Select an "Investing" account from the To section
      And Select another "Saving" account from the To section
      And Write the amount of money "5" in the Balance section
      And Write a description "Grant" in the Description section
      And Click on the Make Transfer button
      Then It should be checked that "Transfer is successfull" is displayed.








