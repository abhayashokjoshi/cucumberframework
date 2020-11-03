Feature: Test Login functionality

@smoke @sanity
Scenario Outline: Test Valid functionality
Given user should be on login page
When user enters valid id "<Username>" and password "<Password>"
And click on login button
Then user should navigate to home page
And click on logout link
And Close browser
Examples:
| Username | Password |
| admin    | admin |



Scenario Outline: Test InValid functionality
Given user should be on login page
When user enters valid id "<Username>" and password "<Password>"
And click on login button
Then user should navigate to login page with error message "<ErrorMsg>"
And Close browser
Examples:
| Username | Password | ErrorMsg |
|  aaaa    | admin    | You must specify a valid username and password.|
| admin    | ffgfgf   | You must specify a valid username and password.|
| admin1   | admin1   | You must specify a valid username and password.|

@param
Scenario: Step paramterization
Given user should be on login page
When user enters valid userid "<Username>" and password "<Password>"
|Username|Password|
|admin   |admin   |
And click on login button
Then user should navigate to home page
And click on logout link
And Close browser
