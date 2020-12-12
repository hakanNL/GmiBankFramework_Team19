package stepdefinitions.customerStepD;


import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class US_007_ME_TC_04LanguageOptions {
    pages.customerPage.US_006_MEInfoSegmentPage infoPage = new pages.customerPage.US_006_MEInfoSegmentPage();

    @Then("Verify just English and Turkish option in the language list")
    public void verify_just_English_and_Turkish_option_in_the_language_list() {

        List<String> listActual = new ArrayList<>();

        listActual.add(0, infoPage.english.getText());
        listActual.add(1, infoPage.türkçe.getText());

        List<String> listExpected = new ArrayList<>();
        listExpected.add(0, "English");
        listExpected.add(1, "Türkçe");
        Assert.assertEquals(listExpected, listActual);
    }

}




