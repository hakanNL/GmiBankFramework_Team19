package stepdefinitions.adminStepD;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.employeePage.EmployeeNewAccountPage;

public class AdminCreateaNewAccount {
    EmployeeNewAccountPage employeeNewAccountPage = new EmployeeNewAccountPage ();
    @Then("Manage  Account is safe")
    public void manage_Account_is_safe() {
        employeeNewAccountPage.manageAccount.click ();
    }

    @Then("admin open the manage account page")
    public void admin_open_the_manage_account_page() {
        Assert.assertTrue (employeeNewAccountPage.adminManageError.isDisplayed ());
    }
}
