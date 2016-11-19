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
  "duration": 240992,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Test the homepage scenario",
  "description": "",
  "id": "test-the-new-homepage;test-the-homepage-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test_01"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the homepage",
  "keyword": "* "
});
formatter.step({
  "line": 7,
  "name": "then user closes the page",
  "keyword": "* "
});
formatter.match({
  "location": "HomePageStep.user_is_on_the_homepage()"
});
formatter.result({
  "duration": 13694097646,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.then_user_closes_the_page()"
});
formatter.result({
  "duration": 4241120482,
  "status": "passed"
});
formatter.after({
  "duration": 72256,
  "status": "passed"
});
});