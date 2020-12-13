package pages.employeePage;

import org.kohsuke.rngom.binary.DataExceptPattern;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_011_RK_Page {
    public US_011_RK_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

   @FindBy(id="tp-customer-createDate")
    public WebElement date;

   @FindBy(id="save-entity")
    public  WebElement saved;

   @FindBy(xpath ="//div[@class='Toastify__toast-body']")
    public  WebElement toaster;

    @FindBy(xpath ="//dl/dd[2]")
    public WebElement Firstnameview;

    @FindBy(xpath ="//dl/dd[3]")
    public WebElement Lastnameview;

    @FindBy(xpath ="//dl/dd[5]")
    public WebElement Emailmeview;

    @FindBy(xpath ="//dl/dd[6]")
    public WebElement MobilePhoneNumberview;

    @FindBy(xpath ="//dl/dd[8]")
    public WebElement ZipCodeview;

    @FindBy(xpath ="//dl/dd[9]")
    public WebElement Addressview;

    @FindBy(xpath ="(//a[@class='btn btn-info btn-sm'])[1]")
    public WebElement classview;

    @FindBy(xpath ="//*[.='Account']")
    public WebElement Acauntyazisi;

    @FindBy(xpath ="(//a[@class='btn btn-success btn-sm'])[1]")
    public WebElement Idbutonu;

    @FindBy(xpath =" //*[.='Manage Accounts']")
    public WebElement Manageecauntlink;

    @FindBy(xpath = "//span[text()='My Operations']")
    public WebElement myOperationsDrop;

    @FindBy(id="tp-customer-zelleEnrolled")
     public WebElement Zellenrolled ;

     @FindBy(id="tp-customer-middleInitial")
     public WebElement middlesatir ;

     @FindBy(id="tp-customer-phoneNumber")
     public WebElement phone ;

     @FindBy(xpath = "//div[@class='Toastify__toast-body']" )
     public WebElement toster ;
     @FindBy(id = "account-menu")
     public WebElement employeeDropdown;

     @FindBy(xpath = "//a[@href='/logout']")
     public WebElement signOutLinki;


}
