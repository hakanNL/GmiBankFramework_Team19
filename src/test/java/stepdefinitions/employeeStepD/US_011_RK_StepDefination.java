package stepdefinitions.employeeStepD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.employeePage.US_011_RK_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_011_RK_StepDefination {

    US_011_RK_Page page = new US_011_RK_Page();

    @Given("user tarih kayit zamanindan onceki bir tarihi alir")
    public void user_tarih_kayit_zamanindan_onceki_bir_tarihi_alir() {
        page.date.sendKeys("2/7/2019 18:50");

    }
    @Given("user tarih kayit zamanindan sonraki bir tarihe alir")
    public void user_tarih_kayit_zamanindan_sonraki_bir_tarihe_alir() {
        page.date.sendKeys("2/7/2021 18:50");
    }

    @Given("Saved butonuna tiklar.")
    public void saved_butonuna_tiklar() {
        page.saved.click();

    }

    @Given("user kaydi gerceklestigini gormeli")
    public void user_kaydi_gerceklestigini_gormeli() {
        //ReusableMethods.verifyElementDisplayed(page.cheking);
        ReusableMethods.wait(2);

        Assert.assertTrue(page.toaster.isDisplayed());
        //ReusableMethods.verifyElementNotDisplayed(By.xpath("//*[contains(text(),'Internal server error.')]"));
        ReusableMethods.wait(1);
        page.employeeDropdown.click();
        ReusableMethods.wait(1);
        page.signOutLinki.click();
    }
    //-----------------------------------------------------------------------------------------------


    @Given("user Create Date in formati Aygun yil saat dakika olarak gorulmeli.")
    public void user_Create_Date_in_formati_Aygun_yil_saat_dakika_olarak_gorulmeli() {
        ReusableMethods.wait(2);
        System.out.println(page.date.getAttribute("value"));
        Assert.assertFalse(page.date.getAttribute("value").contains("2020-12-12T00:00"));
        ReusableMethods.wait(1);
        page.employeeDropdown.click();
        ReusableMethods.wait(1);
        page.signOutLinki.click();
    }
//------------------------------------------------------------------------------------------------

    @Given("user secilen musteriye ait satirdki View butonuna tiklar")
    public void user_secilen_musteriye_ait_satirdki_View_butonuna_tiklar() {
        page.classview.click();
    }

    @Then("user bilgilerin tamaminin doldurulmus oldugu gorulur")
    public void user_bilgilerin_tamaminin_doldurulmus_oldugu_gorulur() {

        ReusableMethods.wait(3);
        Assert.assertTrue(page.Firstnameview.isDisplayed());
        ReusableMethods.wait(3);
        Assert.assertTrue(page.Addressview.isDisplayed());
        ReusableMethods.wait(3);
        Assert.assertTrue(page.Emailmeview.isDisplayed());
        ReusableMethods.wait(3);
        Assert.assertTrue(page.Lastnameview.isDisplayed());
        ReusableMethods.wait(3);
        Assert.assertTrue(page.MobilePhoneNumberview.isDisplayed());
        ReusableMethods.wait(3);
        Assert.assertTrue(page.ZipCodeview.isDisplayed());
        ReusableMethods.wait(2);
        page.employeeDropdown.click();
        ReusableMethods.wait(2);
        page.signOutLinki.click();

    }

//-------------------------------------------------------------------------------------------
    @Given("Click the Manage Accaunt option from the My Operations dropdown.")
    public void click_the_Manage_Accaunt_option_from_the_My_Operations_dropdown() {
       page.myOperationsDrop.click();
        ReusableMethods.wait(1);
        page.Manageecauntlink.click();
}

    @Given("user ID butonuna tiklar")
    public void user_ID_butonuna_tiklar() {
        ReusableMethods.wait(2);
        page.Idbutonu.click();

    }

    @Given("user hesap bilgilsrinin oldugu sayfada Accaunt yazisini dogrular")
    public void user_hesap_bilgilsrinin_oldugu_sayfada_Accaunt_yazisini_dogrular() {
        ReusableMethods.wait(1);
        Assert.assertTrue(page.Acauntyazisi.isDisplayed());
        ReusableMethods.wait(1);
        page.employeeDropdown.click();
        ReusableMethods.wait(1);
        page.signOutLinki.click();
    }

//-----------------------------------------------------------------------------------------------


    @Given("Midle initial entered")
    public void midle_initial_entered() {
        ReusableMethods.wait(1);
        page.middlesatir.sendKeys("R" );
    }


    @Given("Phone initial entered")
    public void phone_initial_entered() {
        ReusableMethods.wait(1);
        page.phone.sendKeys("123-123-4567");

    }

    @Given("user zelle enrolled  radio butonunu secebilmeli")
    public void user_zelle_enrolled_radio_butonunu_secebilmeli() {
        ReusableMethods.wait(1);
        page.Zellenrolled.click();

    }

    @Given("Saved butonuna tiklar")
    public void Saved_butonuna_tiklar() {
        ReusableMethods.wait(1);
        page.saved.click();

    }

    @Then("user kayit basarili yazisini gorur")
    public void user_kayit_basarili_yazisini_gorur() {
        ReusableMethods.wait(2);
        Assert.assertTrue(page.toster.isDisplayed());
        ReusableMethods.wait(1);
        page.employeeDropdown.click();
        ReusableMethods.wait(1);
        page.signOutLinki.click();
    }




}
