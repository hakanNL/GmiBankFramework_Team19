package stepdefinitions.customerStepD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.customerPage.US_015_SO_Page;
import utilities.Driver;
import utilities.ReusableMethods;


public class US_015_SO_StepD {

    US_015_SO_Page page = new US_015_SO_Page();

    @Given("Go to the web address: {string}")
    public void go_to_the_web_address(String string) {
        Driver.getDriver().get(string);
    }

    @Given("Type the name of the valid customer {string} in the Username box.")
    public void type_the_name_of_the_valid_customer_in_the_Username_box(String string) {
   page.Username.sendKeys(string);
    }

    @Given("Type the current password in the password {string} box.")
    public void type_the_current_password_in_the_password_box(String string) {
        page.Password.sendKeys(string + Keys.ENTER);
    }

    @Given("Click on the My Operations button")
    public void click_on_the_My_Operations_button() {
     page.My_Operations.click();
    }

    @Given("Click on the My Accounts button")
    public void click_on_the_My_Accounts_button() {
        page.My_Accounts.click();
    }

    @Given("Click on the View Transaction button")
    public void click_on_the_View_Transaction_button() {
        ReusableMethods.wait(3);
       page.View_Transaction1.click();

    }

    @Given("Get the Account Type01, Account Balance01 information of the first account.")
    public void get_the_Account_Type01_Account_Balance01_information_of_the_first_account() {
        page.Account_Type_1.getText();
        page.Account_Balance_1.getText();
        System.out.println(page.Account_Type_1.getText());
        System.out.println(page.Account_Balance_1.getText());

    }

    @Then("Get the Account Type02, Account Balance02 information of the second account.")
    public void get_the_Account_Type02_Account_Balance02_information_of_the_second_account() {
        page.Account_Type_2.getText();
        page.Account_Balance_2.getText();
        System.out.println(page.Account_Type_2.getText());
        System.out.println(page.Account_Balance_2.getText());
        Driver.closeDriver();
    }


    @Given("Get the ID, Account ID, Description, Date, Amount, New Balance information of the first account.")
    public void get_the_ID_Account_ID_Description_Date_Amount_New_Balance_information_of_the_first_account() {
        System.out.println(page.Account_Info_1.getText());


    }

    @Given("Click on the View Transaction second button")
    public void click_on_the_View_Transaction_second_button() {
        ReusableMethods.wait(2);
        page.View_Transaction2.click();
    }

    @Given("Get the ID, Account ID, Description, Date, Amount, New Balance information of the second account.")
    public void get_the_ID_Account_ID_Description_Date_Amount_New_Balance_information_of_the_second_account() {
        System.out.println(page.Account_Info_2.getText());
        Driver.closeDriver();
    }

    //@US_16_TC_0001_User

    @Given("Click on the Transfer Money button")
    public void click_on_the_Transfer_Money_button() {
        page.Transfer_Money.click();
    }

    @Given("Select an {string} account from the To section")
    public void select_an_account_from_the_To_section(String string) {

        Select select = new Select(page.From_Account);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        select.selectByIndex(2);
    }

    @Given("Select another {string} account from the To section")
    public void select_another_account_from_the_To_section(String string) {
        Select select = new Select(page.To_Account);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        select.selectByIndex(1);
    }

    @Given("Write the amount of money {string} in the Balance section")
    public void write_the_amount_of_money_in_the_Balance_section(String string) {
        page.Balance.sendKeys(string);
    }

    @Given("Write a description {string} in the Description section")
    public void write_a_description_in_the_Description_section(String string) {
       page.Description.sendKeys(string);
    }

    @Given("Click on the Make Transfer button")
    public void click_on_the_Make_Transfer_button() {
       page.Make_Transfer_Buton.click();
    }

    @Then("It should be checked that {string} is displayed.")
    public void it_should_be_checked_that_is_displayed(String string) {
        ReusableMethods.wait(3);
        System.out.println(page.Transfer_successfull.getText());
        ReusableMethods.verifyElementDisplayed(page.Transfer_successfull);
        //Assert.assertEquals(string, page.Transfer_successfull.getText());
Driver.closeDriver();
    }





}
