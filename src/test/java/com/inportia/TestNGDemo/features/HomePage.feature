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
