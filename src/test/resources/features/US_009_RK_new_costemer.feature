@gmibank
  Feature: User go to register for new costemer
    Scenario Outline: TC_01_user send to all boxes
      Given user go to this link "https://gmibank.com/account/register"
      And  User should see SSN box and sendd "SSN_creat"
      And  User should see First Name box send "<firstname>"
      And  User should see Last Name box and send "<lastname>"
      And  User should see Address box and send "<adress>"
      And  User should see Mobil Phone Number box and send "<mobilphone>"
      And  User should see Username box and send "<username>"
      And  User should see Email box and send "<email>"
      And  User should see New password box and send "<password>"
      And  User should see New password confirmation box and send "<paswordconf>"
      And  Click the user registration button
      And user checks whether he has received new customer approval


      Examples:
    | ssn1       | firstname | lastname | adress      | mobilphone | username    | email           | password  | paswordconf|
    |234-49-5149 |Oliver     |Allen     |Oxford St.   |328-721-6743|Kullanici19-6|oliver1@c.gmail  |123456Oa.  |123456Oa.   |



@Creatnewcostemer
    Scenario: TC_01_1_Employe Creat new costemer

      Given go to "http://gmibank.com/login"
      And Valid employee data must be entered in User box and Password box and click Sign in button
      And Click the Manage Customers option from the My Operations dropdown.
      And Acilan sayfada Create a new Customer butonu gorulmeli ve tiklanmali.
      And Formun ilk satirda bulunan SSN  satirina Customer e ait "SSN_creat" girilmeli
      And Forma girilen datalarin dogru ve eksiksiz bir sekilde geldigi gorulmeli.