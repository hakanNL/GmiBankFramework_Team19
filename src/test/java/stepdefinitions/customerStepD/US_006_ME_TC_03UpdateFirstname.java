package stepdefinitions.customerStepD;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_006_ME_TC_03UpdateFirstname {
    pages.customerPage.US_006_MEInfoSegmentPage infoPage = new pages.customerPage.US_006_MEInfoSegmentPage();

    @When("Clear First Name field")
    public void clear_First_Name_field() {
        infoPage.UserInfoFirstName.clear();
    }

    @When("Send {string} to First Name field")
    public void send_to_First_Name_field(String firstname) {
        infoPage.UserInfoFirstName.sendKeys(firstname);
    }

    @Then("Verify Settings saved!")
    public void verify_Settings_saved() {
        String message = infoPage.savingMessage.getText();
        System.out.println(message);
        Assert.assertEquals("Settings saved!",message);

    }

}
