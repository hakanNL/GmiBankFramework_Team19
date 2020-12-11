package pages.employeePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_009_RK_Page {

    public US_009_RK_Page() {
        PageFactory.initElements(Driver.getDriver(), this);

        }
    @FindBy(xpath = "//span[text()='My Operations']")
    public WebElement myOperationsDropDown;

    @FindBy(xpath = "//*[text()='Manage Customers']")
    public WebElement manageCustomerLinki;


    @FindBy(id="jh-create-entity")
    public WebElement  Create_N_Customer;

    @FindBy(id="search-ssn")
    public WebElement Search_SSN;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement Search_Buton;

    @FindBy(id="tp-customer-firstName")
    public WebElement FirstName;

    @FindBy(id="tp-customer-lastName")
    public WebElement  LastName;

    @FindBy(id="tp-customer-email")
    public WebElement Email;

    @FindBy(id="tp-customer-mobilePhoneNumber")
    public WebElement M_Phone_Nu;

    @FindBy(id="tp-customer-address")
    public WebElement Adress;

    @FindBy(xpath = "//input[@class='is-touched is-pristine av-invalid is-invalid form-control']")
    public WebElement SSN2;


}









