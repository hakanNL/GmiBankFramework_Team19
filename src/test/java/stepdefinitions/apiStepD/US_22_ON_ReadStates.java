package stepdefinitions.apiStepD;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigurationReader;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.*;

public class US_22_ON_ReadStates {
    Response response;
    JsonPath jsonPath;
    Response responseCreate;
    static JsonPath createJson;
    List<Map<String,Object>> allStatesList;

    @Given("User go to states end point {string}")
    public void user_go_to_states_end_point(String endpoint) {
      response= given().
                    auth().
                    oauth2(ConfigurationReader.getProperty("token")).
                    contentType(ContentType.JSON).
                    accept(ContentType.JSON).
                when().
                     get(endpoint);
    }

    @Given("User content type and status code verifies")
    public void user_content_type_and_status_code_verifies() {
      response.then().
                        assertThat().
                        statusCode(200).
                        contentType(ContentType.JSON).
                        extract().
                        response();
        //response.prettyPrint();
    }

    @Given("User does the deserilazition operation")
    public void user_does_the_deserilazition_operation() {
        jsonPath=response.jsonPath();
        allStatesList=jsonPath.getList("$");
        System.out.println(allStatesList);
        System.out.println(allStatesList.size());//Butun state lerin sayisi
    }

    @Given("User create one state and verifies")
    public void user_create_one_state_and_verifies() {
             responseCreate=given().
                                auth().
                                oauth2(ConfigurationReader.getProperty("token")).
                                contentType(ContentType.JSON).
                             when().
                                body("{\""+"name"+"\":\""+"DunyaHali"+"\"}").
                                post("https://www.gmibank.com/api/tp-states").
                             then().
                                assertThat().
                                contentType(ContentType.JSON).
                                statusCode(201).
                                extract().
                                response();

        responseCreate.prettyPrint();
    }
    //===========================TC_01==============================
    @Given("User gets all state data from the system and prints to .csv file")
    public void user_gets_all_state_data_from_the_system_and_prints_to_csv_file() {
       WriteToTxt.saveAllStates("allstatesdata.csv",allStatesList);

    }

    @Then("User reads the printed files and verifies that the data created is in the .csv file.")
    public void user_reads_the_printed_files_and_verifies_that_the_data_created_is_in_the_csv_file() {
        List<String> read= ReadTxt.returnAllStates3("allstatesdata.csv");

        Assert.assertTrue(read.contains("DunyaHali"));
    }
    //===========================TC_02==============================

    @Then("User verifies the state created {int} by {int}")
    public void user_verifies_the_state_created_by(Integer int1, Integer int2) {
        createJson=responseCreate.jsonPath();
        System.out.println(createJson.getString("id"));//olusturdugumuz states'in id'si

        Assert.assertEquals(createJson.getString("name"), "DunyaHali");
    }
}
/*
Response responseDelete=given().
                    auth().
                    oauth2(ConfigurationReader.getProperty("token")).
                    contentType(ContentType.JSON).
                    accept(ContentType.JSON).
                when().
                    delete("https://www.gmibank.com/api/tp-states/"+createJson.getString("id")).
                then().
                    assertThat().statusCode(204).
                    extract().
                    response();
        System.out.println("==============================");
        responseDelete.prettyPrint();
        System.out.println("==============================");
        //response.prettyPrint();
 */