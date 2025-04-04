package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;

public class LoginPageSteps {
	
	
	LoginPage lp= new LoginPage();
	
	public By add_to_cart=By.xpath("(//button[text()='Add to cart'])");
	
	public By no_of_items=By.xpath("//span[text()='6']");
	
	public By cart_link = By.xpath("//a[@class='shopping_cart_link']");
	
	public By checkout = By.xpath("//button[@id='checkout']");
	
	public By fname= By.xpath("//input[@id='first-name']");
	
	public By lname= By.xpath("//input[@id='last-name']");
	public By postal_code= By.xpath("//input[@id='postal-code']");
	
	public By continuebtn = By.xpath("//input[@id='continue']");
	
	public By totalprice = By.xpath("//div[text()='129.94']");
	
	public By btn_finish = By.xpath("//button[@name='finish']");
	
	public By ord_confirm =  By.xpath("//h2[text()='Thank you for your order!']");
	
	public By back_to_home = By.xpath("//button[@name='back-to-products']");
	
	
	
	
	 @Given("user is on login page")
	 public void loginpage() throws InterruptedException
	 {
		 
		 lp.login_page();
		 
	 }
	 
	 @When("user enters username and password in respective fields box")
	 public void entertext() throws InterruptedException
	 {
		//lp.entercredentials("standard_user","secret_sauce");
		 lp.entercredentials("Admin","admin123");
				
	 }
	 
	 @SuppressWarnings("deprecation")
	@And("hits enter")
	 public void clickbutton() throws InterruptedException
	 {
		lp.clickonlogin();
	 }
	 
	 
	 @Then("user is navigated to products page")
	 public void user_is_navigated_to_products_page()
	 {
		 Assert.assertTrue(lp.isProductsPageDisplayed());
	 }
	 
	 
	 


//

//	 }
//
//	 @Then("user is on the shipping details page")
//	 public void user_is_on_the_shipping_details_page() {
//	     
//	 }
//
//	
//
//	 @Then("the user enters the firstname")
//	 public void the_user_enters_the_firstname() {
//	     
//	 }
//
//	 @Then("user enters the lastname")
//	 public void user_enters_the_lastname() {
//	     
//	 }
//
//	 @Then("user enters the Zip\\/Postal code")
//	 public void user_enters_the_zip_postal_code() {
//	     
//	 }
//
//	 @Then("user clicks on Continue button")
//	 public void user_clicks_on_continue_button() {
//	    
//	 }
//	 
//	 @Then("user is navigated to the Pricing details page")
//	 public void user_is_navigated_to_the_pricing_details_page() {
//	    
//	 }
//
//	 @Then("user is on the Pricing details page")
//	 public void user_is_on_the_pricing_details_page() {
//	     
//	 }
//
//	 
//
//	 @Given("user verifies the Payment Information is displayed")
//	 public void user_verifies_the_payment_information_is_displayed() {
//	    
//	 }
//
//	 @Then("user verifies the shipping information is displayed")
//	 public void user_verifies_the_shipping_information_is_displayed() {
//	    
//	 }
//
//	 @Then("user verifies the price total information is displayed")
//	 public void user_verifies_the_price_total_information_is_displayed() {
//	     
//	 }
//
//	 @Then("user clicks on Finish button")
//	 public void user_clicks_on_finish_button() {
//	    
//	 }
//	 
//	 @Then("user is navigated to the Order Confirmation page")
//	 public void user_is_navigated_to_the_order_confirmation_page() {
//	     
//	 }
//
//	 @Given("user is on the Order Confirmation page")
//	 public void user_is_on_the_order_confirmation_page() {
//	    
//	 }	 
//
//	 @Given("user verifies the msg {string} is displayed")
//	 public void user_verifies_the_msg_is_displayed(String string) {
//	     
//	 }
//


	 

}

