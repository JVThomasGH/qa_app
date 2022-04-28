package qa.ithuba.step_definitions.steps_about;

import io.cucumber.java.en.And;
import qa.ithuba.screens.screen_about.ScreenAbout;

public class StepsAboutUs {

    ScreenAbout pageAbout;

    @And("Player verifies the main Image is as per design document")
    public void playerVerifiesTheMainImageIsAsPerDesignDocument() throws InterruptedException {
        pageAbout.verifyAboutImage();
    }

    @And("Player verifies the text is same as design document")
    public void playerVerifiesTheTextIsSameAsDesignDocument() {
        pageAbout.verifyPageText();
    }
}
