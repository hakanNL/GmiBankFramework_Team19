package stepdefinitions.operationForEmployeeStepD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.employeePage.EmployeeNewAccountPage;
import utilities.ConfigurationReader;
import utilities.DateUtil;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Date;

public class EmployeDataCreationStpDf {

    EmployeeNewAccountPage employeeNewAccountPage = new EmployeeNewAccountPage ();
    Actions actions = new Actions(Driver.getDriver());
    @Then("user signOut from Website")
    public void user_signOut_from_Website() {
        employeeNewAccountPage.outDropDown.click ();
        employeeNewAccountPage.signOut.click ();
    }

    @And("enters  username")
    public void entersUsername() {
        employeeNewAccountPage.username.sendKeys (ConfigurationReader.getProperty ("date_username")+Keys.ENTER);
    }

    @And("enters  password")
    public void entersPassword() {
        employeeNewAccountPage.password.sendKeys (ConfigurationReader.getProperty ("date_password")+Keys.ENTER);
    }
    @And("user click signIn button")
    public void userClickSignInButton() {
        ReusableMethods.wait(3);

        employeeNewAccountPage.signInButton.click ();

    }
    @Then("user clicks myOperations")
    public void userClicksMyOperations() {
        employeeNewAccountPage.myOperations.click ();
    }
    @Given("user clicks manageAccounts")
    public void userClicksManageAccounts() {
        employeeNewAccountPage.manageAccount.click ();
    }

    @And("user clicks createANewAccount")
    public void userClicksCreateANewAccount() {
        employeeNewAccountPage.createNewAccount.click ();
    }

    @Given("user sends an earlier date")
    public void user_sends_an_earlier_date() throws InterruptedException {
        Thread.sleep (3000);
        employeeNewAccountPage.createDateBox.click ();
        Thread.sleep (2000);
        employeeNewAccountPage.createDateIcon.sendKeys ("01012010"+Keys.ENTER);
        System.out.println(employeeNewAccountPage.createDateIcon.getAttribute("value"));
    }

    @Given("user verifies date is an early date")
    public void user_verifies_date_is_an_early_date() {
        String dailyDateValue = employeeNewAccountPage.createDateIcon.getAttribute("value");
        System.out.println("Expected : " + dailyDateValue);
        String expectedYear=dailyDateValue.substring(0,4);
        System.out.println(expectedYear);
        int expectedYearInt = Integer.parseInt(expectedYear);

        Date date = new Date();
        String dateActual = date.toString();
        System.out.println("Actual : " + dateActual);
        String actualYear = dateActual.substring(dateActual.length()-4);
        System.out.println(actualYear);
        int actualYearInt = Integer.parseInt(actualYear);

        if (expectedYearInt<actualYearInt){
            System.out.println("Early Date can be selected");
        } else{
            System.out.println("Check further month, day and time");
        }
    }

    @Given("user account send a date {string} and click tab")
    public void user_account_send_a_date_and_click_tab(String string) {
        employeeNewAccountPage.createDateBox.click ();
        employeeNewAccountPage.createDateIcon.sendKeys ();

    }

    @And("user account send a date")
    public void userAccountSendADate() {
        employeeNewAccountPage.createDateIcon.click ();
        employeeNewAccountPage.createDateIcon.sendKeys (DateUtil.todaysDate5 ());
        System.out.println(employeeNewAccountPage.createDateIcon.getAttribute("value"));

    }
    @Given("user clicks manageCustomers")
    public void user_clicks_manageCustomers() {
        employeeNewAccountPage.manageCustomers.click ();
    }

    @Given("user clicks createANewCustome")
    public void user_clicks_createANewCustome() {
        employeeNewAccountPage.createNewCustomer.click ();
    }

    @Given("user customer send a date {string} and click tab")
    public void user_customer_send_a_date_and_click_tab(String string) throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep (3000);
        employeeNewAccountPage.customerDate.sendKeys (string+Keys.TAB);

    }

    @Given("user customer send a time {string} and user click tab")
    public void user_customer_send_a_time_and_user_click_tab(String string) {
        employeeNewAccountPage.customerDate.sendKeys (string+Keys.TAB);
    }

    @Given("user customer click tab")
    public void user_customer_click_tab() {
        actions.sendKeys (Keys.TAB).perform ();
    }

    @Given("user customer verifies valid data entry to Create Date box")
    public void user_customer_verifies_valid_data_entry_to_Create_Date_box() {
        String valueDateBoxCustomer = employeeNewAccountPage.customerDate.getAttribute ("value");
        System.out.println (valueDateBoxCustomer);
        Assert.assertFalse (valueDateBoxCustomer.isEmpty ());

    }
    @Given("user customer click user box and select a user")
    public void user_customer_click_user_box_and_select_a_user() throws InterruptedException {
        Select select = new Select (employeeNewAccountPage.userDropDown);
        ReusableMethods.wait(3);
        select.selectByIndex (4);
        Thread.sleep (4000);
    }

    @Given("user customer verifies valid selection of user")
    public void user_customer_verifies_valid_selection_of_user() {
        String userName = employeeNewAccountPage.userDropDown.getAttribute ("value");
        Assert.assertFalse (userName.isEmpty ());

    }
    @Given("user customer click Zelle Enrolled box")
    public void user_customer_click_Zelle_Enrolled_box() throws InterruptedException {
        actions.sendKeys (Keys.PAGE_DOWN).perform ();
        employeeNewAccountPage.zelle.click ();
        Thread.sleep (1000);
        //Assert.assertFalse (employeeNewAccountPage.zelle.isSelected ());

    }




/*
    @Given("user customer verifies that there is no allert message related to Zelle box")
    public void user_customer_verifies_that_there_is_no_allert_message_related_to_Zelle_box() {
        employeeNewAccountPage.saveButton.click ();
        String valueAfterClick = employeeNewAccountPage.zelle.getAttribute ("value");
        System.out.println (valueAfterClick);
        Assert.assertEquals (valueAfterClick,"true");
    }
 */
}