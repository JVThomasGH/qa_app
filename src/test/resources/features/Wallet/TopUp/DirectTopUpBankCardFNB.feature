@DirectTopUpBankCardFNB
Feature: Direct Top Up Bank Card FNB

  AVERAGE TIME: 6 min
  QC PASS 29/11/2021 (FNB SYSTEM NOT AVAILABLE)

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

  Scenario: DT001 Verify whether Pay via Payu button has been changed to Deposit
    When Player Clicks Home screen "WALLET" icon
    And Player should be on "WALLET" screen
    And Player clicks "TOP UP" button
    And Check whether Pay Via Payu button is changed to DEPOSIT button
    * Click on BACK ARROW
    * Click on BACK ARROW

  Scenario: DT002 Verify that Upon selecting credit Card Player is directed to the FNB interface
    When Player Clicks Home screen "WALLET" icon
    And Player clicks "TOP UP" button
    And For Payment Method select "Bank Card"
    And Enter Deposit Amount "10000"
    And Click DEPOSIT button
    And User should be redirected to FNB interface for deposit
    And Navigate BACK on Mobile device
    * Click on BACK ARROW
    * Click on BACK ARROW

  Scenario: DT003 Verify on the FNB interface the Player is able to make a successful transaction for deposit
    When Player Clicks Home screen "WALLET" icon
    And Player clicks "TOP UP" button
    And For Payment Method select "Bank Card"
    And Enter Deposit Amount "10000"
    And Click DEPOSIT button
    And Player captures a successful FNB transaction
    And Verify Top Up Success Message
    * Click on BACK ARROW
    * Click on BACK ARROW

  Scenario: DT004 Verify whether the player is redirected on the National lottery online platform after successful transaction
    When Player Clicks Home screen "WALLET" icon
    And Player clicks "TOP UP" button
    And For Payment Method select "Bank Card"
    And Enter Deposit Amount "10000"
    And Click DEPOSIT button
    And Player captures a successful FNB transaction
      * Click on BACK ARROW
    * Click on BACK ARROW

  Scenario: DT005 Verify whether the player is redirected on the National lottery online platform after Failed transaction
    When Player Clicks Home screen "WALLET" icon
    And Player clicks "TOP UP" button
    And For Payment Method select "Bank Card"
    And Enter Deposit Amount "10000"
    And Click DEPOSIT button
    And Player captures an unsuccessful FNB transaction
    Then Player should get a Decline confirmation once the FNB system confirms the payment has been failed
    * Click on BACK ARROW
    * Click on BACK ARROW

  Scenario: DT006 Verify whether the player wallet is topped up after successful transaction
    When Player Clicks Home screen "WALLET" icon
    And Player notes Before Wallet balance
    And Player clicks "TOP UP" button
    And For Payment Method select "Bank Card"
    And Enter Deposit Amount "10000"
    And Click DEPOSIT button
    And Player captures a successful FNB transaction
    And Player notes After Wallet balance
    And Compare Before with After Wallet Balance

  Scenario: DT007 Verify whether the player wallet remain the same if the transaction is failed
    When Player Clicks Home screen "WALLET" icon
    And Player notes Before Wallet balance
    And Player clicks "TOP UP" button
    And For Payment Method select "Bank Card"
    And Enter Deposit Amount "10000"
    And Click DEPOSIT button
    And Player captures an unsuccessful FNB transaction
#    And Player notes After Wallet balance
#    And Compare Before with After Wallet Balance

  Scenario: DT008 Verify whether the player is able to see the deposit transaction in the Transaction history section
    When Player Clicks Home screen "WALLET" icon
    And Player notes Before Wallet balance
    And Player clicks "TOP UP" button
    And For Payment Method select "Bank Card"
    And Enter Deposit Amount "10000"
    And Click DEPOSIT button
    And Player captures a successful FNB transaction
#    TODO

    Scenario: DT009 Verify whether the system is switched to Payu if FNB system is down
      When Player Clicks Home screen "WALLET" icon
      And Player clicks "TOP UP" button
      And For Payment Method select "Bank Card"
      And Enter Deposit Amount "10000"
      And Click DEPOSIT button
      And Player captures a successful FNB transaction
#      TODO

