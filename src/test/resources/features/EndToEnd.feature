
  Feature: Team 19

    Scenario: Team_19 End To End Tek seferde registration

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
      And Go to the web address: "http://www.gmibank.com/login"
      And Type the name of the valid customer "dcostumer19" in the Username box.
      And Type the current password in the password "Dc145314" box.
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








