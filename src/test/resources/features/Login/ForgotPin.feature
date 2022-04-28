@ForgotPIN
Feature: Forgot PIN Scenarios

  Scenario: Initialise App
    When Player navigates to login form

  Scenario Outline: Verify whether FORGOT PIN page inputs
    And Player clicks pre-login "LOGIN" icon
    And Player clicks on the Forget PIN link
    Then Player should be on "FORGOT PIN" screen
    And Player verifies that the banner is present on the forget pin page
    And Player clicks on field of mobile number and Enter the <mobile_number>
    And Player clicks on field of RSA ID and enter the <rsa_ID>
    And Click "FORGOT PIN" CANCEL button
    Examples:
      | mobile_number | rsa_ID          |
      | "0823914052"  | "8402215150086" |
#    Then Player clicks on the SEND PIN button


