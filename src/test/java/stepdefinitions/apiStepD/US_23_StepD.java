package stepdefinitions.apiStepD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigurationReader;
import utilities.ReadTxt;
import utilities.WriteToTxt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class US_23_StepD {

    Response response;
    JsonPath jsonPath;
    List<Map<String,Object>> allApplicantList;
    List<String> team19LastNameList;

    @Given("user go to end point {string}")
    public void userGoToEndPoint(String endpoint) {

        response = given()
                .accept(ContentType.JSON)
                .auth()
                .oauth2(ConfigurationReader.getProperty("token"))
                    .when()
                .get(endpoint)
                    .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

    }

    @Then("Get all applicants' info as De-serialization")
    public void getAllApplicantsInfoAsDeSerialization() {
        jsonPath=response.jsonPath();
        allApplicantList=jsonPath.getList("$");

    }

    @And("Read all applicants")
    public void readAllApplicants() {
       //System.out.println(allApplicantList);

    }

    @And("User saves the all applicants' SSN to files")
    public void userSavesTheAllApplicantsToFiles() {

        WriteToTxt.saveAllSSN("allApplicants.csv", allApplicantList);

    }

    @And("verify is there are all applicant's from team{int}")
    public void verifyIsThereAreAllApplicantSFromTeam(int arg0) {

        team19LastNameList = new ArrayList<>();
        team19LastNameList.add("Ulutürk");
        team19LastNameList.add("Ekici");
        team19LastNameList.add("Bek");
        List<String> list = ReadTxt.returnCountryName("allApplicants.csv");
        Assert.assertTrue(list.containsAll(team19LastNameList));


      /*   List<String> allCustomer = Collections.singletonList(jsonPath.getString("lastName"));
        System.out.println(allCustomer);
        //Assert.assertTrue("There are not matching", allCustomer.containsAll(team19LastNameList));
        Assert.assertTrue(jsonPath.getString("lastName").contains("Ulutürk") && jsonPath.getString("lastName").contains("Ekici"));

       for (int j=0; j< team19LastNameList.size(); j++) {
            for (int i = 0; i < allCustomer.size(); i++) {
            if (team19LastNameList.get(j).equals(allCustomer.get(i))) ;
            }
        } System.out.println("All same");*/
    }
}
