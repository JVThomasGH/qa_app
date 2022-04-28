@RULES_REGULATIONS
Feature: Rules And Regulations Features

  Background: Login
    Given Player navigates to login form
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    And Player clicks LOGIN button

  Scenario: Click on SIDE MENU ->  Rules and Regulations
    When Player clicks on the side menu on the top left corner of the Home screen
    And Player clicks on SIDE MENU "Rules and Regulations"
    And Player clicks on SIDE MENU "Back Arrow"

  Scenario Outline:  Verify that the <game> game is displayed under the Rules and Regulations menu
    When Player clicks on the side menu on the top left corner of the Home screen
    And Player clicks on SIDE MENU "Rules and Regulations"
    And Player clicks on SIDE MENU <menu>
    Examples:
      | game                 | menu                                |
      | "LOTTO"              | "Rules and Regulations Lotto"       |
      | "POWERBALL"          | "Rules and Regulations PowerBall"   |
      | "SPORTSTAKE 4"       | "Rules and Regulations SS4"         |
      | "SPORTSTAKE 8"       | "Rules and Regulations SS8"         |
      | "SPORTSTAKE 13"      | "Rules and Regulations SS13"        |
      | "SPORTSTAKE CRICKET" | "Rules and Regulations SSCricket"   |
      | "SPORTSTAKE RUGBY"   | "Rules and Regulations SSRugby"     |
      | "DAILY LOTTO"        | "Rules and Regulations Daily Lotto" |
      | "RAFFLE"             | "Rules and Regulations Raffle"      |
      | "EAZIWIN"            | "Rules and Regulations EaziWin"     |

  Scenario: Verify that the user can view the Rules and Regulations side/burger menu whilst logged in
    When Player clicks on the side menu on the top left corner of the Home screen
    And Player clicks on SIDE MENU "Rules and Regulations"

  Scenario: Verify that the user can view the Rules and Regulations menu via the side/burger menu whilst logged out
    When Player Clicks Home screen "LOGOUT" icon
    When Player clicks on the side menu on the top left corner of the Home screen
    And Player clicks on SIDE MENU "Rules and Regulations"
