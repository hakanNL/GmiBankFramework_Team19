package stepdefinitions.employeeStepD;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.EmployeePage.EmployeeNewAccountPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class EmployeeNewAccountStepDef {
    EmployeeNewAccountPage employeeNewAccountPage= new EmployeeNewAccountPage ();
    @Given("Go to gmibank.com home page")
    public void goToGmibankComHomePage() {


        Driver.getDriver ().get (ConfigurationReader.getProperty ("gmi_bank_url"));
    }

    @And("Click to User Account Menu and Click to SignIn")
    public void clickToUserAccountMenuAndClickToSignIn() {

        employeeNewAccountPage.signinDropDown.click ();
        employeeNewAccountPage.sigIn.click ();
    }

    @Given("Enter the username with valid credentail")
    public void enter_the_username_with_valid_credentail() {
        employeeNewAccountPage.username.sendKeys (ConfigurationReader.getProperty ("employee_Username")+Keys.ENTER);
    }

    @Given("Enter the pasword with valid credentail")
    public void enter_the_pasword_with_valid_credentail() {
        employeeNewAccountPage.password.sendKeys (ConfigurationReader.getProperty ("employee_Password")+Keys.ENTER);
    }

    @Given("Click to Sign in button")
    public void click_to_Sign_in_button() {
        employeeNewAccountPage.signInButton.click ();
    }

    @Given("Click to My Operations drop down menu and Click to Manage Accounts then click to Create New Account")
    public void click_to_My_Operations_drop_down_menu_and_Click_to_Manage_Accounts_then_click_to_Create_New_Account() throws InterruptedException {
        employeeNewAccountPage.myOperations.click ();
        employeeNewAccountPage.manageAccount.click ();
        employeeNewAccountPage.createNewAccount.click ();
        Thread.sleep (3000);
    }

    @Given("Click for explanations Do not write data to TextBox")
    public void click_for_explanations_Do_not_write_data_to_TextBox() {
        employeeNewAccountPage.descriptions.click ();
        employeeNewAccountPage.balance.click ();

    }

    @Given("verify the error message")
    public void verify_the_error_message() {
        Assert.assertTrue (employeeNewAccountPage.invalidFeedback.isDisplayed ());
        employeeNewAccountPage.descriptions.sendKeys (ConfigurationReader.getProperty ("descriptions_text") + Keys.ENTER);

    Driver.closeDriver ();
    }

    @Given("Enter a number be dollar to Balance textbox")
    public void enter_a_number_be_dollar_to_Balance_textbox() {
        employeeNewAccountPage.balance.sendKeys (ConfigurationReader.getProperty ("balance")+Keys.ENTER);
    Driver.closeDriver ();
    }
    @Then("User can select an account type as CHECKING, SAVING, CREDIT_CARD or INVESTING")
    public void user_can_select_an_account_type_as_CHECKING_SAVING_CREDIT_CARD_or_INVESTING() throws InterruptedException {
        Select select = new Select(employeeNewAccountPage.accountTypeDropDown);
        List<WebElement> accountTypeList = select.getOptions();
        select.selectByValue ("CHECKING");
        Assert.assertTrue(accountTypeList.get(0).getText().equals("CHECKING"));
        Thread.sleep (3000);
        select.selectByValue ("SAVING");
        Assert.assertTrue(accountTypeList.get(1).getText().equals("SAVING"));
        Thread.sleep (3000);
        select.selectByValue ("CREDIT_CARD");
        Assert.assertTrue(accountTypeList.get(2).getText().equals("CREDIT_CARD"));
        Thread.sleep (3000);
        select.selectByValue ("INVESTING");
        Assert.assertTrue(accountTypeList.get(3).getText().equals("INVESTING"));


    Driver.closeDriver ();
    }
    @Then("Account status should be defined as ACTIVE, SUSPENDED or CLOSED")
    public void account_status_should_be_defined_as_ACTIVE_SUSPENDED_or_CLOSED() throws InterruptedException {
             //Thread.sleep (3000);

        Select select = new Select(employeeNewAccountPage.statusTypeDropdown);
        List<WebElement> statusList = select.getOptions();
        select.selectByIndex (0);
        //Assert.assertTrue(statusList.get(0).getText().equals("ACTIVE"));
        Thread.sleep (3000);
        select.selectByIndex (1);
        //
        Thread.sleep (3000);
        select.selectByIndex (2);
        //Assert.assertTrue(statusList.get(2).getText().equals("CLOSED"));
       // Assert.assertTrue(statusList.get(1).getText().equals("SUSPENDED"));

    Driver.closeDriver ();
    }

    @Then("User can select an employee from the drop-down")
    public void user_can_select_an_employee_from_the_drop_down() {



        employeeNewAccountPage.employee.click ();
        Driver.closeDriver ();
    }


}
