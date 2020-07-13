Feature: LeafTaps Login 


@Smoke
Scenario: TC002_login with invalid credential 


	Given Enter Username as Demosalesmanager 
	And Enter password as crmsfa123 
	When Click on Login Button 
	But verify error message
	
	
