package pages.customerPage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_008_PasswordPage {
    public US_008_PasswordPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@id=\"account-menu\"]/a" )
    public WebElement user;

    @FindBy(xpath = "//*[@id=\"login-item\"]/span")
    public WebElement signIn;

    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement userName;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
    public WebElement SignInPass;

    @FindBy(xpath = "//*[@id=\"account-menu\"]/a/span")
    public WebElement userCustomer;

    @FindBy(xpath = "//*[@id=\"account-menu\"]/div/a[2]/span")
    public WebElement passwordButton;

    @FindBy(xpath = "//*[@id=\"currentPassword\"]")
    public WebElement currentPasswordBox;

    @FindBy(xpath = "//*[@id=\"newPassword\"]")
    public WebElement newPasswordBox;

    @FindBy(xpath = "//*[@id=\"confirmPassword\"]")
    public WebElement confirmationBox;

    @FindBy(xpath = "//*[@id=\"password-form\"]/button/span")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div")
    public WebElement passwordChangedAlert;

    @FindBy(xpath = "//*[@id=\"strengthBar\"]/li[1]")
    public WebElement chart1path;

    @FindBy(xpath = "//*[@id=\"strengthBar\"]/li[4]")
    public WebElement chart2path;

    @FindBy(xpath = "//*[@id=\"strengthBar\"]/li[5]")
    public WebElement chart3path;

}
