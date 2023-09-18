package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(  monochrome = true,
    features = "/Users/raashidshaikh/Desktop/QA/SeleniumWorkSpace/BDD/src/test/java/features",
    glue = {"stepdefinitions", "appHooks"},
    plugin = {"pretty"}
   
)

public class SuiteRunner {

}
