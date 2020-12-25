package pages.customerPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_015_SO_Page {
    public US_015_SO_Page() {
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

    @FindBy(id="entity-menu")
    public WebElement My_Operations;

    @FindBy(partialLinkText = "My Accounts")
     public WebElement My_Accounts;

    @FindBy(xpath="//button[@type='button']")
    public WebElement View_Transaction;

    @FindBy(xpath="(//*[@type='button'])[2]")
    public WebElement View_Transaction1;

    @FindBy(xpath="//tr/td[2]")
    public WebElement Account_Type_1;

    @FindBy(xpath="//tr/td[3]")
    public WebElement Account_Balance_1;

    @FindBy(xpath="//tr[2]/td[2]")
    public WebElement Account_Type_2;

    @FindBy(xpath="//tr[2]/td[3]")
    public WebElement Account_Balance_2;

    @FindBy(xpath="(//tbody/tr)[3]")
    public WebElement Account_Info_1;

    @FindBy(xpath="(//button[@class='btn btn-success btn-sm'])[2]")
    public WebElement View_Transaction2;

    @FindBy(xpath="(//tbody/tr)[3]")
    public WebElement Account_Info_2;



    @FindBy(partialLinkText = "Transfer Money")
    public WebElement Transfer_Money;

    @FindBy(id="fromAccountId")
    public WebElement From_Account;

    @FindBy(id="toAccountId")
    public WebElement To_Account;

    @FindBy(id="balance")
    public WebElement Balance;

    @FindBy(id="description")
    public WebElement Description;

    @FindBy(id="make-transfer")
    public WebElement Make_Transfer_Buton;

    @FindBy(xpath="//div[@class='Toastify__toast-body']")
    public WebElement Transfer_successfull;
}
