package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources/features/bestbuyapi/GetScenario.feature",
		glue="product.bestbuyapi.stepdefs",
		//dryRun = true,
		monochrome = true
		
		//plugin = ""
		
		
		
		)

public class Runner {

}
