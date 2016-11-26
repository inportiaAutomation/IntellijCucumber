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
  "duration": 4214699722,
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
  "duration": 7393060687,
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
  "duration": 450125094,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.clicks_go()"
});
formatter.result({
  "duration": 1489801188,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.value_for_BJP_in_table_should_not_be_null()"
});
formatter.result({
  "duration": 3878046978,
  "status": "passed"
});
formatter.after({
  "duration": 2327180601,
  "status": "passed"
});
formatter.before({
  "duration": 3277933832,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Find the voting percentage for MH vidhan sabha election 2014",
  "description": "",
  "id": "test-the-new-homepage;find-the-voting-percentage-for-mh-vidhan-sabha-election-2014",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@test_04"
    },
    {
      "line": 32,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "user selects year \"2014\" and states \"Maharashtra\" from AC Elections (Vidhan Sabha)",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "find the voting percentage for overall MH",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "find the voting percentage for pimpri from the table",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStep.user_is_on_homepage()"
});
formatter.result({
  "duration": 6595956358,
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
  "location": "HomePageStep.user_selects_year_and_states_from_AC_Elections_Vidhan_Sabha(String,String)"
});
formatter.result({
  "duration": 1889918769,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.find_the_voting_percentage_for_overall_MH()"
});
formatter.result({
  "duration": 14369,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.find_the_voting_percentage_for_pimpri_from_the_table()"
});
formatter.result({
  "duration": 1190407238,
  "status": "passed"
});
formatter.after({
  "duration": 2313179302,
  "status": "passed"
});
});