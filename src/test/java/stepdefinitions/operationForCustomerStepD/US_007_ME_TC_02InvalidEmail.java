package stepdefinitions.operationForCustomerStepD;


import io.cucumber.java.en.When;

public class US_007_ME_TC_02InvalidEmail {

    pages.customerPage.US_006_MEInfoSegmentPage infoPage = new pages.customerPage.US_006_MEInfoSegmentPage();

    @When("Send invalid without . {string} to Email field")
    public void send_invalid_without_to_Email_field(String invalidEmail) {
        infoPage.UserInfoEmail.sendKeys(invalidEmail);
    }
}
