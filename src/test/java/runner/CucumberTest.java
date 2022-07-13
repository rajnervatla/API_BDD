package runner;

/*
* 8. Tags: for grouping of the tests
* Not: tag{"~@reg"} 
* And: tag{"@reg","@smoke"}
* or:  tag{"@reg,@smoke"}
* */

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {
				"/src/test/resources/features/APIHealthCheck.feature" },
		glue = "product.bestbuyapi.stepdefs",
		plugin = {"com.avenstack.extentreports.cucumber.adapters.ExtentCucumberAdapter:" }, 
		dryRun = false

)
public class CucumberTest {

}
