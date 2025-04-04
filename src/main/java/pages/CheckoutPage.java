package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.DriverManager;

public class CheckoutPage
{
	private WebDriver driver;
	
	
	public By checkout = By.xpath("//button[@id='checkout']");
	public By checkoutpage =By.xpath("//span[text()='Checkout: Your Information']");
	
	public CheckoutPage()
	{
		this.driver= DriverManager.getDriver();
	}

	public void checkout()
	{
		driver.get("https://www.saucedemo.com/cart.html");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void clickonbtn()
	{
		
		driver.findElement(checkout).click();
	}

	public boolean isShippingPageDisplyed() {
		if(driver.findElement(checkoutpage).isDisplayed())
		{return true;
		
		}else 
		return false;
	}
	
	
	
}
