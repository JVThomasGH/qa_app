@VoucherTopUp1Voucher
Feature: Voucher Top Up 1Voucher

  AVERAGE TIME: 5 min
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

  Scenario: VOU001 Verify whether the Top Up Screen appears
    * Player Clicks Home screen "WALLET" icon
    * Player should be on "WALLET" screen
      * Player clicks "TOP UP" button
    * For Payment Method select "Voucher"
    * For Voucher Provider select "1Voucher"
    * Enter Voucher Number "1799028649699859"
    * Click on BACK ARROW
    * Click on BACK ARROW

  Scenario Outline: <tcID> <testName>
    * Player Clicks Home screen "WALLET" icon
    * Player should be on "WALLET" screen
    * Player clicks "TOP UP" button
    * For Payment Method select "Voucher"
    * For Voucher Provider select "1Voucher"
    * Enter Voucher Number <input>
    * Click CREDIT WALLET
    * Verify Pop Up <output> Close PopUp? "Yes"
    And Click on BACK ARROW
    And Click on BACK ARROW
    Examples:
      | tcID     | input               | output                           | testName                                                                                                     |
      | "VOU002" | "5132132121"        | "Invalid Voucher PIN" | "Verify whether the player is able to enter numerics as VOUCHER PIN in its corresponding field"                                             |
      | "VOU003" | "abcABC"            | "Invalid Voucher PIN" | "Verify whether the player is able to enter alpha chars as VOUCHER PIN in its corresponding field                                           |
      | "VOU004" | "!@#(&%%*("         | "Invalid Voucher PIN" | "Verify whether the player is able to enter symbols as VOUCHER PIN in its corresponding field"                                              |
      | "VOU005" | "abdCDL!@#(&%%*("   | "Invalid Voucher PIN" | "Verify whether the player is able to enter combination of symbols, alphabets and numeric values as VOUCHER PIN in its corresponding field" |
      | "VOU006" | "0.21564"           | "Invalid Voucher PIN" | "Verify whether player is able to enter floating point number as VOUCHER PIN in its corresponding field"                                    |
      | "VOU007" | "1.4545"            | "Invalid Voucher PIN" | "Verify whether player is able to enter floating point number as VOUCHER PIN in its corresponding field"                                    |
      | "VOU008" | "1234567891234567"  | "1Voucher not found."  | "Verify whether player is able to enter 16 digit numeric number as VOUCHER PIN in its corresponding field"                                  |
      | "VOU009" | "123456789123456"   | "Invalid Voucher PIN" | "Verify whether player is able to enter less than 16 digit numeric number as VOUCHER PIN in its corresponding field"                        |
      | "VOU010" | "12345678912345678" | "1Voucher not found."            | "Verify whether player is able to enter more than 16 digit number as VOUCHER PIN in its corresponding field" |
      | "VOU011" | "8545967589561236"  | "1Voucher not found."            | "Verify whether user is able to enter invalid number as VOUCHER PIN in its corresponding field"              |
      | "VOU012" | "1700750397721926"  | "VoucherUsed"                    | "Verify whether player is able to enter used VOUCHER PIN number as VOUCHER PIN in its corresponding field"   |

    Scenario: VOU013 Verify whether the Top Up Screen appears
    * Player Clicks Home screen "WALLET" icon
    * Player should be on "WALLET" screen
    * Player clicks "TOP UP" button
    * For Payment Method select "Voucher"
    * For Voucher Provider select "1Voucher"
    * Enter Voucher Number "1799028649699859"
      * Click on BACK ARROW
      * Click on BACK ARROW

#  Scenario: VOU014 Verify whether user's wallet successfully credited VOUCHER amount
#    * Player Clicks Home screen "WALLET" icon
#    * Player should be on "WALLET" screen
#    * Player notes Before Wallet balance
#    * Player clicks "TOP UP" button
#    * For Payment Method select "Voucher"
#    * For Voucher Provider select "1Voucher"
#    * Enter Voucher Number "1865944481921680"
#    * Click CREDIT WALLET
#    * Verify Pop Up "Success Voucher" Close PopUp? "Yes"
#    * Player notes After Wallet balance
#    * Compare Before with After Wallet Balance with a Voucher
#    * Click on BACK ARROW

  Scenario: Logout
    When Player Clicks Home screen "LOGOUT" icon

  Scenario: VOU016 (SHOULD FAIL) Verify check whether the player is able to open VOUCHER module before login/register
    When Player Clicks Home screen "WALLET" icon
    Then Player should be on "WALLET" screen

  Scenario: VOU015 Verify whether check all the credentials are mandatory to fill for top up
    Given Player navigates to login form
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    And Player clicks LOGIN button
    * Player Clicks Home screen "WALLET" icon
    * Player should be on "WALLET" screen
    * Player clicks "TOP UP" button
    * For Payment Method select "Voucher"
    * Click CREDIT WALLET
    * Verify Pop Up "Please enter Voucher PIN" Close PopUp? "Yes"
    * Enter Voucher Number "1865944481921680"
    * Click CREDIT WALLET
    * Verify Pop Up "Please select a Voucher Provider." Close PopUp? "Yes"
    * For Voucher Provider select "1Voucher"
    * Click CREDIT WALLET
