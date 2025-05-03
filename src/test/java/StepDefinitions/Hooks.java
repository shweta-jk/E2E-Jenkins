package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
//import utils.DriverManager;
import drivers.DriverManager;
import config.ConfigReader;
import drivers.DriverFactory;

public class Hooks {
	
	@Before
	public void setUP()
	{
		//DriverManager.initDriver();
		 DriverManager.initDriver(ConfigReader.get("browser"));
	        DriverManager.getDriver().get(ConfigReader.get("baseUrl"));
	}
	
	@After
	public void tearDown()
	{
		DriverManager.quitDriver();
	}

}
