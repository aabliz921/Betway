#Feature: As a QA, I would like to verify all negative scenarios for login
#  Scenario: Select ‘Sign in’, and enter as many negative scenarios as possible. Verify that a error message is displayed and the text that it
#  contains is as expected.

@login
Feature: Verify login functionality

  Background: go to BBC login page
    Given Navigate BBC home page
    When User on the Scores & Fixtures - Football - BBC Sport screen
    Then Select 'SignIn' button
    And User on the BBC – Sign in screen


  Scenario Outline: Verify negative scenarios for login
    When User input userName "<userName>"
    Then User input password "<password>"
    And User Clicks signIn button
    And Screen display error massage "<error massage>"
    Examples:
      | userName        | password  | error massage                                                                                         |
      | 234567@test.com | test23456 | Sorry, we can’t find an account with that email. You can register for a new account or get help here. |
      | 234567@test.com |           | Something's missing. Please check and try again.                                                      |
      |                 | test23456 | Sorry, those details don't match. Check you've typed them correctly.                                  |
      |                 |           | Something's missing. Please check and try again.                                                      |

