package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.ConfigReader;
import dev.failsafe.internal.util.Assert;
//import utils.DriverManager;
import drivers.DriverFactory;
import drivers.DriverManager;
import utils.WaitUtils;

public class LoginPage 
{
	private WebDriver driver;
//	
//	public By username= By.id("user-name");
//	
//	public By password= By.id("password");

public By username= By.name("username");
	
	public By password= By.name("password");
	public By login_btn=By.xpath("//button[text()=' Login ']");
	
	//public By login_btn=By.name("login-button");
	
	public By dashboard_page=By.xpath("//h6[text()='Dashboard']");
	
	
	public LoginPage()
	{
		this.driver= DriverManager.getDriver();
	}
	
	

	public void login_page() throws InterruptedException
	{
		/******** to select second search option*******/
//		driver.get("https://www.google.com/");
//		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ARROW_DOWN);
	
		
		WaitUtils.waitForVisibility(username);
		
	}

	public void entercredentials(String usname, String passwd)
	{
		  WebElement ele=driver.findElement(username);
			//ele.click();
			ele.sendKeys(usname);
			
			WebElement pwd= driver.findElement(password);
			pwd.click();
			pwd.sendKeys(passwd);
			
			
		
	}			
			public void clickonlogin() throws InterruptedException
			{

				WaitUtils.waitForVisibility(login_btn).sendKeys(Keys.ENTER);
												
				
				
				WaitUtils.waitForClickability(By.xpath("//button[@title='Leave List']")).click();
				WaitUtils.waitForClickability(By.xpath("(//div[@class='oxd-select-wrapper'])[2]//i")).click();
				WaitUtils.waitForClickability(By.xpath("(//div[@class='oxd-select-wrapper']//div[text()='-- Select --'])[2]")).click();
				
				
				/* if the dom is not available and on click the element appears in dom pls use keyboard actions like below to handle dropdown values*/
				Actions action= new Actions(driver);
				action.sendKeys(Keys.ARROW_DOWN).pause(50).sendKeys(Keys.ARROW_DOWN).pause(50).sendKeys(Keys.ENTER).perform();
				
				WaitUtils.waitForClickability(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).click();
				
				WebElement cal = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
								
				cal.sendKeys(Keys.CONTROL,"a");
				cal.sendKeys(Keys.DELETE);
				cal.sendKeys("2025-10-04");
				
				
				WaitUtils.waitForClickability(By.xpath("(//label[text()='To Date']/parent::div/following::div/child::div/input)[1]")).click();
				WebElement cal1 = driver.findElement(By.xpath("(//label[text()='To Date']/parent::div/following::div/child::div/input)[1]"));
				
				cal1.sendKeys(Keys.CONTROL,"a");
				cal1.sendKeys(Keys.DELETE);
				cal1.sendKeys("2025-14-04");
				
				
				WebElement Leave = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
				Leave.click();
				action.sendKeys(Keys.ARROW_DOWN).pause(50).sendKeys(Keys.ARROW_DOWN).pause(50).sendKeys(Keys.ARROW_DOWN).pause(50).sendKeys(Keys.ENTER).perform();
				
				WebElement leavetype = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
				leavetype.click();
				action.sendKeys(Keys.ARROW_DOWN).pause(500).sendKeys(Keys.ARROW_DOWN).pause(500).sendKeys(Keys.ARROW_DOWN).pause(500).pause(500).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
				
				WebElement leavetyp=driver.findElement(By.xpath("//span[text()='Pending Approval ']"));
				
				if(leavetyp.isDisplayed())
				{
					System.out.println("The leave type is displayed");
				}
				
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
			}				
				
				
				


			

	public boolean isDashboardVisible() {
		WaitUtils.waitForTextToBePresent(dashboard_page,"Dashboard");
		if(driver.findElement(dashboard_page).isDisplayed())
		{
		return true;
		}
		else
			return false;
		
	}

}
