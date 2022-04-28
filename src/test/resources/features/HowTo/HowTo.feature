@HowTo
Feature: To verify the How To screen

  Scenario: Initialise App
    Given Player navigates to login form

  Scenario: Login
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    And Player clicks LOGIN button

  Scenario Outline: <tcID> To verify that the <game> How To screen content is correct
    When Player Clicks Home screen "HOW TO" icon
    And Player should be on "HOW TO" screen
    Then HOW TO PLAY <game> content is displayed correctly
    And Player verifies How To <game> screen
    And Click on BACK ARROW
    And Click on BACK ARROW
    Examples:
      | tcID    | game                 |
      | "HT001" | "Lotto"              |
      | "HT002" | "Lotto Plus 1"       |
      | "HT003" | "Lotto Plus 2"       |
      | "HT004" | "PowerBall"          |
      | "HT005" | "PowerBall Plus"     |
      | "HT006" | "SportStake 4"       |
      | "HT007" | "SportStake 8"       |
      | "HT008" | "SportStake 13"      |
      | "HT009" | "SportStake Cricket" |
      | "HT010" | "SportStake Rugby"   |
      | "HT011" | "Daily Lotto"        |
      | "HT012" | "Raffle"             |
      | "HT013" | "EaziWIN"            |