package stepdefinitions.operationForCustomerStepD;

import cucumber.api.java.en.When;

public class US_006_ME_TC_04UpdateLastname {

    pages.CustomerPage.US_006_MEInfoSegmentPage infoPage = new pages.CustomerPage.US_006_MEInfoSegmentPage();

    @When("Clear Last Name field")
    public void clear_Last_Name_field() {
        infoPage.UserInfoLastName.clear();

    }

    @When("Send {string} to Last Name field")
    public void send_to_Last_Name_field(String newLastName) {
        infoPage.UserInfoLastName.sendKeys("Ekici");

    }
}
