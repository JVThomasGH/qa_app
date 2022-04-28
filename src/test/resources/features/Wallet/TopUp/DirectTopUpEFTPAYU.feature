@DirectTopUpEFTPayU
Feature: Direct Top Up EFT PayU

  AVERAGE TIME: 1 min
  EFT PAYU NOT AVAILABLE

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

    Scenario: DTE001 Verify whether the EFT page is opening on clicking its widget
      When Player Clicks Home screen "WALLET" icon
      And Player should be on "WALLET" screen
      And Player clicks "TOP UP" button
      And Player should be on "TOP UP" screen
      * Click on BACK ARROW
      * Click on BACK ARROW

    Scenario: DTE002 Verify whether all the details of the banks given over the EFT page are right
      When Player Clicks Home screen "WALLET" icon
      And Player should be on "WALLET" screen
      And Player clicks "TOP UP" button
      * Click on BACK ARROW
      * Click on BACK ARROW

    Scenario: DTE003 Verify whether the user is able to Top up using Instant EFT
      When Player Clicks Home screen "WALLET" icon
      And Player should be on "WALLET" screen
      And Player clicks "TOP UP" button
      * Click on BACK ARROW
      * Click on BACK ARROW
