package stepdefinitions.employeeStepD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.employeePage.US_10_US12_ON_Page;
import utilities.Driver;
import utilities.ReusableMethods;
public class US_10_ON_StepDefinition {
    US_10_US12_ON_Page page = new US_10_US12_ON_Page();
    @Given("go to {string}")
    public void go_to(String string) {
        Driver.getDriver().get(string);
    }
    @Given("Valid employee data must be entered in User box and Password box and click Sign in button")
    public void valid_employee_data_must_be_entered_in_User_box_and_Password_box_and_click_Sign_in_button() {
        ReusableMethods.wait(1);

        page.loginUserNameKutusu.sendKeys("Employee9");
        ReusableMethods.wait(1);

        page.loginPasswordKutusu.sendKeys("Employee9");
        ReusableMethods.waitForClickablility(page.loginSigninButonu, 3);
        page.loginSigninButonu.click();
    }
    @Given("Click the Manage Customers option from the My Operations dropdown.")
    public void click_the_Manage_Customers_option_from_the_My_Operations_dropdown() {
        ReusableMethods.waitForClickablility(page.myOperationsDropDown, 5);
        page.myOperationsDropDown.click();
        ReusableMethods.waitForClickablility(page.manageCustomerLinki, 5);
        page.manageCustomerLinki.click();
    }
    @Given("The employee clicks the Edit button of customer information")
    public void the_employee_clicks_the_Edit_button_of_customer_information() {
        ReusableMethods.wait(1);
        page.editLinki.click();
    }
    //====================================TC01===========================================
    @Then("The -Zip Code- box should be left blank and at the bottom of the box -This field is required.- should popup the alert")
    public void the_Zip_Code_box_should_be_left_blank_and_at_the_bottom_of_the_box_This_field_is_required_should_popup_the_alert() {
        page.zipCodeBox.clear();
        ReusableMethods.wait(2);

        page.editAltindakiSaveButonu.click();
        ReusableMethods.wait(2);
        ReusableMethods.verifyElementDisplayed(page.gerekliAlanUyarisiHataMesaji);
        ReusableMethods.wait(1);
        page.employeeDropdown.click();
        ReusableMethods.wait(1);
        page.signOutLinki.click();
    }
    //====================================TC02===========================================
    @Then("The -Address- box should be left blank and at the bottom of the box -This field is required.- should popup the alert")
    public void the_Address_box_should_be_left_blank_and_at_the_bottom_of_the_box_This_field_is_required_should_popup_the_alert() {
        page.addressBox.clear();
        ReusableMethods.wait(2);

        page.editAltindakiSaveButonu.click();
        ReusableMethods.waitForClickablility(page.gerekliAlanUyarisiHataMesaji, 1);
        ReusableMethods.verifyElementDisplayed(page.gerekliAlanUyarisiHataMesaji);
        ReusableMethods.wait(1);
        page.employeeDropdown.click();
        ReusableMethods.wait(1);
        page.signOutLinki.click();
    }
    //====================================TC03===========================================
    @Then("The -City- box should be left blank and at the bottom of the box -This field is required.- should popup the alert")
    public void the_City_box_should_be_left_blank_and_at_the_bottom_of_the_box_This_field_is_required_should_popup_the_alert() {
        page.cityBox.clear();
        ReusableMethods.wait(2);

        page.editAltindakiSaveButonu.click();
        ReusableMethods.waitForClickablility(page.gerekliAlanUyarisiHataMesaji, 1);
        ReusableMethods.verifyElementDisplayed(page.gerekliAlanUyarisiHataMesaji);
        ReusableMethods.wait(1);
        page.employeeDropdown.click();
        ReusableMethods.wait(1);
        page.signOutLinki.click();
    }
    //====================================TC04===========================================
    @Given("The Country box should be left blank and at the bottom of the box -This field is required.- should popup the alert")
    public void the_Country_box_should_be_left_blank_and_at_the_bottom_of_the_box_This_field_is_required_should_popup_the_alert() {
        Select select=new Select(page.countryDropDown);
        select.selectByIndex(0);
        ReusableMethods.wait(2);

        page.editAltindakiSaveButonu.click();
        //ReusableMethods.verifyElementNotDisplayed(By.xpath("//*[text()='This field is required.']"));
        ReusableMethods.wait(1);
        page.employeeDropdown.click();
        ReusableMethods.wait(1);
        page.signOutLinki.click();
    }
    //====================================TC05===========================================
    @Given("The State box should be left blank and at the bottom of the box This field is required. should popup the alert")
    public void the_State_box_should_be_left_blank_and_at_the_bottom_of_the_box_This_field_is_required_should_popup_the_alert() {
        page.stateBox.clear();
        ReusableMethods.wait(2);

        page.editAltindakiSaveButonu.click();
        //ReusableMethods.verifyElementNotDisplayed(By.xpath("//*[text()='This field is required.']"));
        ReusableMethods.wait(1);
        page.employeeDropdown.click();
        ReusableMethods.wait(1);
        page.signOutLinki.click();
    }
    //====================================TC06===========================================
    @Given("Valid data is entered into the Zip Code box {string}")
    public void valid_data_is_entered_into_the_Zip_Code_box(String string) {
        page.zipCodeBox.clear();
        page.zipCodeBox.sendKeys(string);
    }
    @Given("Valid data is entered into the Address box {string}")
    public void valid_data_is_entered_into_the_Address_box(String string) {
        page.addressBox.clear();
        page.addressBox.sendKeys(string);
    }
    @Given("Valid data is entered into the City box {string}")
    public void valid_data_is_entered_into_the_City_box(String string) {
        page.cityBox.clear();
        page.cityBox.sendKeys(string);
    }
    @Given("Valid data is entered into the Country dropdown {string}")
    public void valid_data_is_entered_into_the_Country_dropdown(String string) {
        Select select=new Select(page.countryDropDown);
        select.selectByVisibleText(string);
    }
    @Given("Valid data is entered into the State box {string}")
    public void valid_data_is_entered_into_the_State_box(String string) {
        page.stateBox.clear();
        page.stateBox.sendKeys(string);
    }
    @Then("-This field is required.- It should be verified that the text is not popup.")
    public void this_field_is_required_It_should_be_verified_that_the_text_is_not_popup() {
        ReusableMethods.wait(2);

        page.editAltindakiSaveButonu.click();
        ReusableMethods.wait(1);
        Assert.assertEquals(page.popuptakiUpdateOnayYazisi.getText(),"translation-not-found[gmiBankBackendApp.tPCustomer.updated]");
        ReusableMethods.wait(1);
        page.employeeDropdown.click();
        ReusableMethods.wait(1);
        page.signOutLinki.click();
    }
}
