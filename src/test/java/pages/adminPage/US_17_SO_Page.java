package pages.adminPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class US_17_SO_Page {
    public US_17_SO_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id="account-menu")
    public WebElement Account;

    @FindBy(id="login-item")
    public WebElement Sign;

    @FindBy(id="username")
    public WebElement Username;

    @FindBy(id="password")
    public WebElement Password;

    @FindBy(className ="btn btn-secondary")
    public WebElement Sign_in_button;

    @FindBy(id="admin-menu")
    public WebElement Admin_Menu;

    @FindBy(partialLinkText = "User management")
    public WebElement User_management;

    @FindBy(xpath = "//th[@class='hand'][2]")
    public WebElement Login;

    @FindBy(xpath="(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement Edit;

    @FindBy(xpath="//option[@value='ROLE_USER']")
    public WebElement ROLE_USER;

    @FindBy(xpath="//option[@value='ROLE_EMPLOYEE']")
    public WebElement ROLE_EMPLOYEE;

    @FindBy(xpath="//option[@value='ROLE_MANAGER']")
    public WebElement ROLE_MANAGER;

    @FindBy(xpath="//option[@value='ROLE_ADMIN']")
    public WebElement ROLE_ADMIN;

    @FindBy(xpath="//button[@class='btn btn-primary']")
    public WebElement Save;

    @FindBy(xpath="//button[@class='btn btn-success'][1]")
    public WebElement Activated_User;

    @FindBy(xpath="(//*[@type='button'])[2]")
    public WebElement Deactivated;

    @FindBy(xpath="//div[@class='Toastify__toast-body']")
    public WebElement Update_successfull;
    //<div role="alert" class="Toastify__toast-body">A user is updated with identifier 00001admin</div>

    @FindBy(xpath="(//a[@href='#'])[3]")
    public WebElement Menu_Sign_Out;

    @FindBy(xpath="//a[@href='/logout']")
    public WebElement Sign_Out;

    @FindBy(xpath="//a[@class='btn btn-info btn-sm']")
    public WebElement View_Button;

    @FindBy(id="lastName")
    public WebElement Last_Name;

    @FindBy(id="firstName")
    public WebElement First_Name;

    @FindBy(id="email")
    public WebElement Email;

    @FindBy(xpath ="//a[@class='btn btn-primary float-right jh-create-entity']")
    public WebElement Create_New_User;

    @FindBy(name="login")
    public WebElement Login_User_Name;

    @FindBy(xpath ="//span[text()='Created date']")
    public WebElement Created_date;

    @FindBy(xpath ="(//th[@class='hand'])[5]")
    public WebElement Created_Date;

    @FindBy(xpath ="//a[@class='btn btn-danger btn-sm'][1]")
    public WebElement Delete;

    @FindBy(xpath ="//span[@class='d-none d-md-inline']")
    public WebElement View;

    @FindBy(xpath ="(//span[.='Delete'])[41]")
    public WebElement Confirm_Delete;


    @FindBy(xpath ="//dl[@class='jh-entity-details']")
    public WebElement User_Details;

}
