package pages.EmployeePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EmployeeNewAccountPage {
    public EmployeeNewAccountPage (){
        PageFactory.initElements (Driver.getDriver (),this);
    }

    @FindBy(xpath = "//*[@id=\"account-menu\"]/a")
    public WebElement signinDropDown ;

    @FindBy(xpath = "//*[@id=\"login-item\"]/span")
    public WebElement sigIn;

    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a")
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








}
