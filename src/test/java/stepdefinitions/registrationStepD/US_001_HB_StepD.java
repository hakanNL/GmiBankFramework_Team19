package stepdefinitions.registrationStepD;

<<<<<<< HEAD
public class US_001_ED_StepD {


=======
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.registrationPage.US_01_HB_Page;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.getDriver;

public class US_001_HB_StepD {


    US_01_HB_Page us_01_hb_page = new US_01_HB_Page();


    @Given("Kullanici SSN text box una gecerli bir gecerli_SSN girer")
    public void kullanici_SSN_text_box_una_gecerli_bir_girer() {
        us_01_hb_page.ssnTextBox.sendKeys(ConfigurationReader.getProperty("gecerli_SSN"));
    }

    @Then("Kullanici SSN kutusunun bos olmadigini dogrular")
    public void kullanici_SSN_kutusunun_bos_olmadigini_dogrular() {
        //Assert.assertTrue(us_01_hb_page.ssnTextBox.isDisplayed());
        Assert.assertEquals(ConfigurationReader.getProperty("gecerli_SSN"),us_01_hb_page.ssnTextBox.getAttribute("value"));

    }
    @Given("Kullanici gmibank_register sayfasina gider")
    public void kullanici_gmibank_register_sayfasina_gider() {
        getDriver().get(ConfigurationReader.getProperty("gmibank_register"));

    }

    @Given("Kullanici First Name kutusuna gecerli bir first_Name girer")
    public void kullanici_First_Name_kutusuna_gecerli_bir_first_Name_girer() {
        us_01_hb_page.firstNameTextBox.sendKeys(ConfigurationReader.getProperty("first_Name"));

    }

    @Then("Kullanici First Name kutusunun bos olmadigini dogrular")
    public void kullanici_First_Name_kutusunun_bos_olmadigini_dogrular() {
        Assert.assertEquals(ConfigurationReader.getProperty("first_Name"),us_01_hb_page.firstNameTextBox.getAttribute("value"));

    }
    @Given("Kullanici Last Name kutusuna gecerli bir last_Name girer")
    public void kullanici_Last_Name_kutusuna_gecerli_bir_last_Name_girer() {
        us_01_hb_page.lastNameTextBox.sendKeys(ConfigurationReader.getProperty("last_Name"));
    }

    @Then("Kullanici Last Name kutusunun bos olmadigini dogrular")
    public void kullanici_Last_Name_kutusunun_bos_olmadigini_dogrular() {
        Assert.assertEquals(ConfigurationReader.getProperty("last_Name"),us_01_hb_page.lastNameTextBox.getAttribute("value"));
    }

    @Given("Kullanici Address kutusuna gecerli bir address girer")
    public void kullanici_Address_kutusuna_gecerli_bir_address_girer() {
        us_01_hb_page.addressTextBox.sendKeys(ConfigurationReader.getProperty("address"));
    }

    @Then("Kullanici Address kutusunun bos olmadigini dogrular")
    public void kullanici_Address_kutusunun_bos_olmadigini_dogrular() {
        Assert.assertEquals(ConfigurationReader.getProperty("address"),us_01_hb_page.addressTextBox.getAttribute("value"));
    }

    @Given("Kullanici Mobile Phone Number kutusuna gecerli bir mobile_Phone_Number girer")
    public void kullanici_Mobile_Phone_Number_kutusuna_gecerli_bir_mobile_Phone_Number_girer() {
        us_01_hb_page.mobileTextBox.sendKeys(ConfigurationReader.getProperty("mobile_Phone_Number"));
    }

    @Then("Kullanici Mobile Phone Number kutusunun bos olmadigini dogrular")
    public void kullanici_Mobile_Phone_Number_kutusunun_bos_olmadigini_dogrular() {
        Assert.assertEquals(ConfigurationReader.getProperty("mobile_Phone_Number"),us_01_hb_page.mobileTextBox.getAttribute("value"));
    }

    @Given("Kullanici Username kutusuna gecerli bir username girer")
    public void kullanici_Username_kutusuna_gecerli_bir_username_girer() {
        us_01_hb_page.userNameTextBox.sendKeys(ConfigurationReader.getProperty("username"));
    }

    @Then("Kullanici Username kutusunun bos olmadigini dogrular")
    public void kullanici_Username_kutusunun_bos_olmadigini_dogrular() {
        Assert.assertEquals(ConfigurationReader.getProperty("username"),us_01_hb_page.userNameTextBox.getAttribute("value"));
    }

    @Given("Kullanici Email kutusuna gecerli bir Email girer")
    public void kullanici_Email_kutusuna_gecerli_bir_girer() {
        us_01_hb_page.emailTextBox.sendKeys(ConfigurationReader.getProperty("email"));

    }

    @Then("Kullanici Email kutusunun bos olmadigini dogrular")
    public void kullanici_Email_kutusunun_bos_olmadigini_dogrular() {
        Assert.assertEquals(ConfigurationReader.getProperty("email"),us_01_hb_page.emailTextBox.getAttribute("value"));
    }

    @Given("Kullanici New password kutusuna karakter ve digid den olusan gecerli bir new_Password girer")
    public void kullanici_New_password_kutusuna_karakter_ve_digid_den_olusan_gecerli_bir_new_Password_girer() {
        us_01_hb_page.newPasswordTextBox.sendKeys(ConfigurationReader.getProperty("new_Password"));
    }

    @Given("Kullanici New password kutusunun bos olmadigini dogrular")
    public void kullanici_New_password_kutusunun_bos_olmadigini_dogrular() {
        Assert.assertEquals(ConfigurationReader.getProperty("new_Password"),us_01_hb_page.newPasswordTextBox.getAttribute("value"));
    }

    @Given("Kullanici New password confirmation kutusuna tekrar new_Password girer")
    public void kullanici_New_password_confirmation_kutusuna_tekrar_new_Password_girer() {
        us_01_hb_page.confirmationNewPasswordTextBox.sendKeys(ConfigurationReader.getProperty("new_Password"));
    }

    @When("Kullanici New password confirmation kutusunun bos olmadigini dogrular")
    public void kullanici_New_password_confirmation_kutusunun_bos_olmadigini_dogrular() {
        Assert.assertEquals(ConfigurationReader.getProperty("new_Password"),us_01_hb_page.confirmationNewPasswordTextBox.getAttribute("value"));
    }

    @When("Kullanici Register butonuna tiklar")
    public void kullanici_Register_butonuna_tiklar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(us_01_hb_page.registerButton).perform();

        ReusableMethods.wait(2);

        us_01_hb_page.registerButton.click();

    }

    @Then("Kullanici Registration saved mesajini gorur")
    public void kullanici_Registration_saved_mesajini_gorur() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(us_01_hb_page.successRegisterMessage.getText().contains("saved"));
        System.out.println(us_01_hb_page.successRegisterMessage.getText());


    }
>>>>>>> refs/remotes/origin/master

}
