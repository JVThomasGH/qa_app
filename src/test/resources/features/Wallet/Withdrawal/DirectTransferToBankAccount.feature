@DirectTransferToBankAccount
Feature: Direct Transfer To Bank Account

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

  Scenario: DT001 Verify whether confirmation pop up is coming when selecting right bank profile with valid withdrawal amount
    * Player Clicks Home screen "WALLET" icon
    * Player should be on "WALLET" screen
    * Player clicks "WITHDRAWALS" button
    * Enter Withdrawal Amount "200"
    * For Withdrawal Method select "Direct Transfer"
    * For Banking Profile select "4234242442342134234"
    * Player clicks on SUBMIT button for Withdrawal
    * Player clicks on SUBMIT button for Withdrawal
    * Confirmation message should open up



