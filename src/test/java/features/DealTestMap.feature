Feature: Deal data creation 
Scenario: Free CRM Create a new deal Scenario

Given user is already on login page
When title of the login page is Free CRM
Then user enters username and password
  | username| password |
  | naveenk | test@123 |
Then user click on Login button
Then user is on home page
Then user moves to new deal pages
Then user enters deal details 
    | title     | amount| probability | commission | 
    | test deal1 | 1000 | 50 | 10 |
    | test deal2 | 2000 | 60 | 20 |
    | test deal3 | 3000 | 70 | 30 |
    
Then user close the browser