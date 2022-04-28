package qa.ithuba.step_definitions.steps_media;

import io.cucumber.java.en.Then;
import qa.ithuba.screens.screen_media.ScreenMedia;

public class StepsMedia {

    ScreenMedia screenMedia;

    @Then("Player is redirected to Ithuba National Lottery YouTube account")
    public void playerIsRedirectedToIthubaNationalLotteryYouTubeAccount() {
        screenMedia.verifyYouTubePage();
    }
}
