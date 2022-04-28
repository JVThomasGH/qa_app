package qa.ithuba.step_definitions.steps_home;

import io.cucumber.java.en.And;
import qa.ithuba.screens.screen_home.ScreenHomePreLogin;
import qa.ithuba.utilities.HelperUtil;


public class StepsHomePreLogin extends HelperUtil {

    ScreenHomePreLogin screenHomePreLogin;

    @And("Verify the pre login {string} icon")
    public void verifyThePreLoginIconIcons(String icon) {
        screenHomePreLogin.verifyIconHomeScreenPreLogin(icon);
    }

    @And("Verify pre login banners for {string}")
    public void verifyFooterBanner(String gameName) {
        screenHomePreLogin.verifyTopBannerPreLogin(gameName);
    }

    @And("Verify Footer Banner")
    public void verifyFooterBanner() {
        screenHomePreLogin.verifyFooterBanner();
    }
}
