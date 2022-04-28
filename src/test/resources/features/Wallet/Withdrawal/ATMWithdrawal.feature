@ATMWithdrawal
Feature: ATM Withdrawal

  AVERAGE TIME: 1 min
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

  Scenario: ATM001 Verify whether ATM Withdrawal functionality has been removed from National lottery Mobile app
    * Player Clicks Home screen "WALLET" icon
    * Player should be on "WALLET" screen
    * Player clicks "WITHDRAWALS" button
    * Enter Withdrawal Amount "200"
    * For Withdrawal Method select "ATM Withdrawal"
    * Verify Pop Up "ATM withdrawals not available" Close PopUp? "Yes"
#    * Player clicks on SUBMIT button for Withdrawal













