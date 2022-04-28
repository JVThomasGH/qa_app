package qa.ithuba.screens.screen_home;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.screens.screen_base.ScreenBase;
import qa.ithuba.utilities.HelperUtil;

import java.util.List;

public class ScreenHome extends HelperUtil {

    ScreenBase screenBase;
    ScreenLogin screenLogin;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'LOGOUT' or . = 'LOGOUT') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconLogoutText;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageButton' and @resource-id = 'com.nationallottery.ithuba:id/ib_menu' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSideMenu;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'LOGOUT' or . = 'LOGOUT') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHomeLogout;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'PLAY' or . = 'PLAY') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHomePlay;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'RESULTS' or . = 'RESULTS') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHomeResults;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'DRAWS' or . = 'DRAWS') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHomeDraws;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'MY PROFILE' or . = 'MY PROFILE') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHomeMyProfile;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'WALLET' or . = 'WALLET') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHomeWallet;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'TICKETS' or . = 'TICKETS') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHomeTickets;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'HOW TO' or . = 'HOW TO') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHomeHowTo;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'CONTACT US' or . = 'CONTACT US') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHomeContactUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'ABOUT US' or . = 'ABOUT US') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHomeAboutUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'MEDIA' or . = 'MEDIA') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHomeMedia;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'MESSAGES' or . = 'MESSAGES') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHomeMessages;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/txt_cart_count")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconCart;

    //    @AndroidFindBy(id = "com.nationallottery.ithuba:id/dashboard_icon")
    @AndroidFindBy(className = "android.widget.TextView")
//    @iOSXCUITFindBy (id = "")
    private List<WebElementFacade> homeIcons;

    //    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"ABOUT US\")")
    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'LOGOUT' or . = 'LOGOUT') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconLogout;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"PLAY\")")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconPlay;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'RESULTS' or . = 'RESULTS') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconResults;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'DRAWS' or . = 'DRAWS') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconDraws;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'MY PROFILE' or . = 'MY PROFILE') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconProfile;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'WALLET' or . = 'WALLET') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconWallet;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'TICKETS' or . = 'TICKETS') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconTickets;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'HOW TO' or . = 'HOW TO') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHowTo;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'CONTACT US' or . = 'CONTACT US') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconContactUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'ABOUT US' or . = 'ABOUT US') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconAboutUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'MEDIA' or . = 'MEDIA') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconMedia;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'MESSAGES' or . = 'MESSAGES') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconMessages;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.nationallottery.ithuba:id/iv_banner' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade bannerFooterHomePreLogin;

    @AndroidFindBy(id = "android:id/button1")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonConfirmLogout;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/txt_user_name")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textUserName;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/txt_balance")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textWalletAmount;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.Button[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade bannerFooterPlayNowButtonHomePreLogin;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageButton' and @resource-id = 'com.nationallottery.ithuba:id/ib_arrow_left' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade bannerTopLeftArrow;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageButton' and @resource-id = 'com.nationallottery.ithuba:id/ib_arrow_right' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade bannerTopRightArrow;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v4.view.ViewPager[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.Button[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade bannerTopPlayNow;


    public void clickIconHomeScreen(String icon) {
        switch (icon) {
            case "LOGOUT" -> {
                clickOn(iconHomeLogout);
                screenBase.clickLogoutSuccess();
            }
            case "PLAY" -> clickOn(iconHomePlay);
            case "RESULTS" -> clickOn(iconHomeResults);
            case "DRAWS" -> clickOn(iconHomeDraws);
            case "MY PROFILE" -> clickOn(iconHomeMyProfile);
            case "WALLET" -> clickOn(iconHomeWallet);
            case "TICKETS" -> clickOn(iconHomeTickets);
            case "HOW TO" -> clickOn(iconHomeHowTo);
            case "CONTACT US" -> clickOn(iconHomeContactUs);
            case "ABOUT US" -> clickOn(iconHomeAboutUs);
            case "MEDIA" -> clickOn(iconHomeMedia);
            case "MESSAGES" -> clickOn(iconHomeMessages);
            default -> throw new IllegalArgumentException(icon);
        }
    }

    public void verifyIfOnHomeScreen(String screenName) {
        Assert.assertEquals(screenName, iconLogoutText.getText());
    }

    public void clickSideMenu() {
        clickOn(buttonSideMenu);
    }


    public boolean verifyCartIcon() {
        return iconCart.isDisplayed();
    }

    public boolean verifyIconLogout() {
        return iconLogout.isDisplayed();
    }

    public void clickLogoutIcon() {
        clickOn(iconLogout);
    }

    public void clickPlayIcon() {
        clickOn(iconPlay);
    }

    public void clickResultsIcon() {
        clickOn(iconResults);
    }

    public void clickDrawsIcon() {
        clickOn(iconDraws);
    }

    public void clickProfileIcon() {
        clickOn(iconProfile);
    }

    public void clickWalletIcon() {
        clickOn(iconWallet);
    }

    public void clickTicketsIcon() {
        clickOn(iconTickets);
    }

    public void clickHowToIcon() {
        clickOn(iconHowTo);
    }

    public void clickContactUsIcon() {
        clickOn(iconContactUs);
    }

    public void clickAboutUsIcon() {
        clickOn(iconAboutUs);
    }

    public void clickMediaIcon() {
        clickOn(iconMedia);
    }

    public void clickMessagesIcon() {
        clickOn(iconMessages);
    }

    public void clickButtonConfirmLogout() {
        SLEEP(1000);
        clickOn(buttonConfirmLogout);
    }

    public void verifyPlayerName() {
        Assert.assertTrue(textUserName.isDisplayed());
        logger("USERNAME: " + textUserName.getText());
    }

    public void verifyWalletBalance() {
        Assert.assertTrue(textWalletAmount.isDisplayed());
        logger("WALLET BALANCE: " + textWalletAmount.getText());
    }

    public void clickBannerTopLeftArrow(int loops) {
        for (int i = 0; i < loops; i++) {
            clickOn(bannerTopLeftArrow);
        }
    }

    public void clickBannerTopRightArrow(int loops) {
        for (int i = 0; i < loops; i++) {
            clickOn(bannerTopRightArrow);
        }
    }

    public void verifyIconHomeScreenPostLogin(String icon) {
        switch (icon) {
            case "LOGOUT" -> {
                clickOn(iconHomeLogout);
                clickButtonConfirmLogout();
            }
            case "PLAY" -> {
                clickOn(iconHomePlay);
                SLEEP(1000);
                screenBase.clickBackArrow();
            }

            case "RESULTS" -> {
                clickOn(iconHomeResults);
                SLEEP(1000);
                screenBase.clickBackArrow();
            }

            case "DRAWS" -> {
                clickOn(iconHomeDraws);
                SLEEP(1000);
                screenBase.clickBackArrow();
            }

            case "MY PROFILE" -> {
                clickOn(iconHomeMyProfile);
                SLEEP(1000);
                screenBase.clickBackArrow();
            }

            case "WALLET" -> {
                clickOn(iconHomeWallet);
                SLEEP(1000);
                screenBase.clickBackArrow();
            }

            case "TICKETS" -> {
                clickOn(iconHomeTickets);
                SLEEP(1000);
                screenBase.clickBackArrow();
            }

            case "HOW TO" -> {
                clickOn(iconHomeHowTo);
                SLEEP(1000);
                screenBase.clickBackArrow();
            }
            case "CONTACT US" -> {
                clickOn(iconHomeContactUs);
                SLEEP(1000);
                screenBase.clickBackArrow();
            }
            case "ABOUT US" -> {
                clickOn(iconHomeAboutUs);
                SLEEP(1000);
                screenBase.clickBackArrow();
            }
            case "MEDIA" -> {
                clickOn(iconHomeMedia);
                SLEEP(1000);
                getDriver().navigate().back();
            }
            case "MESSAGES" -> {
                clickOn(iconHomeMessages);
                SLEEP(1000);
                getDriver().navigate().back();
            }
            default -> throw new IllegalArgumentException(icon);
        }
    }

    public void verifyTopBannerPostLogin(String gameName) {
        switch (gameName) {
            case "LOTTO" -> {
                clickBannerTopLeftArrow(1);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON LOTTO PLAY NOW");
                screenBase.clickBackArrow();
            }
            case "LOTTO PLUS 1" -> {
                clickBannerTopLeftArrow(2);
                clickBannerTopRightArrow(1);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON LOTTO PLUS 1 PLAY NOW");
                screenBase.clickBackArrow();
            }
            case "LOTTO PLUS 2" -> {
                clickBannerTopLeftArrow(2);
                clickBannerTopRightArrow(2);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON LOTTO PLUS 2 PLAY NOW");
                screenBase.clickBackArrow();
            }
            case "POWERBALL" -> {
                clickBannerTopLeftArrow(3);
                clickBannerTopRightArrow(3);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON POWERBALL PLAY NOW");
                screenBase.clickBackArrow();
            }
            case "POWERBALL PLUS" -> {
                clickBannerTopLeftArrow(4);
                clickBannerTopRightArrow(4);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON POWERBALL PLUS PLAY NOW");
                screenBase.clickBackArrow();
            }
            case "SPORTSTAKE 4" -> {
                clickBannerTopLeftArrow(5);
                clickBannerTopRightArrow(5);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON SPORTSTAKE 4 PLAY NOW");
                screenBase.clickBackArrow();
            }
            case "SPORTSTAKE 8" -> {
                clickBannerTopLeftArrow(6);
                clickBannerTopRightArrow(6);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON SPORTSTAKE 8 PLAY NOW");
                screenBase.clickBackArrow();
            }
            case "SPORTSTAKE 13" -> {
                clickBannerTopLeftArrow(7);
                clickBannerTopRightArrow(7);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON SPORTSTAKE 13 PLAY NOW");
                screenBase.clickBackArrow();
            }
            case "SPORTSTAKE CRICKET" -> {
                clickBannerTopLeftArrow(8);
                clickBannerTopRightArrow(8);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON SPORTSTAKE CRICKET PLAY NOW");
                screenBase.clickBackArrow();
            }
            case "SPORTSTAKE RUGBY" -> {
                clickBannerTopLeftArrow(9);
                clickBannerTopRightArrow(9);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON SPORTSTAKE RUGBY PLAY NOW");
                screenBase.clickBackArrow();
            }
            case "DAILY LOTTO" -> {
                clickBannerTopLeftArrow(10);
                clickBannerTopRightArrow(10);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON DAILY LOTTO PLAY NOW");
                screenBase.clickBackArrow();
            }
            case "RAFFLE" -> {
                clickBannerTopLeftArrow(11);
                clickBannerTopRightArrow(11);
                System.out.println("ON RAFFLE PLAY NOW");
            }
            default -> throw new IllegalArgumentException(gameName);
        }
    }
}
