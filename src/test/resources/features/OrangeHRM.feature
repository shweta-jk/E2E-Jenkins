#Author: your.email@your.domain.com
Feature: Title of your feature
  I want to use this template for my feature file

 
 
  Background: 
    Given user is on login page
    When user enters username and password in respective fields box
    And hits enter
    Then user is navigated to Dashboard page

  	@tag1
  	Scenario: Admin is able to add a new admin user
  	Given user is on Dashboard page
  	When user clicks on "Admin" link
  #	Then the user is on "Admin/User Management" page
  #	And the user clicks on "Add" button
  #	When user is on "Add User" page
  #	And user selects "Admin" under user role dropdown
  #	And user enters employee name in the Employee name textbox
  #	Then user selects "Enabled" under status dropdown
  #	Then user enters username in Username textbox
  #	Then user enters password in password textbox
  #	And user enters password in confirm password textbox
  #	And user clicks on Save button
  #	Then the user is able to see the added user under Records found list
  #	Then the user clicks on the logged in user icon and clicks on logout
  #	And the user is successfully logged out
  #	
  #	@tag2
  #	Scenario: Admin User is able to  entitle leave for himself/others
  #	Given user is on Dashboard page
    #When user clicks on Leave link
    #Then user is on Leave page
    #And user clicks on Entitlements link
    #Then user clicks on Add Entitlements
    #Then user enters employee name in the employee name textbox
    #And user selects "CAN-Personal"from the Leave Type dropdown
    #Then user enters no of days in the entitlement textbox
    #And user clicks on Save button
    #Then user clicks Confirm on the alert box
    #Then the user verifies that the leave detail is available under the Record found
  #	
   #
    #@tag3
    #Scenario: User is able to apply leave
    #Given user is on Dashboard page
    #When user clicks on Leave link
    #Then user is on Leave page
    #And user clicks on Apply link
    #And user selects Can-Personal from Leave Type dropdown
    #When user selects a future date in From and To date fields
    #And user selects all days under Partial Days
    #And user clicks on Apply button
    #
    #@tag4
    #Scenario: OrangeHRM Leave List
    #Given user is on Dashboard page
    #Then user clicks on Leave List link
    #And user enters From and To date fields
    #When user selects Scheduled from Show Leave with Status dropdown
    #Then user selects CAN-Personal from Leave Type dropdown
    #And user clicks on Search button
    #And user is able to find the leave details under the Records Found section 
    #
    #@tag5
    #Scenario: OrangeHRM Leave Reports
     #Given user is on Dashboard page
     #When user clicks on Leave link
     #Then user is on Leave page
     #And user clicks on Reports link
     #And user clicks on Leave Entitlements and Usage Report link
     #Then user selects the Employee radio button
     #And user enters the employee name in Employee Name textbox
     #Then user clicks on Generate button
     #Then user verifies that report contains eleven rows 
     #And user verifies the leave the person is entitled for is updated correctly
    #
      #
  