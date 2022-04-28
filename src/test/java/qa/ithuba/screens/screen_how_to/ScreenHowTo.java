package qa.ithuba.screens.screen_how_to;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.utilities.HelperUtil;

public class ScreenHowTo extends HelperUtil {

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'HOW TO' or . = 'HOW TO') and @resource-id = 'com.nationallottery.ithuba:id/txt_htp']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade headingHowToScreen;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Select a game and find out how to play' or . = 'Select a game and find out how to play') and @resource-id = 'com.nationallottery.ithuba:id/txt_htp_1']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade heading2HowToScreen;

    @AndroidFindBy(xpath = "//*[@class = 'android.support.v7.widget.RecyclerView' and @resource-id = 'com.nationallottery.ithuba:id/rv_game_icons' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconBoxHowTo;

    @AndroidFindBy(xpath = "//android.widget.ImageView[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHowToLotto;

    @AndroidFindBy(xpath = "//android.widget.ImageView[2]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHowToPowerBall;

    @AndroidFindBy(xpath = "//android.widget.ImageView[3]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHowToLottoPlus1;

    @AndroidFindBy(xpath = "//android.widget.ImageView[4]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHowToPowerBallPlus;

    @AndroidFindBy(xpath = "//android.widget.ImageView[5]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHowToLottoPlus2;

    @AndroidFindBy(xpath = "//android.widget.ImageView[6]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHowToSportStake4;

    @AndroidFindBy(xpath = "//android.widget.ImageView[7]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHowToSportStake8;

    @AndroidFindBy(xpath = "//android.widget.ImageView[8]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHowToSportStake13;

    @AndroidFindBy(xpath = "//android.widget.ImageView[9]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHowToSportStakeCricket;

    @AndroidFindBy(xpath = "//android.widget.ImageView[10]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHowToSportStakeRugby;

    @AndroidFindBy(xpath = "//android.widget.ImageView[11]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHowToDailyLotto;

    @AndroidFindBy(xpath = "//android.widget.ImageView[12]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHowToRaffle;

    @AndroidFindBy(xpath = "//android.widget.ImageView[13]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHowToEaziWIN;

    public void verifyHowToScreen(String screenName) {
        Assert.assertEquals(screenName, headingHowToScreen.getText());
    }

    public void verifyHowToScreenContents() {
        Assert.assertEquals("Select a game and find out how to play", heading2HowToScreen.getText());
        Assert.assertTrue(iconBoxHowTo.isDisplayed());
    }

    public void clickIcon(String gameName) {
        switch (gameName) {
            case "Lotto" -> clickOn(iconHowToLotto);
            case "Lotto Plus 1" -> clickOn(iconHowToLottoPlus1);
            case "Lotto Plus 2" -> clickOn(iconHowToLottoPlus2);
            case "PowerBall" -> clickOn(iconHowToPowerBall);
            case "PowerBall Plus" -> clickOn(iconHowToPowerBallPlus);
            case "SportStake 4" -> clickOn(iconHowToSportStake4);
            case "SportStake 8" -> clickOn(iconHowToSportStake8);
            case "SportStake 13" -> clickOn(iconHowToSportStake13);
            case "SportStake Cricket" -> clickOn(iconHowToSportStakeCricket);
            case "SportStake Rugby" -> clickOn(iconHowToSportStakeRugby);
            case "Daily Lotto" -> clickOn(iconHowToDailyLotto);
            case "Raffle" -> clickOn(iconHowToRaffle);
            case "EaziWIN" -> clickOn(iconHowToEaziWIN);
        }
    }
}
