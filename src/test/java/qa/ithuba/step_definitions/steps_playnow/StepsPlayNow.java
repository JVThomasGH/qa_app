package qa.ithuba.step_definitions.steps_playnow;

import qa.ithuba.globals.World;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import qa.ithuba.screens.screen_base.ScreenBase;
import qa.ithuba.screens.screen_cart.ScreenCart;
import qa.ithuba.screens.screen_play_now.ScreenDailyLotto;
import qa.ithuba.screens.screen_play_now.ScreenLotto;
import qa.ithuba.screens.screen_play_now.ScreenPlayNow;
import qa.ithuba.screens.screen_play_now.ScreenPowerBall;
import qa.ithuba.screens.screen_popups.ScreenPopUps;
import qa.ithuba.utilities.HelperUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StepsPlayNow extends HelperUtil {
    World world;
    ScreenPlayNow screenPlayNow;
    ScreenLotto screenLotto;
    ScreenPowerBall screenPowerBall;
    ScreenDailyLotto screenDailyLotto;
    ScreenBase screenBase;
    ScreenCart screenCart;
    ScreenPopUps screenPopUps;

    @And("Player clicks on {string} icon")
    public void playerClicksOnIcon(String gameName) {
        screenPlayNow.clickGameIcon(gameName);
    }

    @And("Verify that the number chooser screen opens up or not for each {string} board")
    public void verifyThatTheNumberChooserScreenOpensUpOrNotForEachBoard(String gameName) {
        switch (gameName) {
            case "LOTTO" -> screenPlayNow.verifyNumberChoosersLotto();
            case "DAILY LOTTO" -> screenPlayNow.verifyNumberChoosersDailyLotto();
            case "POWERBALL" -> screenPlayNow.verifyNumberChoosersPowerBall();
        }
    }

    @And("Play {int} boards {string} {string}")
    public void playGames(int boards, String gameName, String numbers) {
        List<String> balls = new ArrayList<>(Arrays.asList(numbers.split(" ")));
        world.ballsList = balls;
        switch (gameName) {
            case "LOTTO", "LOTTO PLUS 1", "LOTTO PLUS 2" -> screenLotto.selectLottoNumbers(boards, balls, gameName);
////            case "Lotto Plus 1" -> pageLotto.selectLottoPlus1Numbers(boards, balls);
////            case "Lotto Plus 2" -> pageLotto.selectLottoPlus2Numbers(boards, balls);
            case "POWERBALL", "POWERBALL PLUS" -> screenPowerBall.selectPowerBallNumbers(boards, balls, gameName);
            case "DAILY LOTTO" -> screenDailyLotto.selectDailyLottoNumbers(boards, balls);
            default -> throw new IllegalStateException("Invalid case provided");
        }
    }

    @And("Play a board for {string} {string} with {int} balls")
    public void playGames(String gameName, String numbers, int numberOfBalls) {
        List<String> balls = new ArrayList<>(Arrays.asList(numbers.split(" ")));
        world.ballsList = balls;
        switch (gameName) {
            case "LOTTO", "LOTTO PLUS 1", "LOTTO PLUS 2" -> screenLotto.selectLottoNumbers(balls, gameName);
            case "POWERBALL", "POWERBALL PLUS" -> screenPowerBall.selectOneBoardPowerBallNumbers(balls, numberOfBalls, gameName);
            case "DAILY LOTTO" -> screenDailyLotto.selectDailyLottoNumbers(balls);
            default -> throw new IllegalArgumentException("Invalid case provided");
        }
    }

    @And("Play a board for {string} {string}")
    public void playGames(String gameName, String numbers) {
        List<String> balls = new ArrayList<>(Arrays.asList(numbers.split(" ")));
        world.ballsList = balls;
        switch (gameName) {
            case "LOTTO", "LOTTO PLUS 1", "LOTTO PLUS 2" -> screenLotto.selectLottoNumbers(balls, gameName);
            case "DAILY LOTTO" -> screenDailyLotto.selectDailyLottoNumbers(balls);
            default -> throw new IllegalArgumentException("Invalid case provided");
        }
    }

    @And("Play a board for {string} {string} and duplicate")
    public void playGamesDuplicate(String gameName, String numbers) {
        List<String> balls = new ArrayList<>(Arrays.asList(numbers.split(" ")));
        world.ballsList = balls;
        switch (gameName) {
            case "LOTTO", "LOTTO PLUS 1", "LOTTO PLUS 2" -> screenLotto.selectLottoNumbers(balls, gameName);
            case "POWERBALL", "POWERBALL PLUS" -> screenPowerBall.selectPowerBallNumbersDups(balls, gameName);
            case "DAILY LOTTO" -> screenDailyLotto.selectDailyLottoNumbers(balls);
            default -> throw new IllegalArgumentException("Invalid case provided");
        }
    }

    @And("Player clicks on SUBMIT button")
    public void playerClicksOnSUBMITButton() {
        swipeUp(1);
        screenPlayNow.clickSubmitButton();
    }

    @And("Player clicks on SUBMIT button for Withdrawal")
    public void playerClicksOnSUBMITButtonWithdrawal() {
        swipeUp(1);
        screenPlayNow.clickSubmitButtonWithdrawal();
    }

    @And("Player clicks on SUBMIT button SportStake")
    public void playerClicksOnSUBMITButtonSS() {
        swipeUp(1);
        screenPlayNow.clickSubmitButtonSportStake();
    }

//    @And("Player clicks on RESET button SportStake")
//    public void playerClicksOnRESETButtonSS() {
//        swipeUp(1);
//        screenPlayNow.clickResetButtonSportStake();
//    }

    @And("Player clicks on SUBMIT button SportStake PROPICK")
    public void playerClicksOnSUBMITButtonSSProPick() {
        swipeUp(1);
        screenPlayNow.clickSubmitButtonSportStakePP();
    }

    @And("Player clicks on RESET button")
    public void playerClicksOnRESETButton() {
        screenPlayNow.clickResetButton();
    }

    @And("Player clicks on RESET button SportStake")
    public void playerClicksOnRESETButtonSS() {
        swipeUp(1);
        screenPlayNow.clickResetButtonSS();
        swipeDown(0.50, 0.70);
        swipeDown(0.50, 0.70);
        swipeDown(0.50, 0.70);
        swipeDown(0.50, 0.70);
    }

    @Then("Selected {string} reflect on the chosen Board of ticket {string}")
    public void selectedNumbersReflectOnTheChosenBoardOfTicket(String numbers, String gameName) {
        List<String> balls = new ArrayList<>(Arrays.asList(numbers.split(" ")));
        switch (gameName) {
            case "LOTTO", "DAILY LOTTO" -> screenPlayNow.verifyPlayedNumbers(balls);
            case "POWERBALL" -> screenPlayNow.verifyPlayedNumbersPowerBall(balls);
        }

    }

    @And("Player clicks on Add To Cart button")
    public void playerClicksOnAddToCartButton() {
        String cartBeforeItems = screenCart.getCart();
        logger("CART BEFORE PLAY: " + cartBeforeItems);
        screenPlayNow.clickAddToCart();
        screenPopUps.close();
        String cartAfterItems = screenCart.getCart();
        logger("CART AFTER PLAY: " + cartAfterItems);
        int bCart = Integer.parseInt(cartBeforeItems) + 1;
        int aCart = Integer.parseInt(cartAfterItems);
        Assert.assertEquals(aCart, bCart);
    }

    @And("Click ADD TO CART button")
    public void clickAddToCartButton() {
        screenPlayNow.clickAddToCart();
    }


    @And("Click ADD TO CART button SportStake")
    public void clickAddToCartButtonSS() {
        screenPlayNow.clickAddToCartSS();
    }


    @And("Player selects one board")
    public void playerSelectsOneBoard() {
        screenPlayNow.selectTopBoard();
        screenBase.clickShakeOK();
    }

    @Then("All the selected numbers should be deselected and there should be no numbers under YOUR SELECTED NUMBERS")
    public void allTheSelectedNumbersShouldBeDeselectedAndThereShouldBeNoNumbersUnderYOURSELECTEDNUMBERS() {
        screenPlayNow.verifyNumbersReset();
    }

    @And("The ticket price should be equal to R{double} x number of boards {int} x number of draws {int}")
    public void theTicketPriceShouldBeEqualToRTicketCostXNumberOfBoardsBoardsXNumberOfDrawsDraws(double ticketPrice, int boards, int draws) {
        screenDailyLotto.calculateTotalTicket(ticketPrice, boards, draws);
    }

    @And("Player clicks on SAVE NUMBERS check mark")
    public void playerClicksOnSAVENUMBERSCheckMark() {
        screenPlayNow.clickSaveNumbers();
    }

    @And("Click on Play my saved numbers drop down")
    public void clickOnPlayMySavedNumbersDropDown() {
        screenPlayNow.clickSavedNumbersDropDown();
    }

    @And("Verify option was selected")
    public void verifyOptionWasSelected() {
        screenPlayNow.verifyAddToCartButton();
    }

    @And("Click on QUICK PICK")
    public void clickOnQUICKPICK() {
        screenPlayNow.clickQuickPick();
    }

    @And("Verify QUICK PICK was selected")
    public void verifyQUICKPICKWasSelected() {
        screenPlayNow.verifyQuickPickPlayed();
    }

    @And("Click on SAVE MY TICKET button")
    public void clickOnSAVEMYTICKETButton() {
        screenPlayNow.clickSaveMyTicket();
    }

    @And("Move game slider to {int}")
    public void moveGameSliderToDraws(int slider) {
        screenPlayNow.moveSliderTo(slider);
    }

    @And("Player clicks on HOW TO PLAY button")
    public void playerClicksOnHOWTOPLAYButton() {
        screenPlayNow.clickHowToPlayInGame();
    }
}
