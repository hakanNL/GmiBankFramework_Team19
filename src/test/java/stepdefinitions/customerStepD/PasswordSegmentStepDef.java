package stepdefinitions.customerStepD;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.customerPage.US_008_PasswordPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class PasswordSegmentStepDef {
    US_008_PasswordPage passwordPage = new US_008_PasswordPage();

    @Given("1Go to {string} link")
    public void goToLink(String url) {
        Driver.getDriver().get(url);
    }

    @And("2Click to User drop down menu")
    public void clickToUserDropDownMenu() {
        passwordPage.user.click();
    }

    @And("3Click to Sign in")
    public void clickToSignIn() {
        passwordPage.signIn.click();
    }

    @And("4Enter the username with valid credentials")
    public void enterTheUsernameWithValidCredentials() {
        passwordPage.userName.sendKeys(ConfigurationReader.getProperty("UsernameMy"));
    }

    @And("5Enter the password with valid credentials")
    public void enterThePasswordWithValidCredentials(){
        passwordPage.password.sendKeys(ConfigurationReader.getProperty("PasswordMy"));
    }

    @And("6Click to Sign in button")
    public void clickToSignInButton() throws InterruptedException {
        Thread.sleep(1000);
        passwordPage.SignInPass.click();
    }

    @And("7Click to User drop down menu2")
    public void clickToUserDropDownMenu2() {
        passwordPage.userCustomer.click();
    }

    @And("8Click to Password")
    public void clickToPassword() {
        passwordPage.passwordButton.click();
    }

    @And("9Enter to Current Password")
    public void enterToCurrentPassword() {
        passwordPage.currentPasswordBox.click();
        passwordPage.currentPasswordBox.sendKeys(ConfigurationReader.getProperty("PasswordMy"));
    }

    @And("10Enter the Current Password in New password Box.")
    public void enterTheCurrentPasswordInNewPasswordBox() {
        passwordPage.newPasswordBox.sendKeys(ConfigurationReader.getProperty("PasswordMy"));
    }

    @And("11Enter to Current Password in New password confirmation Box.")
    public void enterToCurrentPasswordInNewPasswordConfirmationBox() {
        passwordPage.confirmationBox.sendKeys(ConfigurationReader.getProperty("PasswordMy"));
    }

    @And("12Click to Save Button.")
    public void clickToSaveButton() {
        passwordPage.saveButton.click();
    }

    @And("13Assert that Save Alert Negative.")
    public void assertThatSaveAlertNegative() {
        Assert.assertTrue(passwordPage.passwordChangedAlert.isDisplayed());
        Driver.closeDriver();
    }




    @And("9Enter the Basic Password to New password box.")
    public void enterTheBasicPasswordToNewPasswordBox() {
        passwordPage.currentPasswordBox.sendKeys(ConfigurationReader.getProperty("PasswordMy"));
        passwordPage.newPasswordBox.sendKeys(ConfigurationReader.getProperty("BasicPassword"));
    }

    @And("10Enter the Password with one uppercase adding to New password box.")
    public void enterThePasswordWithOneUppercaseAddingToNewPasswordBox() {
        passwordPage.newPasswordBox.sendKeys(ConfigurationReader.getProperty("Basic2Password"));
    }

    @And("11Assert that level chart1.")
    public void assertThatLevelChart1(){
        String actualchart1=passwordPage.chart1path.getAttribute("style");
        Assert.assertEquals(ConfigurationReader.getProperty("expectedchart1"), actualchart1);
    }

    @And("12Enter the Password with more one digit adding to New password box.")
    public void enterThePasswordWithMoreOneDigitAddingToNewPasswordBox(){
        passwordPage.newPasswordBox.clear();
        passwordPage.newPasswordBox.sendKeys(ConfigurationReader.getProperty("Basic3Password"));
    }

    @And("13Assert that level chart2")
    public void assertThatLevelChart2() {
        String actualchart2=passwordPage.chart2path.getAttribute("style");
        Assert.assertEquals(ConfigurationReader.getProperty("expectedchart2"), actualchart2);
    }

    @And("14Enter to Password with more special char adding to New password box.")
    public void enterToPasswordWithMoreSpecialCharAddingToNewPasswordBox() {
        passwordPage.newPasswordBox.clear();
        passwordPage.newPasswordBox.sendKeys(ConfigurationReader.getProperty("Basic4Password"));
    }

    @And("15Assert that level chart3")
    public void assertThatLevelChart(){
        String actualchart3=passwordPage.chart3path.getAttribute("style");
        Assert.assertEquals(ConfigurationReader.getProperty("expectedchart3"), actualchart3);

    }

    @And("16Enter the valid Password has least 7 chars to New password box.")
    public void enterTheValidPasswordHasLeastCharsToNewPasswordBox(){
        passwordPage.newPasswordBox.clear();
        passwordPage.newPasswordBox.sendKeys(ConfigurationReader.getProperty("PasswordMy"));
    }

    @And("17Assert that level chart4")
    public void assertThatLevelChart4() {
        String actualchart3=passwordPage.chart3path.getAttribute("style");
        Assert.assertEquals(ConfigurationReader.getProperty("expectedchart3"), actualchart3);
    }

    @And("18Enter the valid  Password  has least 7 chars to New password confirmation box.")
    public void enterTheValidPasswordHasLeastCharsToNewPasswordConfirmationBox() {
        passwordPage.confirmationBox.sendKeys(ConfigurationReader.getProperty("PasswordMy"));
    }

    @And("19Click to Save button.")
    public void clickToSaveButton19() {
        passwordPage.saveButton.click();
    }

    @Then("20Assert that Save Alert.")
    public void assertThatSaveAlert() {
        Assert.assertTrue(passwordPage.passwordChangedAlert.isDisplayed());
        Driver.closeDriver();
    }



}
