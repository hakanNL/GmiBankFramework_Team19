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

    @FindBy(xpath = "(//button/span[text()='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//span[text()='Sign out']")
    public WebElement signOutButton;

}
