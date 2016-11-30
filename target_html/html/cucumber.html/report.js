$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ElectionsMap.feature");
formatter.feature({
  "line": 1,
  "name": "Elections Map",
  "description": "",
  "id": "elections-map",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4214421371,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Find the turn out % for pimpri form the election map",
  "description": "",
  "id": "elections-map;find-the-turn-out-%-for-pimpri-form-the-election-map",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@elections_map_01"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on Election Map",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user selects \"AC\" and state as \"Maharashtra\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user selects year as \"2009\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "find the turnout percentage for \"Pimpri\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.user_is_on_homepage()"
});
formatter.result({
  "duration": 14024757633,
  "status": "passed"
});
formatter.match({
  "location": "ElectionsMapStep.user_is_on_Election_Map()"
});
formatter.result({
  "duration": 456528,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AC",
      "offset": 14
    },
    {
      "val": "Maharashtra",
      "offset": 32
    }
  ],
  "location": "ElectionsMapStep.user_selects_and_state_as(String,String)"
});
formatter.result({
  "duration": 1729635,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2009",
      "offset": 22
    }
  ],
  "location": "ElectionsMapStep.user_selects_year_as(String)"
});
formatter.result({
  "duration": 35307,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pimpri",
      "offset": 33
    }
  ],
  "location": "ElectionsMapStep.find_the_turnout_percentage_for(String)"
});
formatter.result({
  "duration": 28327,
  "status": "passed"
});
formatter.after({
  "duration": 2315897535,
  "status": "passed"
});
});