package qa.ithuba.step_definitions.steps_how_to;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import qa.ithuba.screens.screen_how_to.*;

public class StepsHowTo {

    ScreenHowTo screenHowTo;
    ScreenHowToLotto screenHowToLotto;
    ScreenHowToPowerBall screenHowToPowerBall;
    ScreenHowToSportStake4 screenHowToSportStake4;
    ScreenHowToSportStake8 screenHowToSportStake8;
    ScreenHowToSportStake13 screenHowToSportStake13;
    ScreenHowToSportStakeCricket screenHowToSportStakeCricket;
    ScreenHowToSportStakeRugby screenHowToSportStakeRugby;
    ScreenHowToDailyLotto screenHowToDailyLotto;
    ScreenHowToRaffle screenHowToRaffle;
    ScreenHowToEaziWIN screenHowToEaziWIN;

    @Then("HOW TO PLAY {string} content is displayed correctly")
    public void howToPlayContentIsDisplayedCorrectly(String gameName) {
        screenHowTo.verifyHowToScreenContents();
    }

    @And("Player verifies How To {string} screen")
    public void playerClicksHowToGameIcon(String gameName) {
        screenHowTo.clickIcon(gameName);
        switch (gameName) {
            case "Lotto", "Lotto Plus 1", "Lotto Plus 2" -> screenHowToLotto.verifyHowToLottoText();
            case "PowerBall", "PowerBall Plus" -> screenHowToPowerBall.verifyHowToPowerBallText();
            case "SportStake 4" -> screenHowToSportStake4.verifyHowToSportStake4Text();
            case "SportStake 8" -> screenHowToSportStake8.verifyHowToSportStake8Text();
            case "SportStake 13" -> screenHowToSportStake13.verifyHowToSportStake13Text();
            case "SportStake Cricket" -> screenHowToSportStakeCricket.verifyHowToSportStakeCricketText();
            case "SportStake Rugby" -> screenHowToSportStakeRugby.verifyHowToSportStakeRugbyText();
            case "Daily Lotto" -> screenHowToDailyLotto.verifyHowToDailyLottoText();
            case "Raffle" -> screenHowToRaffle.verifyHowToRaffleText();
            case "EaziWIN" -> screenHowToEaziWIN.verifyHowToEaziWINText();
        }
    }
}
