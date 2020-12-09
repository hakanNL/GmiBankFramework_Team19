package stepdefinitions.operationForCustomerStepD;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CustomerPage.US_006_MEInfoSegmentPage;
import pages.loginPage.LoginPage;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

public class US_006_MEInfoSegmentStepD {

    LoginPage loginPage = new LoginPage();
    US_006_MEInfoSegmentPage infoPage = new US_006_MEInfoSegmentPage();

    @Given("user clicks on sing in button")
    public void user_clicks_on_sing_in_button() {
        loginPage.signInButton.click();
    }

    @When("user enters {string} to Username field")
    public void user_enters_to_Username_field(String username) {
        loginPage.username.sendKeys(username);

    }

    @When("user enters {string} to password field")
    public void user_enters_to_password_field(String password) {
        loginPage.password.sendKeys(password);

    }

    @When("user clicks on second sing in button")
    public void user_clicks_on_second_sing_in_button() {
        loginPage.submitButton.click();

    }

    @When("click User Name button")
    public void click_User_Name_button() {
        infoPage.infoAccountMenu.click();

    }

    @When("clicks User Info button")
    public void clicks_User_Info_button() {
        infoPage.UserInfoButton.click();

    }

    @Then("Verify on First Name field {string}")
    public void verify_on_First_Name_field(String string) throws InterruptedException {
        Thread.sleep(3000);
        //Assert.assertTrue(infoPage.UserInfoFirstName.getText());
        //String st = infoPage.FirstNameText.getText();
        //System.out.println(st);
        System.out.println(ReusableMethods.getElementsText(By.xpath("//select")));
    }

    @Then("Verify on Last Name field {string}")
    public void verify_on_Last_Name_field(String string) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(infoPage.UserInfoLastName.isDisplayed());
        System.out.println(infoPage.UserInfoLastName.getText());
    }

    @Then("Verify on Email field {string}")
    public void verify_on_Email_field(String string) throws InterruptedException {
        Thread.sleep(3000);
        //Assert.assertTrue(infoPage.UserInfoEmail.getText());
        System.out.println(infoPage.UserInfoEmail.getText());
    }

    @Then("Verify on Language field {string}")
    public void verify_on_Language_field(String string) throws InterruptedException {
        Thread.sleep(3000);
        //Assert.assertTrue(infoPage.UserInfoLanguage.getText());
        System.out.println(infoPage.UserInfoLanguage.getText());
    }



}
