@RESULTS
Feature: To Verify RESULTS LOTTO

  Background: Login
    Given Player navigates to login form
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    And Player clicks LOGIN button

  Scenario Outline: <tcID> <game> - To verify whether the user is able to view <game> Results
    When Player Clicks Home screen "RESULTS" icon
    And Player should be on "RESULTS" screen
    And Player clicks <game> Results
    And Verify that the <game> result numbers are also displayed in numerical order
    And <game> - In the More Info section verify the following info is displayed - ROLLOVER AMOUNT, ROLLOVER NO, TOTAL PRIZE POOL, TOTAL SALES, NEXT JACKPOT, DRAW MACHINE and NEXT DRAW DATE
    And Click on BACK ARROW
    And Click on BACK ARROW
    Examples:
      | tcID      | game                 |
      | "RES001"  | "LOTTO"              |
      | "RES002"  | "POWERBALL"          |
      | "RES003"  | "LOTTO PLUS 1"       |
      | "RES004"  | "POWERBALL PLUS"     |
      | "RES005"  | "LOTTO PLUS 2"       |
      | "RES006"  | "DAILY LOTTO"        |
      | "RES007"  | "SPORTSTAKE 4"       |
      | "RES008"  | "SPORTSTAKE 8"       |
      | "RES009"  | "SPORTSTAKE 13"      |
      | "RES0010" | "SPORTSTAKE CRICKET" |
      | "RES0011" | "SPORTSTAKE RUGBY"   |
      | "RES0012" | "RAFFLE"             |
      | "RES0013" | "PICK 3"             |
      | "RES0014" | "RAPIDO"             |

  Scenario Outline: <tcID> <game> - To verify whether the user is able to to click on the HISTORICAL RESULTS button view Historical Results
    When Player Clicks Home screen "RESULTS" icon
    And Player clicks <game> Results
    And Clicks on HISTORICAL RESULTS <game>
    And Click on BACK ARROW
    And Click on BACK ARROW
    And Click on BACK ARROW
    Examples:
      | tcID      | game                 |
      | "RES0015" | "LOTTO"              |
      | "RES0016" | "POWERBALL"          |
      | "RES0017" | "LOTTO PLUS 1"       |
      | "RES0018" | "POWERBALL PLUS"     |
      | "RES0019" | "LOTTO PLUS 2"       |
      | "RES0020" | "DAILY LOTTO"        |
      | "RES0021" | "SPORTSTAKE 4"       |
      | "RES0022" | "SPORTSTAKE 8"       |
      | "RES0023" | "SPORTSTAKE 13"      |
      | "RES0024" | "SPORTSTAKE CRICKET" |
      | "RES0025" | "SPORTSTAKE RUGBY"   |
      | "RES0026" | "RAFFLE"             |
      | "RES0027" | "PICK 3"             |
      | "RES0028" | "RAPIDO"             |

  Scenario Outline: <tcID> <game> - To verify whether the user is able to search Historical Results using a Date range
    When Player Clicks Home screen "RESULTS" icon
    And Player clicks <game> Results
    And Clicks on HISTORICAL RESULTS <game>
    And Enter the Start Date - d m yyyy "1" "11" "2019"
    And Enter the End Date - d m yyyy "10" "11" "2021"
    And Click SEARCH
    And Click on BACK ARROW
    And Click on BACK ARROW
    And Click on BACK ARROW
    Examples:
      | tcID      | game                 |
      | "RES0029" | "LOTTO"              |
      | "RES0030" | "POWERBALL"          |
      | "RES0031" | "LOTTO PLUS 1"       |
      | "RES0032" | "POWERBALL PLUS"     |
      | "RES0033" | "LOTTO PLUS 2"       |
      | "RES0034" | "DAILY LOTTO"        |
      | "RES0035" | "SPORTSTAKE 4"       |
      | "RES0036" | "SPORTSTAKE 8"       |
      | "RES0037" | "SPORTSTAKE 13"      |
      | "RES0038" | "SPORTSTAKE CRICKET" |
      | "RES0039" | "SPORTSTAKE RUGBY"   |
      | "RES0040" | "RAFFLE"             |
      | "RES0041" | "PICK 3"             |
      | "RES0042" | "RAPIDO"             |

  Scenario Outline: <tcID> <game> - CRITICAL - To verify that wining numbers in the Historical List view matches the winning numbers in the detailed view
    When Player Clicks Home screen "RESULTS" icon
    And Player clicks <game> Results
    And Clicks on HISTORICAL RESULTS <game>
    And Click on View More Info to verify that the displayed winning numbers in the Historical Results page match the Winning numbers in the detailed view screen - <game>
    And Click on BACK ARROW
    And Click on BACK ARROW
    And Click on BACK ARROW
    And Click on BACK ARROW
    Examples:
      | tcID      | game             |
      | "RES0043" | "LOTTO"          |
      | "RES0044" | "POWERBALL"      |
      | "RES0045" | "LOTTO PLUS 1"   |
      | "RES0046" | "POWERBALL PLUS" |
      | "RES0047" | "LOTTO PLUS 2"   |
      | "RES0048" | "DAILY LOTTO"    |

  Scenario Outline: <tcID> <game> - Verify that Disclaimer and Lotto banner are added to the bottom of the LOTTO results page
    When Player Clicks Home screen "RESULTS" icon
    And Player clicks <game> Results
    And Clicks on HISTORICAL RESULTS <game>
    And Verify that the Disclaimer text and <game> banner are displayed at the bottom of the screen
    And Click on BACK ARROW
    And Click on BACK ARROW
    And Click on BACK ARROW
    Examples:
      | tcID      | game                 |
      | "RES0049" | "LOTTO"              |
      | "RES0050" | "POWERBALL"          |
      | "RES0051" | "LOTTO PLUS 1"       |
      | "RES0052" | "POWERBALL PLUS"     |
      | "RES0053" | "LOTTO PLUS 2"       |
      | "RES0054" | "DAILY LOTTO"        |
      | "RES0055" | "SPORTSTAKE 4"       |
      | "RES0056" | "SPORTSTAKE 8"       |
      | "RES0057" | "SPORTSTAKE 13"      |
      | "RES0058" | "SPORTSTAKE CRICKET" |
      | "RES0059" | "SPORTSTAKE RUGBY"   |
      | "RES0060" | "RAFFLE"             |
      | "RES0061" | "PICK 3"             |
      | "RES0062" | "RAPIDO"             |

  Scenario Outline: <tcID> <game> - Verify that user can Play or Save winning numbers from Results screen
    When Player Clicks Home screen "RESULTS" icon
    And Player clicks <game> Results
    And Click on Play Numbers for <game>
    And Click on BACK ARROW
    And Click on Save Numbers
    And Click on BACK ARROW
    And Click on BACK ARROW
    Examples:
      | tcID      | game             |
      | "RES0063" | "LOTTO"          |
      | "RES0064" | "POWERBALL"      |
      | "RES0065" | "LOTTO PLUS 1"   |
      | "RES0066" | "POWERBALL PLUS" |
      | "RES0067" | "LOTTO PLUS 2"   |
      | "RES0068" | "DAILY LOTTO"    |
#
  Scenario: Logout
    When Player Clicks Home screen "LOGOUT" icon

  Scenario: RES0069 To verify whether the user is able to view Raffle Results without logging in
    When Player Clicks Home screen "RESULTS" icon
    Then Player should be on "RESULTS" screen
    And Verify the "RESULTS" page contents
    And Click on BACK ARROW

