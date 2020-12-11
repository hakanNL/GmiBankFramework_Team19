package pages.registrationPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_01_HB_Page {
    public US_01_HB_Page(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement insanFigur;
    @FindBy(xpath = "//a[@href  = '/account/register']")
    public WebElement registerLink;
    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnTextBox;
    @FindBy(className = "invalid-feedback")
    public WebElement ssnMessage;
    @FindBy(xpath = "//*[@id='register-form']/div[1]/div")
    public WebElement ssnInvalidMessage;
    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameTextBox;
    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement firstNameInvalidMessage;
    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastNameTextBox;
    @FindBy(css = "#register-form > div:nth-child(3) > div")
    public WebElement lastNameInvalidMessage;
    @FindBy(id = "address")
    public WebElement addressTextBox;
    @FindBy(id = "mobilephone")
    public WebElement mobileTextBox;
    @FindBy(xpath = "@FindBy(xpath =//div[(text() ='Your mobile phone number is invalid')]')")
    public WebElement mobileTextinvalidmessage;
    @FindBy(xpath = "//*[@id='register-form']/div[5]/div")
    public WebElement mobileInvalidMessage;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameTextBox;
    @FindBy(xpath = "//*[@id='register-form']/div[6]/div")
    public WebElement userNameInvalidMessage;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;
    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement emailInvalidMessage;
    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement newPasswordTextBox;
    @FindBy(xpath = "//input[@name='secondPassword']")
    public WebElement confirmationNewPasswordTextBox;
    @FindBy(xpath = "//*[@id='register-submit']")
    public WebElement registerButton;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement successRegisterMessage;

}
