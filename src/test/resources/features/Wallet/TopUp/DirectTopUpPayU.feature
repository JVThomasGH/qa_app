@DirectTopUpPayU
Feature: Direct Top Up PayU

  AVERAGE TIME: 2 min
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

  Scenario: DTP001 Verify whether the Top Up Screen appears
      When Player Clicks Home screen "WALLET" icon
      And Player should be on "WALLET" screen
      And Player clicks "TOP UP" button
      And Player should be on "TOP UP" screen
    * Click on BACK ARROW
    * Click on BACK ARROW

  Scenario: DTP002 Verify the amount field is only taking valid amount
    When Player Clicks Home screen "WALLET" icon
    And Player clicks "TOP UP" button
    And For Payment Method select "Instant EFT"
    And Enter Deposit Amount "10001"
    And Click DEPOSIT button
    * Verify Pop Up "Amount should be in between R1.00 to R10,000.00" Close PopUp? "Yes"
    * Click on BACK ARROW
    * Click on BACK ARROW

  Scenario: DTP003 Verify whether the Pay with PayU button is working or not
    When Player Clicks Home screen "WALLET" icon
    And Player clicks "TOP UP" button
    And For Payment Method select "Instant EFT"
    And Enter Deposit Amount "10000"
    And Click DEPOSIT button
    And Player clicks iPay radio button
    And Player clicks CONTINUE button
    And Complete the PayU payment
    * Click on BACK ARROW
    * Click on BACK ARROW

  Scenario: DTP004 Verify whether all the details of the banks given over the EFT page are right
    When Player Clicks Home screen "WALLET" icon
    And Player clicks "TOP UP" button
    And For Payment Method select "Instant EFT"
    And Enter Deposit Amount "10000"
    And Click DEPOSIT button
    And Player clicks iPay radio button
    And Player clicks CONTINUE button
    And Complete the PayU payment
    * Click on BACK ARROW
    * Click on BACK ARROW
