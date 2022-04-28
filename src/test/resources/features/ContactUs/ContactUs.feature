@ContactUs
Feature: To verify the Contact Us screen

  Background: Login
    Given Player navigates to login form
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    And Player clicks LOGIN button

  Scenario: CU001 Pre-Login - Verify that player can open the Contact Us page from the side menu
    When Player Clicks Home screen "LOGOUT" icon
    When Player clicks on the side menu on the top left corner of the Home screen
    And Player clicks on SIDE MENU "Contact Us"
    Then Player should be on "CONTACT US" screen
    And Verify the "CONTACT US" page contents
    And Click on BACK ARROW

  Scenario: CU002 Pre-Login - Verify that user can open the Contact Us page from the HOME PAGE icon
    When Player Clicks Home screen "LOGOUT" icon
    When Player clicks pre-login "CONTACT US" icon
    Then Player should be on "CONTACT US" screen
    And Verify the "CONTACT US" page contents
    And Click on BACK ARROW

  Scenario: CU003 Verify that player can open the Contact Us page from the side menu
    When Player clicks on the side menu on the top left corner of the Home screen
    And Player clicks on SIDE MENU "Contact Us"
    Then Player should be on "CONTACT US" screen
    And Verify the "CONTACT US" page contents
    And Click on BACK ARROW

  Scenario: CU004 Verify that user can open the Contact Us page from the HOME PAGE icon
    When Player Clicks Home screen "CONTACT US" icon
    Then Player should be on "CONTACT US" screen
    And Verify the "CONTACT US" page contents
    And Click on BACK ARROW

  Scenario Outline: <tcID> Verify that player can click the phone numbers and email links in the Contact Us page from the side menu
    When Player clicks on the side menu on the top left corner of the Home screen
    And Player clicks on SIDE MENU "Contact Us"
    Then Player should be on "CONTACT US" screen
    And Player clicks Contact Us screen <link> link
    Examples:
      | tcID    | link                       |
      | "CU005" | "0800 484 822"             |
      | "CU006" | "0860 456 886"             |
#      | "CU007" | "info@ithubalottery.co.za" |

  Scenario Outline: <tcID> Verify that player can click the phone numbers and email links in the Contact Us page from the HOME PAGE ico
    When Player Clicks Home screen "CONTACT US" icon
    Then Player should be on "CONTACT US" screen
    And Player clicks Contact Us screen <link> link
    Examples:
      | tcID    | link           |
      | "CU008" | "0800 484 822" |
      | "CU009" | "0860 456 886" |
#     | "CU010"  | "info@ithubalottery.co.za" |

