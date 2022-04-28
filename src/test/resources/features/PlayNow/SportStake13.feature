@SPORTSTAKE13
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
      | tcID    | game              |
      | "S1301" | "SPORTSTAKE 13TM" |

  Scenario Outline: <tcID> <game> - Verify whether Player is able to select option/Predictions in less than 13 rows
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    And Player clicks on PLAY MANUAL SELECT
    And Player captures <predictions> predictions for the "" "single" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 | 1 | 2 | 1 | 1 | 3 |
    And Player clicks on SUBMIT button SportStake
    * Verify Pop Up "Please select at least one result from each row" Close PopUp? "Yes"
    Examples:
      | tcID    | game              | predictions |
      | "S1302" | "SPORTSTAKE 13TM" | 12          |

  Scenario Outline: <tcID> <game> - Verify that Player is able to select options/predictions in all 13 rows
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    And Player clicks on PLAY MANUAL SELECT
    And Player captures <predictions> predictions for the "" "single" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 | 1 | 2 | 1 | 1 | 3 |
    And Player clicks on SUBMIT button SportStake
    Examples:
      | tcID    | game              | predictions |
      | "S1303" | "SPORTSTAKE 13TM" | 13          |

  Scenario Outline: <tcID> <game> - Verify that maximum bet amount allowed validation is working (which is configurable, currently R2000)
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    And Player clicks on PLAY MANUAL SELECT
    And Player captures <predictions> predictions for the "" "multi" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 | 1 | 2 | 1 | 1 | 3 |
    And Player clicks on SUBMIT button SportStake
    * Verify Pop Up "Price is greater than R2000.00" Close PopUp? "Yes"
    Examples:
      | tcID    | game              | predictions |
      | "S1304" | "SPORTSTAKE 13TM" | 13          |

  Scenario Outline: <tcID> <game> - Verify that maximum bet amount allowed validation is working (which is configurable, currently R2000)
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    And Player clicks on PLAY MANUAL SELECT
    And Player captures <predictions> predictions for the "" "multi" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 | 1 | 2 | 1 | 1 | 3 |
    And Player clicks on SUBMIT button SportStake
    * Verify Pop Up "Price is greater than R2000.00" Close PopUp? "Yes"
    Examples:
      | tcID    | game              | predictions |
      | "S1305" | "SPORTSTAKE 13TM" | 13          |

  Scenario Outline: <tcID> <game> - Verify that selected options/results get deselected when user select an already selected option/result
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    And Player clicks on PLAY MANUAL SELECT
    And Select predictions for matches and then deselect it for <game>
    And Player clicks on SUBMIT button SportStake
    * Verify Pop Up "Please select at least one result from each row" Close PopUp? "Yes"
    Examples:
      | tcID    | game              |
      | "S0806" | "SPORTSTAKE 13TM" |

  Scenario Outline: <tcID> <game> - Verify that "Reset" button resets the selected options
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    And Player clicks on PLAY MANUAL SELECT
    And Player captures <predictions> predictions for the "" "multi" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 | 1 | 2 | 1 | 1 | 3 |
    And Player clicks on RESET button SportStake
    Examples:
      | tcID    | game              | predictions |
      | "S1307" | "SPORTSTAKE 13TM" | 13          |

  Scenario Outline: <tcID> <game> - Verify that user is able to add the ticket to Cart after choosing options/predictions in all 13 rows
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    And Player clicks on PLAY MANUAL SELECT
    And Player captures <predictions> predictions for the "" "single" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 | 1 | 2 | 1 | 1 | 3 |
    And Player clicks on SUBMIT button SportStake
    And Click ADD TO CART button SportStake
    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
    Examples:
      | tcID    | game              | predictions |
      | "S1308" | "SPORTSTAKE 13TM" | 13          |

  Scenario: S1309 - Verify that user is able to play the "Pro Pick" game play option
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on "SPORTSTAKE 13TM" icon
    And Player clicks on PLAY PROPICK
    And Player clicks on PLAY PROPICK "128"
    And Player clicks on SUBMIT button SportStake PROPICK
    And Click ADD TO CART button SportStake
    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"

  Scenario Outline: <tcID> <game> - Verify that user is able to open My Cart screen having Sportstake 13 ticket added
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    And Player clicks on PLAY MANUAL SELECT
    And Player captures <predictions> predictions for the "" "single" <game>
      | 1 | 1 | 2 | 3 | 2 | 1 | 3 | 3 | 1 | 2 | 1 | 1 | 3 |
    And Player clicks on SUBMIT button SportStake
    And Click ADD TO CART button SportStake
    * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
    * Player clicks on Cart icon
    Then Player should be taken to My Cart screen displaying SPORTSTAKE tickets added to cart
    Examples:
      | tcID    | game              | predictions |
      | "S1310" | "SPORTSTAKE 13TM" | 13          |

  Scenario Outline: <tcID> <game> - Verify that the SPORTSTAKE 13 ticket can be purchased successfully
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
    Examples:
      | tcID   | game              | predictions |
      | "S0811 | "SPORTSTAKE 13TM" | 13          |

  Scenario: Logout
    When Player Clicks Home screen "LOGOUT" icon

  Scenario Outline: <tcID> <game> -  Verify whether player should not able to open <game> GamePlay screen without Logging In/Registration
    When Player Clicks Home screen "PLAY" icon
    And Player clicks on <game> icon
    Then Player should be on "LOGIN" screen
    And Click "LOGIN" CANCEL button
    Examples:
      | tcID    | game              |
      | "S1312" | "SPORTSTAKE 13TM" |
