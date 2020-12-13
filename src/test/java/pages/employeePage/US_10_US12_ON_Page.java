package pages.employeePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;

public class US_10_US12_ON_Page {
    public US_10_US12_ON_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement loginUserNameKutusu;
    @FindBy(name = "password")
    public WebElement loginPasswordKutusu;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginSigninButonu;
    @FindBy(xpath = "//span[text()='My Operations']")
    public WebElement myOperationsDropDown;
    @FindBy(xpath = "//*[text()='Manage Customers']")
    public WebElement manageCustomerLinki;
    @FindBy(xpath = "//tbody/tr[1]/td")
    public WebElement tumMusterilerListesi;
    @FindBy(id = "account-menu")
    public WebElement employeeDropdown;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[4]")
    public WebElement signOutLinki;
    @FindBy(xpath ="//div[@class='Toastify__toast-body']")
    public  WebElement toaster;
    @FindBy(xpath = "//tr[1]/td[10]/div/a[1]")
    public WebElement viewLinki;
    @FindBy(xpath = "//tr[1]/td[10]/div/a[2]")
    public WebElement editLinki;
    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement editAltindakiSaveButonu;
    @FindBy(xpath = "//tr[1]/td[10]/div/a[3]")
    public WebElement deleteLinki;
    @FindBy(xpath = "//div[.='translation-not-found[gmiBankBackendApp.tPCustomer.deleted]']")
    public WebElement popuptakiDeleteOnayYazisi;
    @FindBy(xpath = "//div[.='translation-not-found[gmiBankBackendApp.tPCustomer.updated]']")
    public WebElement popuptakiUpdateOnayYazisi;

    //@FindBy(xpath = "//div[.='Internal server error.']")
    //public WebElement popuptakiDeleteOnayYazisi;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement viewdekiEditLinki;
    @FindBy(xpath = "//*[text()='Confirm delete operation']")
    public WebElement popuptakiEminMisinYazisi;
    @FindBy(xpath = "//button[@id='jhi-confirm-delete-tPCustomer']")
    public WebElement popuptakiDeleteButonu;
    @FindBy(xpath = "//input[@name='zipCode']")
    public WebElement zipCodeBox;
    @FindBy(xpath = "//input[@name='address']")
    public WebElement addressBox;
    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityBox;
    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement countryDropDown;
    @FindBy(xpath = "//input[@name='state']")
    public WebElement stateBox;
    @FindBy(xpath = "//*[text()='This field is required.']")
    public WebElement gerekliAlanUyarisiHataMesaji;
}
