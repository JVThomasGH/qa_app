@SavedTickets
@Tickets
Feature: Saved Tickets

  Scenario: Initialise App
    Given Player navigates to login form

  Scenario: Login
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    * Player clicks LOGIN button

  Scenario: ST001 to ST007 Verify that the Saved Tickets are displaying on Saved Tickets screen
    * Player Clicks Home screen "TICKETS" icon
    * Player clicks on "SAVED TICKETS"
    * Verify that the Game name is displayed under Saved Tickets screen
    * Verify that Saved Tickets are displayed in the Saved Tickets page
    * Navigate BACK on Mobile device
    * Verify that the Number of Draws are displayed
    * Verify that the selected Board is displayed
    * Verify that the SAVE button is enabled
    * Verify that the player is able to Delete the Ticket
    * Verify Pop Up "Ticket Deleted Successfully" Close PopUp? "Yes"
    * Click on BACK ARROW

    Scenario: ST008 Verify that the player is able to Add Ticket to Cart
      * Player Clicks Home screen "TICKETS" icon
      * Player clicks on "SAVED TICKETS"
      * Click on VIEW button Saved Tickets
      * Click PLAY on Saved Ticket
      * Verify Pop Up "Your saved ticket is deleted. If required, please save it again." Close PopUp? "Yes"
      * Click ADD TO CART button
      * Verify Pop Up "You have successfully added ticket to your cart." Close PopUp? "Yes"
      And Click on BACK ARROW
      And Click on BACK ARROW
      And Click Go To Cart button
      And Click PAY FROM MY WALLET
      And Click PAY NOW
      And Verify played numbers on receipt
      And Click on BACK ARROW