package stepdefinitions.loginStepD;

import io.cucumber.java.en.*;
import org.junit.Assert;
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

    @Given("user clicks on sing in button")
    public void user_clicks_on_sing_in_button() {
        loginPage.signInButton.click();
    }

    @When("user enters a valid username {string}")
    public void user_enters_a_valid_username(String username) {
        loginPage.username.sendKeys(username);
    }

    @When("user enters a valid password {string}")
    public void user_enters_a_valid_password(String password) {
        loginPage.password.sendKeys(password);
    }

    @When("user clicks on second sing in button")
    public void user_clicks_on_second_sing_in_button() {
        loginPage.submitButton.click();
    }

    @Then("verify there should be a sign out button on the account-menu")
    public void verify_there_should_be_a_sign_out_button_on_the_account_menu() {
        loginPage.accountMenu.click();
        Assert.assertTrue(loginPage.signOutButton.isDisplayed());
    }
    @Given("user clicks on cancel button")
    public void user_clicks_on_cancel_button() {
      //  loginPage.cancelButton.click();
        System.out.println(loginPage.cancelButton.getText());
    }
    @Then("verify if the user cancel to sign in")
    public void verify_if_the_user_cancel_to_sign_in() {
        Assert.assertTrue(loginPage.cancelButton.isDisplayed());


    }


}
