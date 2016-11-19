
Feature: test the table


Scenario Outline: test the table example
Given this is my first row value "<username>"
And this is my second row value "<password>"

Examples:
|username|password|
|pravin|pwd_01|
|pooja|pwd_02|
|manisha|pwd_03|
|shagufta|pwd_04||



@wip
Scenario: test the parameter
Given this is my first row value for second test "PRAVIN    "
And this is my second row value for second test "PWD"

@wip
Scenario: test the parameter
Given this is my first row value for second test "Pooja    "
And this is my second row value for second test "PWD"


@wip
Scenario: test the parameter
Given this is my first row value for second test "Manish    "
And this is my second row value for second test "PWD"