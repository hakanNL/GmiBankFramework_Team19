package stepdefinitions.registrationStepD;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import pages.registrationPage.US_002_ED_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_002_ED_StepD {

    US_002_ED_Page registerPage = new US_002_ED_Page();
    SoftAssert softAssert=new SoftAssert();

    @Given("user go to this link {string}")
    public void user_go_to_this_link(String string) {
        Driver.getDriver().get(string);
    }
    @Given("user sends {string} to mobile box")
    public void user_sends_to_mobile_box(String string) {
        registerPage.mobilephone.sendKeys(string+Keys.ENTER);
    }

    @Given("user sends {string}{int}{int}{int}{string} to mobile box")
    public void user_sends_to_mobile_box(String string, Integer int1, Integer int2, Integer int3, String string2) {
        registerPage.mobilephone.sendKeys(string+int1+int2+int3+string2+Keys.ENTER);
    }

    @Given("user sends {string} to SSN box")
    public void user_sends_to_SSN_box(String string) {
        registerPage.ssn.sendKeys(string+Keys.ENTER);
    }
    @Given("user sends {string} to email box")
    public void user_sends_to_email_box(String string) {
        registerPage.email.sendKeys(string+ Keys.ENTER);
    }
    //===================================================================================
    @Then("user checks mobil box if correct data is entered")
    public void user_checks_mobil_box_if_correct_data_is_entered() {
        ReusableMethods.verifyElementDisplayed(registerPage.mobilinvalid);
    }
    @Then("user checks email box if correct data is entered")
    public void user_checks_email_box_if_correct_data_is_entered() {
        ReusableMethods.verifyElementDisplayed(registerPage.emailinvalid);
    }
    @Then("user checks ssn if correct data is entered")
    public void user_checks_ssn_if_correct_data_is_entered() {
        ReusableMethods.verifyElementDisplayed(registerPage.ssninvalid);
    }
//======================================================================================


    @Given("User should see SSN box and send {string}")
    public void user_should_see_SSN_box_and_send(String string) {
        registerPage.ssn.sendKeys(string);
        //    System.out.println("value :   "+registerPage.ssn.getAttribute("value"));
        softAssert.assertTrue(registerPage.ssn.getAttribute("value").isEmpty());
    }

    @Given("User should see First Name box send {string}")
    public void user_should_see_First_Name_box_send(String string) {
        registerPage.firstname.sendKeys(string);
        //    System.out.println("value :   "+registerPage.firstname.getAttribute("value"));
        softAssert.assertTrue(registerPage.firstname.getAttribute("value").isEmpty());
    }
    @Given("User should see Last Name box and send {string}")
    public void user_should_see_Last_Name_box_and_send(String string) {
        registerPage.lastname.sendKeys(string);
        //    System.out.println("value :   "+registerPage.lastname.getAttribute("value"));
        softAssert.assertTrue(registerPage.lastname.getAttribute("value").isEmpty());
    }
    @Given("User should see Address box and send {string}")
    public void user_should_see_Address_box_and_send(String string) {
        registerPage.address.sendKeys(string);
        //    System.out.println("value :   "+registerPage.address.getAttribute("value"));
        softAssert.assertTrue(registerPage.address.getAttribute("value").isEmpty());
    }
    @Given("User should see Mobil Phone Number box and send {string}")
    public void user_should_see_Mobil_Phone_Number_box_and_send(String string) {
        registerPage.mobilephone.sendKeys(string);
        //    System.out.println("value :   "+registerPage.mobilephone.getAttribute("value"));
        softAssert.assertTrue(registerPage.mobilephone.getAttribute("value").isEmpty());

    }
    @Given("User should see Username box and send {string}")
    public void user_should_see_Username_box_and_send(String string) {
        registerPage.username.sendKeys(string);
        //    System.out.println("value :   "+registerPage.username.getAttribute("value"));
        softAssert.assertTrue(registerPage.username.getAttribute("value").isEmpty());
    }
    @Given("User should see Email box and send {string}")
    public void user_should_see_Email_box_and_send(String string) {
        registerPage.email.sendKeys(string);
        //    System.out.println("value :   "+registerPage.email.getAttribute("value"));
        softAssert.assertTrue(registerPage.email.getAttribute("value").isEmpty());
    }
    @Given("User should see New password box and send {string}")
    public void user_should_see_New_password_box_and_send(String string) {
        registerPage.firstPassword.sendKeys(string);
        //    System.out.println("value :   "+registerPage.firstPassword.getAttribute("value"));
        softAssert.assertTrue(registerPage.firstPassword.getAttribute("value").isEmpty());
    }
    @Given("User should see New password confirmation box and send {string}")
    public void user_should_see_New_password_confirmation_box_and_send(String string) {
        registerPage.secondPassword.sendKeys(string);
        //    System.out.println("value :   "+registerPage.secondPassword.getAttribute("value"));
        softAssert.assertTrue(registerPage.secondPassword.getAttribute("value").isEmpty());
    }



}

