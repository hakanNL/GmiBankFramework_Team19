package stepdefinitions.operationForCustomerStepD;

import cucumber.api.java.en.When;

public class US_007_ME_TC_02InvalidEmail {

    pages.CustomerPage.US_006_MEInfoSegmentPage infoPage = new pages.CustomerPage.US_006_MEInfoSegmentPage();

    @When("Send invalid without . {string} to Email field")
    public void send_invalid_without_to_Email_field(String invalidEmail) {
        infoPage.UserInfoEmail.sendKeys(invalidEmail);
    }
}
