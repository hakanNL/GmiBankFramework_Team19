package stepdefinitions.operationForCustomerStepD;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class US_007_ME_TC_01InvalidEmail {

    pages.CustomerPage.US_006_MEInfoSegmentPage infoPage = new pages.CustomerPage.US_006_MEInfoSegmentPage();

    @When("Send invalid {string} to Email field")
    public void send_invalid_to_Email_field(String invalidEmail) {
        infoPage.UserInfoEmail.sendKeys(invalidEmail);
    }

    @Then("Verify This field is invalid")
    public void verify_This_field_is_invalid() {
        System.out.println(infoPage.emailMessage.getText());
        Assert.assertEquals("This field is invalid",infoPage.emailMessage.getText());
    }
}
