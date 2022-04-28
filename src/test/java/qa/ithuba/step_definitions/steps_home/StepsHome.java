package qa.ithuba.step_definitions.steps_home;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.ithuba.screens.screen_home.ScreenHome;
import qa.ithuba.utilities.HelperUtil;

public class StepsHome extends HelperUtil {

    ScreenHome screenHome;

    @And("Verify the post login {string} icon")
    public void verifyThePreLoginIconIcons(String icon) {
        screenHome.verifyIconHomeScreenPostLogin(icon);
    }

    @Then("Player profile name should be displayed")
    public void userProfileNameShouldBeDisplayed() {
        screenHome.verifyPlayerName();
    }

    @Then("Player wallet balance should be displayed")
    public void accountBalanceIsDisplayed() {
        screenHome.verifyWalletBalance();
    }

    @When("Player Clicks Home screen {string} icon")
    public void playerIsOnTheHomeScreenClickOnAboutUs(String icon) {
        screenHome.clickIconHomeScreen(icon);
    }

    @When("Player clicks on the side menu on the top left corner of the Home screen")
    public void playerClicksOnTheSideMenuOnTheTopLeftCornerOfTheHomeScreen() {
        screenHome.clickSideMenu();
    }

    @And("Player logs out")
    public void playerLogsOut() {
        screenHome.clickLogoutIcon();
        screenHome.clickButtonConfirmLogout();
    }

    @And("Verify post login banners for {string}")
    public void verifyPostLoginBanners(String gameName) {
        screenHome.verifyTopBannerPostLogin(gameName);
    }
}
