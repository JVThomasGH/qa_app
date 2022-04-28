@POWERBALL
Feature: Play Now POWERBALL Game

  Background: Login
    Given Player navigates to login form
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    And Player clicks LOGIN button

  Scenario: Clear All Cart Items
    * Player clicks on Cart icon
    * Remove all Items from Cart
    * Click on BACK ARROW

  Scenario: PB001 Verify that a player is able to open POWERBALL game play screen after logging in with valid username and password
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "POWERBALL" icon
    Then Player should be on "POWERBALL" screen

  Scenario Outline: PB002 Verify that a player is not able to select same number more than once on a board
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "POWERBALL" icon
    And Play a board for "POWERBALL" <numbers> with 5 balls
    And Player clicks on SUBMIT button
    * Verify Pop Up "Please select any 5 numbers and 1 powerball" Close PopUp? "Yes"
    Examples:
      | game        | numbers             |
      | "POWERBALL" | "01 02 03 04 01 20" |

  Scenario Outline: PB003 Verify that a player is able to deselect the selected numbers on a board
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "POWERBALL" icon
    And Play a board for "POWERBALL" <numbers> and duplicate
    And Player clicks on SUBMIT button
    * Verify Pop Up "Please select any 5 numbers and 1 powerball" Close PopUp? "Yes"
    Examples:
      | game        | numbers             |
      | "POWERBALL" | "01 02 03 04 05 20" |

  Scenario Outline: PB004 <game> - Verify that a player is able to select exactly 5 numbers on 1 board
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "POWERBALL" icon
    And Play a board for <game> <numbers> with 5 balls
    And Player clicks on SUBMIT button
    Then Selected <numbers> reflect on the chosen Board of ticket <game>
    And Click ADD TO CART button
    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
    Examples:
      | game        | numbers             |
      | "POWERBALL" | "01 02 03 04 05 20" |
#      | "POWERBALL PLUS" | "01 02 03 04 05 20" |

  Scenario Outline: PB005 Verify whether a player is able to select more than 5 numbers on 1 board
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "POWERBALL" icon
    And Play a board for "POWERBALL" <numbers> with 6 balls
    * Verify Pop Up "Board Max Reached" Close PopUp? "Yes"
    Examples:
      | game        | numbers                |
      | "POWERBALL" | "01 02 03 04 05 06 07" |

  Scenario: PB006 Verify that the ADD TO CART button is disabled before user Selects a board
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "POWERBALL" icon
    And Player selects one board
    And Player clicks on SUBMIT button
    * Verify Pop Up "Please select any 5 numbers and 1 powerball" Close PopUp? "Yes"

  Scenario Outline: PB007 Verify that a player is able to Play multiple boards
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "POWERBALL" icon
    And Play 20 boards "POWERBALL" <numbers>
    And Player clicks on Add To Cart button
    Examples:
      | game        | numbers             |
      | "POWERBALL" | "01 02 03 04 05 06" |

  Scenario Outline: PB008 Verify that the reset button clears the selected numbers
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "POWERBALL" icon
    And Play a board for "POWERBALL" <numbers> with 5 balls
    And Player clicks on RESET button
    Then All the selected numbers should be deselected and there should be no numbers under YOUR SELECTED NUMBERS
    Examples:
      | game        | numbers             |
      | "POWERBALL" | "01 02 03 04 05 06" |

  Scenario Outline: PB009 Verify that the ticket price increases in multiples of R5 for each board of POWERBALL played till 5 boards
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "POWERBALL" icon
    And Move game slider to <draws>
    And Play <boards> boards "POWERBALL" <numbers>
    And The ticket price should be equal to R<ticketCost> x number of boards <boards> x number of draws <draws>
    Examples:
      | game        | numbers             | boards | ticketCost | draws |
      | "POWERBALL" | "01 02 03 04 05 06" | 4      | 5          | 3     |

  Scenario Outline: PB010 Verify that a player is able to save the selected numbers
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "POWERBALL" icon
    And Play <boards> boards <game> <numbers>
    And Player clicks on SAVE NUMBERS check mark
    Examples:
      | game        | numbers             | boards |
      | "POWERBALL" | "01 02 03 04 05 06" | 1      |

  Scenario: PB011 Verify that a player is able to play the saved numbers for any board
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "POWERBALL" icon
    And Click on Play my saved numbers drop down
    And Player clicks on SUBMIT button
    And Verify option was selected

  Scenario: PB012 Verify that a player is able to play Quick Pick for any board
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "POWERBALL" icon
    And Click on QUICK PICK
    And Player clicks on SUBMIT button
    And Verify option was selected
    And Verify QUICK PICK was selected

  Scenario Outline: PB013 Verify that a player is able to save ticket using the my save ticket option after selecting numbers from 1 or more boards
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "POWERBALL" icon
    And Play a board for "POWERBALL" <numbers> with 5 balls
    And Player clicks on SUBMIT button
    And Click on SAVE MY TICKET button
    * Verify Pop Up "Ticket Saved Successfully" Close PopUp? "Yes"
    Examples:
      | game        | numbers             |
      | "POWERBALL" | "01 02 03 04 05 06" |

  Scenario Outline: PB014 Verify that a player is able to play saved tickets
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "POWERBALL" icon
    And Play a board for "POWERBALL" <numbers> with 5 balls
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
      | game        | numbers             |
      | "POWERBALL" | "02 04 06 08 10 12" |

  Scenario Outline: PB015 Verify that the total ticket price for POWERBALL game is correct
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "POWERBALL" icon
    And Move game slider to <draws>
    And Play <boards> boards "POWERBALL" <numbers>
    And The ticket price should be equal to R<ticketCost> x number of boards <boards> x number of draws <draws>
    Examples:
      | game        | numbers             | boards | ticketCost | draws |
      | "POWERBALL" | "01 02 03 04 05 06" | 5      | 5          | 10    |
#
  Scenario: PB016 Verify that a player is able to play Quick Pick for any board
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "POWERBALL" icon
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
#
  Scenario: Clear All Cart Items
    * Player clicks on Cart icon
    * Remove all Items from Cart

  Scenario: PB017 Verify that a player is able to open POWERBALL game play screen without Logging In or Registration
    When Player Clicks Home screen "LOGOUT" icon
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "POWERBALL" icon
    Then Player should be on "LOGIN" screen

