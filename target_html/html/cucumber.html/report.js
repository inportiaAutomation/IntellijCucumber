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
  "duration": 1328294,
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
formatter.match({
  "location": "HomePageStep.user_is_on_homepage()"
});
formatter.result({
  "duration": 19326350168,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2014",
      "offset": 19
    },
    {
      "val": "Maharashtra",
      "offset": 37
    }
  ],
  "location": "HomePageStep.user_selects_year_and_states_from_PC_Elelections_Lok_Sabha(String,String)"
});
formatter.result({
  "duration": 1205764094,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.clicks_go()"
});
formatter.result({
  "duration": 2449321270,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.value_for_BJP_in_table_should_not_be_null()"
});
formatter.result({
  "duration": 105203,
  "status": "passed"
});
formatter.after({
  "duration": 218959,
  "status": "passed"
});
});