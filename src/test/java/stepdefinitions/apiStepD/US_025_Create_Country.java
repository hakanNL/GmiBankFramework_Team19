package stepdefinitions.apiStepD;

import io.cucumber.java.en.And;
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

public class US_025_Create_Country {
    Response response;
    JsonPath jsonPath;
    Response responseCreate;
    Response responseDelete;
    static JsonPath createJson;
    List<Map<String, Object>> allCountriesList;

    @Given("1.Use api end point  {string}")
    public void useApiEndPoint(String endpoint) {
        response = given().
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

    @And("2.Get all customers' countries information as De-Serialization")
    public void getAllCustomersInformationAsDeSerialization() {
        jsonPath = response.jsonPath();
        allCountriesList = jsonPath.getList("$");
        System.out.println(allCountriesList.get(allCountriesList.size()-1));
        System.out.println("size :"+allCountriesList.size());//Butun country lerin sayisi
    }

    @And("3.Create a new country {string}")
    public void createANewCountry(String newCountry) {
        responseCreate=given().
                auth().
                oauth2(ConfigurationReader.getProperty("token")).
                contentType(ContentType.JSON).
                when().
                body("{\""+"name"+"\":\""+newCountry+"\"}").
                post("https://www.gmibank.com/api/tp-countries").
                then().
                assertThat().
                contentType(ContentType.JSON).
                statusCode(201).
                extract().
                response();
        responseCreate.prettyPrint();
        createJson=responseCreate.jsonPath();
        System.out.println("id : "+createJson.getString("id"));//olusturdugumuz country'nin id'si
    }

    @And("4.Validate the new country 1 by 1")
    public void validateTheNewCountryBy() {
        String newCountry="Switzerland";
        System.out.println(allCountriesList.get(allCountriesList.size()-1).get("name"));
        Assert.assertEquals(createJson.getString("name"), newCountry);
    }
}






