Feature: Elections Map

@elections_map_01
Scenario: Find the turn out % for pimpri form the election map
Given user is on homepage
And user is on Election Map
When user selects "AC" and state as "Maharashtra" 
And user selects year as "2009"
Then find the turnout percentage for "Pimpri"



