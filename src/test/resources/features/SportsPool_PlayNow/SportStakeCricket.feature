@SportStake_Cricket
Feature: Play Now SportStake Rugby Game

  Background: Login
    Given Player navigates to login form
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    And Player clicks LOGIN button

#  Scenario: Clear All Cart Items
#    * Player clicks on Cart icon
#    * Remove all Items from Cart

  Scenario Outline: <tcID> <game> - Verify for logo and link text for <game> of Play Now module
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    Then Player should be on <game> screen
    Then <game> logo and text should be as per the requirement
    Examples:
      | tcID    | game                 |
      | "SR001" | "SPORTSTAKE CRICKET" |
