package stepdefinitions.apiStepD;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigurationReader;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.given;
public class US_026_UpdateCountries {
    Response response;
    JsonPath jsonPath;
    Response responseCreate;
    static JsonPath createJson;
    List<Map<String,Object>> allCountriesList;

    @Given("User go to end point {string}")
    public void user_go_to_end_point(String endpointcountry) {
        response= given().
                auth().
                oauth2(ConfigurationReader.getProperty("token")).
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                when().
                get(endpointcountry);

    }
    @Given("User must verify content type and status code")
    public void user_must_verify_content_type_and_status_code() {
        response.then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                extract().
                response();
       // response.prettyPrint();

    }
    @Given("Get all information for all countries as De-Serialization")
    public void get_all_information_for_all_countries_as_De_Serialization() {
        jsonPath=response.jsonPath();
        allCountriesList=jsonPath.getList("$");
        System.out.println(allCountriesList);
        System.out.println(allCountriesList.size());
    }
    @Given("User create one country and verify it")
    public void user_create_one_country_and_verify_it() {
        responseCreate=given().
                auth().
                oauth2(ConfigurationReader.getProperty("token")).
                contentType(ContentType.JSON).
                when().
                body("{\""+"name"+"\":\""+"Dunya"+"\"}").
                post("https://www.gmibank.com/api/tp-countries").
                then().
                assertThat().
                contentType(ContentType.JSON).
                statusCode(201).
                extract().
                response();
    }
    @Given("User gets all countries data from the system and prints to .csv file")
    public void user_gets_all_countries_data_from_the_system_and_prints_to_csv_file() {
        WriteToTxt.saveAllStates("allcountrydata.csv",allCountriesList);
    }
    @Then("User read the printed files and verifies that the data created is in the .csv file.")
    public void user_read_the_printed_files_and_verifies_that_the_data_created_is_in_the_csv_file() {
        List<String> read= ReadTxt.returnAllStates3("allcountrydata.csv");
        Assert.assertTrue(read.contains("Dunya"));
    }
    @Given("User gets one country that just created")
    public void user_gets_one_country_that_just_created() {
        createJson=responseCreate.jsonPath();
        System.out.println(createJson.getString("id"));

        Assert.assertEquals(createJson.getString("name"), "Dunya");
    }

    @Then("User update these countries and verify it")
    public void user_update_these_countries_and_verify_it() {
        Map<String, Object> reqBody = new HashMap<String, Object>();
        reqBody.put("id",62136);
        reqBody.put("name", "absurt");
        reqBody.put("states", null);

        Response responseUpdate=given().
                accept(ContentType.JSON).
                auth().basic("Employee9", "Employee9").
                auth().oauth2(ConfigurationReader.getProperty("token")).
                contentType(ContentType.JSON).
                body(reqBody).
                when().
                put("https://www.gmibank.com/api/tp-countries/");
        //responseUpdate.prettyPrint();
        responseUpdate.
                then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON);
        Response response3= given().
                auth().
                oauth2(ConfigurationReader.getProperty("token")).
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                when().
                get("https://www.gmibank.com/api/tp-countries/");

        //response3.prettyPrint();
        response.prettyPrint();
    }



}