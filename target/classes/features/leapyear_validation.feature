Feature: Test Leap Year 


Scenario Outline: Verify year divide by 4 
	Given an year in "<year>" format 
	When year is not divided by 4 
	Then give response "<value>" 
	
	Examples: 
		|year|	value	|
		|2007|	false	|
		|2008|	false	| 
			
		
		
Scenario Outline: Verify year divide by 4 but not century 
	Given an year in "<year>" format 
	When year is divisible by 4 and not a century 
	Then give response "<value>" 
	
	Examples: 
		|year|	value	|
		|2012|	true	|
		|1600|	true	|
		
		
		
Scenario Outline: Verify year divide by 4,centure but not by 400 
	Given an year in "<year>" format 
	When year is divisible by 4 and a century and not divisible by 400 
	Then give response "<value>" 
	
	Examples: 
		|year|	value	|
		|2600|	false	|
		|1200|	false	|
		
		
Scenario Outline: Verify year divide by 4,centure and 400 
	Given an year in "<year>" format 
	When year is divisible by 4 and a century and divisible by 400 
	Then give response "<value>" 
	
	Examples: 
		|year|	value	|
		|2000|	true	|
		|2001|	true	|
		