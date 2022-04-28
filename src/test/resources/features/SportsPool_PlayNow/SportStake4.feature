@SportStake4
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
##      | "S4001" | "SPORTSTAKE 4" |
#      | "SR001" | "SPORTSTAKE RUGBY" |

  Scenario Outline: <tcID> <game> - Verify whether Player is able to select options/results in all 8 rows on Mobile App
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    And Player captures <predictions> predictions for the "" "single" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 | 1 | 1 |
#    And Player clicks on SUBMIT button SportStake
#    And Click on BACK ARROW
#    And Click on BACK ARROW
#    And Click on BACK ARROW
    Examples:
      | tcID    | game               | predictions |
      | "S4002" | "SPORTSTAKE 4"     | 4           |
#
#  Scenario Outline: <tcID> <game> - Verify that Player is able to select multiple options/results in all 8 rows on Mobile App
#    When Player Clicks Home screen "PLAY" icon
#    And Player clicks on <game> icon
#    And Player captures <predictions> predictions for the "First Half" "multi" <game>
#      | 1 | 1 | 2 | 3 |
#    And Player captures <predictions> predictions for the "Second Half" "multi" <game>
#      | 1 | 1 | 2 | 3 |
#    And Player clicks on SUBMIT button SportStake
#    * Verify Pop Up "Price is greater than R2,000.00" Close PopUp? "Yes"
#    And Click on BACK ARROW
#    And Click on BACK ARROW
#    Examples:
#      | tcID    | game           | predictions |
#      | "S4003" | "SPORTSTAKE 4" | 4           |
#
#  Scenario Outline: <tcID> <game> - Verify that selected options/results get deselected when user select an already selected option/result
#    When Player Clicks Home screen "PLAY" icon
#    And Player clicks on <game> icon
#    And Select predictions for matches and then deselect it for <game>
#    And Player clicks on SUBMIT button SportStake
#    * Verify Pop Up "Please select at least one result from each row" Close PopUp? "Yes"
#    And Click on BACK ARROW
#    And Click on BACK ARROW
#    Examples:
#      | tcID    | game           |
#      | "S4004" | "SPORTSTAKE 4" |
#
#  Scenario Outline: <tcID> <game> - Verify that "Reset" button resets the selected options
#    When Player Clicks Home screen "PLAY" icon
#    And Player clicks on <game> icon
#    And Player captures <predictions> predictions for the "First Half" "multi" <game>
#      | 1 | 1 | 2 | 3 |
#    And Player captures <predictions> predictions for the "Second Half" "multi" <game>
#      | 1 | 1 | 2 | 3 |
#    And Player clicks on RESET button SportStake
#    And Click on BACK ARROW
#    And Click on BACK ARROW
#    Examples:
#      | tcID    | game           | predictions |
#      | "S4005" | "SPORTSTAKE 4" | 4           |
#
#
#  Scenario Outline: <tcID> <game> - Verify that user can Modify the Board by clicking the Back Arrow button at the TOP left of the "Your Selection" screen
#    When Player Clicks Home screen "PLAY" icon
#    And Player clicks on <game> icon
#    And Player captures <predictions> predictions for the "First Half" "single" <game>
#      | 1 | 1 | 2 | 3 |
#    And Player captures <predictions> predictions for the "Second Half" "single" <game>
#      | 1 | 1 | 2 | 3 |
#    And Player clicks on SUBMIT button SportStake
#    And Click on BACK ARROW
#    And Player clicks on RESET button SportStake
#    And Player captures <predictions> predictions for the "First Half" "single" <game> after reset
#      | 3 | 1 | 2 | 1 |
#    And Player captures <predictions> predictions for the "Second Half" "single" <game> after reset
#      | 1 | 3 | 1 | 2 |
#    Examples:
#      | tcID    | game           | predictions |
#      | "S4006" | "SPORTSTAKE 4" | 4           |
#
#  Scenario Outline: <tcID> <game> - Verify that Player is able to add the ticket to Cart after choosing options/results in all 8 rows and moving to Your Selection Screen on Mobile App
#    When Player Clicks Home screen "PLAY" icon
#    And Player clicks on <game> icon
#    And Player captures <predictions> predictions for the "First Half" "single" <game>
#      | 1 | 1 | 2 | 3 |
#    And Player captures <predictions> predictions for the "Second Half" "single" <game>
#      | 1 | 1 | 2 | 3 |
#    And Player clicks on SUBMIT button SportStake
#    And Click ADD TO CART button SportStake
#    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
#    And Click on BACK ARROW
#    And Click on BACK ARROW
#    Examples:
#      | tcID   | game           | predictions |
#      | "S4007 | "SPORTSTAKE 4" | 4           |
##
##  Scenario Outline: <tcID> <game> - Verify whether the ticket of SPORTSTAKE 4 can be purchased on Mobile App
##    When Player Clicks Home screen "PLAY" icon
##    And Player clicks on <game> icon
##    And Player captures <predictions> predictions for the "First Half" "single" <game>
##      | 1 | 1 | 2 | 3 |
##    And Player captures <predictions> predictions for the "Second Half" "single" <game>
##      | 1 | 1 | 2 | 3 |
##    And Player clicks on SUBMIT button SportStake
##    And Click ADD TO CART button SportStake
##    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
##    And Click on BACK ARROW
##    And Click on BACK ARROW
##    And Click Go To Cart button
##    And Click PAY FROM MY WALLET
##    And Click PAY NOW
##    And Player verifies Receipt
##    And Click on BACK ARROW
##    Examples:
##      | tcID   | game           | predictions |
##      | "S4008 | "SPORTSTAKE 4" | 4           |
#
#  Scenario Outline: <tcID> <game> - Verify that the HOW TO PLAY? button redirects you to how to section of SPORTSTAKE 4 on Mobile App
#    When Player Clicks Home screen "PLAY" icon
#    And Player clicks on <game> icon
#    And Player clicks on HOW TO PLAY button
#    And Click on BACK ARROW
#    And Click on BACK ARROW
#    And Click on BACK ARROW
#    Examples:
#      | tcID   | game           | predictions |
#      | "S4009 | "SPORTSTAKE 4" | 4           |
#
#  Scenario Outline: <tcID> <game> - Verify that player is unable to select and submit option/result in less than 8 rows on Mobile App
#    When Player Clicks Home screen "PLAY" icon
#    And Player clicks on <game> icon
#    And Player captures <predictions> predictions for the "First Half" "single" <game>
#      | 1 | 1 | 2 | 3 |
#    And Player captures <predictions> predictions for the "Second Half" "single" <game>
#      | 1 | 1 | 2 | 3 |
#    And Player clicks on SUBMIT button SportStake
#    * Verify Pop Up "Please select at least one result from each row" Close PopUp? "Yes"
#    And Click on BACK ARROW
#    And Click on BACK ARROW
#    Examples:
#      | tcID    | game           | predictions |
#      | "S4010" | "SPORTSTAKE 4" | 3           |
#
#
#  Scenario: Logout
#    When Player Clicks Home screen "LOGOUT" icon
#
#  Scenario Outline: <tcID> <game> -  Verify whether player should not able to open <game> GamePlay screen without Logging In/Registration
#    When Player Clicks Home screen "PLAY" icon
#    And Player clicks on <game> icon
#    Then Player should be on "LOGIN" screen
#    And Click "LOGIN" CANCEL button
#    * Click on BACK ARROW
#    Examples:
#      | tcID    | game           |
#      | "S4011" | "SPORTSTAKE 4" |
