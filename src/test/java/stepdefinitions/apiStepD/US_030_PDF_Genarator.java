package stepdefinitions.apiStepD;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.UserManagement;
import utilities.ConfigurationReader;
import utilities.PdfGenerator;

import java.io.IOException;
import java.util.List;

import static io.restassured.RestAssured.*;
public class US_030_PDF_Genarator {

    Response response;
    @Given("send a GET request to REST API end point {string}")
    public void sendAGETRequestToRESTAPIEndPoint(String endPoint) {
        response = given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("token")).
                when().
                get(endPoint);
        response.prettyPrint();
    }
    @Given("HTTP Status Code should be {int} and contentType should be {string}")
    public void http_Status_Code_should_be_and_contentType_should_be_JSON(Integer statusCode, String contentType) {
        response.then().
                assertThat().
                statusCode(statusCode).
                contentType(contentType);
    }
    @Then("all users' info as Name, last name and role should had on a pdf document")
    public void all_users_info_as_Name_last_name_and_role_should_had_on_a_pdf_document() {
        //ObjectMapper obj = new ObjectMapper();
        //List<US30Pojo> allUserPojolist = obj.readValue(response.asString(), new TypeReference<List<US30Pojo>>())
        ObjectMapper objectMapper = new ObjectMapper();
        List<UserManagement> allUserPojoList = null;
        try {
            allUserPojoList = objectMapper.readValue(response.asString(), new TypeReference<List<UserManagement>> () {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        PdfGenerator.createTableWithPojo("AllUser.pdf", allUserPojoList);
    }
}



















