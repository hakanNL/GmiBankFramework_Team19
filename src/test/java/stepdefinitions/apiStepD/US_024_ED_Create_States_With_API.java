package stepdefinitions.apiStepD;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigurationReader;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_024_ED_Create_States_With_API {

    Response response;
    JsonPath jsonPath;
    static JsonPath createJson;
    List<Map<String,Object>> allStatesList;

    @Given("User go to state end points {string}")
    public void user_go_to_state_end_points(String states) {
        Response responseCreate = given().
                auth().
                oauth2(ConfigurationReader.getProperty("token")).
                contentType(ContentType.JSON).
                when().
                body("{\"" + "name" + "\":\"" + "ccc" + "\"}").
                post("https://www.gmibank.com/api/tp-states").
                then().
                assertThat().
                contentType(ContentType.JSON).
      //          statusCode(201).
                extract().
                response();
        responseCreate.prettyPrint();
        createJson = responseCreate.jsonPath();
    }

        @Given("user checks that state has created")
        public void user_checks_that_state_has_created() {

            System.out.println(createJson.getString("id"));//olusturdugumuz states'in id'si
            Assert.assertEquals(createJson.getString("name"), "ccc");
        }
}
