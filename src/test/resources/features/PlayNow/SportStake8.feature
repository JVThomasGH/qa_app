@SPORTSTAKE8
Feature: Play Now SportStake 8 Game

  Background: Login
    Given Player navigates to login form
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    And Player clicks LOGIN button

  Scenario: Clear All Cart Items
    * Player clicks on Cart icon
    * Remove all Items from Cart

  Scenario Outline: <tcID> <game> - Verify for logo and link text for <game> of Play Now module
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    Then Player should be on <game> screen
    Then <game> logo and text should be as per the requirement
    Examples:
      | tcID    | game           |
      | "S0801" | "SPORTSTAKE 8" |
#
#  Scenario Outline: <tcID> <game> - Verify whether Player is able to select option/result in less than 16 rows both the halves
#    When Player Clicks Home screen "PLAY" icon
#    And Player clicks on <game> icon
#    And Player clicks on PLAY MANUAL SELECT
#    And Player captures <predictions> predictions for the "First Half" "single" <game>
#      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
#    And Player captures <predictions> predictions for the "Second Half" "single" <game>
#      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
#    And Player clicks on SUBMIT button SportStake
#    * Verify Pop Up "Please select at least one result from each row" Close PopUp? "Yes"
#    Examples:
#      | tcID    | game           | predictions |
#      | "S0802" | "SPORTSTAKE 8" | 7           |
#
#  Scenario Outline: <tcID> <game> - Verify whether Player is able to select options/results in all 16 rows both the halves
#    When Player Clicks Home screen "PLAY" icon
#    And Player clicks on <game> icon
#    And Player clicks on PLAY MANUAL SELECT
#    And Player captures <predictions> predictions for the "First Half" "single" <game>
#      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
#    And Player captures <predictions> predictions for the "Second Half" "single" <game>
#      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
#    And Player clicks on SUBMIT button SportStake
#    Examples:
#      | tcID    | game           | predictions |
#      | "S0803" | "SPORTSTAKE 8" | 8           |
#
#  Scenario Outline: <tcID> <game> - Verify whether maximum bet amount allowed validation is working or not (which is configurable, currently R2000)
#    When Player Clicks Home screen "PLAY" icon
#    And Player clicks on <game> icon
#    And Player clicks on PLAY MANUAL SELECT
#    And Player captures <predictions> predictions for the "First Half" "multi" <game>
#      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
#    And Player captures <predictions> predictions for the "Second Half" "multi" <game>
#      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
#    And Player clicks on SUBMIT button SportStake
#    * Verify Pop Up "Price is greater than R2000.00" Close PopUp? "Yes"
#    Examples:
#      | tcID    | game           | predictions |
#      | "S0804" | "SPORTSTAKE 8" | 8           |
#
#  Scenario Outline: <tcID> <game> - Verify that selected options/results get deselected when user select an already selected option/result
#    When Player Clicks Home screen "PLAY" icon
#    And Player clicks on <game> icon
#    And Player clicks on PLAY MANUAL SELECT
#    And Select predictions for matches and then deselect it for <game>
#    And Player clicks on SUBMIT button SportStake
#    * Verify Pop Up "Please select at least one result from each row" Close PopUp? "Yes"
#    Examples:
#      | tcID    | game           | predictions |
#      | "S0805" | "SPORTSTAKE 8" | 8           |
#
#  Scenario Outline: <tcID> <game> - Verify that "Reset" button deselects all the selected results on selection screen .
#    When Player Clicks Home screen "PLAY" icon
#    And Player clicks on <game> icon
#    And Player clicks on PLAY MANUAL SELECT
#    And Player captures <predictions> predictions for the "First Half" "single" <game>
#      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
#    And Player captures <predictions> predictions for the "Second Half" "single" <game>
#      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
#    And Player clicks on RESET button SportStake
#    Examples:
#      | tcID    | game           | predictions |
#      | "S0806" | "SPORTSTAKE 8" | 8           |
#
#  Scenario Outline: <tcID> <game> - Verify whether Player is able to add the ticket to Cart after choosing options/results in all 16 rows
#    When Player Clicks Home screen "PLAY" icon
#    And Player clicks on <game> icon
#    And Player clicks on PLAY MANUAL SELECT
#    And Player captures <predictions> predictions for the "First Half" "single" <game>
#      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
#    And Player captures <predictions> predictions for the "Second Half" "single" <game>
#      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
#    And Player clicks on SUBMIT button SportStake
#    And Click ADD TO CART button SportStake
#    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
#    Examples:
#      | tcID   | game           | predictions |
#      | "S0807 | "SPORTSTAKE 8" | 8           |
#
#  Scenario: S0808 - Verify that user is able to play the "Pro Pick" game play option
#    When Player Clicks Home screen "PLAY" icon
#    And Player clicks on "SPORTSTAKE 8" icon
#    And Player clicks on PLAY PROPICK
#    And Player clicks on PLAY PROPICK "128"
#    And Player clicks on SUBMIT button SportStake PROPICK
#    And Click ADD TO CART button SportStake
#    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"

#  Scenario Outline: <tcID> <game> - Verify that the SPORTSTAKE 8 ticket can be purchased successfully
#    When Player Clicks Home screen "PLAY" icon
#    And Player clicks on <game> icon
#    And Player clicks on PLAY MANUAL SELECT
#    And Player captures <predictions> predictions for the "First Half" "single" <game>
#      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
#    And Player captures <predictions> predictions for the "Second Half" "single" <game>
#      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
#    And Player clicks on SUBMIT button SportStake
#    And Click ADD TO CART button SportStake
#    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
#    And Click on BACK ARROW
#    And Click on BACK ARROW
#    And Click Go To Cart button
#    And Click PAY FROM MY WALLET
#    And Click PAY NOW
#    And Player verifies Receipt
#    Examples:
#      | tcID   | game           | predictions |
#      | "S0809 | "SPORTSTAKE 8" | 8           |
#
#  Scenario: Logout
#    When Player Clicks Home screen "LOGOUT" icon
#
#  Scenario Outline: <tcID> <game> -  Verify whether player should not able to open <game> GamePlay screen without Logging In/Registration
#    When Player Clicks Home screen "PLAY" icon
#    And Player clicks on <game> icon
#    Then Player should be on "LOGIN" screen
#    And Click "LOGIN" CANCEL button
#    Examples:
#      | tcID     | game              |
#      | "S08008" | "SPORTSTAKE 8"    |
