package stepdefinitions.customerStepD;


import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US_007_ME_TC_04LanguageOptions {
    pages.customerPage.US_006_MEInfoSegmentPage infoPage = new pages.customerPage.US_006_MEInfoSegmentPage();

    @Then("Verify just English and Turkish option in the language list")
    public void verify_just_English_and_Turkish_option_in_the_language_list() {
       System.out.println(infoPage.UserInfoLanguage.getText());


        //List<String> list = new ArrayList<>();
        //list.add(0,"English");
        //list.add(1,"Türkçe");
        //System.out.println(list);
       // Assert.assertEquals(ReusableMethods.getElementsText(By.xpath("//select")), list);
        Assert.assertTrue(infoPage.UserInfoLanguage.getText().contains("English") && infoPage.UserInfoLanguage.getText().contains("Türkçe"));
        }

}




