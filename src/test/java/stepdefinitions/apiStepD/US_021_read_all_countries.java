package stepdefinitions.apiStepD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.ConfigurationReader;
import org.junit.Assert;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class US_021_read_all_countries {
    Response response;
    JsonPath jsonPath;
    List<Map<String,Object>>  allCountry;
    @Given("User go to countries end point {string}")

    public void user_go_to_countries_end_point(String countryEndpoint) {
        response=
                given()
                .accept(ContentType.JSON)
                .auth()
                .oauth2(ConfigurationReader.getProperty("token"))
                .when()
                .get(countryEndpoint);
        response.prettyPrint();
    }
    @Given("Get all information for countries as De-Serialization")
    public void get_all_information_for_countries_as_De_Serialization() {
        JsonPath json=response.jsonPath();
         allCountry=json.getList("$");
        System.out.println(allCountry);
    }
    @Then("User validate {int} th countries info")
    public void user_validate_th_countries_info(Integer int1) {
    String expectedCountry="New Mexico";
        Assert.assertEquals(expectedCountry,allCountry.get(6).get("name"));
    }

}
