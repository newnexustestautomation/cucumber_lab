package nl.newnexus.lab.runners;

/**
 * Created by robertvanbuiten on 01-09-16.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features/administrator.feature",
        tags = "@LAB",
        glue = "nl.newnexus.lab.adapters",
        format = {"pretty", "json:target/cucumber/cucumber.json"})
public class testrunner extends AbstractTestNGCucumberTests {
}
