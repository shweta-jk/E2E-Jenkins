package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverManager;

public class Hooks {
	
	@Before
	public void setUP()
	{
		DriverManager.initializeDriver();
	}
	
	@After
	public void tearDown()
	{
		DriverManager.quitDriver();
	}

}
