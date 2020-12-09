package stepdefinitions.operationForCustomerStepD;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utilities.Driver;

public class US_006_ME_TC_03UpdateFirstname {
    pages.CustomerPage.US_006_MEInfoSegmentPage infoPage = new pages.CustomerPage.US_006_MEInfoSegmentPage();

    @When("Clear First Name field")
    public void clear_First_Name_field() {
        infoPage.UserInfoFirstName.clear();
    }

    @When("Send {string} to First Name field")
    public void send_to_First_Name_field(String firstname) {
        infoPage.UserInfoFirstName.sendKeys("MehmetCustomer");
    }

    @Then("Verify Settings saved!")
    public void verify_Settings_saved() {
        String message = infoPage.savingMessage.getText();
        System.out.println(message);
        Assert.assertEquals("Settings saved!",message);

    }

}
