@Login
Feature: Login Scenarios

  Scenario: Initialise App
    When Player navigates to login form

  Scenario Outline: Valid Login Tests: <tcDescription>
    And Player clicks pre-login "LOGIN" icon
    And Player enters user name as <username>
    And Player enters password as <password>
    And Player clicks LOGIN button
    Then Player should be on <pageIcon> screen
    And Player logs out
    Examples:
      | username             | password | pageIcon | tcDescription                                 |
      | "0718933068"         | "12345"  | "LOGOUT" | "Login with valid user name and password"     |
      | "beesoons@gmail.com" | "12345"  | "LOGOUT" | "Login with valid email address and password" |

  Scenario Outline: Verify that the correct user profile name and account balance is displayed on the Home Page
    And Player clicks pre-login "LOGIN" icon
    And Player enters user name as <username>
    And Player enters password as <password>
    And Player clicks LOGIN button
    Then Player profile name should be displayed
    Then Player wallet balance should be displayed
    And Player logs out
    Examples:
      | username     | password |
      | "0718933068" | "12345"  |

  Scenario Outline: Negative Login Tests: <tcDescription>
    And Player clicks pre-login "LOGIN" icon
    And Player enters user name as <username>
    And Player enters password as <password>
    And Player clicks LOGIN button
    Then login should fail with an error <err> <tcDescription>
    And Player should be on <page> screen
    Examples:
      | username              | password  | err                                      | page    | tcDescription                                                                   |
      | "invalidUserName"     | "12345"   | "Please enter valid Mobile/Email"        | "LOGIN" | "Invalid Username"                                                              |
      | "0718933068"          | "99999"   | "Either username or password is invalid" | "LOGIN" | "Invalid Password"                                                              |
      | ""                    | ""        | "Please enter Mobile/Email"              | "LOGIN" | "Verify when user does not enter any Number or leave it blank in Mobile Number" |
      | "0718933068000"       | ""        | "Please enter valid Mobile/Email"        | "LOGIN" | "Verify whether user can enter more than 10 digits in the Mobile number field"  |
      | "0718933068"          | ""        | "Please enter your Pin"                  | "LOGIN" | "Verify when user does not enter any Number or leave it blank in PIN"           |
      | "0718933068"          | "0000000" | "Either username or password is invalid" | "LOGIN" | "Verify whether user can enter more than 5 digits pin"                          |
      | "82020520365"         | "12356"   | "Please enter valid Mobile/Email"        | "LOGIN" | "Verify if user click on LOGIN button with invalid inputs"                      |
      | "beesoons@gmail.comx" | "12345"   | "Either username or password is invalid" | "LOGIN" | "Verify whether user is able to login with an invalid email address"            |
      | "beesoons@gmail.com"  | "12346"   | "Either username or password is invalid" | "LOGIN" | "Verify whether user is able to login with a valid Email but invalid password"  |

  Scenario: Verify whether REGISTER button is displayed or not
    Then Player clicks the REGISTER button
    Then Player should be on "REGISTER NOW!" screen
    Then Click "REGISTER NOW!" CANCEL button

  Scenario Outline: User should be able to see the Logout button on the homepage
    And Player enters user name as <username>
    And Player enters password as <password>
    And Player clicks LOGIN button
    Then Player should be on <pageIcon> screen
    And Player logs out
    Examples:
      | username     | password | pageIcon |
      | "0718933068" | "12345"  | "LOGOUT" |


