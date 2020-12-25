package pages.loginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement accountMenu;


    @FindBy(id = "login-item")

    public WebElement signInButton;


    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//span[contains(text(),'Cancel')]")
    public WebElement cancelButton;

    @FindBy(xpath = "//span[contains(text(),'Sign out')]")
    public WebElement signOutButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement errorMessage;

    @FindBy(xpath = "//div[@class='modal-content']")
    public WebElement signInDialog;

    @FindBy(linkText = "Did you forget your password?")
    public WebElement resetPasswordText;

    @FindBy(linkText = "Register a new account")
    public WebElement registerNewAccountText;

    @FindBy(xpath = "//div[@class='Toastify']")
    public WebElement successAlertMessage;



}
