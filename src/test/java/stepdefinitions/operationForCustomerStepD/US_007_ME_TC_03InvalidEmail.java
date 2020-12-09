package stepdefinitions.operationForCustomerStepD;

import cucumber.api.java.en.When;

public class US_007_ME_TC_03InvalidEmail {

    pages.CustomerPage.US_006_MEInfoSegmentPage infoPage = new pages.CustomerPage.US_006_MEInfoSegmentPage();

    @When("Send invalid without . and @ {string} to Email field")
    public void send_invalid_without_and_to_Email_field(String invalidEmail) {
        infoPage.emailMessage.sendKeys(invalidEmail);
    }

}
