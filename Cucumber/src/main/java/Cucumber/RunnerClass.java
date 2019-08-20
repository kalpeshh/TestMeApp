package Cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "resources", glue = "Cucumber", monochrome = true, plugin = {
		"pretty", "json:target/cucumber.json" } , tags = {"@ProductScenario"}, dryRun = false)

public class RunnerClass extends AbstractTestNGCucumberTests {

}
