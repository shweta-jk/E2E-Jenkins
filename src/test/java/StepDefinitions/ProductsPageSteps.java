package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import pages.ProductsPage;

public class ProductsPageSteps 
{
	ProductsPage Pp= new ProductsPage();
	
	 @Given("user is on products page")
	 public void user_is_on_products_page()
	 {
		 Pp.Producthomepage();
	     
	 }
	
	
	@Then("user adds the backpack to the cart")
	 public void user_adds_the_backpack_to_the_cart() {
		Pp.addtocart();
		
		 
	   
	 }
	 
	 
	 @Then("user verifies that all the items are added to the cart")
	 public void user_verifies_that_all_the_items_are_added_to_the_cart() {
			Pp.addallitems();
	 }
	 
	 @Then("user clicks on the cart symbol")
	 public void user_clicks_on_the_cart_symbol()
	 {
		 Pp.clickcart();
		 
		   
		}
	 
	 
	 @Then("user is navigated to checkout page")
	 public void user_is_navigated_to_checkout_page() 
	 {
	     
		 Assert.assertTrue(Pp.isYourcartDisplayed());
	 }
	 
	
	
	
}
