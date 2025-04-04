package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import pages.CheckoutPage;
import pages.LoginPage;

public class CheckoutPageSteps
{

	CheckoutPage Cp= new CheckoutPage();
	
	@Given("user is on the checkout page")
	 public void user_is_on_the_checkout_page() 
	{
		Cp.checkout();
	    
	 }
	
		
	@Then("the user clicks on checkout button")
	 public void the_user_clicks_on_checkout_button()
	{
	     Cp.clickonbtn();
	 }
	 
	 @Then("user is navigated to the shipping details page")
	 public void user_is_navigated_to_the_shipping_details_page() 
	 {
	     Assert.assertTrue(Cp.isShippingPageDisplyed());
	 }

}
