#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@login
Feature: Login Action
I want to login to facebook application and check valid credentials

Scenario Outline: Check login with valid credentials
Given user is on home page
When  user enter username "<username>"
And   user enter password "<password>"
Then  user should enter to application.
Examples:
|username|password|
|Prasanna|prasanna24|
|Ram|Ram24|


Scenario: Check Successful Logout
When user click on Logout button
Then user should sucessfuly logout from Application.

 
 


      
      