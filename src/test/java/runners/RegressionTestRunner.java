package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},

        features = "src/test/resources/features",
        glue = "stepdefinitions",
<<<<<<< HEAD
        tags = "@US10US12",
=======
        tags = "@gmibank",
>>>>>>> master
        dryRun = false
)

public class RegressionTestRunner {
}
