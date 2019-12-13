Feature: Application Login

#Background:
#Given Validate the browser
#When Browser is triggered
#Then Check if browser is started

@RegTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "jin" and "1234"
Then Home page is loaded
And Cards displayed is "true"
@MobileTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "john" and "4321"
Then Home page is loaded
And Cards displayed is "false"
@SmokeTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User sign up with following details
| jenny | abcd | jenny@test.com | Australia | 321321321 |
Then Home page is loaded
And Cards displayed is "false"
@RegTest
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login in to application with <Username> and <Password>
Then Home page is loaded
And Cards displayed is "true"
Examples:
| Username | Password |
| user1	   | pass1    |
| user2	   | pass2    |
| user3	   | pass3    |
| user4    | pass4    |