
Feature: login validation
Background:
Given open browser
|chrome|
|firefox|
|ie|
And go to url

@smoke
Scenario: As a user should be able to login using valid credantial


When user type email in user text box
And user type password in paaword text box
And user click in login button
Then user should nevigate to profile page

@smoke
Scenario: As a user should be able to login using valid credantia using datatable concept


When user type email and password  in  text box
|userid|password|
|user1|pass1|
And user click in login button
Then user should nevigate to profile page



@Reg
Scenario Outline: As a user should not be able to login using invalid credantial

When user type <"email"> in user text box
And user type <"password"> in paaword text box
And user click in login button
Then user should not be nevigated to profile page

Examples:
|email|password|
|"sislam"|"s2344"|
|"sadf"|"f45"|
|"asdsfd"|"xs324"|