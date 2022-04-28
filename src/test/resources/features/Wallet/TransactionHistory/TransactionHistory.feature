@TransactionHistory
Feature: Transaction History

  AVERAGE TIME: 3 min
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
    * Player clicks LOGIN button

    Scenario: TH001 Verify whether the TRANSACTION HISTORY page is opening or not
      * Player Clicks Home screen "WALLET" icon
      * Player should be on "WALLET" screen
      * Player clicks "TRANSACTION HISTORY" button
      * Player should be on "TRANSACTION HISTORY" screen
      * Click on BACK ARROW
      * Click on BACK ARROW

  Scenario: TH002 Verify whether the start date drop down is opening the calendar view
    * Player Clicks Home screen "WALLET" icon
    * Player clicks "TRANSACTION HISTORY" button
    * Enter the Transaction History Start Date - d m yyyy "25" "11" "2021"
    * Enter the Transaction History End Date - d m yyyy "26" "11" "2021"
    * Click SEARCH Transaction History
    * Player should be able to scroll down to see wagers and winnings
    * Click on BACK ARROW
    * Click on BACK ARROW

  Scenario: TH003 Verify whether the start date drop down is opening the calendar view
    * Player Clicks Home screen "WALLET" icon
    * Player clicks "TRANSACTION HISTORY" button
    * Enter the Transaction History Start Date - d m yyyy "1" "11" "2021"
    * Enter the Transaction History End Date - d m yyyy "20" "11" "2021"
    * Click SEARCH Transaction History
    * Check the Information of the transaction history for the game
    * Click on BACK ARROW
    * Click on BACK ARROW

  Scenario: TH004 Verify that Ticket Details option is available in transaction history
    * Player Clicks Home screen "WALLET" icon
    * Player clicks "TRANSACTION HISTORY" button
    * Enter the Transaction History Start Date - d m yyyy "16" "11" "2021"
    * Enter the Transaction History End Date - d m yyyy "17" "11" "2021"
    * Click SEARCH Transaction History
    * Verify the ticket details is displayed for each winning ticket
    * Click on BACK ARROW
    * Click on BACK ARROW
    * Click on BACK ARROW

  Scenario: TH005 Verify that Eaziwin Ticket Details option is available in transaction history
    * Verify that the Eaziwin Ticket Details option is available in the drop down before the Search button

  Scenario: TH006 Verify whether the user is able to select Eaziwin Ticket Details option from drop down of Transaction history
    * Verify whether the user is able to select Eaziwin Ticket Details option from drop down of Transaction history

  Scenario: TH007 Verify that user is able to view Game name, Transaction date, Amount and Transaction ID bet amount and Closing balance
    * Player Clicks Home screen "WALLET" icon
    * Player clicks "TRANSACTION HISTORY" button
    * Enter the Transaction History Start Date - d m yyyy "28" "11" "2021"
    * Enter the Transaction History End Date - d m yyyy "29" "11" "2021"
    * Click SEARCH Transaction History
    * Check the Information of the transaction history for the game
    * Click on BACK ARROW
    * Click on BACK ARROW
