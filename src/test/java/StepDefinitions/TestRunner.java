package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features",
		glue="StepDefinitions",
		plugin= {"pretty",
				"json:target/cucumber.json","html:target/HtmlReports"},
				monochrome=true
			
		
		)



public class TestRunner {

}
