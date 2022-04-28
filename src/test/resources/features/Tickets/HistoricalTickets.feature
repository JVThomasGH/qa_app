@HistoricalTickets
@Tickets
Feature: Historical Tickets

  Background: Login
    Given Player navigates to login form
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    And Player clicks LOGIN button

  Scenario: HT001 Verify that the Transaction Date, Amount, Type and View Ticket is displayed under the Historical Tickets screen
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on "HISTORICAL TICKETS"
    And Enter the Start Date for Historical Tickets - d m yyyy "1" "01" "2022"
    And Enter the End Date for Historical Tickets - d m yyyy "20" "01" "2022"
    And Click SEARCH Historical Tickets
    And Verify that the Transaction Date Amount Type and View Ticket is displayed

  Scenario: HT002 Verify that the player is able to select tickets using a Date range
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on "HISTORICAL TICKETS"
    And Enter the Start Date for Historical Tickets - d m yyyy "1" "01" "2022"
    And Enter the End Date for Historical Tickets - d m yyyy "20" "01" "2022"
    And Click SEARCH Historical Tickets

  Scenario Outline: <tcID> Verify that <game> ticket is present on Historical ticket or not
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on "HISTORICAL TICKETS"
    And Enter the Start Date for Historical Tickets - d m yyyy "1" "01" "2022"
    And Enter the End Date for Historical Tickets - d m yyyy "20" "01" "2022"
    And Click SEARCH Historical Tickets
    And Verify that <game> ticket is present on Historical ticket or not
    Examples:
      | tcID    | game             |
      | "HT003" | "Lotto"          |
      | "HT004" | "Lotto Plus 1"   |
      | "HT005" | "Lotto Plus 2"   |
      | "HT006" | "PowerBall"      |
      | "HT007" | "PowerBall Plus" |
      | "HT008" | "Daily Lotto"    |
      | "HT009" | "SportStake 08"  |
      | "HT010" | "SportStake 13"  |
      | "HT011" | "Raffle"         |

  Scenario Outline: Verify whether the correct information is pulling through on the View ticket information pop-up
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on "HISTORICAL TICKETS"
    And Enter the Start Date for Historical Tickets - d m yyyy "1" "01" "2022"
    And Enter the End Date for Historical Tickets - d m yyyy "20" "01" "2022"
    And Click SEARCH Historical Tickets
    And Click VIEW button in Transaction History
    And Verify that <game>: Serial Number, Draw Number, First Draw, Ticket Cost, Draw Duration,
    Examples:
      | tcID    | game             |
      | "HT012" | "Lotto"          |
      | "HT013" | "Lotto Plus 1"   |
      | "HT014" | "Lotto Plus 2"   |
      | "HT015" | "PowerBall"      |
      | "HT016" | "PowerBall Plus" |
      | "HT017" | "Daily Lotto"    |
      | "HT018" | "SportStake 08"  |
      | "HT019" | "SportStake 13"  |
      | "HT020" | "Raffle"         |
