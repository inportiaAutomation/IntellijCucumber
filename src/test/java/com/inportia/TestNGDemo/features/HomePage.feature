@test
Feature: Test the new homepage

@test_01
Scenario: Test the homepage scenario
* user is on the homepage
* then user closes the page


@test_02
Scenario Outline: test the table example
* user is entering the username "<username>"
* user is entering the password "<password>"

Examples:
|username| password|
|user_name_1|pwd_1|
|user_name_2|pwd_2|
|user_name_3|pwd_3|
|user_name_4|pwd_4|



@test_03 @wip
Scenario: Find the voting percentage for BJP in MH for 2014 
Given user is on homepage
When user selects year "2014" and states "Maharashtra" from PC Elelections(Lok Sabha)
And Clicks go 
Then value for BJP in table should not be null 







