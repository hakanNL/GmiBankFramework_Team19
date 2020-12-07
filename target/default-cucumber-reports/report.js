$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\US_004_YU_Login_page_should_accessible_with_valid_credentials.feature");
formatter.feature({
  "name": "US_004_YU_Login_page_should_accessible_with_valid_credentials",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@gmibank"
    }
  ]
});
formatter.background({
  "name": "User is on the gmibank homepage",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the gmibank homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepD.user_is_on_the_gmibank_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC01 User should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@gmibank"
    }
  ]
});
formatter.step({
  "name": "user clicks on account-menu button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepD.user_clicks_on_account_menu_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects on \"Sign in\" button on the dropdown menu",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepD.user_selects_on_button_on_the_dropdown_menu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters a valid username \"valid_username\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepD.user_enters_a_valid_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters a valid password \"valid_password\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepD.user_enters_a_valid_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on -sing in- button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepD.user_clicks_on_sing_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify there should be a \"sign out\" button on the account-menu",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepD.verify_there_should_be_a_button_on_the_account_menu(String)"
});
formatter.result({
  "status": "passed"
});
});