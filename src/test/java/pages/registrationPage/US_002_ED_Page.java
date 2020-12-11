package pages.registrationPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_002_ED_Page {
    public US_002_ED_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (id="ssn" )
    public WebElement ssn;
    @FindBy (id="firstname" )
    public WebElement firstname;
    @FindBy (id="lastname" )
    public WebElement lastname;
    @FindBy (id="address" )
    public WebElement address;
    @FindBy (id="mobilephone" )
    public WebElement mobilephone;
    @FindBy (id="username" )
    public WebElement username;
    @FindBy (id="email" )
    public WebElement email;
    @FindBy (id="firstPassword" )
    public WebElement firstPassword;
    @FindBy (id="secondPassword" )
    public WebElement secondPassword;
    @FindBy (id="register-submit" )
    public WebElement register_submit;


    @FindBy(xpath = "//*[@class='invalid-feedback']")
    public WebElement ssninvalid;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement emailinvalid;
    @FindBy(xpath = "//*[text()='Your mobile phone number is invalid']")
    public WebElement mobilinvalid;

    @FindBy(xpath ="//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement registrationconfirmation;




}