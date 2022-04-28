@Home
Feature: To verify the Home screen

  Background: Login
    Given Player navigates to login form
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    And Player clicks LOGIN button

  Scenario Outline: <tcID> PreLogin <icon> Verify Home page screen layout when user is not logged in
    When Player Clicks Home screen "LOGOUT" icon
    And Verify the pre login <icon> icon
    Examples:
      | tcID    | icon         |
      | "HM001" | "LOGIN"      |
      | "HM002" | "PLAY"       |
      | "HM003" | "RESULTS"    |
      | "HM004" | "HOW TO"     |
      | "HM005" | "CONTACT US" |
      | "HM006" | "ABOUT US"   |
      | "HM007" | "MEDIA"      |
      | "HM008" | "MESSAGES"   |

  Scenario: HM009 Verify pre login Home Screen banners
    When Player Clicks Home screen "LOGOUT" icon
    And Verify Footer Banner

  Scenario Outline: <tcID> <game> Verify pre login Home Screen banners
    When Player Clicks Home screen "LOGOUT" icon
    And Verify pre login banners for <game>
    Examples:
      | tcID    | game                 |
      | "HM010" | "LOTTO"              |
      | "HM011" | "LOTTO PLUS 1"       |
      | "HM012" | "LOTTO PLUS 2"       |
      | "HM013" | "POWERBALL"          |
      | "HM014" | "POWERBALL PLUS"     |
      | "HM015" | "SPORTSTAKE 4"       |
      | "HM016" | "SPORTSTAKE 8"       |
      | "HM017" | "SPORTSTAKE 13"      |
      | "HM018" | "SPORTSTAKE CRICKET" |
      | "HM019" | "SPORTSTAKE RUGBY"   |
      | "HM020" | "DAILY LOTTO"        |

  Scenario: Login
    When Player Clicks Home screen "LOGOUT" icon
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    And Player clicks LOGIN button

  Scenario Outline: <tcID> Home <icon> Verify Home page screen layout when user is logged in
    And Verify the post login <icon> icon
    Examples:
      | tcID    | icon         |
      | "HM021" | "PLAY"       |
      | "HM022" | "RESULTS"    |
      | "HM023" | "DRAWS"      |
      | "HM024" | "MY PROFILE" |
      | "HM025" | "WALLET"     |
      | "HM026" | "TICKETS"    |
      | "HM027" | "HOW TO"     |
      | "HM028" | "CONTACT US" |
      | "HM029" | "ABOUT US"   |
      | "HM030" | "MEDIA"      |
      | "HM031" | "MESSAGES"   |
#      | "LOGOUT"     |

  Scenario Outline:<tcID> <game> Verify post login Home Screen banners
    And Verify post login banners for <game>
    Examples:
      | tcID    | game                 |
      | "HM032" | "LOTTO"              |
      | "HM033" | "LOTTO PLUS 1"       |
      | "HM034" | "LOTTO PLUS 2"       |
      | "HM035" | "POWERBALL"          |
      | "HM036" | "POWERBALL PLUS"     |
      | "HM037" | "SPORTSTAKE 4"       |
      | "HM038" | "SPORTSTAKE 8"       |
      | "HM039" | "SPORTSTAKE 13"      |
      | "HM040" | "SPORTSTAKE CRICKET" |
      | "HM041" | "SPORTSTAKE RUGBY"   |
      | "HM042" | "DAILY LOTTO"        |