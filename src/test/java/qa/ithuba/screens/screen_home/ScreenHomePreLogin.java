package qa.ithuba.screens.screen_home;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.screens.screen_base.ScreenBase;
import qa.ithuba.utilities.HelperUtil;

public class ScreenHomePreLogin extends HelperUtil {

    ScreenLogin screenLogin;
    ScreenBase screenBase;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'LOGIN' or . = 'LOGIN') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconPreHomeLogin;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'PLAY' or . = 'PLAY') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconPreHomePlay;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'RESULTS' or . = 'RESULTS') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconPreHomeResults;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'HOW TO' or . = 'HOW TO') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconPreHomeHowTo;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'CONTACT US' or . = 'CONTACT US') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconPreHomeContactUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'ABOUT US' or . = 'ABOUT US') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconPreHomeAboutUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'MEDIA' or . = 'MEDIA') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconPreHomeMedia;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'MESSAGES' or . = 'MESSAGES') and @resource-id = 'com.nationallottery.ithuba:id/dashboard_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconPreHomeMessages;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.nationallottery.ithuba:id/iv_banner' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade bannerFooterHomePreLogin;

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


    public void verifyIconHomeScreenPreLogin(String icon) {
        switch (icon) {
            case "LOGIN" -> {
                clickOn(iconPreHomeLogin);
                SLEEP(1000);
                screenLogin.clickCancelButton();
            }
            case "PLAY" -> {
                clickOn(iconPreHomePlay);
                SLEEP(1000);
                screenBase.clickBackArrow();
            }

            case "RESULTS" -> {
                clickOn(iconPreHomeResults);
                SLEEP(1000);
                screenBase.clickBackArrow();
            }
            case "HOW TO" -> {
                clickOn(iconPreHomeHowTo);
                SLEEP(1000);
                screenBase.clickBackArrow();
            }
            case "CONTACT US" -> {
                clickOn(iconPreHomeContactUs);
                SLEEP(1000);
                screenBase.clickBackArrow();
            }
            case "ABOUT US" -> {
                clickOn(iconPreHomeAboutUs);
                SLEEP(1000);
                screenBase.clickBackArrow();
            }
            case "MEDIA" -> {
                clickOn(iconPreHomeMedia);
                SLEEP(1000);
                getDriver().navigate().back();
            }
            case "MESSAGES" -> {
                clickOn(iconPreHomeMessages);
                SLEEP(1000);
                screenLogin.clickCancelButton();
            }
            default -> throw new IllegalArgumentException(icon);
        }
    }

    public void clickIconHomeScreenPreLogin(String icon) {
        switch (icon) {
            case "LOGIN" -> clickOn(iconPreHomeLogin);
            case "PLAY" -> clickOn(iconPreHomePlay);
            case "RESULTS" -> clickOn(iconPreHomeResults);
            case "HOW TO" -> clickOn(iconPreHomeHowTo);
            case "CONTACT US" -> clickOn(iconPreHomeContactUs);
            case "ABOUT US" -> clickOn(iconPreHomeAboutUs);
            case "MEDIA" -> clickOn(iconPreHomeMedia);
            case "MESSAGES" -> clickOn(iconPreHomeMessages);
            default -> throw new IllegalArgumentException(icon);
        }
    }

    public void verifyFooterBanner() {
        Assert.assertTrue(bannerFooterHomePreLogin.isDisplayed());
        clickOn(bannerFooterPlayNowButtonHomePreLogin);
        screenLogin.clickCancelButton();
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

    public void verifyTopBannerPreLogin(String gameName) {
        switch (gameName) {
            case "LOTTO" -> {
                clickBannerTopLeftArrow(1);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON LOTTO PLAY NOW");
                screenLogin.clickCancelButton();
            }
            case "LOTTO PLUS 1" -> {
                clickBannerTopLeftArrow(2);
                clickBannerTopRightArrow(1);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON LOTTO PLUS 1 PLAY NOW");
                screenLogin.clickCancelButton();
            }
            case "LOTTO PLUS 2" -> {
                clickBannerTopLeftArrow(2);
                clickBannerTopRightArrow(2);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON LOTTO PLUS 2 PLAY NOW");
                screenLogin.clickCancelButton();
            }
            case "POWERBALL" -> {
                clickBannerTopLeftArrow(3);
                clickBannerTopRightArrow(3);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON POWERBALL PLAY NOW");
                screenLogin.clickCancelButton();
            }
            case "POWERBALL PLUS" -> {
                clickBannerTopLeftArrow(4);
                clickBannerTopRightArrow(4);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON POWERBALL PLUS PLAY NOW");
                screenLogin.clickCancelButton();
            }
            case "SPORTSTAKE 4" -> {
                clickBannerTopLeftArrow(5);
                clickBannerTopRightArrow(5);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON SPORTSTAKE 4 PLAY NOW");
                screenLogin.clickCancelButton();
            }
            case "SPORTSTAKE 8" -> {
                clickBannerTopLeftArrow(6);
                clickBannerTopRightArrow(6);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON SPORTSTAKE 8 PLAY NOW");
                screenLogin.clickCancelButton();
            }
            case "SPORTSTAKE 13" -> {
                clickBannerTopLeftArrow(7);
                clickBannerTopRightArrow(7);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON SPORTSTAKE 13 PLAY NOW");
                screenLogin.clickCancelButton();
            }
            case "SPORTSTAKE CRICKET" -> {
                clickBannerTopLeftArrow(8);
                clickBannerTopRightArrow(8);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON SPORTSTAKE CRICKET PLAY NOW");
                screenLogin.clickCancelButton();
            }
            case "SPORTSTAKE RUGBY" -> {
                clickBannerTopLeftArrow(9);
                clickBannerTopRightArrow(9);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON SPORTSTAKE RUGBY PLAY NOW");
                screenLogin.clickCancelButton();
            }
            case "DAILY LOTTO" -> {
                clickBannerTopLeftArrow(10);
                clickBannerTopRightArrow(10);
                clickOn(bannerTopPlayNow);
                System.out.println("CLICKED ON DAILY LOTTO PLAY NOW");
                screenLogin.clickCancelButton();
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
