$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 2,
  "name": "Test the new homepage",
  "description": "",
  "id": "test-the-new-homepage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.before({
  "duration": 814253,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Find the voting percentage for BJP in MH for 2014",
  "description": "",
  "id": "test-the-new-homepage;find-the-voting-percentage-for-bjp-in-mh-for-2014",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@test_03"
    },
    {
      "line": 24,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "user selects year \"2014\" and states \"Maharashtra\" from PC Elelections(Lok Sabha)",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Clicks go",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "value for BJP in table should not be null",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 239058,
  "status": "passed"
});
formatter.uri("TestTable.feature");
formatter.feature({
  "line": 2,
  "name": "test the table",
  "description": "",
  "id": "test-the-table",
  "keyword": "Feature"
});
formatter.before({
  "duration": 694083,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "test the parameter",
  "description": "",
  "id": "test-the-table;test-the-parameter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "this is my first row value for second test \"PRAVIN    \"",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "this is my second row value for second test \"PWD\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "PRAVIN    ",
      "offset": 44
    }
  ],
  "location": "TestTableStep.this_is_my_first_row_value_for_second_test(String)"
});
formatter.result({
  "duration": 914731318,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PWD",
      "offset": 45
    }
  ],
  "location": "TestTableStep.this_is_my_second_row_value_for_second_test(String)"
});
formatter.result({
  "duration": 648752,
  "status": "passed"
});
formatter.after({
  "duration": 520882,
  "status": "passed"
});
formatter.before({
  "duration": 250605,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "test the parameter",
  "description": "",
  "id": "test-the-table;test-the-parameter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "this is my first row value for second test \"Pooja    \"",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "this is my second row value for second test \"PWD\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Pooja    ",
      "offset": 44
    }
  ],
  "location": "TestTableStep.this_is_my_first_row_value_for_second_test(String)"
});
formatter.result({
  "duration": 674410,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PWD",
      "offset": 45
    }
  ],
  "location": "TestTableStep.this_is_my_second_row_value_for_second_test(String)"
});
formatter.result({
  "duration": 629935,
  "status": "passed"
});
formatter.after({
  "duration": 504205,
  "status": "passed"
});
formatter.before({
  "duration": 518744,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "test the parameter",
  "description": "",
  "id": "test-the-table;test-the-parameter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "this is my first row value for second test \"Manish    \"",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "this is my second row value for second test \"PWD\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Manish    ",
      "offset": 44
    }
  ],
  "location": "TestTableStep.this_is_my_first_row_value_for_second_test(String)"
});
formatter.result({
  "duration": 712900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PWD",
      "offset": 45
    }
  ],
  "location": "TestTableStep.this_is_my_second_row_value_for_second_test(String)"
});
formatter.result({
  "duration": 291660,
  "status": "passed"
});
formatter.after({
  "duration": 147968,
  "status": "passed"
});
});