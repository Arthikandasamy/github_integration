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

Feature: Login functionality
#Background: 
#Given open the chrome browser
#And Load the application as 'http://leaftaps.com/opentaps'

@smoke
Scenario: Test with positive credential

And Enter the username as <username>
And Enter password as <password>
When click on login button
Then Home page should be displayed.

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

#Scenario: Test with negative credential
#And Enter the username as 'Demo'
#And Enter password as 'crmsfa'
#When click on login button
#But Error message page should be displayed.
