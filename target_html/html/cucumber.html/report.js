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
  "duration": 188031,
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
  "duration": 24170092135,
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
  "duration": 3315507515,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.find_the_voting_percentage_for_overall_MH()"
});
formatter.result({
  "duration": 45981,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.find_the_voting_percentage_for_pimpri_from_the_table()"
});
formatter.result({
  "duration": 3799913292,
  "status": "passed"
});
formatter.after({
  "duration": 247970,
  "status": "passed"
});
});