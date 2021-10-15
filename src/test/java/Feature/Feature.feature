Feature: Application login

@RegTest
Scenario: Login payment
Given user is on netbanking login page
When user login into application with username and password
Then homepage is populated
And cards are displayed

@SanityTest
Scenario Outline: Login payment
Given user is on netbanking login page
When user login into application with <username> and <password>
Then homepage is populated
And cards are displayed

Examples:
 | username | password |
 | User1     | yas123   |
 | User2     | say321   |
























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