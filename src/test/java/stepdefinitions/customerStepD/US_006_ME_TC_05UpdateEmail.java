package stepdefinitions.customerStepD;


import io.cucumber.java.en.When;

public class US_006_ME_TC_05UpdateEmail {

    pages.customerPage.US_006_MEInfoSegmentPage infoPage = new pages.customerPage.US_006_MEInfoSegmentPage();

    @When("Clear Email field")
    public void clear_Email_field() {
        infoPage.UserInfoEmail.clear();
    }

    @When("Send {string} to Email field")
    public void send_to_Email_field(String newEmail) {
       infoPage.UserInfoEmail.sendKeys(newEmail);
    }


}
