@regression
Feature: invalid create register
  Background: user invalid
    Given user go to this link "https://gmibank.com/account/register"
  @mobilbox
  Scenario Outline: TC_01_user sends data to mobile phone box
    And   user sends "<mobilbox>" to mobile box
    Then  user checks mobil box if correct data is entered

    Examples:
      | mobilbox     |
      |323-561-639a  |
      |333-3333333   |
      |333333-3333   |
      |333/333/3333  |
      |333=333=3333  |
      |bcd-klmd-fsle |
      |?333-333-3333?|
      |395 531 6523  |
      |999-999-9999  |
      |000-000-0000  |
      |acf-234-frsd  |

  @ssn
  Scenario Outline: TC_02_user sends data to SSN box
    And  user sends "<ssn>" to SSN box
    Then user checks ssn if correct data is entered
    Examples:
      | ssn       |
      |111445555  |
      |           |
      |111-445555 |
      |11144-5555 |
      |111=44=5555|
      |11144555   |
      |1114455558 |
      |111 445555 |
      |111 44 5555|
      |111a44a5555|
      |011-44-5555|
      |abc-as-lmnr|

  @email
  Scenario Outline: TC_03_user sends data to email boxx
    And  user sends "<emailbox>" to email box
    Then user checks email box if correct data is entered
    Examples:
      | emailbox         |
      |@g.c          |
      |@g.co         |
      |@g.com        |
      |abc@g.c       |
      |abc@g.co      |
      |abc@.c        |
      |abc@.co       |
      |abc@.com      |
      |abc.com       |
      |@com          |
      |abcd@gmail.com|
      |a@hotmail.com |
      |adsdsadsadsa  |
      |2353@s.com    |

  @anyfield
  Scenario Outline: TC_04_user send to anyfıeld
    And  User should see SSN box and send "<ssn1>"
    And  User should see First Name box send "<firstname>"
    And  User should see Last Name box and send "<lastname>"
    And  User should see Address box and send "<adress>"
    And  User should see Mobil Phone Number box and send "<mobilphone>"
    And  User should see Username box and send "<username>"
    And  User should see Email box and send "<email>"
    And  User should see New password box and send "<password>"
    And  User should see New password confirmation box and send "<paswordconf>"
    And  Click the user registration button
 # Then user checks whether the registration has taken place
    Examples:
      | ssn1       | firstname | lastname | adress      | mobilphone | username  | email          | password  | paswordconf|
      |            |Oliver     |Allen     |Oxford St.   |328-721-6743|Boomer     |oliver@c.gmail  |A123       |A123        |
      |234-34-2145 |           |Baker     |Abbey Road St|462-936-4964|Crasher    |baker@m.gmail   |abcdefg1   |abcdefg1    |
      |234-34-2146 |Amelia     |          |Brick Lane St|328-721-1235|Insane     |Amelia@z.gmail  |2142sds    |            |
      |234-34-2147 |Jack       |Gibbs     |             |462-936-4986|AgentMan   |gibbis@c.gmail  |sad213     |2785482     |
      |234-34-2148 |Jacob      |Kelley    |Piccadilly St|            |lagarto    |kelly@f.gmail   |sdasd      |324276328   |
      |234-34-2149 |Emily      |Miller    |Carnaby St   |462-936-7232|           |miller@l.gmail  |Ad1@k.S    |Ad1@k.S     |
      |234-34-2150 |Isabella   |Rogers    |Baker St     |328-721-2376|Lone_Wolf  |                |3Sa2.622W  |3Sa2.622W   |
      |234-34-2151 |Samantha   |Scott     |Brick Lane St|468-936-1721|Master     |scott@s.gmail   |           |S$l.Xw24V   |
      |234-34-2152 |Thomas     |Shaw      |Marylebone St|468-926-1182|shef       |show@l.gmail    |2785482sa? |            |



  @password
  Scenario Outline: TC_05_user sends data to passwor box
    And  user sends "<kirmizi>" to password kirmizi
    And  user sends "<turuncu>" to password turuncu
    And  user sends "<yesil>" to password yesil


    Examples:
      | kirmizi  | turuncu | yesil     |
      | abcd     | Denemek | Yesil#4   |






