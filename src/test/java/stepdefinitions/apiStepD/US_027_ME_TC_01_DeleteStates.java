package stepdefinitions.apiStepD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.ConfigurationReader;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class US_027_ME_TC_01_DeleteStates {

    Response response;
    JsonPath jsonPath;

    @Given("User go to end point {string}")
    public void user_go_to_end_point(String endPoint) {
        response = given().
                                 accept(ContentType.JSON).
                                 auth().
                                 oauth2(ConfigurationReader.getProperty("token")).
                            when().get(endPoint);
       response.prettyPrint();


    }

    @Then("Get all information for {string} as De-Serialization")
    public void get_all_information_for_as_De_Serialization(String string) {
        jsonPath = response.jsonPath();
        List<Map<String,Object>> allState = jsonPath.getList("$");
        System.out.println(allState);
        System.out.println(allState.get(0));

    }

    @Then("User can delete just created states")
    public void user_can_delete_just_created_states() {

    }

    @Then("Assert to delete")
    public void assert_to_delete() {

    }


}
