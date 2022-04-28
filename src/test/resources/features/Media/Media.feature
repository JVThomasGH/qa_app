@Media
Feature: To verify the Media screen

  Scenario: Initialise App
    Given Player navigates to login form

  Scenario: Login
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    And Player clicks LOGIN button

  Scenario: To verify that Player is redirected to Ithuba National Lottery Youtube account after clicking on Media
    When Player Clicks Home screen "MEDIA" icon
    And Player is redirected to Ithuba National Lottery YouTube account
