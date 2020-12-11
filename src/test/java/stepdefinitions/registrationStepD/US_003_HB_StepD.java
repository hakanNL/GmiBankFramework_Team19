package stepdefinitions.registrationStepD;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import pages.registrationPage.US_003_HB_Page;

public class US_003_HB_StepD {

    US_003_HB_Page registerPage = new US_003_HB_Page();
    SoftAssert softAssert=new SoftAssert();

    @Given("Click the user registration button")
    public void click_the_user_registration_button() {
        registerPage.register_submit.click();
    }
    @Given("user sends {string} to password kirmizi")
    public void user_sends_to_password_kirmizi(String string) {
        registerPage.firstPassword.sendKeys(string+ Keys.ENTER);
        Assert.assertTrue(registerPage.kirmizPassword.isDisplayed());
    }
    @Given("user sends {string} to password turuncu")
    public void user_sends_to_password_turuncu(String string) {
        registerPage.firstPassword.sendKeys(string+Keys.ENTER);
        Assert.assertTrue(registerPage.turuncuPassword.isDisplayed());
    }
    @Given("user sends {string} to password yesil")
    public void user_sends_to_password_yesil(String string) {
        registerPage.firstPassword.sendKeys(string+Keys.ENTER);
        Assert.assertTrue(registerPage.yesilPassword.isDisplayed());
    }

}
