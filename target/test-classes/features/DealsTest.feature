Feature: Free CRM Deal data Creation

Scenario: Free CRM Create a new deal Scenario

Given user is already on login page
When title of the login page is Free CRM
Then user enters username and password
 | naveenk | test@123 |
Then user click on Login button
Then user is on home page
Then user moves to new deal pages
Then user enters contact details  
    | test deal | 1000 | 50 | 10 |
    
Then user close the browser