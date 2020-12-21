package stepdefinitions.apiStepD;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigurationReader;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class US_026_UpdateCountries {

    Response response;
    JsonPath jsonPath;

    @Given("User go to end point {string}")
    public void user_go_to_end_point(String endpoint) {
        response = given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("token")).
                when().get(endpoint);

        //response.prettyPrint();

    }

    @Then("Get all information for {string} as De-Serialization")
    public void get_all_information_for_as_De_Serialization(String string) {

       jsonPath = response.jsonPath();

       List<Map<String,Object>> allCountries = jsonPath.getList("$");
       //for (int i=0; i<allCountries.size(); i++){

          // System.out.println(allCountries.get(i).get("name"));

       }


    @Then("User")
    public void user() {

    }
}
