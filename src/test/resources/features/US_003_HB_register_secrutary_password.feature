@gmibank
Feature: create register
  Background: user invalid
    Given user go to this link "https://gmibank.com/account/register"

@password
Scenario Outline: TC_05_user sends data to passwor box
And  user sends "<kirmizi>" to password kirmizi
And  user sends "<turuncu>" to password turuncu
And  user sends "<yesil>" to password yesil


Examples:
| kirmizi  | turuncu | yesil     |
| abcd     | Denemek | Yesil#4   |


