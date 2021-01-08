package stepdefinitions.apiStepD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import org.testng.Assert;
import org.junit.Assert;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.ArrayList;
import java.util.List;

public class US_29_SD {

    List<Object> allcustomerName;
    List<Object> allcountryName;
    List<Object> allstateName;
    List<String> allCustomerFromCVS;

    @Given("user create connection with using {string} , {string} and {string}")
    public void userCreateConnectionWithUsingAnd(String url, String username, String pasword) {

        DatabaseUtility.createConnection();

    }

    @Given("user gets all customer column data using {string} and {string}")
    public void userGetsAllCustomerColumnDataUsingAnd(String query, String columnName) {

        allcustomerName = DatabaseUtility.getColumnData(query, columnName);
        //System.out.println(allcustomerName);
        System.out.println ("All customer name from DB :" + allcustomerName);

    }

    @And("user sets all customer info to correspondedd files")
    public void userSetsAllCustomerInfoToCorrespondedFiles() {

       //WriteToTxt.saveAllCustomerDateBase("countryNamesDB.cvs",allcustomerName);
       // WriteToTxt.saveAllCustomerDateBase("allCustomerFromDB.cvs",allcustomerName);

    }

    @Then("user validates all db customer info")
    public void userValidatesAllDbCustomerInfo() {
        // Asseretion with you created from CVS DB file

    //    allCustomerFromCVS = ReadTxt.returnCountryName("allCustomerFromDB.cvs");
    //    System.out.println("From CVS Size:" + allCustomerFromCVS.size()+ " = " + allCustomerFromCVS);
    //    Assert.assertTrue("The names are not matching", allcustomerName.containsAll(allCustomerFromCVS));

        // Asseretion with you created in Selenium

        List<Object> allCustomer = new ArrayList<>();
        allCustomer.add("Bek");
        allCustomer.add("Ulutürk");
        allCustomer.add("Ekici");
        allCustomer.add("ramazan");
        allCustomer.add("tanza");

        System.out.println("Our customer name :" + allCustomer);

        Assert.assertTrue("The names are not matching", allcustomerName.containsAll(allCustomer));


    }

    @Given("user gets all countries info using {string} and {string}")
    public void userGetsAllCountriesInfoUsingAnd(String query, String colunmName) {

        allcountryName = DatabaseUtility.getColumnData(query, colunmName);
        System.out.println("All country names from DB :" +allcountryName);

    }

    @Then("user validates all db countries info")
    public void userValidatesAllDbCountriesInfo() {

        List<Object> ourCountry = new ArrayList<>();
        ourCountry.add("HIMALAYALAYA");
        ourCountry.add("Finland");
        ourCountry.add("ITALY");

        System.out.println("Our country names :" + ourCountry);

        Assert.assertTrue("The country names are not matching", allcountryName.containsAll(ourCountry));

    }

    @Given("user gets all states info using {string} and {string}")
    public void userGetsAllStatesInfoUsingAnd(String query, String colunmName) {

        allstateName = DatabaseUtility.getColumnData(query, colunmName);
        System.out.println("All state names from DB :"+allstateName);

    }

    @Then("user validates all db states info")
    public void userValidatesAllDbStatesInfo() {

        List<Object> ourState = new ArrayList<>();
        ourState.add("DunyaHali");
        ourState.add("Stendal");
        ourState.add("Helsinki");
        ourState.add("Malatya44");

        System.out.println("Our states names :"+ourState);

        Assert.assertTrue("The state names are not matching", allstateName.containsAll(ourState));
    }
}
