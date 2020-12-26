package pages.employeePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EmployeeNewAccountPage {
    public EmployeeNewAccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"account-menu\"]/a")
    public WebElement signinDropDown;

    @FindBy(id = "login-item")
    public WebElement sigIn;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a/span")
    public WebElement myOperations;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[2]/span")
    public WebElement manageAccount;
    @FindBy(xpath = "//*[@id=\"jh-create-entity\"]/span")
    public WebElement createNewAccount;

    @FindBy(xpath = "//*[@id=\"tp-account-description\"]")
    public WebElement descriptions;
    @FindBy(xpath = "//*[@id=\"tp-account-balance\"]")
    public WebElement balance;
    @FindBy(id = "tp-account-accountType")
    public WebElement accountTypeDropDown;
    @FindBy(name = "accountStatusType")
    public WebElement statusTypeDropdown;
    // @FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div/div/div/div[2]/div/form/div[4]/select")
    //public WebElement accountStatusType;
    @FindBy(id = "tp-account-employee")
    public WebElement employee;
    @FindBy(id = "save-entity")
    public WebElement saveButton;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/div[2]/div/form/div[1]/div/div")
    public WebElement invalidFeedback;

    // US14 locator
    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement manageCustomers;

    @FindBy(id = "jh-create-entity")
    public WebElement createNewCustomer;
    @FindBy(id = "search-ssn")
    public WebElement ssnTexBox;
    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchButton;
    @FindBy(id = "tp-customer-middleInitial")
    public WebElement middle;
    @FindBy(id = "tp-customer-phoneNumber")
    public WebElement phone;
    @FindBy(id = "tp-customer-zipCode")
    public WebElement zipCode;
    @FindBy(id = "tp-customer-city")
    public WebElement ctiy;
    @FindBy(id = "tp-customer-createDate")
    public WebElement date;
    @FindBy(xpath = "//*[@id=\"save-entity\"]/span")
    public WebElement customerSave;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]")
    public WebElement errorMessage;


    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement succesMessage;

    @FindBy(id = "tp-customer-user")
    public WebElement userDropDown;
    @FindBy(id = "tp-customer-account")
    public WebElement accountDropDown;
    @FindBy(id = "tp-customer-zelleEnrolled")
    public WebElement zelle;
    @FindBy(id = "tp-account-createDate")
    public WebElement createDateIcon;

    @FindBy(xpath = "//span[.='Create Date']")
    public WebElement createDateBox;
    @FindBy(xpath = "//*[@id=\"account-menu\"]/a")
    public WebElement outDropDown;
    @FindBy(xpath = "//*[@id=\"account-menu\"]/div/a[3]/span")
    public WebElement signOut;
    @FindBy(id = "tp-customer-createDate")
    public WebElement customerDate;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div[1]/div/div/div/span")
    public WebElement adminManageError;
}