@SportStake_Rugby
Feature: Play Now SportStake Rugby Game

  Scenario: Initialise App
    Given Player navigates to login form

  Scenario: Login
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    And Player clicks LOGIN button

  #  Scenario: Clear All Cart Items
  #    * Player clicks on Cart icon
  #    * Remove all Items from Cart
  #    * Click on BACK ARROW
  #  Scenario Outline: <tcID> <game> - Verify for logo and link text for <game> of Play Now module
  #    When Player Clicks Home screen "PLAY" icon
  #    And Player clicks on <game> icon
  #    Then Player should be on <game> screen
  #    Then <game> logo and text should be as per the requirement
  #    And Click on BACK ARROW
  #    And Click on BACK ARROW
  #    Examples:
  #      | tcID    | game               |
  #      | "SR001" | "SPORTSTAKE RUGBY" |
  #    Scenario: Verify that player is not able to open SPORTSTAKE RUGBY Game Play screen without Logging In/Registration.
  #  Scenario Outline: <tcID> <game> - Verify whether Player is able to select options/results in all 10 rows on Mobile App
  #    When Player Clicks Home screen "PLAY" icon
  #    And Player clicks on <game> icon
  #    And Player captures <numMatches> predictions for the "" "single" <game>
  #      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 | 1 | 1 |
  #    And Player clicks on SUBMIT button SportStake
  #    And Click on BACK ARROW
  #    And Click on BACK ARROW
  #    And Click on BACK ARROW
  #    Examples:
  #      | tcID    | game               | numMatches |
  #      | "SR002" | "SPORTSTAKE RUGBY" | 10         |
  #  Scenario Outline: <tcID> <game> - Verify that Player is able to select multiple options/results in all 10 rows
  #    When Player Clicks Home screen "PLAY" icon
  #    And Player clicks on <game> icon
  #    And Player captures <numMatches> predictions for the "" "multi" <game>
  #      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 | 1 | 1 |
  #    And Player clicks on SUBMIT button SportStake
  #    * Verify Pop Up "Price is greater than R2,000.00" Close PopUp? "Yes"
  #    And Click on BACK ARROW
  #    And Click on BACK ARROW
  #    Examples:
  #      | tcID    | game               | numMatches |
  #      | "SR003" | "SPORTSTAKE RUGBY" | 10         |
  Scenario Outline: Verify whether selected options/results get deselected if we select an already selected option/result
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    And Player captures <numMatches> predictions for the "" "multi" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 | 1 | 1 |
    And Swipe to top of screen
    And Deselect <numMatches> predictions for the "" "multi" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 | 1 | 1 |
    Examples:
      | tcID    | game               | numMatches |
      | "SR004" | "SPORTSTAKE RUGBY" | 10         |


