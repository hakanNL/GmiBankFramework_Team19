package stepdefinitions.loginStepD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.loginPage.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class LoginStepD {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the gmibank homepage")
    public void user_is_on_the_gmibank_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_bank_url"));
    }

    @Given("user clicks on account-menu button")
    public void user_clicks_on_account_menu_button() {
        ReusableMethods.wait(3);

        loginPage.accountMenu.click();
    }

    @Given("user clicks on sing in button")
    public void user_clicks_on_sing_in_button() {
        ReusableMethods.wait(4);
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

    @Then("verify if there is an option to cancel on the sign in page")
    public void verify_if_there_is_an_option_to_cancel_on_the_sign_in_page() {
        ReusableMethods.wait(3);
        Assert.assertTrue(loginPage.cancelButton.isDisplayed());
    }

    @Then("verify if there a success message to login on the page")
    public void verify_if_there_a_success_message_to_login_on_the_page() {
        Assert.assertTrue(loginPage.successAlertMessage.getText().isEmpty());
    }

    @Given("user clicks on sing out button")
    public void user_clicks_on_sing_out_button() {
        loginPage.accountMenu.click();
        loginPage.signOutButton.click();
    }
}
