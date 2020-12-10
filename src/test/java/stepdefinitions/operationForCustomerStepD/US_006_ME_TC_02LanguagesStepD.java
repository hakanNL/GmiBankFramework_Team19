package stepdefinitions.operationForCustomerStepD;


import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ReusableMethods;

public class US_006_ME_TC_02LanguagesStepD {
    pages.customerPage.US_006_MEInfoSegmentPage infoPage = new pages.customerPage.US_006_MEInfoSegmentPage();

    @Then("Verify Language")
    public void verify_Language() {
        Assert.assertEquals("Language",infoPage.languageTitle.getText());
        System.out.println(infoPage.languageTitle.getText());
    }

    @Then("click Languages Row button")
    public void click_Languages_Row_button() {
        infoPage.UserInfoLanguage.click();
    }

    @Then("select Türkish")
    public void select_Türkish() {
        infoPage.türkçe.click();
    }

    @Then("click Save button")
    public void click_Save_button() {
       infoPage.UserInfoSaveButton.click();
       ReusableMethods.wait(3);
    }

    @Then("Verify Dil")
    public void verify_Dil() {
        ReusableMethods.wait(3);
        Assert.assertEquals("Dil",infoPage.languageTitle.getText());
    }

    @Then("select English")
    public void select_English() {
        infoPage.english.click();
    }

}
