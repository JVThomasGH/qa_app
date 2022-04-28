package qa.ithuba.step_definitions.steps_faq;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.ithuba.screens.screen_faq.*;

public class StepsFAQ {

    ScreenFAQ screenFAQ;
    ScreenFAQLotto screenFAQLotto;
    ScreenFAQPowerBall screenFAQPowerBall;
    ScreenFAQSportStake4 screenFAQSportStake4;
    ScreenFAQSportStake8 screenFAQSportStake8;
    ScreenFAQSportStake13 screenFAQSportStake13;
    ScreenFAQSportStakeCricket screenFAQSportStakeCricket;
    ScreenFAQSportStakeRugby screenFAQSportStakeRugby;
    ScreenFAQDailyLotto screenFAQDailyLotto;
    ScreenFAQRaffle screenFAQRaffle;
    ScreenFAQEaziWIN screenFAQEaziWIN;

    @Then("FAQs screen is displayed with the list of all games as per the design document")
    public void faqsScreenIsDisplayedWithTheListOfAllGamesAsPerTheDesignDocument() {
        screenFAQ.verifyTextFAQ();
    }

    @When("Player Clicks FAQ screen {string} icon")
    public void playerClicksFAQScreenIcon(String gameName) {
        screenFAQ.clickIcon(gameName);
    }

    @And("Player clicks each question and then verify its contents for {string}")
    public void playerClicksEachQuestionAndThenVerifyItsContentsForGame(String gameName) {
        switch (gameName) {
            case "Lotto" -> screenFAQLotto.expandAndVerifyQuestionsLotto();
            case "PowerBall" -> screenFAQPowerBall.expandAndVerifyQuestionsPowerBall();
            case "SportStake 4" -> screenFAQSportStake4.expandAndVerifyQuestionsSportStake4();
            case "SportStake 8" -> screenFAQSportStake8.expandAndVerifyQuestionsSportStake8();
            case "SportStake 13" -> screenFAQSportStake13.expandAndVerifyQuestionsSportStake13();
            case "SportStake Cricket" -> screenFAQSportStakeCricket.expandAndVerifyQuestionsSportStakeCricket();
            case "SportStake Rugby" -> screenFAQSportStakeRugby.expandAndVerifyQuestionsSportStakeRugby();
            case "Daily Lotto" -> screenFAQDailyLotto.expandAndVerifyQuestionsDailyLotto();
            case "Raffle" -> screenFAQRaffle.expandAndVerifyQuestionsRaffle();
            case "EaziWIN" -> screenFAQEaziWIN.expandAndVerifyQuestionsEaziWIN();

        }
    }
}
