package pages.CustomerPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_006_MEInfoSegmentPage {

   public US_006_MEInfoSegmentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement infoAccountMenu;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public  WebElement UserInfoButton;

    @FindBy(xpath = "//input[1]")
    public WebElement UserInfoFirstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement UserInfoLastName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement UserInfoEmail;

    @FindBy(xpath = "//select")
    public WebElement UserInfoLanguage;

    @FindBy(xpath = "//button[@type = 'submit']")
    public WebElement UserInfoSaveButton;


}
