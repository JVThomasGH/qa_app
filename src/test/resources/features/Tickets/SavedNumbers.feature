@SavedNumbers
@Tickets
Feature: Saved Numbers

  Scenario: Initialise App
    Given Player navigates to login form

  Scenario: Login
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    * Player clicks LOGIN button

  Scenario: SN001 Verify that ONLY LOTTO, POWERBALL and DAILY LOTTO games are displayed under the Saved Numbers tab
    * Player Clicks Home screen "TICKETS" icon
    * Lotto PowerBall and Daily Lotto options are displayed
    * Click on BACK ARROW

  Scenario Outline: <tcID> <game> Verify that the player is able to select the Numbers they want to Save after selecting the Game
    * Player Clicks Home screen "PLAY" icon
    * Player clicks on <game> icon
    * Play <boards> boards <game> <numbers>
    * Player clicks on SAVE NUMBERS check mark
    * Verify Pop Up "Numbers Saved Successfully" Close PopUp? "Yes"
#    * Verify Pop Up "Numbers are already saved" Close PopUp? "Yes"
    * Click on BACK ARROW
    * Click on BACK ARROW
    Examples:
      | tcID    | game          | numbers             | boards |
      | "SN002" | "LOTTO"       | "19 16 03 04 05 09" | 1      |
      | "SN003" | "POWERBALL"   | "19 02 03 04 05 20" | 1      |
      | "SN004" | "DAILY LOTTO" | "19 02 03 04 07"    | 1      |

  Scenario Outline: <tcID> <game> Verify that the player is able RESET their selection
    * Player Clicks Home screen "PLAY" icon
    * Player clicks on <game> icon
    * Play a board for <game> <numbers>
    * Player clicks on RESET button
    * Click on BACK ARROW
    * Click on BACK ARROW
    * Click on BACK ARROW
    Examples:
      | tcID    | game          | numbers             | boards |
      | "SN005" | "LOTTO"       | "01 02 03 04 14 09" | 1      |
      | "SN006" | "DAILY LOTTO" | "01 02 03 04 07"    | 1      |

  Scenario Outline: <tcID> <game> Verify that the player is able RESET their selection
    * Player Clicks Home screen "PLAY" icon
    * Player clicks on <game> icon
    And Play a board for "POWERBALL" <numbers> with 5 balls
    And Player clicks on RESET button
    * Click on BACK ARROW
    * Click on BACK ARROW
    * Click on BACK ARROW
    Examples:
      | tcID    | game        | numbers             | boards |
      | "SN007" | "POWERBALL" | "08 02 03 04 05 20" | 1      |

  Scenario Outline: <tcID> Verify that the LOTTO Saved Numbers are displayed
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on SAVED NUMBERS <game>
    * Player clicks PLAY SAVED NUMBERS
    * Player verifies Saved Numbers PopUp
    * Click on BACK ARROW
    * Click on BACK ARROW
    Examples:
      | tcID    | game          |
      | "SN008" | "LOTTO"       |
      | "SN009" | "DAILY LOTTO" |
      | "SN010" | "POWERBALL"   |

  Scenario Outline: <tcID> Verify that the player is able to delete the Saved Numbers
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on SAVED NUMBERS <game>
    * Player clicks PLAY SAVED NUMBERS
    * Player Deletes Saved Numbers in PopUp
    * Verify Pop Up "Numbers deleted successfully." Close PopUp? "Yes"
    * Player verifies Saved Numbers PopUp
    * Click on BACK ARROW
    * Click on BACK ARROW
    Examples:
      | tcID    | game          |
      | "SN011" | "LOTTO"       |
      | "SN012" | "DAILY LOTTO" |
      | "SN013" | "POWERBALL"   |

  Scenario Outline: <tcID> Verify that the player is able to PLAY the Saved Numbers
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on SAVED NUMBERS <game>
    * Player clicks PLAY SAVED NUMBERS
    * Player Play Saved Numbers in PopUp
    * Click ADD TO CART button
    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
    And Click Go To Cart button
    And Click PAY FROM MY WALLET
    And Click PAY NOW
    And Verify played numbers on receipt
    * Click on BACK ARROW
    * Click on BACK ARROW
    * Click on BACK ARROW
    * Click on BACK ARROW
    Examples:
      | tcID    | game          |
      | "SN014" | "LOTTO"       |
      | "SN015" | "DAILY LOTTO" |
      | "SN016" | "POWERBALL"   |

  Scenario Outline: <tcID> Verify that the SAVE button is enabled when <game> numbers are selected
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    And Play <boards> boards <game> <numbers>
    And Player clicks on SAVE NUMBERS check mark
    * Verify Pop Up "Numbers Saved Successfully" Close PopUp? "Yes"
    And Click on BACK ARROW
    And Click on BACK ARROW
    Examples:
      | tcID    | game          | numbers             | boards |
      | "SN017" | "LOTTO"       | "01 02 03 04 27 06" | 1      |
      | "SN018" | "DAILY LOTTO" | "01 02 03 04 27"    | 1      |
      | "SN019" | "POWERBALL"   | "01 02 03 04 27 06" | 1      |
