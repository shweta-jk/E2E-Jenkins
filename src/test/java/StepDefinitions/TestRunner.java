package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features",
		glue="StepDefinitions",
		plugin= {"pretty",
				"json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml"},
				monochrome=true
			
		
		)



public class TestRunner {

}
