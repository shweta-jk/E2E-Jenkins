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

import dev.failsafe.internal.util.Assert;
import utils.DriverManager;

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
	
	public By prod_page=By.xpath("//span[text()='Products']");
	
	
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
//		Thread.sleep(10000);
//		String text=driver.findElement(By.xpath("//textarea[@id='APjFqb']")).getText();
//		System.out.println(text);
//		
//		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
		//Thread.sleep(10000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		List<WebElement> weblist= driver.findElements(By.xpath("(//a[@class='oxd-main-menu-item'])"));
		
		for(WebElement s : weblist)
		{
			System.out.println(s.getText());
		}
		
		
		
		
//		driver.get("https://www.saucedemo.com/");
//		String title=driver.getTitle();
//
//		System.out.println("The title is :"  +title);
//
//
		Thread.sleep(5000);
	}

	public void entercredentials(String usname, String passwd)
	{
		  WebElement ele=driver.findElement(username);
			ele.click();
			ele.sendKeys(usname);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebElement pwd= driver.findElement(password);
			pwd.click();
			pwd.sendKeys(passwd);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}			
			public void clickonlogin() throws InterruptedException
			{


				WebElement ele1= driver.findElement(login_btn);
				ele1.sendKeys(Keys.ENTER);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				Thread.sleep(5000);
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				//js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//button[@title='Leave List']")));	
				driver.findElement(By.xpath("//button[@title='Leave List']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper'])[2]//i")).click();
				Thread.sleep(5000);
				WebElement ele11=driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']//div[text()='-- Select --'])[2]"));
				ele11.click();
				ele11.click();
				Thread.sleep(5000);
				/* if the dom is not available and on click the element appears in dom pls use keyboard actions like below to handle dropdown values*/
				Actions action= new Actions(driver);
				action.sendKeys(Keys.ARROW_DOWN).pause(500).sendKeys(Keys.ARROW_DOWN).pause(500).sendKeys(Keys.ENTER).perform();
				
				/* Handle calendar input*/
				WebElement cal = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
				wait.until(ExpectedConditions.elementToBeClickable(cal));
				
				
				cal.sendKeys(Keys.CONTROL,"a");
				cal.sendKeys(Keys.DELETE);
				Thread.sleep(5000);
				
				
				cal.sendKeys("2025-10-04");
				Thread.sleep(10000);
				
				
				WebElement cal1 = driver.findElement(By.xpath("(//label[text()='To Date']/parent::div/following::div/child::div/input)[1]"));
				
				cal1.sendKeys(Keys.CONTROL,"a");
				cal1.sendKeys(Keys.DELETE);
				Thread.sleep(5000);
				
				
				cal1.sendKeys("2025-14-04");
				Thread.sleep(5000);
				
				WebElement Leave = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));
				Leave.click();
				action.sendKeys(Keys.ARROW_DOWN).pause(500).sendKeys(Keys.ARROW_DOWN).pause(500).sendKeys(Keys.ARROW_DOWN).pause(500).sendKeys(Keys.ENTER).perform();
				Thread.sleep(5000);
				WebElement leavetype = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
				leavetype.click();
				action.sendKeys(Keys.ARROW_DOWN).pause(500).sendKeys(Keys.ARROW_DOWN).pause(500).sendKeys(Keys.ARROW_DOWN).pause(500).pause(500).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
				Thread.sleep(5000);
				WebElement leavetyp=driver.findElement(By.xpath("//span[text()='Pending Approval ']"));
				
				if(leavetyp.isDisplayed())
				{
					System.out.println("The leave type is displayed");
				}
				
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(5000);
			}				
				
				
				


			

	public boolean isProductsPageDisplayed() {
		if(driver.findElement(prod_page).isDisplayed())
		{
		return true;
		}
		else
			return false;
		
	}

}
