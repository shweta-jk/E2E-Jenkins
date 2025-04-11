#Author: your.email@your.domain.com
Feature: Title of your feature
  I want to use this template for my feature file

  #@tag1
  #Scenario: Sauce labs login is working
  #Background: 
    #Given user is on login page
    #When user enters username and password in respective fields box
    #And hits enter
    #Then user is navigated to products page

  @tag1
  Scenario: Sauce labs add products to the cart
  	Given user is on login page
    When user enters username and password in respective fields box
    And hits enter
  #	
    #Given user is on products page
    #And user adds the backpack to the cart
    #Then user verifies that all the items are added to the cart
    #And user clicks on the cart symbol
    #Then user is navigated to checkout page
    #Given user is on the checkout page
    #Then the user clicks on checkout button
    #And user is navigated to the shipping details page
#
  #@tag4
  #Scenario: The user is able to input the shipping details
    #Given user is on the shipping details page
    #Then the user enters the firstname
    #And user enters the lastname
    #And user enters the Zip/Postal code
    #Then user clicks on Continue button
    #And user is navigated to the Pricing details page
#
  #@tag5
  #Scenario: The user is able to verify the pricing details
    #Given user is on the Pricing details page
    #And user verifies the Payment Information is displayed
    #Then user verifies the shipping information is displayed
    #And user verifies the price total information is displayed
    #Then user clicks on Finish button
    #And user is navigated to the Order Confirmation page
#
  #@tag6
  #Scenario: The user verifies the order confirmation msg
    #Given user is on the Order Confirmation page
    #And user verifies the msg "Thank you for your order!" is displayed
