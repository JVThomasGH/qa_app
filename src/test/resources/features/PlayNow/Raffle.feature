@Raffle
Feature: Play Now Raffle Game

  Background: Login
    Given Player navigates to login form
    And Player clicks pre-login "LOGIN" icon
    And Player enters their login credentials
      | 0718933068 | 12345 |
    And Player clicks LOGIN button

  Scenario: Clear All Cart Items
    * Player clicks on Cart icon
    * Remove all Items from Cart

#  Scenario: RA001 Verify that the player is able to access the RAFFLE Game PLAY NOW screen after successfully logging In
#    * Player Selects "Play Now" "Raffle"
#    * Player should be on "Play Now" "Raffle"
#
#  Scenario: RA002 Verify that the player is able to add a single ticket of the RAFFLE Game to Cart
#    * Player Selects "Play Now" "Raffle"
#    * Player clicks on Add To Cart button for Raffle
#    * Player clicks on Go to Cart button
#    * Verify that the player is able to add a single ticket of the "Raffle" Game to Cart
#
#  Scenario: C208: Verify that the player is able to add multiple tickets of the RAFFLE Game to Cart
#    * Player Selects "Play Now" "Raffle"
#    * Click the "+" sign to select tickets until you reach "25" tickets
#    * Player clicks on Add To Cart button for Raffle
#    * Player clicks on Go to Cart button
#    * Confirm tickets in Cart
#
#  Scenario: C224: Verify that the correct Total price is displayed on the RAFFLE Tickets
#    * Player Selects "Play Now" "Raffle"
#    * Click the "+" sign to select tickets until you reach "25" tickets
#    * Player clicks on Add To Cart button for Raffle
#    * Player clicks on Go to Cart button
#    * Confirm total price for the tickets played at R "20" per ticket
#
#  Scenario: C681: Verify that the player is able to click on the plus button to add the required number of tickets
#    * Player Selects "Play Now" "Raffle"
#    * Click the "+" sign to select tickets until you reach "25" tickets
#
#  Scenario: C682: Verify that the player is able to click on the minus button to decrease the selected number of tickets
#    * Player Selects "Play Now" "Raffle"
#    * Click the "+" sign to select tickets until you reach "25" tickets
#    * Click the "-" sign to select tickets until you reach "25" tickets
#
#  Scenario: C683: Verify that the number of tickets selected and total amount match
#    * Player Selects "Play Now" "Raffle"
#    * Click the "+" sign to select tickets until you reach "4" tickets
#    * Player clicks on Add To Cart button for Raffle
#    * Player clicks on Go to Cart button
#    * Confirm total price for the tickets played at R "20" per ticket
#
#  Scenario: C684: Verify that the player is able to click on the 'Confirm and Pay now' button
#    * Player Selects "Play Now" "Raffle"
#    * Click the "+" sign to select tickets until you reach "4" tickets
#    * Player clicks on Add To Cart button for Raffle
#    * Player clicks on Go to Cart button
#    * Player clicks on Pay From Wallet button
#    * Player clicks on Confirm and Pay Now button
#
#  Scenario: C685: Verify that after clicking 'Confirm And Pay Now' button the ticket is available in the Cart or not
#    * Player Selects "Play Now" "Raffle"
#    * Click the "+" sign to select tickets until you reach "1" tickets
#    * Player clicks on Add To Cart button for Raffle
#    * Player clicks on Go to Cart button
#    * Player clicks on Pay From Wallet button
#    * Player clicks on Confirm and Pay Now button
#
#  Scenario: C686: Verify that the RAFFLE banner is available on the PLAY NOW screen
#    * Player Selects "Play Now" "Raffle"
#    * The Raffle Banner should display on the page
#
#
##  Scenario: C687: Verify that the Jackpot name is displayed on the RAFFLE banner
##    * Player Selects "Play Now" "Raffle"
##    * The Raffle Banner should display on the page
###  Do a manual check of the Raffle Jackpot banner.
###   TODO
##
##  Scenario: C688: Verify that the Cash price is displayed on the RAFFLE banner
##    * Player Selects "Play Now" "Raffle"
##    * The Raffle Banner should display on the page
###  Do a manual check of the Raffle Jackpot banner.
###   TODO
##
##  Scenario: C689: Verify that the Total number of tickets available is displayed on the RAFFLE banner
##    * Player Selects "Play Now" "Raffle"
##    * The Raffle Banner should display on the page
###  Do a manual check of the Raffle Jackpot banner.
###   TODO
##
##  Scenario: C690: Verify that the Sales Close Date and Time are displayed on the RAFFLE banner
##    * Player Selects "Play Now" "Raffle"
##    * The Raffle Banner should display on the page
###  Do a manual check of the Raffle Jackpot banner.
###   TODO
##
##  Scenario:C691: Verify that the Draw Date and Time are displayed on the RAFFLE banner
##    * Player Selects "Play Now" "Raffle"
##    * The Raffle Banner should display on the page
###  Do a manual check of the Raffle Jackpot banner.
###   TODO
#
#  Scenario: C715: Verify that the ticket numbers does not exceed 25
#    * Player Selects "Play Now" "Raffle"
#    * Click the "+" sign to select tickets until you reach "26" tickets
#    * Verify Pop Up "Max Board limit reached" Close PopUp? "No"
#
#  Scenario: C716: Verify that the Sales Open Date is displayed on the RAFFLE banner
##    * Player is logged into the Ithuba National Lottery website with data - "Home" "Login"
##    * Player Selects "Play Now" "Raffle"
##    * The Raffle Banner should display on the page
###  Do a manual check of the Raffle Jackpot banner.
###   TODO
#
#  Scenario: C808: Verify that the player has sufficient funds in their respective wallet to play a RAFFLE game
#    * Player notes Wallet Amount
#    * There should be at least R"50.00" or more
#
#  Scenario: C810: Verify that RAFFLE game name is displayed on the PLAY NOW screen
#    * Player Selects "Play Now" "Raffle"
#    * Player should be on "Play Now" "Raffle"
#
#  Scenario: C811: Verify that the RAFFLE game logo is displayed on the PLAY NOW screen
#    * Player Selects "Play Now" "Raffle"
#    * Player should be on "Play Now" "Raffle"
#
#  Scenario: C812: Verify that the player receives a generic message when the tickets are sold out or sales are closed
#    * Player Selects "Play Now" "Raffle"
#    * Player should be on "Play Now" "Raffle"
##  TODO
#
#  Scenario: C813: Verify that the player receives a confirmation web inbox message after a successful bet
#    * Player Selects "Play Now" "Raffle"
#    * Player should be on "Play Now" "Raffle"
##  TODO
#
#  Scenario: C814: Verify that the player is able to confirm the bet
#    * Player Selects "Play Now" "Raffle"
#    * Player should be on "Play Now" "Raffle"
##    TODO
#
#  Scenario: C815: Verify that the SMS received by the player contains the correct Ticket information
#    * Player Selects "Play Now" "Raffle"
#    * Player should be on "Play Now" "Raffle"
##    TODO
#
#  Scenario: C177 C204: Verify that the player is redirected to the login screen when attempting to open RAFFLE Game PLAY NOW screen without logging In or Registration
#    * Player is not logged in
#    * Player Navigates to "Play Now" "Raffle"
#    * Take screenshot of new tab
#    * Switch back to Home Page
#
