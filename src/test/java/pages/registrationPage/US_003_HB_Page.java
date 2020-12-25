package pages.registrationPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_003_HB_Page {
    public US_003_HB_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (id="firstPassword" )
    public WebElement firstPassword;
    @FindBy (id="secondPassword" )
    public WebElement secondPassword;
    @FindBy(xpath = "//li[@class='point'][1]")
    public WebElement kirmizPassword;
    @FindBy(xpath = "//li[@class='point'][2]")
    public  WebElement turuncuPassword;
    @FindBy(xpath = "//li[@class='point'][3]")
    public  WebElement maviPassword;
    @FindBy(xpath = "//li[@class='point'][5]")
    public  WebElement yesilPassword;
    @FindBy (id="register-submit" )
    public WebElement register_submit;
}
