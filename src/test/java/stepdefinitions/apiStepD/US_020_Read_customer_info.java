package stepdefinitions.apiStepD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigurationReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_020_Read_customer_info {
    Response response;
    JsonPath jsonPath;
    List<Map<String, Object>> allCustomers;


    @Given("User go to customers end point {string}")
    public void user_go_to_customers_end_point(String endpoint) {
        response = given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("token")).
                when().get(endpoint);
    }

    @Given("Get all information for customers as De-Serialization")
    public void get_all_information_for_customers_as_De_Serialization() {
        jsonPath = response.jsonPath();
        allCustomers = jsonPath.getList("$");
        }

    @Then("User validate {int} th customers info")
    public void user_validate_th_customers_info(Integer costumerS) {
        //String actualSSN = allCustomers.get(0).get("ssn").toString();
       // Assert.assertEquals("458-62-6584",actualSSN);
        List<String> actualSsnlist = new ArrayList<>();

        for (int i =0; i<allCustomers.size(); i++) {
            String actualSSN = allCustomers.get(i).get("ssn").toString();
            Assert.assertEquals("458-62-6584", actualSSN);
           // System.out.println(actualSSN);
            actualSsnlist.add(actualSSN);
        }

    }

}
