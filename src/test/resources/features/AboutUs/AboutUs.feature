@AboutUs
Feature: To verify the About Us screen

  Background: Login
    Given Player navigates to login form
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    And Player clicks LOGIN button

  Scenario: AU001 To verify that the images and text are correct on about Us page
    When Player Clicks Home screen "ABOUT US" icon
    And Player verifies the main Image is as per design document
    And Player verifies the text is same as design document
    And Click on BACK ARROW
    Then Player should be on "LOGOUT" screen
