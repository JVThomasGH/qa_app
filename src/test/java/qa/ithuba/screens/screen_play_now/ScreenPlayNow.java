package qa.ithuba.screens.screen_play_now;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import qa.ithuba.screens.screen_base.ScreenBase;
import qa.ithuba.screens.screen_popups.ScreenPopUps;
import qa.ithuba.utilities.HelperUtil;

import java.util.ArrayList;
import java.util.List;

public class ScreenPlayNow extends HelperUtil {

    ScreenPopUps screenPopUps;
    ScreenBase screenBase;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").packageName(\"com.nationallottery.ithuba\").enabled(true).clickable(true).longClickable(false).checkable(false).checked(false).focusable(true).focused(false).scrollable(false).selected(false).index(0)")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade playNowLotto;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").packageName(\"com.nationallottery.ithuba\").enabled(true).clickable(true).longClickable(false).checkable(false).checked(false).focusable(true).focused(false).scrollable(false).selected(false).index(1)")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade playNowPowerBall;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").packageName(\"com.nationallottery.ithuba\").enabled(true).clickable(true).longClickable(false).checkable(false).checked(false).focusable(true).focused(false).scrollable(false).selected(false).index(2)")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade playNowSportStake4;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").packageName(\"com.nationallottery.ithuba\").enabled(true).clickable(true).longClickable(false).checkable(false).checked(false).focusable(true).focused(false).scrollable(false).selected(false).index(3)")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade playNowSportStake8;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").packageName(\"com.nationallottery.ithuba\").enabled(true).clickable(true).longClickable(false).checkable(false).checked(false).focusable(true).focused(false).scrollable(false).selected(false).index(4)")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade playNowSportStake13;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").packageName(\"com.nationallottery.ithuba\").enabled(true).clickable(true).longClickable(false).checkable(false).checked(false).focusable(true).focused(false).scrollable(false).selected(false).index(5)")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade playNowSportStakeCricket;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").packageName(\"com.nationallottery.ithuba\").enabled(true).clickable(true).longClickable(false).checkable(false).checked(false).focusable(true).focused(false).scrollable(false).selected(false).index(6)")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade playNowSportStakeRugby;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").packageName(\"com.nationallottery.ithuba\").enabled(true).clickable(true).longClickable(false).checkable(false).checked(false).focusable(true).focused(false).scrollable(false).selected(false).index(7)")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade playNowLottoDailyLotto;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").packageName(\"com.nationallottery.ithuba\").enabled(true).clickable(true).longClickable(false).checkable(false).checked(false).focusable(true).focused(false).scrollable(false).selected(false).index(8)")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade playNowRaffle;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").packageName(\"com.nationallottery.ithuba\").enabled(true).clickable(true).longClickable(false).checkable(false).checked(false).focusable(true).focused(false).scrollable(false).selected(false).index(9)")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade playNowEaiWIN;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.nationallottery.ithuba:id/img_game_logo' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gameLogo;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'How To Play' or . = 'How To Play') and @resource-id = 'com.nationallottery.ithuba:id/btn_how_to']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonHowToPlay;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'How To Play' or . = 'How To Play') and @resource-id = 'com.nationallottery.ithuba:id/btn_how_to']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonHowToPlayInGame;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Quick Pick' or . = 'Quick Pick') and @resource-id = 'com.nationallottery.ithuba:id/btn_quick_pick']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonQuickPick;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'My Saved Numbers' or . = 'My Saved Numbers') and @resource-id = 'com.nationallottery.ithuba:id/btn_saved_numbers']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonPlaySavedNumbers;


    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonPlayTopSavedNumbers;


    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[2]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade boardA;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Reset' or . = 'Reset') and @resource-id = 'com.nationallottery.ithuba:id/btn_reset']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonReset;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Reset' or . = 'Reset') and @resource-id = 'com.nationallottery.ithuba:id/btnResetSportsStakeManual']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonResetSS;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'SUBMIT' or . = 'SUBMIT') and @resource-id = 'com.nationallottery.ithuba:id/btn_submit']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSubmit;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'SUBMIT' or . = 'SUBMIT') and @resource-id = 'com.nationallottery.ithuba:id/b_submit']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSubmitWithdrawal;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'SUBMIT' or . = 'SUBMIT') and @resource-id = 'com.nationallottery.ithuba:id/btnSubmitSportsStakeManual']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSubmitSS;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'SUBMIT' or . = 'SUBMIT') and @resource-id = 'com.nationallottery.ithuba:id/btnSubmitSportsStakePropick']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSubmitSSPP;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'SAVE MY TICKET' or . = 'SAVE MY TICKET') and @resource-id = 'com.nationallottery.ithuba:id/btn_save_ticket']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSaveTicket;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.SeekBar' and @resource-id = 'com.nationallottery.ithuba:id/seekbar_draws']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade seekbarDraws;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Slide to select Number of Draws' or . = 'Slide to select Number of Draws') and @resource-id = 'com.nationallottery.ithuba:id/tv_slide_to_select']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade seekbarLabel;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txt_number']")
//    @iOSXCUITFindBy (id = "")
    private List<WebElementFacade> playedBallsList;

    @AndroidFindBy(xpath = "//*[@class = 'android.support.v7.widget.RecyclerView' and @resource-id = 'com.nationallottery.ithuba:id/recycler_selected' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade playedBoard;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'ADD TO CART' or . = 'ADD TO CART') and @resource-id = 'com.nationallottery.ithuba:id/btn_add_cart']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonAddToCart;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'ADD TO CART' or . = 'ADD TO CART') and @resource-id = 'com.nationallottery.ithuba:id/btn_add_to_cart']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonAddToCartSS;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[2]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonChoose5NumbersPB;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Your Selected Numbers:' or . = 'Your Selected Numbers:') and @resource-id = 'com.nationallottery.ithuba:id/txt_lbl']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelYourSelectedNumbers;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.nationallottery.ithuba:id/btn_save' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade checkMarkSaveNumbers;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Quick Pick' or . = 'Quick Pick') and @resource-id = 'com.nationallottery.ithuba:id/txt_quick_pick']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelQuickPick;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"RAFFLE\").packageName(\"com.nationallottery.ithuba\").enabled(true).clickable(false).longClickable(false).checkable(false).checked(false).focusable(false).focused(false).scrollable(false).selected(false).index(0)")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade headingRaffle;


    @AndroidFindBy(id = "com.nationallottery.ithuba:id/txt_game_name")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade headingLottos;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/title_sportstake_manual']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade heading;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/title_sportstake_manual']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade headingSS4;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/txt_board_num")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelOnBoard;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/btn_choose")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade chooseBoard;

    public void clickGameIcon(String gameName) {
        switch (gameName) {
            case "LOTTO" -> clickOn(playNowLotto);
            case "POWERBALL" -> clickOn(playNowPowerBall);
            case "SPORTSTAKE 4" -> clickOn(playNowSportStake4);
            case "SPORTSTAKE 8" -> clickOn(playNowSportStake8);
            case "SPORTSTAKE 13TM" -> clickOn(playNowSportStake13);
            case "SPORTSTAKE CRICKET" -> clickOn(playNowSportStakeCricket);
            case "SPORTSTAKE RUGBY" -> clickOn(playNowSportStakeRugby);
            case "DAILY LOTTO" -> clickOn(playNowLottoDailyLotto);
            case "RAFFLE" -> clickOn(playNowRaffle);
            case "EAZIWIN" -> clickOn(playNowEaiWIN);
            default -> throw new IllegalArgumentException(gameName);
        }

    }


    public void verifyScreen(String screenName) {
        switch (screenName) {
            case "LOTTO", "POWERBALL", "DAILY LOTTO" -> Assert.assertEquals(screenName, headingLottos.getText());
            case "SPORTSTAKE 4", "SPORTSTAKE 8", "SPORTSTAKE 13TM", "SPORTSTAKE CRICKET", "SPORTSTAKE RUGBY" -> Assert.assertEquals(screenName, heading.getText());
            case "RAFFLE" -> Assert.assertEquals(screenName, headingRaffle.getText());
            default -> throw new IllegalArgumentException(screenName);
        }
    }

    public void verifyScreenSS4(String screenName) {
        Assert.assertEquals(screenName, headingSS4.getText());
    }

    public void clickOnBoard(int boardNumber) {
        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + boardNumber + "]/android.widget.TextView[2]"));
        screenBase.clickShakeOK();
    }

    public void clickChooseNumbers(int i) {
        clickOnBoard(i);
        logger("CURRENTLY ON BOARD: " + labelOnBoard.getText());
        screenBase.clickBackArrow();
    }

    public void clickChooseBoard() {
        clickOn(chooseBoard);
        screenBase.clickShakeOK();
        logger("CURRENTLY ON BOARD: " + labelOnBoard.getText());
        screenBase.clickBackArrow();
    }

    public void verifyNumberChoosersLotto() {
        for (int i = 0; i < 20 - 3; i++) {
            clickChooseBoard();
            swipeUp(1300, 1700);
        }
    }

    public void verifyNumberChoosersDailyLotto() {
        for (int i = 1; i < 6; i++) {
            clickOnBoard(i);
            screenBase.clickBackArrow();
        }
    }

    public void verifyNumberChoosersPowerBall() {
        for (int i = 1; i < 20; i++) {
            clickOnBoard(i);
            screenBase.clickBackArrow();
        }
    }


    public void clickSubmitButton() {
        clickOn(buttonSubmit);
    }

    public void clickSubmitButtonWithdrawal() {
        clickOn(buttonSubmitWithdrawal);
    }

    public void clickSubmitButtonSportStake() {
        clickOn(buttonSubmitSS);
    }

    public void clickResetButtonSportStake() {
        clickOn(buttonResetSS);
    }

    public void clickSubmitButtonSportStakePP() {
        clickOn(buttonSubmitSSPP);
    }

    public void clickResetButton() {
        clickOn(buttonReset);
    }

    public void clickResetButtonSS() {
        clickOn(buttonResetSS);
    }

    List<String> actualList = new ArrayList<>();

    public void verifyPlayedNumbers(List<String> balls) {
        for (WebElementFacade ball : playedBallsList) {
            actualList.add(ball.getText());
            logger("BALLS PLAYED: " + ball.getText());
        }
        Assert.assertEquals(balls, actualList);
    }

    public void verifyPlayedNumbersPowerBall(List<String> balls) {
        for (WebElementFacade ball : playedBallsList) {
            actualList.add(ball.getText());
            logger("BALLS PLAYED: " + ball.getText());
        }
        actualList.remove(5);
        Assert.assertEquals(balls, actualList);
    }

    public void clickAddToCart() {
        clickOn(buttonAddToCart);
    }

    public void clickAddToCartSS() {
        clickOn(buttonAddToCartSS);
    }

    public void selectTopBoard() {
        clickOn(buttonChoose5NumbersPB);
    }

    public void verifyNumbersReset() {
        try {
            Assert.assertTrue(labelYourSelectedNumbers.isDisabled());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public void clickSaveNumbers() {
        clickOn(checkMarkSaveNumbers);
    }

    public void clickSavedNumbersDropDown() {
        clickOn(boardA);
        screenBase.clickShakeOK();
        clickOn(buttonPlaySavedNumbers);
        clickOn(buttonPlayTopSavedNumbers);
    }

    public void verifyAddToCartButton() {
        Assert.assertTrue(buttonAddToCart.isDisplayed());
    }

    public void clickQuickPick() {
        clickOn(boardA);
        screenBase.clickShakeOK();
        clickOn(buttonQuickPick);
    }

    public void verifyQuickPickPlayed() {
        Assert.assertEquals("Quick Pick", labelQuickPick.getText());
        logger("FOUND: " + labelQuickPick.getText());
    }

    public void clickSaveMyTicket() {
        clickOn(buttonSaveTicket);
    }

    public void moveSliderTo(int slider) {
        int sl2 = slider + 1;
        Actions actions = new Actions(getDriver());
        clickOn(seekbarLabel);
        for (int i = 0; i < sl2; i++) {
            actions.sendKeys(Keys.RIGHT).perform();
        }
    }

    public void clickHowToPlay() {
        clickOn(buttonHowToPlay);
    }

    public void clickHowToPlayInGame() {
        clickOn(buttonHowToPlayInGame);
    }
}
