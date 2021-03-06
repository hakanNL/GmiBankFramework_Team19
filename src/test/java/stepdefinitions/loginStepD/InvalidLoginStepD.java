package stepdefinitions.loginStepD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.loginPage.LoginPage;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

import static io.restassured.RestAssured.given;

public class InvalidLoginStepD {

    LoginPage loginPage = new LoginPage();

    @When("user enters a invalid username {string}")
    public void user_enters_a_invalid_username(String invalidUsername) {
        loginPage.username.sendKeys(invalidUsername);
    }

    @Then("verify if there is an error message on the screen")
    public void verify_if_there_is_an_error_message_on_the_screen() {
        ReusableMethods.wait(3);

        Assert.assertFalse(loginPage.signInDialog.getText().contains(loginPage.errorMessage.getText()));

    }

    @When("user enters a invalid password {string}")
    public void user_enters_a_invalid_password(String invalidPassword) {
        loginPage.password.sendKeys(invalidPassword);

    }

    @Then("verify if there is an option to reset their password on the page")
    public void verify_if_there_is_an_option_to_reset_their_password_on_the_page() {
        ReusableMethods.wait(1);

        Assert.assertTrue(loginPage.signInDialog.getText().contains(loginPage.resetPasswordText.getText()));
    }

    @Then("verify if there is an option to registration on the page")
    public void verify_if_there_is_an_option_to_registration_on_the_page() {
        ReusableMethods.wait(1);
        Assert.assertTrue(loginPage.signInDialog.getText().contains(loginPage.registerNewAccountText.getText()));
    }

}
