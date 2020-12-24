package stepdefinitions.apiStepD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.*;

public class US_021_read_all_countries {
    Response response;
    JsonPath jsonPath;

    @Given("User go to countries end point {string}")
    public void user_go_to_countries_end_point(String endpoint) {
        response = given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("token")).
                when().get(endpoint);

    }



}
