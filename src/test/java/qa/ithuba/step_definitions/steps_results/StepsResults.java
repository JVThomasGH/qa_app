package qa.ithuba.step_definitions.steps_results;

import io.cucumber.java.en.And;
import qa.ithuba.screens.screen_popups.ScreenPopUps;
import qa.ithuba.screens.screen_results.ScreenResults;
import qa.ithuba.utilities.HelperUtil;

public class StepsResults extends HelperUtil {

    ScreenResults screenResults;
    ScreenPopUps screenPopUps;

    @And("Player clicks {string} Results")
    public void playerClicksGameResults(String gameName) {
        screenResults.clickGameResults(gameName);
    }

    @And("Verify that the {string} result numbers are also displayed in numerical order")
    public void verifyThatTheGameResultNumbersAreAlsoDisplayedInNumericalOrder(String gameName) {
        screenResults.verifyNumericalOrder(gameName);
    }

    @And("{string} - In the More Info section verify the following info is displayed - ROLLOVER AMOUNT, ROLLOVER NO, TOTAL PRIZE POOL, TOTAL SALES, NEXT JACKPOT, DRAW MACHINE and NEXT DRAW DATE")
    public void inTheMoreInfoSectionVerifyInfoIsDisplayed(String gameName) {
        screenResults.verifyMoreInfo(gameName);
    }

    @And("Clicks on HISTORICAL RESULTS {string}")
    public void clicksOnHISTORICALRESULTS(String gameName) {
        switch (gameName) {
            case "LOTTO", "POWERBALL", "LOTTO PLUS 1", "POWERBALL PLUS", "LOTTO PLUS 2", "DAILY LOTTO", "PICK 3" -> screenResults.clickHistoricalResults();
            case "SPORTSTAKE 4", "SPORTSTAKE 8", "SPORTSTAKE 13", "SPORTSTAKE CRICKET", "SPORTSTAKE RUGBY" -> screenResults.clickHistoricalResultsSS();
            case "RAFFLE" -> screenResults.clickHistoricalResultsRaffle();
            case "RAPIDO" -> screenResults.clickHistoricalResultsRapido();
            default -> throw new IllegalArgumentException(gameName);
        }
    }

    @And("Enter the Start Date - d m yyyy {string} {string} {string}")
    public void enterTheStartDate(String day, String month, String year) {
        screenResults.enterStartDate(day, month, year);
    }

    @And("Enter the End Date - d m yyyy {string} {string} {string}")
    public void enterTheEndDate(String day, String month, String year) {
        screenResults.enterEndDate(day, month, year);
    }

    @And("Click SEARCH")
    public void clickSEARCH() {
        screenResults.clickSearchResults();
    }

    @And("Click on View More Info to verify that the displayed winning numbers in the Historical Results page match the Winning numbers in the detailed view screen - {string}")
    public void clickOnViewMoreInfoToVerifyThatTheDisplayedWinningNumbersInTheHistoricalResultsPageMatchTheWinningNumbersInTheDetailedViewScreen(String gameName) {
        screenResults.verifyHistoryWithDetailedView(gameName);
    }

    @And("Verify that the Disclaimer text and {string} banner are displayed at the bottom of the screen")
    public void verifyThatTheDisclaimerTextAndGameBannerAreDisplayedAtTheBottomOfTheScreen(String gameName) {
        screenResults.verifyDisclaimer();
    }

    @And("Click on Play Numbers for {string}")
    public void clickOnPlayNumbers(String gameName) {
        screenResults.clickPlayNumbers(gameName);
    }

    @And("Click on Save Numbers")
    public void clickOnSaveNumbers() {
        screenResults.clickSaveNumbers();
        screenPopUps.close();
    }
}
