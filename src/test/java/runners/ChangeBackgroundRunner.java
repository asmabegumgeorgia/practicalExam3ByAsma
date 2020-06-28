package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features", 
		glue = {"steps" },
		
		dryRun = false, 
		monochrome = true, 
		plugin = { 
				"pretty", 
				"html:test-output",
				"json:target/cucumber.json"})

public class ChangeBackgroundRunner {

}
