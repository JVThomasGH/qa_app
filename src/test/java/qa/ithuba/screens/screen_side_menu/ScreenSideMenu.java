package qa.ithuba.screens.screen_side_menu;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.screens.screen_home.ScreenLogin;
import qa.ithuba.utilities.HelperUtil;
import qa.ithuba.screens.screen_base.ScreenBase;

import java.util.List;

public class ScreenSideMenu extends HelperUtil {

    ScreenBase screenBase;
    ScreenLogin screenLogin;

    @AndroidFindBy(className = "android.widget.ImageView")
//    @iOSXCUITFindBy (id = "")
    private List<WebElementFacade> gameIcons;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'LOGOUT' or . = 'LOGOUT') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconLogoutText;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageButton' and @resource-id = 'com.nationallottery.ithuba:id/ib_menu' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSideMenu;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'LOGIN' or . = 'LOGIN') and @resource-id = 'com.nationallottery.ithuba:id/tv_logout']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkLogin;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'LOGOUT' or . = 'LOGOUT') and @resource-id = 'com.nationallottery.ithuba:id/tv_logout']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkLogout;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.nationallottery.ithuba:id/iv_back_drawer' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkBackArrow;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Home' or . = 'Home') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkHome;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Play Now!' or . = 'Play Now!') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkPlayNow;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'How to Play?' or . = 'How to Play?') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkHowToPlay;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'My Profile' or . = 'My Profile') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkMyProfile;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'My Cart' or . = 'My Cart') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkMyCart;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Wallet' or . = 'Wallet') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkWallet;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Tickets' or . = 'Tickets') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkTickets;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Results' or . = 'Results') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkResults;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Rules and Regulations' or . = 'Rules and Regulations') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkRulesRegs;


    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = '- LOTTO' or . = '- LOTTO') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkRulesRegsLotto;


    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = '- POWERBALL' or . = '- POWERBALL') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkRulesRegsPowerBall;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = '- SPORTSTAKE 4' or . = '- SPORTSTAKE 4') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkRulesRegsSS4;

       @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = '- SPORTSTAKE 8' or . = '- SPORTSTAKE 8') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkRulesRegsSS8;

       @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = '- SPORTSTAKE 13' or . = '- SPORTSTAKE 13') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkRulesRegsSS13;

       @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = '- SPORTSTAKE CRICKET' or . = '- SPORTSTAKE CRICKET') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkRulesRegsSSCricket;

       @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = '- SPORTSTAKE RUGBY' or . = '- SPORTSTAKE RUGBY') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkRulesRegsSSRugby;

       @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = '- DAILY LOTTO' or . = '- DAILY LOTTO') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkRulesRegsDailyLotto;

       @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = '- RAFFLE' or . = '- RAFFLE') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkRulesRegsRaffle;

       @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = '- EAZiWIN' or . = '- EAZiWIN') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkRulesRegsEaziWin;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'About Us' or . = 'About Us') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkAboutUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Media' or . = 'Media') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkMedia;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Messages' or . = 'Messages') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkMessages;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Contact Us' or . = 'Contact Us') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkContactUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'FAQ' or . = 'FAQ') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkFAQ;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Terms & Conditions' or . = 'Terms & Conditions') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkTnC;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Lotteries Act' or . = 'Lotteries Act') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkLotteryAct;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Play Responsibly' or . = 'Play Responsibly') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkPlayResponsibly;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'App Version: 2.9' or . = 'App Version: 2.9') and @resource-id = 'com.nationallottery.ithuba:id/drawer_item_app_version']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelAppVersion;


    public void ClickIconHomePage(String icon) {
        switch (icon) {
            case "LOGOUT" -> gameIcons.get(1).click();
            case "PLAY" -> gameIcons.get(2).click();
            case "RESULTS" -> gameIcons.get(3).click();
            case "DRAWS" -> gameIcons.get(4).click();
            case "MY PROFILE" -> gameIcons.get(5).click();
            case "WALLET" -> gameIcons.get(6).click();
            case "TICKETS" -> gameIcons.get(7).click();
            case "HOW TO" -> gameIcons.get(8).click();
            case "CONTACT US" -> gameIcons.get(9).click();
            case "ABOUT US" -> gameIcons.get(10).click();
            case "MEDIA" -> gameIcons.get(11).click();
            case "MESSAGES" -> gameIcons.get(12).click();
            default -> throw new IllegalArgumentException(icon);
        }

    }

    public void verifyHomePage() {
        Assert.assertEquals("LOGOUT", iconLogoutText.getText());
    }

    public void clickSideMenu() {
        clickOn(buttonSideMenu);
    }

    public void clickLogin() {
        clickOn(linkLogin);
    }

    public void clickHome() {
        clickOn(linkHome);
    }

    public void clickPlayNow() {
        clickOn(linkPlayNow);
    }

    public void clickHowToPlay() {
        clickOn(linkHowToPlay);
    }

    public void clickResults() {
        clickOn(linkResults);
    }

    public void clickRulesRegs() {
        clickOn(linkRulesRegs);
    }

    public void clickRulesRegsLotto() {
        clickOn(linkRulesRegsLotto);
    }

    public void clickRulesRegsPowerBall() {
        clickOn(linkRulesRegsPowerBall);
    }

    public void clickRulesRegsSS4() {
        clickOn(linkRulesRegsSS4);
    }

    public void clickRulesRegsSS8() {
        clickOn(linkRulesRegsSS8);
    }

    public void clickRulesRegsSS13() {
        clickOn(linkRulesRegsSS13);
    }

    public void clickRulesRegsSSCricket() {
        clickOn(linkRulesRegsSSCricket);
    }

    public void clickRulesRegsSSRugby() {
        clickOn(linkRulesRegsSSRugby);
    }

    public void clickRulesRegsDailyLotto() {
        clickOn(linkRulesRegsDailyLotto);
    }

    public void clickRulesRegsRaffle() {
        clickOn(linkRulesRegsRaffle);
    }

    public void clickRulesRegsEaziWin() {
        clickOn(linkRulesRegsEaziWin);
    }

    public void clickAboutUs() {
        clickOn(linkAboutUs);
    }

    public void clickMedia() {
        clickOn(linkMedia);
    }

    public void clickMessages() {
        clickOn(linkMessages);
    }

    public void clickContactUs() {
        clickOn(linkContactUs);
    }

    public void clickFAQ() {
        clickOn(linkFAQ);
    }

    public void clickTnC() {
        clickOn(linkTnC);
    }

    public void clickLotteriesAct() {
        clickOn(linkLotteryAct);
    }

    public void clickPlayResponsibly() {
        clickOn(linkPlayResponsibly);
    }

    public void getAppVersion() {
        clickOn(labelAppVersion);
    }

    public void clickSideMenuBackArrow() {
        clickOn(linkBackArrow);
    }

    public void verifyLinkTextPreLoginSideMenu(String link) {
        switch (link) {
            case "LOGIN" -> Assert.assertEquals(link, linkLogin.getText());
            case "Home" -> Assert.assertEquals(link, linkHome.getText());
            case "Play Now!" -> Assert.assertEquals(link, linkPlayNow.getText());
            case "How to Play?" -> Assert.assertEquals(link, linkHowToPlay.getText());
            case "Results" -> Assert.assertEquals(link, linkResults.getText());
            case "Rules and Regulations" -> Assert.assertEquals(link, linkRulesRegs.getText());
            case "About Us" -> Assert.assertEquals(link, linkAboutUs.getText());
            case "Media" -> Assert.assertEquals(link, linkMedia.getText());
            case "Messages" -> Assert.assertEquals(link, linkMessages.getText());
            case "Contact Us" -> Assert.assertEquals(link, linkContactUs.getText());
            case "FAQ" -> Assert.assertEquals(link, linkFAQ.getText());
            case "Terms & Conditions" -> Assert.assertEquals(link, linkTnC.getText());
            case "Lotteries Act" -> {
                swipeUp(1);
                Assert.assertEquals(link, linkLotteryAct.getText());
            }
            case "Play Responsibly" -> Assert.assertEquals(link, linkPlayResponsibly.getText());
            case "App Version: 2.9" -> {
                Assert.assertEquals(link, labelAppVersion.getText());
                clickOn(linkBackArrow);
            }
            default -> throw new IllegalArgumentException(link);
        }
    }

    public void verifyLinkTextSideMenu(String link) {
        switch (link) {
            case "LOGIN" -> Assert.assertEquals(link, linkLogin.getText());
            case "LOGOUT" -> Assert.assertEquals(link, linkLogout.getText());
            case "Home" -> Assert.assertEquals(link, linkHome.getText());
            case "Play Now!" -> Assert.assertEquals(link, linkPlayNow.getText());
            case "How to Play?" -> Assert.assertEquals(link, linkHowToPlay.getText());
            case "My Profile" -> Assert.assertEquals(link, linkMyProfile.getText());
            case "My Cart" -> Assert.assertEquals(link, linkMyCart.getText());
            case "Wallet" -> Assert.assertEquals(link, linkWallet.getText());
            case "Tickets" -> Assert.assertEquals(link, linkTickets.getText());
            case "Results" -> Assert.assertEquals(link, linkResults.getText());
            case "Rules and Regulations" -> Assert.assertEquals(link, linkRulesRegs.getText());
            case "About Us" -> Assert.assertEquals(link, linkAboutUs.getText());
            case "Media" -> Assert.assertEquals(link, linkMedia.getText());
            case "Messages" -> {
                swipeUp(1);
                Assert.assertEquals(link, linkMessages.getText());
            }
            case "Contact Us" -> Assert.assertEquals(link, linkContactUs.getText());
            case "FAQ" -> Assert.assertEquals(link, linkFAQ.getText());
            case "Terms & Conditions" -> Assert.assertEquals(link, linkTnC.getText());
            case "Lotteries Act" -> Assert.assertEquals(link, linkLotteryAct.getText());
            case "Play Responsibly" -> Assert.assertEquals(link, linkPlayResponsibly.getText());
            case "App Version: 2.9" -> Assert.assertEquals(link, labelAppVersion.getText());
        }
    }
}
