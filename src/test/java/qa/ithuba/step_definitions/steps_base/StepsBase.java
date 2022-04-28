package qa.ithuba.step_definitions.steps_base;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.webdriver.exceptions.ElementShouldBeEnabledException;
import org.junit.runner.RunWith;
import qa.ithuba.screens.screen_about.ScreenContactUs;
import qa.ithuba.screens.screen_register.ScreenRegister;
import qa.ithuba.screens.screen_tickets.ScreenTickets;
import qa.ithuba.screens.screen_base.ScreenBase;
import qa.ithuba.screens.screen_forgot_pin.ScreenForgotPIN;
import qa.ithuba.screens.screen_home.ScreenHome;
import qa.ithuba.screens.screen_home.ScreenLogin;
import qa.ithuba.screens.screen_how_to.ScreenHowTo;
import qa.ithuba.screens.screen_play_now.ScreenPlayNow;
import qa.ithuba.screens.screen_results.ScreenResults;
import qa.ithuba.screens.screen_wallet.ScreenWallet;
import qa.ithuba.utilities.HelperUtil;

@RunWith(SerenityRunner.class)
public class StepsBase extends HelperUtil {

    ScreenBase screenBase;
    ScreenLogin screenLogin;
    ScreenHome screenHome;
    ScreenContactUs screenContactUs;
    ScreenForgotPIN screenForgotPIN;
    ScreenRegister screenRegister;
    ScreenHowTo screenHowTo;
    ScreenPlayNow screenPlayNow;
    ScreenResults screenResults;
    ScreenWallet screenWallet;
    ScreenTickets screenTickets;

    @Given("Player enters their login credentials")
    public void playerIsLoggedIntoTheIthubaNationalLotteryWebsite(DataTable dataTable) throws InterruptedException {
        String userID = dataTable.row(0).get(0);
        String userPass = dataTable.row(0).get(1);
        System.out.println(dataTable.row(0).indexOf(0));
        screenLogin.login(userID, userPass);
    }

    @And("Click on BACK ARROW")
    public void clickOnBack() {
        try {
            screenBase.clickBackArrow();
            SLEEP(500);
        } catch (ElementShouldBeEnabledException e) {
            System.out.println("BACK ARROW NOT VISIBLE");;
        }
    }

    @Then("Player should be on {string} screen")
    public void playerShouldBeOnPage(String screenName) {
        switch (screenName) {
            case "HOME" -> screenHome.verifyIfOnHomeScreen(screenName);
            case "CONTACT US" -> screenContactUs.verifyIfOnContactUsScreen(screenName);
            case "RESULTS" -> screenResults.verifyIfOnResultsScreen(screenName);
            case "WALLET" -> screenWallet.verifyIfOnWalletScreen(screenName);
            case "TOP UP" -> screenWallet.verifyIfOnTopUpScreen(screenName);
            case "LOGIN" -> screenLogin.verifyLoginScreen(screenName);
            case "LOGOUT" -> screenLogin.verifyHomeScreen(screenName);
            case "FORGOT PIN" -> screenForgotPIN.verifyForgotPINScreen(screenName);
            case "REGISTER NOW!" -> screenRegister.verifyRegisterScreen(screenName);
            case "HOW TO" -> screenHowTo.verifyHowToScreen(screenName);
            case "SPORTSTAKE 4" -> screenPlayNow.verifyScreenSS4(screenName);
            case "LOTTO", "POWERBALL", "DAILY LOTTO", "SPORTSTAKE 8", "SPORTSTAKE 13TM", "SPORTSTAKE CRICKET", "SPORTSTAKE RUGBY", "RAFFLE", "EAZIWIN" -> screenPlayNow.verifyScreen(screenName);
            case "TRANSACTION HISTORY" -> screenWallet.verifyScreenTH(screenName);
            default -> throw new IllegalArgumentException(screenName);
        }
    }

    @And("Verify the {string} page contents")
    public void verifyThePageContents(String screenName) {
        switch (screenName) {
            case "CONTACT US" -> screenContactUs.verifyContactUsScreen();
        }
    }

}
