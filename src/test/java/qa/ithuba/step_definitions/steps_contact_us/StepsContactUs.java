package qa.ithuba.step_definitions.steps_contact_us;

import io.cucumber.java.en.And;
import qa.ithuba.screens.screen_about.ScreenContactUs;

public class StepsContactUs {

    ScreenContactUs screenContactUs;


    @And("Player clicks Contact Us screen {string} link")
    public void playerClicksContactUsScreenLink(String link) {
        screenContactUs.clickLink(link);
    }
}
