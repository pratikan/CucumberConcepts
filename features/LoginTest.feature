Feature: Free CRM login feature

Scenario Outline: Free CRM login Test Scenario

Given user is already on login page
When title of the login page is Free CRM
Then user enters "<username>" and "<password>"
Then user click on Login button
Then user is on home page
Then user moves to new contact pages
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then user close the browser

Examples:
         | username | password | firstname | lastname | position |
         | naveenk  | test@123 | Tom       | peter    | QA       |
         | naveenk  | test@123 | Harry     | cris     | Manager  |
