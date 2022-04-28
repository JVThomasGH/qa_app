@RunningBalance
Feature: Running Balance

  AVERAGE TIME: 1 min 20 sec
  QC PASS 29/11/2021

  Scenario: Initialise App
    Given Player navigates to login form

  Scenario: Login
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
#      | 0823914052 | 12345 |
#      | 0795298337 | 24680 |
#      | 0737954697 | 23546 |
    And Player clicks LOGIN button

  Scenario: RB001 Verify whether player is able to see transaction history page or not
    * Player Clicks Home screen "WALLET" icon
    * Player should be on "WALLET" screen
    * Player clicks "TRANSACTION HISTORY" button
    * Player should be on "TRANSACTION HISTORY" screen
    And Click on BACK ARROW
    And Click on BACK ARROW
#
  Scenario: RB002 Verify whether player is able to select start & end date to see ledger wise transaction history of player's activity
    * Player Clicks Home screen "WALLET" icon
    * Player clicks "TRANSACTION HISTORY" button
    And Enter the Transaction History Start Date - d m yyyy "1" "11" "2019"
    And Enter the Transaction History End Date - d m yyyy "10" "11" "2021"
    And Click SEARCH Transaction History
    And Click on BACK ARROW
    And Click on BACK ARROW

  Scenario: RB003 Verify whether player's balance displays with ledger entries or not
    * Player Clicks Home screen "WALLET" icon
    * Player notes Before Wallet balance
    * Player clicks "TRANSACTION HISTORY" button
    * Player balance should be displayed with ledger entries
    And Displayed ledger entries with closing balance should be correct
    And Click on BACK ARROW
    And Click on BACK ARROW

  Scenario: RB004 Verify when the player selects date range in which no transaction is performed
    * Player Clicks Home screen "WALLET" icon
    * Player notes Before Wallet balance
    * Player clicks "TRANSACTION HISTORY" button
    And Enter the Transaction History Start Date - d m yyyy "20" "11" "2021"
    And Enter the Transaction History End Date - d m yyyy "21" "11" "2021"
    And Click SEARCH Transaction History
    And Message should display - No transaction details found for selected date range
    And Click on BACK ARROW
    And Click on BACK ARROW
