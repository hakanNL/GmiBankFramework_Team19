package stepdefinitions.apiStepD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigurationReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class US_027_ME_DeleteStates {
    Response response ;
    Response responseNewState;
    Response responseNewStateDelete;
    JsonPath json;
    JsonPath createJson;
    List<Map<String,Object>> allState;
    JsonPath jsonNewAllState;

    @Given("User read all state at the endpoint {string}")
    public void user_read_all_state_at_the_endpoint(String stateEndpoint) {
        response = given().
                            accept(ContentType.JSON).
                            auth().
                            oauth2(ConfigurationReader.getProperty("token")).
                            when().
                            get(stateEndpoint);
       // response.prettyPrint();

        response.then().assertThat().statusCode(200).contentType(ContentType.JSON);
    }

    @Given("Get all information of state as De_Serilization")
    public void get_all_information_of_state_as_De_Serilization() {
        json = response.jsonPath();
        allState = json.getList("$");
        System.out.println(allState);
        System.out.println(json.getList("$"));
        System.out.println(json.getList("$").size());
    }

    @Given("Create states and validation")
    public void create_states() {
        Map<String,Object> newState1 = new HashMap<>();

        newState1.put("name","Stendal");

        System.out.println(newState1);

        responseNewState = given().
                               contentType(ContentType.JSON).
                               auth().
                               oauth2(ConfigurationReader.getProperty("token")).
                               body(newState1).
                           when().
                               post("https://www.gmibank.com/api/tp-states").
                               then().
                               assertThat().
                               statusCode(201).
                               contentType(ContentType.JSON).
                               extract().response();
        responseNewState.prettyPrint();
        createJson = responseNewState.jsonPath();
        System.out.println("New states id : " + createJson.getString("id"));
       // System.out.println(json.getString("id"));

        //Assertion yapmak için end pointteki dataların son halini alıyoruz.
        Response responseNewAll = given().
                                      accept(ContentType.JSON).
                                      auth().
                                      oauth2(ConfigurationReader.getProperty("token")).
                                  when().
                                      get("https://www.gmibank.com/api/tp-states");
        jsonNewAllState = responseNewAll.jsonPath();
        Assert.assertTrue(jsonNewAllState.getString("id").contains(createJson.getString("id")));
    }

    @Then("Delete state we created and Assert deletion")
    public void delete_state_we_created_and_Assert_deletion() {

        responseNewStateDelete = given().
                                       auth().
                                       oauth2(ConfigurationReader.getProperty("token")).
                                       contentType(ContentType.JSON).
                                       accept(ContentType.JSON).
                                 when().
                                       delete("https://www.gmibank.com/api/tp-states/" + createJson.getString("id")).
                                       then().
                                       assertThat().
                                       statusCode(204).
                                       extract().response();

    }
}
