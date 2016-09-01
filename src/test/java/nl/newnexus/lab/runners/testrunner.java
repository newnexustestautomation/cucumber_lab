package nl.newnexus.lab.runners;

/**
 * Created by robertvanbuiten on 01-09-16.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features/example.feature",
        glue = "uk.co.automatictester.jwebfwk.glue",
        format = {"pretty"})
public class testrunner extends AbstractTestNGCucumberTests {
}
