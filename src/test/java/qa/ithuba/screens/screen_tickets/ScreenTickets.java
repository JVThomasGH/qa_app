package qa.ithuba.screens.screen_tickets;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.utilities.HelperUtil;

import java.util.Calendar;
import java.util.Date;

public class ScreenTickets extends HelperUtil {

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Saved Numbers' or . = 'Saved Numbers') and @resource-id = 'com.nationallottery.ithuba:id/btn_saved_nos']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSavedNumbers;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Saved Tickets' or . = 'Saved Tickets') and @resource-id = 'com.nationallottery.ithuba:id/btn_saved_tickets']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSavedTickets;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Pending Draws' or . = 'Pending Draws') and @resource-id = 'com.nationallottery.ithuba:id/btn_pending_draws']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonPendingDraws;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Historical Tickets' or . = 'Historical Tickets') and @resource-id = 'com.nationallottery.ithuba:id/btn_historical_tickets']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonHistoricalTickets;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonLotto;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[2]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonPowerBall;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[3]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonDailyLotto;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[3]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade topSavedTicket;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'MY TICKETS' or . = 'MY TICKETS') and @resource-id = 'com.nationallottery.ithuba:id/txt_my_wallet']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade headingTickets;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoLotto;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[2]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoPowerBall;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[3]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoDailyLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Play Saved Numbers' or . = 'Play Saved Numbers') and @resource-id = 'com.nationallottery.ithuba:id/txt_my_saved_nos']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonPlaySavedNumbers;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Your Selected Numbers' or . = 'Your Selected Numbers') and @resource-id = 'com.nationallottery.ithuba:id/txt_title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelYourSelectedNumbers;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonDeleteTopSavedNumbers;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[2]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonPlayTopSavedNumbers;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[3]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonViewTopButton;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txt_pending_ticket_no']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelTicketNumberTopRow;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txt_pending_dialog_game_name']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelTicketGameNameTopRow;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txt_pending_draw_dialog_no_of_draws']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelBetDuration;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txt_ticket_date']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelDrawDate;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.LinearLayout' and @resource-id = 'com.nationallottery.ithuba:id/lin_pending_ticket_number_container' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade selectedNumbers;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'REPLAY TICKET' or . = 'REPLAY TICKET') and @resource-id = 'com.nationallottery.ithuba:id/btn_pending_dialog_replay_ticket']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonReplayTicket;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Yes' or . = 'Yes') and @resource-id = 'com.nationallottery.ithuba:id/txt_pending_draw_dialog_bet_type']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelProPickYes;


    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'No' or . = 'No') and @resource-id = 'com.nationallottery.ithuba:id/txt_pending_draw_dialog_bet_type']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelProPickNo;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Game 1' or . = 'Game 1') and @resource-id = 'com.nationallottery.ithuba:id/game_no']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade game1Label;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txt_pending_dialog_team_name']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade game1TeamLabel;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[2]/android.view.ViewGroup[1]/android.widget.TextView[3]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade game1SelectionLabel;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade historyTicketsDate;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[2]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade historyTicketsType;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[3]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade historyTicketsAmount;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonView1StHistoryTickets;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/tv_from_date']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade dateStartHT;


    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/tv_to_date']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade dateEndHT;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'android:id/date_picker_header_year']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade datePickerYear;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageButton' and @resource-id = 'android:id/next' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade monthNext;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'OK' or . = 'OK') and @resource-id = 'android:id/button1']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade dateOK;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'CANCEL' or . = 'CANCEL') and @resource-id = 'android:id/button2']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade dateCancel;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageButton' and @resource-id = 'android:id/prev' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade monthPrevious;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'SEARCH' or . = 'SEARCH') and @resource-id = 'com.nationallottery.ithuba:id/b_search']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSearchDatesHT;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/tv_serial_number']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelTHSerialNumber;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/tv_draw_number']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelTHDrawNumber;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/tv_draw_date']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelTHDrawDate;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/tv_ticket_cost']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelTHTicketCost;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/tv_draw_duration']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelTHDrawDuration;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[3]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonTopViewSavedTicket;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[2]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelTopGameNameSavedTicket;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Delete Ticket' or . = 'Delete Ticket')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonDeleteTopSavedTicket;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txt_saved_ticket_dialog_no_of_draws']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelNumberOfDrawsSavedTicket;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txt_saved_ticket_dialog_bet_amount']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelBetAmountSavedTicket;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'PLAY' or . = 'PLAY') and @resource-id = 'com.nationallottery.ithuba:id/btn_play_saved_ticket']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonPlaySavedTicket;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'SAVE' or . = 'SAVE') and @resource-id = 'com.nationallottery.ithuba:id/btn_saved_ticket_save_no']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSaveSavedTicket;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.LinearLayout' and @resource-id = 'com.nationallottery.ithuba:id/lin_saved_ticket_number_container' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade ballsSavedTicket;

    public void clickSavedTickets() {
        clickOn(buttonSavedTickets);
    }

    public void playSaveTicket() {
        clickOn(topSavedTicket);
        Assert.assertTrue(ballsSavedTicket.isDisplayed());
        clickOn(buttonPlaySavedTicket);
    }

    public void verifyGamesOnTicketsPage() {
        Assert.assertTrue(logoLotto.isDisplayed());
        Assert.assertTrue(logoPowerBall.isDisplayed());
        Assert.assertTrue(logoDailyLotto.isDisplayed());
    }

    public void clickSavedNumbers() {
        clickOn(buttonSavedNumbers);
    }

    public void clickSavedNumbersLotto() {
        clickOn(logoLotto);
    }

    public void clickSavedNumbersDailyLotto() {
        clickOn(logoDailyLotto);
    }

    public void clickSavedNumbersPowerBall() {
        clickOn(logoPowerBall);
    }

    public void clickPlaySavedNumbers() {
        clickOn(buttonPlaySavedNumbers);
    }

    public void verifySavedNumbers() {
        Assert.assertEquals("Your Selected Numbers", labelYourSelectedNumbers.getText());
        clickOn(labelYourSelectedNumbers);
    }

    public void deleteSavedNumbers() {
        clickOn(buttonDeleteTopSavedNumbers);
//        clickOn(labelYourSelectedNumbers);
    }

    public void playSavedNumbers() {
        clickOn(buttonPlayTopSavedNumbers);
    }

    public void clickPendingDraws() {
        clickOn(buttonPendingDraws);
    }

    public void clickHistoricalTickets() {
        clickOn(buttonHistoricalTickets);
    }

    public void clickView() {
        clickOn(buttonViewTopButton);
    }

    public void verifyTicketNumber() {
        Assert.assertTrue(labelTicketNumberTopRow.isDisplayed());
        logger("TICKET NUMBER: " + labelTicketNumberTopRow.getText());
    }

    public void verifyGameName() {
        Assert.assertTrue(labelTicketGameNameTopRow.isDisplayed());
        logger("GAME NAME: " + labelTicketGameNameTopRow.getText());
    }

    public void verifyBetDuration() {
        Assert.assertTrue(labelBetDuration.isDisplayed());
        logger("BET DURATION: " + labelBetDuration.getText());
    }

    public void verifyDrawDate() {
        Assert.assertTrue(labelDrawDate.isDisplayed());
        logger("DRAW DATE: " + labelDrawDate.getText());
    }

    /**
     * Verify the selected numbers
     */
    public void verifySelectedNumbers() {
        Assert.assertTrue(selectedNumbers.isDisplayed());
        logger("SELECTED NUMBERS: " + selectedNumbers.getText());
    }

    /**
     * Click the Replay Ticket button
     */
    public void clickReplayTicket() {
        clickOn(buttonReplayTicket);
    }

    public void verifyDisabledReplayButton() {
        Assert.assertTrue(buttonReplayTicket.isDisabled());
    }

    /**
     * Verify that the ProPick Yes label is shown
     */
    public void verifyProPickYes() {
        Assert.assertTrue(labelProPickYes.isDisplayed());
        logger(labelProPickYes.getText());
    }

    /**
     * Verify that the ProPick No label is shown
     */
    public void verifyProPickNo() {
        Assert.assertTrue(labelProPickNo.isDisplayed());
        logger(labelProPickNo.getText());
    }

    /**
     * Verify that Team Names element exists
     */
    public void verifyTeamNames() {
        SLEEP(2000);
        System.out.println(game1Label.getText());
        System.out.println(game1TeamLabel.getText());
        System.out.println(game1SelectionLabel.getText());

        Assert.assertNotNull(game1Label.getText());
        Assert.assertNotNull(game1TeamLabel.getText());
        Assert.assertNotNull(game1SelectionLabel.getText());
    }

    /**
     * Verify that Historical Ticket items are present:
     * Date, Amount, Type and View button
     */
    public void verifyLabelsHistorical() {
        System.out.println(historyTicketsDate.getText());
        System.out.println(historyTicketsType.getText());
        System.out.println(historyTicketsAmount.getText());

        Assert.assertNotNull(historyTicketsDate.getText());
        Assert.assertNotNull(historyTicketsType.getText());
        Assert.assertNotNull(historyTicketsAmount.getText());

        clickOn(buttonView1StHistoryTickets);
    }

    int clicks;

    /**
     * The Start Date field in the Historical Tickets screen
     */
    public void enterStartDateHT(String day, String month, String year) {
        int monthInt = Integer.parseInt(month);
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month_ = cal.get(Calendar.MONTH);
        int actual_month = month_ + 1;
        clickOn(dateStartHT);
        clickOn(datePickerYear);
        clickOn($("//*[@class = 'android.widget.TextView' and (@text = '" + year + "' or . = '" + year + "') and @resource-id = 'android:id/text1']"));
        if (monthInt > actual_month) {
            clicks = monthInt - actual_month;
            for (int i = 0; i < clicks; i++) {
                clickOn(monthNext);
            }
            clickOn($("//*[@class = 'android.view.View' and (@text = '" + day + "' or . = '" + day + "')]"));
            clickOn(dateOK);
        } else if (monthInt < actual_month) {
            clicks = actual_month - monthInt;
            for (int i = 0; i < clicks; i++) {
                clickOn(monthPrevious);
            }
            clickOn($("//*[@class = 'android.view.View' and (@text = '" + day + "' or . = '" + day + "')]"));
            clickOn(dateOK);
        } else {
            clickOn($("//*[@class = 'android.view.View' and (@text = '" + day + "' or . = '" + day + "')]"));
            clickOn(dateOK);
        }
    }

    /**
     * The End Date field in the Historical Tickets screen
     */
    public void enterEndDateHT(String day, String month, String year) {
        int monthInt = Integer.parseInt(month);
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month_ = cal.get(Calendar.MONTH);
        int actual_month = month_ + 1;
        clickOn(dateEndHT);
        clickOn(datePickerYear);
        clickOn($("//*[@class = 'android.widget.TextView' and (@text = '" + year + "' or . = '" + year + "') and @resource-id = 'android:id/text1']"));
        if (monthInt > actual_month) {
            clicks = monthInt - actual_month;
            for (int i = 0; i < clicks; i++) {
                clickOn(monthNext);
            }
            clickOn($("//*[@class = 'android.view.View' and (@text = '" + day + "' or . = '" + day + "')]"));
            clickOn(dateOK);
        } else if (monthInt < actual_month) {
            clicks = actual_month - monthInt;
            for (int i = 0; i < clicks; i++) {
                clickOn(monthPrevious);
            }
            clickOn($("//*[@class = 'android.view.View' and (@text = '" + day + "' or . = '" + day + "')]"));
            clickOn(dateOK);
        } else {
            clickOn($("//*[@class = 'android.view.View' and (@text = '" + day + "' or . = '" + day + "')]"));
            clickOn(dateOK);
        }
    }

    /**
     * Click on the Search button after entering Date range for Historical Tickets
     */
    public void clickSearchHistory() {
        clickOn(buttonSearchDatesHT);
    }

    /**
     * Verifies that the ticket details are displayed on the Historical Ticket
     */
    public void verifyViewDetails() {
        System.out.println(labelTHSerialNumber.getText());
        System.out.println(labelTHDrawNumber.getText());
        System.out.println(labelTHDrawDate.getText());
        System.out.println(labelTHTicketCost.getText());
        System.out.println(labelTHDrawDuration.getText());

        Assert.assertNotNull(labelTHSerialNumber.getText());
        Assert.assertNotNull(labelTHDrawNumber.getText());
        Assert.assertNotNull(labelTHDrawDate.getText());
        Assert.assertNotNull(labelTHTicketCost.getText());
        Assert.assertNotNull(labelTHDrawDuration.getText());
    }

    /**
     * Click on the topmost View button on the Transaction History page
     */
    public void click1stViewButtonTransactionHistory() {
        clickOn(buttonView1StHistoryTickets);
    }

    /**
     * Verifies that Saved Tickets are displayed on the Saved Tickets page
     */
    public void verifySavedTicketsScreen() {
        clickOn(buttonTopViewSavedTicket);
    }

    /**
     * Verifies that Game Names are displayed on the Saved Tickets page
     */
    public void verifyGameNames() {
        logger("GAME NAME: " + labelTopGameNameSavedTicket.getText());
        Assert.assertNotNull(labelTopGameNameSavedTicket.getText());
    }

    /**
     *
     * Verify that the player is able to Delete the Ticket
     */
    public void verifyDeleteSavedTicket() {
        clickOn(buttonDeleteTopSavedTicket);
    }

    /**
     * Verify that the Number of Draws is displayed under Saved Tickets
     */
    public void verifyNumberOfDrawsSavedTickets() {
        clickOn(buttonTopViewSavedTicket);
        logger("NUMBER OF DRAWS: " + labelNumberOfDrawsSavedTicket.getText());
        Assert.assertNotNull(labelNumberOfDrawsSavedTicket.getText());
    }

    /**
     * Verify that the selected Board is displayed under Saved Ticket screen
     */
    public void verifySelectedBoardDisplayed() {
        Assert.assertNotNull(ballsSavedTicket);
    }

    /**
     *
     * Verifies that the SAVE button is enabled on the Save Tickets screen
     */
    public void verifySaveButtonEnabled() {
        buttonPlaySavedTicket.isClickable();
        logger("SAVE button is enables");
    }

    public void clickOnView() {
        clickOn(buttonTopViewSavedTicket);
    }

    public void clickPlayButtonSavedTickets() {
        clickOn(buttonPlaySavedTicket);
    }
}
