package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.DriverManager;



public class ProductsPage
{
	private WebDriver driver;
	
	public By add_to_cart=By.xpath("(//button[text()='Add to cart'])");
	
	public By no_of_items=By.xpath("//span[text()='6']");
	
	public By cart_link = By.xpath("//a[@class='shopping_cart_link']");
	
	public By your_cart = By.xpath("//span[text()='Your Cart']");
	
	public By checkout = By.xpath("//button[@id='checkout']");
	
	public ProductsPage()
	{
		this.driver= DriverManager.getDriver();
	}
		
	public void Producthomepage()
	{
		driver.get("https://www.saucedemo.com/inventory.html");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addtocart() 
	{
		driver.get("https://www.saucedemo.com/inventory.html");
		List<WebElement> items= driver.findElements(add_to_cart);
		  System.out.println(items.size());
		  
		  for(WebElement webele:items) 
		  {
			  webele.click();
		  }

		
	}
	
	
	public void addallitems()
	{
		  List<WebElement> items= driver.findElements(add_to_cart);
		  String noofitems=driver.findElement(no_of_items).getText(); int
		  noofitms=Integer.parseInt(noofitems); System.out.println(noofitems);
		  if(Integer.valueOf(noofitems)==items.size()) {
		  System.out.println("All the items are added to the cart"); }
		 
		
	}


	public void clickcart() 
	{
		
		driver.findElement(cart_link).click();
		
	}


	public boolean isYourcartDisplayed()
	{
		if(driver.findElement(your_cart).isDisplayed())
		{
			return true;
		}
		else 
			return false;
	}
	 

}
