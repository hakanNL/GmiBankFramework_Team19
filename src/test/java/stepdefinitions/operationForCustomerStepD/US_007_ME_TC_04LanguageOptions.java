package stepdefinitions.operationForCustomerStepD;


import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US_007_ME_TC_04LanguageOptions {
    pages.customerPage.US_006_MEInfoSegmentPage infoPage = new pages.customerPage.US_006_MEInfoSegmentPage();

    @Then("Verify just English and Turkish option in the language list")
    public void verify_just_English_and_Turkish_option_in_the_language_list() {
        System.out.println(infoPage.UserInfoLanguage.getText());
      //  System.out.println((ReusableMethods.getElementsText(By.xpath("//select"))));
      //  List<String> list = new ArrayList<>();
      //  list.add(0,"English");
      //  list.add(1,"Türkçe");
      //  Assert.assertTrue(ReusableMethods.getElementsText(By.xpath("//select")).equals(list));
        Assert.assertTrue(infoPage.UserInfoLanguage.getText().contains("English") && infoPage.UserInfoLanguage.getText().contains("Türkçe"));
        }

}




