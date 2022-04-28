package qa.ithuba.step_definitions.steps_playnow;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import qa.ithuba.screens.screen_play_lotto.ScreenSportStake;

import java.util.List;

public class StepsSportStake {

    ScreenSportStake screenSportStake;

    @Then("{string} logo and text should be as per the requirement")
    public void sportstakeLogoAndTextShouldBeAsPerTheRequirement(String gameName) {
        screenSportStake.verifyPageContents(gameName);
    }

    @And("Player clicks on PLAY MANUAL SELECT")
    public void playerClicksOnPLAYMANUALSELECT() {
        screenSportStake.clickPlayManual();
    }

    @And("Player captures {int} predictions for the {string} {string} {string}")
    public void player_captures_predictions_for_game(int numMatches, String half, String flag, String gameName, DataTable dataTable) {
        List<String> predictions = dataTable.row(0);
        switch (gameName) {
            case "SPORTSTAKE 4" -> {
                switch (half) {
                    case "First Half" -> screenSportStake.capturePredictions1stHalfSS4(numMatches, flag, predictions);
                    case "Second Half" -> screenSportStake.capturePredictions2ndHalfSS4(numMatches, flag, predictions);
                }
            }
            case "SPORTSTAKE 8" -> {
                switch (half) {
                    case "First Half" -> screenSportStake.capturePredictions1stHalfSS8(numMatches, flag, predictions);
                    case "Second Half" -> screenSportStake.capturePredictions2ndHalfSS8(numMatches, flag, predictions);
                }
            }
            case "SPORTSTAKE 13TM" -> {
                screenSportStake.capturePredictionsSS13(numMatches, flag, predictions);
            }

            case "SPORTSTAKE RUGBY" -> {
                screenSportStake.capturePredictionsSSRugby(numMatches, flag, predictions);
            }
            default -> throw new IllegalArgumentException(gameName);
        }
    }

    @And("Swipe to top of screen")
    public void swipeToTopOfScreen() {
        screenSportStake.swipeToTop();
    }

    @And("Player captures {int} predictions for the {string} {string} {string} after reset")
    public void player_captures_predictions_for_game_after_reset(int numPredictions, String half, String flag, String gameName, DataTable dataTable) {
        List<String> predictions = dataTable.row(0);
        switch (gameName) {
            case "SPORTSTAKE 4" -> {
                switch (half) {
                    case "First Half" -> screenSportStake.capturePredictions1stHalfSS4reset(numPredictions, flag, predictions);
                    case "Second Half" -> screenSportStake.capturePredictions2ndHalfSS4reset(numPredictions, flag, predictions);
                }
            }
            case "SPORTSTAKE 8" -> {
                switch (half) {
                    case "First Half" -> screenSportStake.capturePredictions1stHalfSS8(numPredictions, flag, predictions);
                    case "Second Half" -> screenSportStake.capturePredictions2ndHalfSS8(numPredictions, flag, predictions);
                }
            }
            case "SPORTSTAKE 13TM" -> {
                screenSportStake.capturePredictionsSS13(numPredictions, flag, predictions);
            }

            case "SPORTSTAKE Rugby" -> {
                screenSportStake.capturePredictionsSSRugby(numPredictions, flag, predictions);
            }
            default -> throw new IllegalArgumentException(gameName);
        }
    }

    @And("Select predictions for matches and then deselect it for {string}")
    public void selectPredictionsForMatchesAndThenDeselectIt(String gameName) {
        switch (gameName) {
            case "SPORTSTAKE 4" -> screenSportStake.selectDeselectSS4();
            case "SPORTSTAKE 8" -> screenSportStake.selectDeselectSS8();
            case "SPORTSTAKE 13TM" -> screenSportStake.selectDeselectSS13();
            default -> throw new IllegalArgumentException(gameName);
        }
    }

    @And("Player clicks on PLAY PROPICK")
    public void playerClicksOnPLAYPROPICK() {
        screenSportStake.clickProPick();
    }

    @And("Player clicks on PLAY PROPICK {string}")
    public void playerClicksOnPLAYPROPICKoption(String propick) {
        screenSportStake.clickProPickOption(propick);
    }

    @Then("Player should be taken to My Cart screen displaying SPORTSTAKE tickets added to cart")
    public void playerShouldBeTakenToMyCartScreenDisplayingSPORTSTAKETicketsAddedToCart() {
        screenSportStake.verifyTicketInCart();
    }

    @And("Deselect {int} predictions for the {string} {string} {string}")
    public void deselectPredictionsNumMatchesPredictionsForTheGame(int numMatches, String half, String flag, String gameName, DataTable dataTable) {
        List<String> predictions = dataTable.row(0);
        screenSportStake.capturePredictionsSSRugby(numMatches, flag, predictions);
    }
}