package stepdefinitions.loginStepD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginStepD {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the gmibank homepage")
    public void user_is_on_the_gmibank_homepage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_bank_url"));

    }

    @Given("user clicks on account-menu button")
    public void user_clicks_on_account_menu_button() {
        loginPage.accountMenu.click();

    }

    @Given("user selects on {string} button on the dropdown menu")
    public void user_selects_on_button_on_the_dropdown_menu(String signIn) {
//        Select options = new Select(loginPage.signInButton);
//        options.selectByVisibleText(signIn);
        loginPage.signInButton.click();
    }

    @When("user enters a valid username {string}")
    public void user_enters_a_valid_username(String username) {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("valid_username"));

    }

    @When("user enters a valid password {string}")
    public void user_enters_a_valid_password(String password) {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("valid_password"));

    }

    @When("user clicks on -sing in- button")
    public void user_clicks_on_sing_in_button() {
        loginPage.submitButton.click();

    }

    @Then("verify there should be a {string} button on the account-menu")
    public void verify_there_should_be_a_button_on_the_account_menu(String options) {
      //  loginPage.signInButton.click();
      //  verifyElementDisplayed(WebElement )

    }
}
