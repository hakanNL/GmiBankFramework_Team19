@gmibank
@newdate
Feature: The date cannot be typed earlier, in the past, at the time of creation a customer
  Background: date cheking about customer
    Given go to "http://gmibank.com/login"
    And Valid employee data must be entered in User box and Password box and click Sign in button



  @pastdate
  Scenario: TC_01_1_user send to all boxes
    And Click the Manage Customers option from the My Operations dropdown.
    And Acilan sayfada Create a new Customer butonu gorulmeli ve tiklanmali.
    And Formun ilk satirda bulunan SSN  satirina Customer e ait "SSN_creat" girilmeli
    And user tarih kayit zamanindan onceki bir tarihi alir
    And Saved butonuna tiklar.
    And user kaydi gerceklestigini gormeli


  @featuredate
    Scenario: TC_01_2_user send to all boxes
    And Click the Manage Customers option from the My Operations dropdown.
    And Acilan sayfada Create a new Customer butonu gorulmeli ve tiklanmali.
    And Formun ilk satirda bulunan SSN  satirina Customer e ait "SSN_creat" girilmeli
    And user tarih kayit zamanindan sonraki bir tarihe alir
    And Saved butonuna tiklar.
    And user kaydi gerceklestigini gormeli

#-----------------------------------------------------------------------------------------------

  @formatdate
  Scenario: TC_02_user send to all boxes
    And Click the Manage Customers option from the My Operations dropdown.
    And Acilan sayfada Create a new Customer butonu gorulmeli ve tiklanmali.
    And Formun ilk satirda bulunan SSN  satirina Customer e ait "SSN_creat" girilmeli
    And Saved butonuna tiklar.
    And user Create Date in formati Aygun yil saat dakika olarak gorulmeli.


  #----------------------------------------------------------------------------------------------
  @wiewverify
  Scenario: TC_03_user view verify
    And Click the Manage Customers option from the My Operations dropdown.
  And user secilen musteriye ait satirdki View butonuna tiklar
  Then user bilgilerin tamaminin doldurulmus oldugu gorulur

    #--------------------------------------------------------------------------------------------
  @Manageaccaunt
  Scenario: TC_04_user Manage accaunt
    And Click the Manage Accaunt option from the My Operations dropdown.
    And user ID butonuna tiklar
    And user hesap bilgilsrinin oldugu sayfada Accaunt yazisini dogrular

#--------------------------------------------------------------------------------------------
  @zelle
  Scenario: TC_05_zelle enroled clickable
    And Click the Manage Customers option from the My Operations dropdown.
    And Acilan sayfada Create a new Customer butonu gorulmeli ve tiklanmali.
    And Formun ilk satirda bulunan SSN  satirina Customer e ait "SSN_creat" girilmeli
    And Midle initial entered
    And Phone initial entered
    And Valid data is entered into the Zip Code box "11764"
    And Valid data is entered into the Address box "Yeterikadar mah. Umitliler cd. Gelecekliler sk. no:5/2"
    And Valid data is entered into the City box "Bayburt"
    And Valid data is entered into the Country dropdown "USA"
    And Valid data is entered into the State box "New York"
    And user zelle enrolled  radio butonunu secebilmeli
    And Saved butonuna tiklar
    Then user kayit basarili yazisini gorur
