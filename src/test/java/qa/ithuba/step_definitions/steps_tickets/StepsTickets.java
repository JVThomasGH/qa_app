package qa.ithuba.step_definitions.steps_tickets;

import io.cucumber.java.en.And;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Pending;
import org.junit.runner.RunWith;
import qa.ithuba.screens.screen_tickets.ScreenTickets;

@RunWith(SerenityRunner.class)
public class StepsTickets {

    ScreenTickets screenTickets;

    @And("Click on SAVED TICKETS")
    public void clickOnSAVEDTICKETS() {
        screenTickets.clickSavedTickets();
    }

    @And("Play Saved Ticket")
    public void playSavedTicket() {
        screenTickets.playSaveTicket();
    }

    @And("Lotto PowerBall and Daily Lotto options are displayed")
    public void lottoPowerBallAndDailyLottoOptionsAreDisplayed() {
        screenTickets.verifyGamesOnTicketsPage();
    }

    @And("Player clicks on SAVED NUMBERS {string}")
    public void playerClicksOnSAVEDNUMBERS(String gameName) {
        screenTickets.clickSavedNumbers();
        switch (gameName) {
            case "LOTTO" -> screenTickets.clickSavedNumbersLotto();
            case "DAILY LOTTO" -> screenTickets.clickSavedNumbersDailyLotto();
            case "POWERBALL" -> screenTickets.clickSavedNumbersPowerBall();
            default -> throw new IllegalArgumentException(gameName);
        }
    }

    @And("Player clicks PLAY SAVED NUMBERS")
    public void playerClicksPLAYSAVEDNUMBERS() {
        screenTickets.clickPlaySavedNumbers();
    }

    @And("Player verifies Saved Numbers PopUp")
    public void playerVerifiesSavedNumbersPopUp() {
        screenTickets.verifySavedNumbers();
    }

    @And("Player Deletes Saved Numbers in PopUp")
    public void playerDeletesSavedNumbersInPopUp() {
        screenTickets.deleteSavedNumbers();
    }

    @And("Player Play Saved Numbers in PopUp")
    public void playerPlaysSavedNumbersInPopUp() {
        screenTickets.playSavedNumbers();
    }

    @And("Player clicks on {string}")
    public void playerClicksOnPENDINGDRAWS(String ticketsSubMenu) {
        switch (ticketsSubMenu) {
            case "SAVED NUMBERS" -> screenTickets.clickSavedNumbers();
            case "SAVED TICKETS" -> screenTickets.clickSavedTickets();
            case "PENDING DRAWS" -> screenTickets.clickPendingDraws();
            case "HISTORICAL TICKETS" -> screenTickets.clickHistoricalTickets();
        }

    }

    @And("Click VIEW button")
    public void clickVIEWButton() {
        screenTickets.clickView();
    }

    @And("Verify Ticket Number for Pending Draws ticket")
    public void verifyTicketNumberForPendingDrawsTicket() {
        screenTickets.verifyTicketNumber();
    }

    @And("Verify Game Name for Pending Draws ticket")
    public void verifyThatGameNameIsDisplayedForPendingDrawsTickets() {
        screenTickets.verifyGameName();
    }

    @And("Verify that Bet Duration is displayed")
    public void verifyThatBetDurationIsDisplayed() {
        screenTickets.verifyBetDuration();
    }

    @And("Verify Draw Date for Pending Draws ticket")
    public void verifyThatDrawDateIsDisplayed() {
        screenTickets.verifyDrawDate();
    }

    @And("Verify Selected Numbers for Pending Draws ticket")
    public void verifySelectedNumbersForPendingDrawsTicket() {
        screenTickets.verifySelectedNumbers();
    }

    @And("Click REPLAY TICKET")
    public void clickREPLAYTICKET() {
        screenTickets.clickReplayTicket();
    }

    @And("REPLAY TICKET should be disabled")
    public void replayTICKETShouldBeDisabled() {
        screenTickets.verifyDisabledReplayButton();
    }

    @And("Verify PROPICK IS YES")
    public void verifyPROPICKISYES() {
        screenTickets.verifyProPickYes();
    }

    @And("Verify PROPICK IS NO")
    public void verifyPROPICKISNO() {
        screenTickets.verifyProPickNo();
    }

    @And("Verify that Team names are displayed in YOUR SELECTION section of the ticket information screen")
    public void verifyThatTeamNamesAreDisplayedInYOURSELECTIONSectionOfTheTicketInformationScreen() {
        screenTickets.verifyTeamNames();
    }

    @And("Verify that the Transaction Date Amount Type and View Ticket is displayed")
    public void verifyThatTheTransactionDateAmountTypeAndViewTicketIsDisplayed() {
        screenTickets.verifyLabelsHistorical();
    }

    @And("Enter the Start Date for Historical Tickets - d m yyyy {string} {string} {string}")
    public void enterTheStartDate(String day, String month, String year) {
        screenTickets.enterStartDateHT(day, month, year);
    }

    @And("Enter the End Date for Historical Tickets - d m yyyy {string} {string} {string}")
    public void enterTheEndDate(String day, String month, String year) {
        screenTickets.enterEndDateHT(day, month, year);
    }

    @And("Click SEARCH Historical Tickets")
    public void clickSEARCHHT() {
        screenTickets.clickSearchHistory();
    }

    @And("Verify that {string} ticket is present on Historical ticket or not")
    @Pending
    public void verifyThatGameTicketIsPresentOnHistoricalTicketOrNot(String game) {
        System.out.println(game + "::: Perform a manual verification in Transaction History");
//        throw new SkipStepException(game + "::: Perform a manual verification in Transaction History");
    }

    @And("Verify that {string}: Serial Number, Draw Number, First Draw, Ticket Cost, Draw Duration,")
    public void verifyThatGameSerialNumberDrawNumberFirstDrawTicketCostDrawDuration(String game) {
        screenTickets.verifyViewDetails();
    }

    @And("Click VIEW button in Transaction History")
    public void clickVIEWButtonInTransactionHistory() {
        screenTickets.click1stViewButtonTransactionHistory();
    }

    @And("Verify that Saved Tickets are displayed in the Saved Tickets page")
    public void verifyThatSavedTicketsAreDisplayedInTheSavedTicketsPage() {
        screenTickets.verifySavedTicketsScreen();
    }

    @And("Verify that the Game name is displayed under Saved Tickets screen")
    public void verifyThatTheGameNameIsDisplayedUnderSavedTicketsScreen() {
        screenTickets.verifyGameNames();
    }

    @And("Verify that the player is able to Delete the Ticket")
    public void verifyThatThePlayerIsAbleToDeleteTheTicket() {
        screenTickets.verifyDeleteSavedTicket();
    }

    @And("Verify that the Number of Draws are displayed")
    public void verifyThatTheNumberOfDrawsAreDisplayed() {
        screenTickets.verifyNumberOfDrawsSavedTickets();
    }

    @And("Verify that the selected Board is displayed")
    public void verifyThatTheSelectedBoardIsDisplayed() {
        screenTickets.verifySelectedBoardDisplayed();
    }

    @And("Verify that the SAVE button is enabled")
    public void verifyThatTheSAVEButtonIsEnabled() {
        screenTickets.verifySaveButtonEnabled();
    }

    @And("Click on VIEW button Saved Tickets")
    public void clickOnVIEWButtonSavedTickets() {
        screenTickets.clickOnView();
    }

    @And("Click PLAY on Saved Ticket")
    public void clickPLAYOnSavedTicket() {
        screenTickets.clickPlayButtonSavedTickets();
    }
}