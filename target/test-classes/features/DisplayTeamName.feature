#Feature: As a business user, I would like to make a record of all teams which are playing today
#  Scenario: Output all team names with a match today. If there are no matches today, output a message to convey this.
@name
Feature: Verify the team names


  Scenario: Verify the team names
    Given navigate to BBC sport page
    When User on the Scores & Fixtures - Football - BBC Sport screen
    Then User should able to see today's matches
    And Verify the team names on the screen

