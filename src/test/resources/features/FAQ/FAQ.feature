@FAQ
Feature: To verify the FAQ screens

  Background: Login
    Given Player navigates to login form
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    And Player clicks LOGIN button

  Scenario: FAQ001 To verify that user can access FAQs without logging in
    When Player Clicks Home screen "LOGOUT" icon
    When Player clicks on the side menu on the top left corner of the Home screen
    And Player clicks on SIDE MENU "FAQ"
    Then FAQs screen is displayed with the list of all games as per the design document

  Scenario: FAQ002 Verify that user can access FAQs while logged in
    When Player clicks on the side menu on the top left corner of the Home screen
    And Player clicks on SIDE MENU "FAQ"
    Then FAQs screen is displayed with the list of all games as per the design document

  Scenario Outline: <tcID> <game> - Verify that the Questions and answers are correct for
    When Player clicks on the side menu on the top left corner of the Home screen
    And Player clicks on SIDE MENU "FAQ"
    When Player Clicks FAQ screen <game> icon
    And Player clicks each question and then verify its contents for <game>

    Examples:
      | tcID      | game                 |
      | "FAQ003"  | "Lotto"              |
      | "FAQ004"  | "PowerBall"          |
      | "FAQ005"  | "SportStake 4"       |
      | "FAQ006"  | "SportStake 8"       |
      | "FAQ007"  | "SportStake 13"      |
      | "FAQ008"  | "SportStake Cricket" |
      | "FAQ009"  | "SportStake Rugby"   |
      | "FAQ0010" | "Daily Lotto"        |
      | "FAQ0011" | "Raffle"             |
      | "FAQ0012" | "EaziWIN"            |
