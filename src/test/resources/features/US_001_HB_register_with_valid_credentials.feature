@gmibank
@demo
Feature: System should allow any user to register with valid credentials validating

  Background: Kullanici register sayfasina gider
    Given Kullanici gmibank_register sayfasina gider

  @US01TC01
  Scenario: US01TC01 gecerli SSN ile dogrulama
    And Kullanici SSN text box una gecerli bir gecerli_SSN girer
    Then Kullanici SSN kutusunun bos olmadigini dogrular

  @US01TC02
  Scenario: US01TC02 bos birakilmamak kaydiyla gecerli bir first name girilebilmeli
    And Kullanici First Name kutusuna gecerli bir first_Name girer
    Then Kullanici First Name kutusunun bos olmadigini dogrular

  @US01TC03
  Scenario: US01TC03 bos birakilmamak kaydiyla gecerli bir last name  girilebilmeli
    And Kullanici Last Name kutusuna gecerli bir last_Name girer
    Then Kullanici Last Name kutusunun bos olmadigini dogrular

  @US01TC04
  Scenario: US01TC04 adres kutusuna gecerli bir post code ile address girilebilmeli
    And Kullanici Address kutusuna gecerli bir address girer
    Then Kullanici Address kutusunun bos olmadigini dogrular

  @US01TC05
  Scenario: US01TC05 Mobile Phone Number kutusuna bosluk birakmadan gecerli bir Mobile_Phone_Number girilebilmeli
    And Kullanici Mobile Phone Number kutusuna gecerli bir mobile_Phone_Number girer
    Then Kullanici Mobile Phone Number kutusunun bos olmadigini dogrular

  @US01TC06
  Scenario: US01TC06 Username kutusuna karakter ve digid den olusan gecerli bir Username girilebilmeli
    And Kullanici Username kutusuna gecerli bir username girer
    Then Kullanici Username kutusunun bos olmadigini dogrular

  @US01TC07
  Scenario: US01TC07 Email kutusuna '@' ve '.' dan olusan gecerli bir Email girilebilmeli

    And Kullanici Email kutusuna gecerli bir Email girer
    Then Kullanici Email kutusunun bos olmadigini dogrular


  @US01TC08
  Scenario: US01TC09 Tek seferde registration

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
    Then Kullanici Registration saved mesajini gorur














