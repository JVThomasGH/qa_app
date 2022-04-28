@BankingDetails
Feature: Banking Details

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

  Scenario: BD001 Verify whether user is able to see My BANKING PROFILE or not
    * Player Clicks Home screen "WALLET" icon
    * Player should be on "WALLET" screen
    * Player clicks "WITHDRAWALS" button
    * Enter Withdrawal Amount "200"
    * For Withdrawal Method select "Direct Transfer"
    * For Banking Profile select "Add New Banking Profile"
    * Click ALLOW APP PERMISSIONS
    * Player should be on New Banking Profile page
    * Click on BACK ARROW
    * Click on BACK ARROW
    * Click on BACK ARROW

  Scenario: BD002 Verify that Add New Banking Profile fields cannot be left blank
    * Player Clicks Home screen "WALLET" icon
    * Player clicks "WITHDRAWALS" button
    * Enter Withdrawal Amount "200"
    * For Withdrawal Method select "Direct Transfer"
    * For Banking Profile select "Add New Banking Profile"
#    * Click ALLOW APP PERMISSIONS
    * Player clicks on SUBMIT button for Withdrawal

  Scenario Outline: BD003 <tcID> Verify that Add New Banking Profile fields cannot be left blank
    And Verify <field> cannot be left blank and field returns <fieldText>
    Examples:
      | tcID | field              | fieldText                      |
      | "A"  | "Select Bank Name" | "Please select Bank Name."     |
      | "B"  | "Account Type"     | "Please select Account Type."  |
      | "C"  | "Branch Code"      | "Please enter Branch Code."    |
      | "D"  | "Account Number"   | "Please enter Account Number." |
