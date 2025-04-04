import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import onlineshopping.ShoppingDetails;

public class ShoppingMain {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
	
		String shoppingPageUrl="C:/Users/skulka18/Downloads/Online.html";
		WebDriverManager.chromedriver().setup();
		
	    
		 driver = new ChromeDriver();
		
		
		 ShoppingDetails phonedetails= new ShoppingDetails("Phone","#102 Radiant Karale","Kruti Kulkarni",2); 
		 
		 ShoppingDetails Laptopdetails= new ShoppingDetails("Laptop","#102 Radiant Karale","Kruti Kulkarni",6); 
		 
		OnlineShoppingApp oapp= new OnlineShoppingApp();
		String confmsg1=oapp.completeCheckout(driver, shoppingPageUrl, phonedetails);
		System.out.println(confmsg1);
		
		String confmsg=oapp.completeCheckout(driver, shoppingPageUrl, Laptopdetails);
		System.out.println(confmsg);
		Thread.sleep(5000);

		driver.quit();
	}
	

}
