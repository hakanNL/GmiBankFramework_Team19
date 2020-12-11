package stepdefinitions.employeeStepD;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import pages.employeePage.US_009_RK_Page;
import pages.registrationPage.US_002_ED_Page;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

public class US_09_RK_StepDefinition {

    US_002_ED_Page registerPage = new US_002_ED_Page();

    @Given("User should see SSN box and sendd {string}")
    public void user_should_see_SSN_box_and_sendd(String string) {
    registerPage.ssn.sendKeys(ConfigurationReader.getProperty("SSN_creat"));
    }


    @Given("user checks whether he has received new customer approval")
    public void user_checks_whether_he_has_received_new_customer_approval() {
       // ReusableMethods.verifyElementDisplayed(registerPage.registrationconfirmation);
        //Assert.assertEquals(registerPage.registrationconfirmation.getText(),"Registration saved!");
        ReusableMethods.verifyElementDisplayed(registerPage.registrationconfirmation);

    }
//----------------------------------------------------------------------------------------------------------------------
        US_009_RK_Page Page = new US_009_RK_Page();


    @Given("Acilan sayfada My Operation sekmesine tilanarak acilmali")
    public void acilan_sayfada_My_Operation_sekmesine_tilanarak_acilmali() {
        Page.myOperationsDropDown.click();
    }

    @Given("Manage Customers alt sekmesine tiklanmali.")
    public void manage_Customers_alt_sekmesine_tiklanmali() {
    Page.manageCustomerLinki.click();
    }

    @Given("Acilan sayfada Create a new Customer butonu gorulmeli ve tiklanmali.")
    public void acilan_sayfada_Create_a_new_Customer_butonu_gorulmeli_ve_tiklanmali() {
    Page.Create_N_Customer.click();
    }


    @Given("Formun ilk satirda bulunan SSN  satirina Customer e ait {string} girilmeli")
    public void formun_ilk_satirda_bulunan_SSN_satirina_Customer_e_ait_girilmeli(String string) {
    Page.Search_SSN.sendKeys(ConfigurationReader.getProperty("SSN_creat"));
    Page.Search_Buton.click();
    }

    @Given("Forma girilen datalarin dogru ve eksiksiz bir sekilde geldigi gorulmeli.")
    public void forma_girilen_datalarin_dogru_ve_eksiksiz_bir_sekilde_geldigi_gorulmeli() {

        ReusableMethods.wait(2);
        Assert.assertFalse(Page.FirstName.getAttribute("value").isEmpty());
        ReusableMethods.wait(2);
        Assert.assertFalse(Page.LastName.getAttribute("value").isEmpty());
        ReusableMethods.wait(2);
        Assert.assertFalse(Page.Email.getAttribute("value").isEmpty());
        ReusableMethods.wait(2);
        Assert.assertFalse(Page.M_Phone_Nu.getAttribute("value").isEmpty());
        ReusableMethods.wait(2);
        Assert.assertFalse(Page.Adress.getAttribute("value").isEmpty());

    }


}
