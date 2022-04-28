package qa.ithuba.step_definitions.steps_side_menu;

import io.cucumber.java.en.And;
import qa.ithuba.screens.screen_side_menu.ScreenSideMenu;
import qa.ithuba.utilities.HelperUtil;

public class StepsSideMenu extends HelperUtil {

    ScreenSideMenu screenSideMenu;

    @And("Player clicks on SIDE MENU {string}")
    public void playerClicksOnSIDEMENU(String item) {
        switch (item) {
            case "Back Arrow" -> screenSideMenu.clickSideMenuBackArrow();
            case "LOGIN" -> screenSideMenu.clickLogin();
            case "Home" -> screenSideMenu.clickHome();
            case "Play Now!" -> screenSideMenu.clickPlayNow();
            case "How to Play?" -> screenSideMenu.clickHowToPlay();
            case "Results" -> screenSideMenu.clickResults();
            case "Rules and Regulations" -> screenSideMenu.clickRulesRegs();
            case "Rules and Regulations Lotto" -> screenSideMenu.clickRulesRegsLotto();
            case "Rules and Regulations PowerBall" -> screenSideMenu.clickRulesRegsPowerBall();
            case "Rules and Regulations SS4" -> screenSideMenu.clickRulesRegsSS4();
            case "Rules and Regulations SS8" -> {
                swipeUp(1);
                screenSideMenu.clickRulesRegsSS8();
            }
            case "Rules and Regulations SS13" -> {
                swipeUp(1);
                screenSideMenu.clickRulesRegsSS13();
            }
            case "Rules and Regulations SSCricket" -> {
                swipeUp(1);
                screenSideMenu.clickRulesRegsSSCricket();
            }
            case "Rules and Regulations SSRugby" -> {
                swipeUp(1);
                screenSideMenu.clickRulesRegsSSRugby();
            }
            case "Rules and Regulations Daily Lotto" -> {
                swipeUp(1);
                screenSideMenu.clickRulesRegsDailyLotto();
            }
            case "Rules and Regulations Raffle" -> {
                swipeUp(1);
                screenSideMenu.clickRulesRegsRaffle();
            }
            case "Rules and Regulations EaziWin" -> {
                swipeUp(1);
                screenSideMenu.clickRulesRegsEaziWin();
            }


            case "About Us" -> screenSideMenu.clickAboutUs();
            case "Media" -> screenSideMenu.clickMedia();
            case "Messages" -> screenSideMenu.clickMessages();
            case "Contact Us" -> {
                swipeUp(1);
                screenSideMenu.clickContactUs();
            }
            case "FAQ" -> {
                swipeUp(1);
                screenSideMenu.clickFAQ();
            }
            case "Terms and Conditions" -> {
                swipeUp(1);
                screenSideMenu.clickTnC();
            }
            case "Lotteries Act" -> {
                swipeUp(1);
                screenSideMenu.clickLotteriesAct();
            }
            case "Play Responsibly" -> {
                swipeUp(1);
                screenSideMenu.clickPlayResponsibly();
            }
            case "App Version 2.9" -> {
                swipeUp(1);
                screenSideMenu.getAppVersion();
            }
            default -> throw new IllegalArgumentException(item);
        }
    }

    @And("{string} Player verifies the pre login SIDE MENU link text for")
    public void playerVerifiesThePreLoginLinkTextForLink(String link) {
        screenSideMenu.verifyLinkTextPreLoginSideMenu(link);

    }

    @And("Player verifies the link text for {string}")
    public void playerVerifiesTheLinkTextForLink(String item) {
        screenSideMenu.verifyLinkTextSideMenu(item);
    }
}
