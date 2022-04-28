@LOTTO
Feature: Play Now LOTTO Game

  Background: Login
    Given Player navigates to login form
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    And Player clicks LOGIN button

  Scenario: Clear All Cart Items
    * Player clicks on Cart icon
    * Remove all Items from Cart

  Scenario: LO001 Verify that a player is able to open LOTTO game play screen after logging in with valid username and password
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "LOTTO" icon
    Then Player should be on "LOTTO" screen

  Scenario Outline: LO002 Verify that a player is not able to select same number more than once on a board
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "LOTTO" icon
    And Play a board for "LOTTO" <numbers>
    And Player clicks on SUBMIT button
    * Verify Pop Up "Please select any 6 numbers" Close PopUp? "Yes"
    Examples:
      | game    | numbers                |
      | "LOTTO" | "01 02 03 04 05 06 01" |

  Scenario Outline: LO003 Verify that a player is able to deselect the selected numbers on a board
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "LOTTO" icon
    And Play a board for "LOTTO" <numbers>
    And Player clicks on SUBMIT button
    * Verify Pop Up "Please select any 6 numbers" Close PopUp? "Yes"
    Examples:
      | game    | numbers                               |
      | "LOTTO" | "01 02 03 04 05 06 01 02 03 04 05 06" |

  Scenario Outline: <tcID> <game> - Verify that a player is able to select exactly 6 numbers on 1 board
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "LOTTO" icon
    And Play a board for <game> <numbers>
    And Player clicks on SUBMIT button
    Then Selected <numbers> reflect on the chosen Board of ticket <game>
    And Click ADD TO CART button
    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
    Examples:
      | tcID     | game           | numbers             |
      | "LO004a" | "LOTTO"        | "01 02 03 04 05 06" |
      | "LO004b" | "LOTTO PLUS 1" | "01 02 03 04 05 06" |
      | "LO004c" | "LOTTO PLUS 2" | "01 02 03 04 05 06" |

  Scenario Outline: LO005 Verify whether a player is able to select more than 6 numbers on 1 board
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "LOTTO" icon
    And Play a board for "LOTTO" <numbers>
    * Verify Pop Up "Board Max Reached" Close PopUp? "Yes"
    Examples:
      | game    | numbers                |
      | "LOTTO" | "01 02 03 04 05 06 07" |

  Scenario: LO006 Verify that the ADD TO CART button is disabled before user Selects a board
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "LOTTO" icon
    And Player selects one board
    And Player clicks on SUBMIT button
    * Verify Pop Up "Please select any 6 numbers" Close PopUp? "Yes"

  Scenario Outline: LO007 Verify that a player is able to Play multiple boards
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "LOTTO" icon
    And Play <boards> boards "LOTTO" <numbers>
    And Player clicks on Add To Cart button
    Examples:
      | game    | numbers             | boards |
      | "LOTTO" | "01 02 03 04 05 06" | 4      |

  Scenario Outline: LO008 Verify that the reset button clears the selected numbers
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "LOTTO" icon
    And Play a board for "LOTTO" <numbers>
    And Player clicks on RESET button
    Then All the selected numbers should be deselected and there should be no numbers under YOUR SELECTED NUMBERS
    Examples:
      | game    | numbers             |
      | "LOTTO" | "01 02 03 04 05 06" |

  Scenario Outline: <tcID> Verify that the ticket price increases for each board of <game> played till 20 boards
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "LOTTO" icon
    And Move game slider to <draws>
    And Play <boards> boards <game> <numbers>
    And The ticket price should be equal to R<ticketCost> x number of boards <boards> x number of draws <draws>
    Examples:
      | tcID     | game           | numbers             | boards | ticketCost | draws |
      | "LO009a" | "LOTTO"        | "01 02 03 04 05 06" | 20     | 5.0        | 10    |
      | "LO009b" | "LOTTO PLUS 1" | "01 02 03 04 05 06" | 2      | 7.5        | 10    |
      | "LO009c" | "LOTTO PLUS 2" | "01 02 03 04 05 06" | 2      | 10.0       | 10    |

  Scenario Outline: LO010 Verify that a player is able to save the selected numbers
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "LOTTO" icon
    And Play <boards> boards <game> <numbers>
    And Player clicks on SAVE NUMBERS check mark
    Examples:
      | game    | numbers             | boards |
      | "LOTTO" | "01 02 03 04 05 06" | 1      |

  Scenario: LO011 Verify that a player is able to play the saved numbers for any board
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "LOTTO" icon
    And Click on Play my saved numbers drop down
    And Player clicks on SUBMIT button
    And Verify option was selected

  Scenario: LO012 Verify that a player is able to play Quick Pick for any board
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "LOTTO" icon
    And Click on QUICK PICK
    And Player clicks on SUBMIT button
    And Verify option was selected
    And Verify QUICK PICK was selected

  Scenario Outline: LO013 Verify that a player is able to save ticket using the my save ticket option after selecting numbers from 1 or more boards
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "LOTTO" icon
    And Play a board for "LOTTO" <numbers>
    And Player clicks on SUBMIT button
    And Click on SAVE MY TICKET button
    * Verify Pop Up "Ticket Saved Successfully" Close PopUp? "Yes"
    Examples:
      | game    | numbers             |
      | "LOTTO" | "01 02 03 04 05 06" |

  Scenario Outline: LO014 Verify that a player is able to play saved tickets
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "LOTTO" icon
    And Play a board for "LOTTO" <numbers>
    And Player clicks on SUBMIT button
    And Click on SAVE MY TICKET button
    * Verify Pop Up "Ticket Saved Successfully" Close PopUp? "Yes"
    And Click on BACK ARROW
    And Click on BACK ARROW
    * Player Clicks Home screen "TICKETS" icon
    And Click on SAVED TICKETS
    And Play Saved Ticket
    * Verify Pop Up "Your saved ticket is deleted. If required, please save it again." Close PopUp? "Yes"
    Examples:
      | game    | numbers             |
      | "LOTTO" | "02 04 06 08 10 12" |
#
  Scenario Outline: <tcID> <game> - Verify that the total ticket price for LOTTO game is correct
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "LOTTO" icon
    And Move game slider to <draws>
    And Play <boards> boards <game> <numbers>
    And The ticket price should be equal to R<ticketCost> x number of boards <boards> x number of draws <draws>
    Examples:
      | tcID     | game           | numbers             | boards | ticketCost | draws |
      | "LO015a" | "LOTTO"        | "01 02 03 04 05 06" | 2      | 5.0        | 10    |
      | "LO015b" | "LOTTO PLUS 1" | "01 02 03 04 05 06" | 2      | 7.5        | 10    |
      | "LO015c" | "LOTTO PLUS 2" | "01 02 03 04 05 06" | 2      | 10.0       | 10    |
#
  Scenario: LO016 Verify that a player is able to play Quick Pick for any board
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "LOTTO" icon
    And Click on QUICK PICK
    And Player clicks on SUBMIT button
    And Click ADD TO CART button
    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
    And Click on BACK ARROW
    And Click on BACK ARROW
    And Click Go To Cart button
    And Click PAY FROM MY WALLET
    And Click PAY NOW
    And Verify played numbers on receipt

  Scenario: Clear All Cart Items
    * Player clicks on Cart icon
    * Remove all Items from Cart

  Scenario: LO017 Verify that a player is able to open LOTTO game play screen without Logging In or Registration
    When Player Clicks Home screen "LOGOUT" icon
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "LOTTO" icon
    Then Player should be on "LOGIN" screen
