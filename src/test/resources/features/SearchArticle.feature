#Feature: As a sports user, I would like to read about all articles related to sports
#  Scenario: Use the search option to find all articles related to ‘sports’. Output the first heading and the last heading returned on the page.
@search
Feature:Searching related to sport
  Scenario: Verify the seached atricle
    Given Navigate BBC home page
    When User on the Scores & Fixtures - Football - BBC Sport screen
    And User should search a article about "sport"
    Then User should see all article
    And User clicks on first article


