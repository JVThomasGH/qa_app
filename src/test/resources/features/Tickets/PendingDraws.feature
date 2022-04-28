@PendingDraws
@Tickets
Feature: Pending Draws

  Scenario: Initialise App
    Given Player navigates to login form

  Scenario: Login
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    * Player clicks LOGIN button

  Scenario: PD001 Verify that Pending Draws tab is displayed under MY TICKETS
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on "PENDING DRAWS"
    * Click VIEW button
    * Navigate BACK on Mobile device
    * Click on BACK ARROW

  Scenario Outline: <tcID> Verify that the Bet Duration is displayed under Pending Draws tab for SPORTSTAKE 8
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    And Player clicks on PLAY MANUAL SELECT
    And Player captures <predictions> predictions for the "First Half" "single" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
    And Player captures <predictions> predictions for the "Second Half" "single" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
    And Player clicks on SUBMIT button SportStake
    And Click ADD TO CART button SportStake
    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
    And Click on BACK ARROW
    And Click on BACK ARROW
    And Click Go To Cart button
    And Click PAY FROM MY WALLET
    And Click PAY NOW
    And Player verifies Receipt
    And Click on BACK ARROW
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on "PENDING DRAWS"
    * Click VIEW button
    And Verify that Bet Duration is displayed
    * Navigate BACK on Mobile device
    And Click on BACK ARROW
    Examples:
      | tcID   | game           | predictions |
      | "PD002 | "SPORTSTAKE 8" | 8           |

  Scenario Outline: <tcID> Verify that the Bet Duration is displayed under Pending Draws tab for SPORTSTAKE 13
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    And Player clicks on PLAY MANUAL SELECT
    And Player captures <predictions> predictions for the "" "single" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 | 1 | 2 | 1 | 1 | 3 |
    And Player clicks on SUBMIT button SportStake
    And Click ADD TO CART button SportStake
    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
    And Click on BACK ARROW
    And Click on BACK ARROW
    And Click Go To Cart button
    And Click PAY FROM MY WALLET
    And Click PAY NOW
    And Player verifies Receipt
    And Click on BACK ARROW
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on "PENDING DRAWS"
    * Click VIEW button
    And Verify that Bet Duration is displayed
    * Navigate BACK on Mobile device
    And Click on BACK ARROW
    Examples:
      | tcID   | game              | predictions |
      | "PD003 | "SPORTSTAKE 13TM" | 13          |

  Scenario Outline: PD004 Verify that the Game Name/Ticket Number/Draw Date/Selected Numbers is displayed in the ticket details under Pending Draws tab
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "LOTTO" icon
    And Play a board for "LOTTO" <numbers>
    And Player clicks on SUBMIT button
    And Click ADD TO CART button
    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
    And Click on BACK ARROW
    And Click on BACK ARROW
    And Click Go To Cart button
    And Click PAY FROM MY WALLET
    And Click PAY NOW
    And Player verifies Receipt
    And Click on BACK ARROW
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on "PENDING DRAWS"
    * Click VIEW button
    * Verify Game Name for Pending Draws ticket
    * Verify Ticket Number for Pending Draws ticket
    * Verify Draw Date for Pending Draws ticket
    And Verify Selected Numbers for Pending Draws ticket
    Examples:
      | game    | numbers             |
      | "LOTTO" | "01 02 03 04 05 06" |

  Scenario Outline: PD005 Verify that the player is able to REPLAY the Ticket displayed under Pending Draws
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "LOTTO" icon
    And Play a board for "LOTTO" <numbers>
    And Player clicks on SUBMIT button
    And Click ADD TO CART button
    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
    And Click on BACK ARROW
    And Click on BACK ARROW
    And Click Go To Cart button
    And Click PAY FROM MY WALLET
    And Click PAY NOW
    And Player verifies Receipt
    And Click on BACK ARROW
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on "PENDING DRAWS"
    * Click VIEW button
    * Click REPLAY TICKET
    * Click ADD TO CART button
    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
    Examples:
      | game    | numbers             |
      | "LOTTO" | "01 02 03 04 05 06" |

  Scenario Outline: <tcID> Verify that the REPLAY TICKET option is NOT available for SPORTSTAKE 8
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    And Player clicks on PLAY MANUAL SELECT
    And Player captures <predictions> predictions for the "First Half" "single" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
    And Player captures <predictions> predictions for the "Second Half" "single" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
    And Player clicks on SUBMIT button SportStake
    And Click ADD TO CART button SportStake
    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
    And Click on BACK ARROW
    And Click on BACK ARROW
    And Click Go To Cart button
    And Click PAY FROM MY WALLET
    And Click PAY NOW
    And Player verifies Receipt
    And Click on BACK ARROW
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on "PENDING DRAWS"
    * Click VIEW button
    Examples:
      | tcID   | game           | predictions |
      | "PD006 | "SPORTSTAKE 8" | 8           |

  Scenario Outline: <tcID> Verify that the REPLAY TICKET option is NOT available for SPORTSTAKE 13
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    And Player clicks on PLAY MANUAL SELECT
    And Player captures <predictions> predictions for the "" "single" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 | 1 | 2 | 1 | 1 | 3 |
    And Player clicks on SUBMIT button SportStake
    And Click ADD TO CART button SportStake
    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
    And Click on BACK ARROW
    And Click on BACK ARROW
    And Click Go To Cart button
    And Click PAY FROM MY WALLET
    And Click PAY NOW
    And Player verifies Receipt
    And Click on BACK ARROW
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on "PENDING DRAWS"
    * Click VIEW button
    Examples:
      | tcID   | game              | predictions |
      | "PD007 | "SPORTSTAKE 13TM" | 13          |

  Scenario: PD008 Verify that the IF the Ticket was a PROPICK "YES" should be displayed in the Ticket information screen for SPORTSTAKE 8
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "SPORTSTAKE 8" icon
    And Player clicks on PLAY PROPICK
    And Player clicks on PLAY PROPICK "128"
    And Player clicks on SUBMIT button SportStake PROPICK
    And Click ADD TO CART button SportStake
    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
    And Click on BACK ARROW
    And Click on BACK ARROW
    And Click Go To Cart button
    And Click PAY FROM MY WALLET
    And Click PAY NOW
    And Player verifies Receipt
    And Click on BACK ARROW
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on "PENDING DRAWS"
    * Click VIEW button
    And Verify PROPICK IS YES
    * Navigate BACK on Mobile device
    * Click on BACK ARROW

  Scenario: PD009 Verify that the IF the Ticket was a PROPICK "YES" should be displayed in the Ticket information screen for SPORTSTAKE 8
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "SPORTSTAKE 13TM" icon
    And Player clicks on PLAY PROPICK
    And Player clicks on PLAY PROPICK "128"
    And Player clicks on SUBMIT button SportStake PROPICK
    And Click ADD TO CART button SportStake
    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
    And Click on BACK ARROW
    And Click on BACK ARROW
    And Click Go To Cart button
    And Click PAY FROM MY WALLET
    And Click PAY NOW
    And Player verifies Receipt
    And Click on BACK ARROW
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on "PENDING DRAWS"
    * Click VIEW button
    And Verify PROPICK IS YES
    * Navigate BACK on Mobile device
    * Click on BACK ARROW

  Scenario Outline: Verify that the IF the Ticket was NOT a PROPICK "NO" should be displayed in the Ticket information screen for SPORTSTAKE 08
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    And Player clicks on PLAY MANUAL SELECT
    And Player captures <predictions> predictions for the "First Half" "single" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
    And Player captures <predictions> predictions for the "Second Half" "single" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
    And Player clicks on SUBMIT button SportStake
    And Click ADD TO CART button SportStake
    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
    And Click on BACK ARROW
    And Click on BACK ARROW
    And Click Go To Cart button
    And Click PAY FROM MY WALLET
    And Click PAY NOW
    And Player verifies Receipt
    And Click on BACK ARROW
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on "PENDING DRAWS"
    * Click VIEW button
    * Verify PROPICK IS NO
    * Navigate BACK on Mobile device
    * Click on BACK ARROW
    Examples:
      | tcID   | game           | predictions |
      | "PD010 | "SPORTSTAKE 8" | 8           |

  Scenario Outline: Verify that the IF the Ticket was NOT a PROPICK "NO" should be displayed in the Ticket information screen for SPORTSTAKE 13
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    And Player clicks on PLAY MANUAL SELECT
    And Player captures <predictions> predictions for the "" "single" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 | 1 | 2 | 1 | 1 | 3 |
    And Player clicks on SUBMIT button SportStake
    And Click ADD TO CART button SportStake
    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
    And Click on BACK ARROW
    And Click on BACK ARROW
    And Click Go To Cart button
    And Click PAY FROM MY WALLET
    And Click PAY NOW
    And Player verifies Receipt
    And Click on BACK ARROW
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on "PENDING DRAWS"
    * Click VIEW button
    * Verify PROPICK IS NO
    * Navigate BACK on Mobile device
    * Click on BACK ARROW
    Examples:
      | tcID   | game              | predictions |
      | "PD011 | "SPORTSTAKE 13TM" | 13          |

  Scenario Outline: Verify that the Team Names are displayed under Pending Draws Sportstake Ticket Info
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    And Player clicks on PLAY MANUAL SELECT
    And Player captures <predictions> predictions for the "First Half" "single" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
    And Player captures <predictions> predictions for the "Second Half" "single" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 |
    And Player clicks on SUBMIT button SportStake
    And Click ADD TO CART button SportStake
    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
    And Click on BACK ARROW
    And Click on BACK ARROW
    And Click Go To Cart button
    And Click PAY FROM MY WALLET
    And Click PAY NOW
    And Player verifies Receipt
    And Click on BACK ARROW
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on "PENDING DRAWS"
    * Click VIEW button
    And Verify that Team names are displayed in YOUR SELECTION section of the ticket information screen
    Examples:
      | tcID   | game           | predictions |
      | "PD012 | "SPORTSTAKE 8" | 8           |

  Scenario: Verify that the Num. of Draws is displayed under Pending Draws tab LOTTO game

  Scenario: Verify that the Num. of Draws is displayed under Pending Draws tab POWERBALL game

  Scenario: Verify that the Num. of Draws is displayed under Pending Draws tab DAILY LOTTO game
















