package stepdefinitions.adminStepD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.employeePage.EmployeeNewAccountPage;
import utilities.ConfigurationReader;

public class AdminToManageCustomerStepD {

    EmployeeNewAccountPage employeeNewAccountPage = new EmployeeNewAccountPage ();

    @Given("the user_name enters")
    public void the_user_name_enters() {
        employeeNewAccountPage.username.sendKeys (ConfigurationReader.getProperty ("admin_username")+ Keys.ENTER);

    }

    @Given("the user_password enters")
    public void the_user_password_enters() {
        employeeNewAccountPage.password.sendKeys (ConfigurationReader.getProperty ("admin_password")+Keys.ENTER);
    }

    @Then("Manage  Customer is safe")
    public void manage_Customer_is_safe() throws InterruptedException {
        Thread.sleep (3000);
        employeeNewAccountPage.manageCustomers.click ();

    }

    @And("admin open the manage customer page")
    public void adminOpenTheManageCustomerPage() {
        Assert.assertTrue (employeeNewAccountPage.adminManageError.isDisplayed ());


    }
}
