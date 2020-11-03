@Leads
Feature: Test Lead functionality

Background:
Given user should be on login page
When user enters valid id and password
And click on login button
Then user should navigate to home page

@smoke
Scenario Outline: Test Valid lead functionality
Given user click on new lead
Then user enters fname and lname and click on save button
And user should navigate lead page
And click on logout link
And Close browser
Examples:
| fname    | lname |
| modi     | bjp   |


Scenario: Test Valid lead functionality
Given user click on leads
Then select lead checkbok
And click on logout link
And Close browser
