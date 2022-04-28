@HomeSideMenu
Feature: To verify the Home screen Side Menu

  Scenario: Initialise App
    Given Player navigates to login form

  Scenario: Click SIDE MENU
    When Player clicks on the side menu on the top left corner of the Home screen

  Scenario Outline: <link> Verify that the side bar menu contains all the links for logged out user
    And <link> Player verifies the pre login SIDE MENU link text for
    Examples:
      | link                    |
      | "LOGIN"                 |
      | "Home"                  |
      | "Play Now!"             |
      | "How to Play?"          |
      | "Results"               |
      | "Rules and Regulations" |
      | "About Us"              |
      | "Media"                 |
      | "Messages"              |
      | "Contact Us"            |
      | "FAQ"                   |
      | "Terms & Conditions"    |
      | "Lotteries Act"         |
      | "Play Responsibly"      |
      | "App Version: 2.9"      |

  Scenario: Login
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
#      | 0823914052 | 12345 |
#      | 0795298337 | 24680 |
#      | 0737954697 | 23546 |
    And Player clicks LOGIN button

  Scenario: Click on the side menu
    When Player clicks on the side menu on the top left corner of the Home screen

  Scenario Outline: <link> - Verify that user can open the side bar menu while logged in
    And Player verifies the link text for <link>
    Examples:
      | link                    |
      | "LOGOUT"                  |
      | "Home"                  |
      | "Play Now!"             |
      | "How to Play?"          |
      | "My Profile"            |
      | "My Cart"               |
      | "Wallet"                |
      | "Tickets"               |
      | "Results"               |
      | "Rules and Regulations" |
      | "About Us"              |
      | "Media"                 |
      | "Messages"              |
      | "Contact Us"            |
      | "FAQ"                   |
      | "Terms and Conditions"  |
      | "Lotteries Act"         |
      | "Play Responsibly"      |
      | "App Version 2.9"       |
