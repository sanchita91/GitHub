Feature: login validation
Given open chome browser
|chrome|
|firefox|
|ie|
And go to url

Scenario: As a user should be able to login using valid credantia


When user type email in user text box
And user type password in password text box
And user should click the click button
Then user should nevigate to profile page


Scenario Outline: As a user should be able to login using invalid credantia

Given open chome browser
And go to url
When user type <"email"> in user text box
And user type <"password"> in password text box
And user should click the click button
Then user should nevigate to profile page

Examples:
|"email"|"password"|
|"sanchita"|"s12345"|
|"avijit"|"A12345"|
