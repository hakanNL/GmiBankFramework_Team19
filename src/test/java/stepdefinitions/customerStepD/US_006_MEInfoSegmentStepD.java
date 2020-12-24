package stepdefinitions.customerStepD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.customerPage.US_006_MEInfoSegmentPage;
import pages.loginPage.LoginPage;
import utilities.ReusableMethods;
public class US_006_MEInfoSegmentStepD {
    LoginPage loginPage = new LoginPage();
    US_006_MEInfoSegmentPage infoPage = new US_006_MEInfoSegmentPage();
    @When("user enters {string} to Username field")
    public void user_enters_to_Username_field(String username) {
        loginPage.username.sendKeys(username);
    }
    @When("user enters {string} to password field")
    public void user_enters_to_password_field(String password) {
        loginPage.password.sendKeys(password);
    }
    @When("click User Name button")
    public void click_User_Name_button() {
        ReusableMethods.wait(2);
        infoPage.infoAccountMenu.click();
    }
    @When("clicks User Info button")
    public void clicks_User_Info_button() {
        infoPage.UserInfoButton.click();
    }
    @Then("Verify on First Name field {string}")
    public void verify_on_First_Name_field(String string) {
        ReusableMethods.wait(3);
        Assert.assertEquals(string,infoPage.UserInfoFirstName.getAttribute("value"));
    }
    @Then("Verify on Last Name field {string}")
    public void verify_on_Last_Name_field(String string) {
        Assert.assertEquals("Ekinci",infoPage.UserInfoLastName.getAttribute("value"));
    }
    @Then("Verify on Email field {string}")
    public void verify_on_Email_field(String string) {
        Assert.assertEquals("izmirsh12@gmail.com",infoPage.UserInfoEmail.getAttribute("value"));
    }
    @Then("Verify on Language field {string}")
    public void verify_on_Language_field(String string)  {
        Assert.assertTrue(infoPage.UserInfoLanguage.getText().contains("English"));
    }
    @Then("click Sign out button")
    public void click_Sign_out_button() {
        infoPage.signOutButton.click();
    }
}
