Feature: LeafTaps Login 

	
@Regression
Scenario Outline: TC001_Test Login Functionality with valid credential 


	Given Enter Username as <username>
	And Enter password as <password> 
	When Click on Login Button 
	Then verify Homepage is displayed 
	
	Examples:
	|username|password|
	|Demosalesmanger|crmsfa|
	|DemoCSR|crmsfa|
	
@Smoke
Scenario: TC002_open my homepage 


	Given Enter Username as Demosalesmanager 
	And Enter password as crmsfa 
	When Click on Login Button 
	Then verify Homepage is displayed 
	When click on crmsfa link 
	Then Verfiy MyHomePage is displayed 
	
