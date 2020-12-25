package stepdefinitions.operationForAdminStepD;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.adminPage.US_17_SO_Page;
import utilities.Driver;
import utilities.ReusableMethods;
import com.github.javafaker.Faker;

import java.util.List;
public class US_17_SO_StepD {
    US_17_SO_Page page = new US_17_SO_Page();
    Faker faker = new Faker();

    //@US_17_TC_0001_User
    @Given("Type the name of the valid admin {string} in the Username box.")
    public void type_the_name_of_the_valid_admin_in_the_Username_box(String username) {
       page.Username.sendKeys(username);
    }

    @Given("Type the current password in the password1 {string} box.")
    public void type_the_current_password_in_the_password1_box(String password) {
        page.Password.sendKeys(password + Keys.ENTER);
    }

    @Given("Click on the Adminisration button")
    public void click_on_the_Adminisration_button() {
        page.Admin_Menu.click();
    }

    @Given("Click on the User management button")
    public void click_on_the_User_management_button() {
        page.User_management.click();
    }

    @Given("Click on once the Login button")
    public void click_on_once_the_Login_button() {
        ReusableMethods.wait(1);
        page.Login.click();
    }
    @Given("Click on once the Edit button")
    public void click_on_once_the_Edit_button() {
        ReusableMethods.wait(2);
        page.Edit.click();
    }

    @Given("Select Profiles as User")
    public void select_Profiles_as_User() {
        ReusableMethods.wait(2);
        page.ROLE_USER.click();
    }

    @Given("Click on once the Save button")
    public void click_on_once_the_Save_button() {
        page.Save.click();
    }

    @Given("Click on the Activate button for first User")
    public void click_on_the_Activate_button_for_first_User() {
        ReusableMethods.wait(5);
        page.Activated_User.click();
    }

    @Given("It should be checked that {string} is displayed.\"")
    public void it_should_be_checked_that_is_displayed(String string) {
        ReusableMethods.wait(2);
        System.out.println(page.Update_successfull.getText());
        ReusableMethods.verifyElementDisplayed(page.Update_successfull);
        //Assert.assertEquals(string, page.Transfer_successfull.getText());

    }

    @Given("Click on twice the Login button")
    public void click_on_twice_the_Login_button() {
        ReusableMethods.wait(5);
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(page.Login);
           }

    @Then("Click on the Deactivate button for first User")
    public void click_on_the_Deactivate_button_for_first_User() {
        ReusableMethods.wait(2);
        page.Deactivated.click();
        ReusableMethods.wait(1);
        page.Menu_Sign_Out.click();
        ReusableMethods.wait(1);
        page.Sign_Out.click();

       }
       //@US_17_TC_0002_User

       @Given("Click on the Activate button for first Employee")
       public void click_on_the_Activate_button_for_first_Employee() {

       }
    @Given("Select Profiles as Employee")
    public void select_Profiles_as_Employee() {
        ReusableMethods.wait(1);
        page.ROLE_EMPLOYEE.click();
    }

    //@US_17_TC_0003_User
    @Given("Select Profiles as Manager")
    public void select_Profiles_as_Manager() {
        ReusableMethods.wait(1);
      page.ROLE_MANAGER.click();
    }

    @Given("Click on the Activate button for first Manager")
    public void click_on_the_Activate_button_for_first_Manager() {
    }

    //@US_17_TC_0004_User
    @Given("Select Profiles as Admin")
    public void select_Profiles_as_Admin() {
        ReusableMethods.wait(1);
        page.ROLE_ADMIN.click();
    }

    @Given("Click on the Activate button for first Admin")
    public void click_on_the_Activate_button_for_first_Admin() {
    }

    //@US_17_TC_0005_User
    @Given("Click on the View button for first User")
    public void click_on_the_View_button_for_first_User() {
        page.View.click();
    }

    @Then("It should be checked that All user info is displayed.")
    public void it_should_be_checked_that_All_user_info_is_displayed() {
        Assert.assertTrue(page.User_Details.isDisplayed());

        ReusableMethods.wait(1);
        page.Menu_Sign_Out.click();
        ReusableMethods.wait(1);
        page.Sign_Out.click();
    }

    //@US_17_TC_0006_User
    @Given("Click on the Edit button for first User")
    public void click_on_the_Edit_button_for_first_User() {
        page.Edit.click();
      }

    @Given("Change the {string} in the First name box.")
    public void change_the_in_the_First_name_box(String string) {
        ReusableMethods.wait(1);
        page.First_Name.clear();
        ReusableMethods.wait(1);
        page.First_Name.sendKeys(string);
    }

    @Given("Change the {string} in the Last name box.")
    public void change_the_in_the_Last_name_box(String lastname) {
        page.Last_Name.clear();
        ReusableMethods.wait(1);
        page.Last_Name.sendKeys(lastname);
    }

    @Given("Change the {string} in the Email box.")
    public void change_the_in_the_Email_box(String email) {
        page.Email.clear();
        ReusableMethods.wait(1);
        page.Email.sendKeys(email);
        ReusableMethods.wait(1);
    }

    @Given("Click on the Save button")
    public void click_on_the_Save_button() {
        page.Save.click();

        ReusableMethods.wait(1);
        page.Menu_Sign_Out.click();
        ReusableMethods.wait(1);
        page.Sign_Out.click();

    }

    //@US_17_TC_0007_User
    @Given("Click on the Create a new user button")
    public void click_on_the_Create_a_new_user_button() {
        page.Create_New_User.click();
    }

    @Given("Type the new username in the Login box.")
    public void type_the_new_username_in_the_Login_box() {
        page.Login_User_Name.sendKeys(faker.name().username());
    }

    @Given("Type the First name in the First name box.")
    public void type_the_First_name_in_the_First_name_box() {
        page.First_Name.sendKeys(faker.name().firstName());
    }

    @Given("Type the Last name in the Last name box.")
    public void type_the_Last_name_in_the_Last_name_box() {
        page.Last_Name.sendKeys(faker.name().lastName());
    }

    @Given("Type the Email in the Email box.")
    public void type_the_Email_in_the_Email_box() {
        page.Email.sendKeys(faker.internet().emailAddress());
    }
    @Given("Select the Profile as {string} in the Profiles box.")
    public void select_the_Profile_as_in_the_Profiles_box(String string) {
        page.ROLE_EMPLOYEE.click();
        ReusableMethods.wait(2);
        page.Save.click();

    }

    @Given("Click on the Created date button")
    public void click_on_the_Created_date_button() {
        ReusableMethods.wait(6);
        page.Created_date.click();
    }

    @Given("Click on the Delete button for first User")
    public void click_on_the_Delete_button_for_first_User() {
        ReusableMethods.wait(3);
        page.Delete.click();
    }

    @Given("Confirm delete operation")
    public void confirm_delete_operation() {
        ReusableMethods.wait(2);
        page.Confirm_Delete.click();

        ReusableMethods.wait(1);
        page.Menu_Sign_Out.click();
        ReusableMethods.wait(1);
        page.Sign_Out.click();
    }

}
