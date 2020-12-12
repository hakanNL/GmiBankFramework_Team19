package stepdefinitions.employeeStepD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.employeePage.US_10_US12_ON_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_12_ON_StepDefinition {
    US_10_US12_ON_Page page = new US_10_US12_ON_Page();

    //============================TC01====================================
    @Given("The employee verifies that a list of all customers who have filled in their account information is seen.")
    public void the_employee_verifies_that_a_list_of_all_customers_who_have_filled_in_their_account_information_is_seen() {
        ReusableMethods.verifyElementDisplayed(page.editLinki);
        for (WebElement w : page.tumMusterilerListesi) {
            System.out.println(w.getText());
        }
        Driver.closeDriver();
    }
    //============================TC02====================================
    @Given("Employee sees View customer information button and clicked")
    public void employee_sees_customer_information_button_and_clicked() {
        ReusableMethods.waitForClickablility(page.editLinki, 1);
        page.editLinki.click();
    }

    @Then("The employee verifies that sees the Edit button on the customer information page.")
    public void the_employee_verifies_that_sees_the_button_on_the_customer_information_page() {
        ReusableMethods.verifyElementDisplayed(page.viewdekiEditLinki);
        Driver.closeDriver();
    }
    //============================TC03====================================
    @Given("The Employee verifies that she sees the Edit button of customer information.")
    public void the_Employee_verifies_that_she_sees_the_Edit_button_of_customer_information() {
        ReusableMethods.verifyElementDisplayed(page.editLinki);
        Driver.closeDriver();
    }
    //============================TC04====================================
    @Given("The employee makes changes in some part of the customer information and clicks the Save button.")
    public void the_employee_makes_changes_in_some_part_of_the_customer_information_and_clicks_the_Save_button() {
        page.addressBox.sendKeys("Alaturka sk.");
        page.editAltindakiSaveButonu.click();
    }

    @Then("The employee verifies that it has seen the message -translation-not-found [gmiBankBackendApp.tPCustomer.updated]-")
    public void the_employee_verifies_that_it_has_seen_the_message_translation_not_found_gmiBankBackendApp_tPCustomer_updated() {
        ReusableMethods.wait(3);
        Assert.assertEquals(page.popuptakiUpdateOnayYazisi.getText(),"translation-not-found[gmiBankBackendApp.tPCustomer.updated]");
        Driver.closeDriver();
    }
    //============================TC05====================================
    @Given("The employee clicks the Delete button of customer information")
    public void the_employee_clicks_the_button_of_customer_information() {
        page.deleteLinki.click();
    }

    @Given("The employee verifies that sees the -Confirm deletion- text in the pop-up.")
    public void the_employee_verifies_that_sees_the_text_in_the_pop_up() {
        ReusableMethods.waitForClickablility(page.popuptakiEminMisinYazisi, 1);
        ReusableMethods.verifyElementDisplayed(page.popuptakiEminMisinYazisi);
    }

    @Given("The employee clicks the Delete button in the -Confirm delete operation- popup")
    public void the_employee_clicks_the_button_in_the_popup() {
        ReusableMethods.waitForClickablility(page.popuptakiDeleteButonu, 1);
        page.popuptakiDeleteButonu.click();
    }

    @Then("The employee verifies that has seen the -translation-not-found [gmiBankBackendApp.tPCustomer.deleted]- message.")
    public void the_employee_verifies_that_has_seen_the_message() {
        ReusableMethods.wait(3);
        Assert.assertEquals(page.popuptakiDeleteOnayYazisi.getText(),"translation-not-found[gmiBankBackendApp.tPCustomer.deleted]");
        Driver.closeDriver();
    }
}
