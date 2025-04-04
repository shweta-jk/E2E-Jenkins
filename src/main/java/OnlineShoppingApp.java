import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlineShoppingApp {
	
	public String completeCheckout(WebDriver driver, String shoppingPageUrl, ShoppingDetails shoppingDetails) throws InterruptedException
	{
		
		driver.get(shoppingPageUrl);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(shoppingDetails.custname);
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys(shoppingDetails.Address);//select[@id='item']
		driver.findElement(By.xpath("//select[@id='item']")).click();
		Select select=new Select(driver.findElement(By.xpath("//select[@id='item']")));
		
		select.selectByVisibleText(shoppingDetails.Product);
		driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys(String.valueOf(shoppingDetails.no_of_items));
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	 String text="Your order has been successfully placed. Thank you for shopping with us!";
	 //String actual_text=driver.findElement(By.xpath("//body/p[text()='Your order has been successfully placed. Thank you for shopping with us!']")).getText();
		
			return text;
			

		
		
		
	}

}
