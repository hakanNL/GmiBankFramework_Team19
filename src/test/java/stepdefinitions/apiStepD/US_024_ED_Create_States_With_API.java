package stepdefinitions.apiStepD;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigurationReader;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_024_ED_Create_States_With_API {

    Response response;
    JsonPath jsonPath;
    static JsonPath createJson;
    List<Map<String,Object>> allStatesList;

    @Given("go to end point {string}")
    public void go_to(String endpoint) {
        response=given().
                auth().
                oauth2(ConfigurationReader.getProperty("token")).
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                when().
                get(endpoint).
                then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                extract().
                response();
        response.prettyPrint();
    }
    @Given("user system should be all data response")
    public void user_system_should_be_all_data_response() {
        jsonPath=response.jsonPath();
        allStatesList=jsonPath.getList("$");
        System.out.println(allStatesList);
        System.out.println(allStatesList.size());//Butun state lerin sayisi
    }
    @Given("user created states")
    public void user_created_states() {
        Response responseCreate=given().
                auth().
                oauth2(ConfigurationReader.getProperty("token")).
                contentType(ContentType.JSON).
                when().
                body("{\""+"name"+"\":\""+"Aksam"+"\"}").
                post("https://www.gmibank.com/api/tp-states").
                then().
                assertThat().
                contentType(ContentType.JSON).
                statusCode(201).
                extract().
                response();
        responseCreate.prettyPrint();
        createJson=responseCreate.jsonPath();
        System.out.println(createJson.getString("id"));//olusturdugumuz states'in id'si
        Assert.assertEquals(createJson.getString("name"), "Aksam");
        Response responseCreate2=given().//Bu
                auth().
                oauth2(ConfigurationReader.getProperty("token")).
                contentType(ContentType.JSON).
                when().
                body("{\""+"name"+"\":\""+"Dun"+"\"}").
                post("https://www.gmibank.com/api/tp-states").
                then().
                contentType(ContentType.JSON).
                statusCode(201).
                extract().
                response();
        responseCreate2.prettyPrint();
    }
    @Given("user install all data")
    public void user_install_all_data() {
        System.out.println("===========================================");
        WriteToTxt.saveAllStates("allstatesdata.csv",allStatesList);
        List<String> read= ReadTxt.returnAllStates3("allstatesdata.csv");
        Assert.assertTrue(read.contains("Dun"));
    }
    @Given("user compare created data and install data and verify")
    public void user_compare_created_data_and_install_data_and_verify() {
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
    }
}