package qa.ithuba.screens.screen_results;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.SkipStepException;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.utilities.HelperUtil;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ScreenResults extends HelperUtil {

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'RESULTS' or . = 'RESULTS') and @resource-id = 'com.nationallottery.ithuba:id/txt_results_menu_heading']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade headingResults;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoLottoResults;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[2]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoPowerBallResults;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[3]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoLottoP1Results;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[4]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoPowerBallPlusResults;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[5]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoLottoP2Results;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[6]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoDailyLottoResults;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[7]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoSS4Results;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[8]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoSS8Results;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[9]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoSS13Results;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[10]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoSSCricketResults;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[11]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoSSRugbyResults;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[12]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoRaffleResults;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[11]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoPick3Results;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[12]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoRapidoResults;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'NUMERICAL ORDER' or . = 'NUMERICAL ORDER')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelNumericalOrder;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'MORE INFO' or . = 'MORE INFO') and @resource-id = 'com.nationallottery.ithuba:id/results_more_info_label']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelMoreIfo;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'ROLLOVER AMOUNT' or . = 'ROLLOVER AMOUNT') and @resource-id = 'com.nationallottery.ithuba:id/txt_rollover_amount_label']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelRollOverAmount;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txt_rollover_amount']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelRollOverAmountData;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'ROLLOVER NO' or . = 'ROLLOVER NO') and @resource-id = 'com.nationallottery.ithuba:id/txt_rollover_no_label']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelRollOverNo;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'TOTAL PRIZE POOL' or . = 'TOTAL PRIZE POOL') and @resource-id = 'com.nationallottery.ithuba:id/txt_total_prize_pool_label']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelTotalPrizePool;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'TOTAL SALES' or . = 'TOTAL SALES') and @resource-id = 'com.nationallottery.ithuba:id/txt_total_sales_label']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelTotalSales;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'NEXT JACKPOT' or . = 'NEXT JACKPOT') and @resource-id = 'com.nationallottery.ithuba:id/txt_next_jackpot_label']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelNextJackpot;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'DRAW MACHINE' or . = 'DRAW MACHINE') and @resource-id = 'com.nationallottery.ithuba:id/txt_draw_machine_label']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelDrawMachine;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'NEXT DRAW DATE' or . = 'NEXT DRAW DATE') and @resource-id = 'com.nationallottery.ithuba:id/txt_next_draw_date_label']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelNextDrawDate;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'Historical Results' or . = 'Historical Results') and @resource-id = 'com.nationallottery.ithuba:id/btn_board_results_historical_results']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonHistoricalResults;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'Historical Results' or . = 'Historical Results') and @resource-id = 'com.nationallottery.ithuba:id/btn_sportstake_fix_historical_results']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonHistoricalResultsSS;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'Historical Results' or . = 'Historical Results') and @resource-id = 'com.nationallottery.ithuba:id/btn_raffle_results_historical_results']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonHistoricalResultsRaffle;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'Historical Results' or . = 'Historical Results') and @resource-id = 'com.nationallottery.ithuba:id/btn_rapido_results_historical_results']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonHistoricalResultsRapido;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txt_start_date' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade dateStart;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txt_end_date' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade dateEnd;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'SEARCH' or . = 'SEARCH') and @resource-id = 'com.nationallottery.ithuba:id/btn_historical_results_search']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSearchDates;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'android:id/date_picker_header_year']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade datePickerYear;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'OK' or . = 'OK') and @resource-id = 'android:id/button1']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade dateOK;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'CANCEL' or . = 'CANCEL') and @resource-id = 'android:id/button2']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade dateCancel;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageButton' and @resource-id = 'android:id/prev' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade monthPrevious;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageButton' and @resource-id = 'android:id/next' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade monthNext;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.LinearLayout' and @resource-id = 'com.nationallottery.ithuba:id/lin_board_results_number_container'] //*[@class = 'android.widget.TextView']")
//    @iOSXCUITFindBy (id = "")
    private List<WebElementFacade> ballsHistoryList;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txt_number']")
//    @iOSXCUITFindBy (id = "")
    private List<WebElementFacade> ballsReplayWinNumbers;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.LinearLayout' and @resource-id = 'com.nationallottery.ithuba:id/lin_pick3_results_number_container'] //*[@class = 'android.widget.TextView']")
//    @iOSXCUITFindBy (id = "")
    private List<WebElementFacade> ballsHistoryListPick3;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.LinearLayout' and @resource-id = 'com.nationallottery.ithuba:id/lin_rapido_results_sectiona_number_container'] //*[@class = 'android.widget.TextView']")
//    @iOSXCUITFindBy (id = "")
    private List<WebElementFacade> ballsHistoryListRapido;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[2]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.Button[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonMoreInfo;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = concat('Disclaimer: Although ITHUBA takes every care to ensure the accuracy of information containing the National Lottery results, ITHUBA cannot take any responsibility for any errors, mistakes or omissions contained herein. The National Lottery results contained in the official records maintained by ITHUBA' , \"'\" , 's Central Lottery system will prevail and all games Rules and Regulations shall be applicable.') or . = concat('Disclaimer: Although ITHUBA takes every care to ensure the accuracy of information containing the National Lottery results, ITHUBA cannot take any responsibility for any errors, mistakes or omissions contained herein. The National Lottery results contained in the official records maintained by ITHUBA' , \"'\" , 's Central Lottery system will prevail and all games Rules and Regulations shall be applicable.')) and @resource-id = 'com.nationallottery.ithuba:id/txt_disclaimer']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textDisclaimer;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.LinearLayout' and @resource-id = 'com.nationallottery.ithuba:id/lin_results_bottom_banner' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade bannerResultsBottom;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Play Numbers' or . = 'Play Numbers') and @resource-id = 'com.nationallottery.ithuba:id/btn_board_results_play_nos']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonPlayNumbers;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Save Numbers' or . = 'Save Numbers') and @resource-id = 'com.nationallottery.ithuba:id/btn_board_results_save_nos']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSaveNumbers;

    public void verifyIfOnResultsScreen(String screenName) {
        Assert.assertEquals(screenName, headingResults.getText());
    }

    public void clickGameResults(String gameName) {
        switch (gameName) {
            case "LOTTO" -> clickOn(logoLottoResults);
            case "POWERBALL" -> clickOn(logoPowerBallResults);
            case "LOTTO PLUS 1" -> clickOn(logoLottoP1Results);
            case "POWERBALL PLUS" -> clickOn(logoPowerBallPlusResults);
            case "LOTTO PLUS 2" -> clickOn(logoLottoP2Results);
            case "DAILY LOTTO" -> clickOn(logoDailyLottoResults);
            case "SPORTSTAKE 4" -> clickOn(logoSS4Results);
            case "SPORTSTAKE 8" -> clickOn(logoSS8Results);
            case "SPORTSTAKE 13" -> clickOn(logoSS13Results);
            case "SPORTSTAKE CRICKET" -> clickOn(logoSSCricketResults);
            case "SPORTSTAKE RUGBY" -> clickOn(logoSSRugbyResults);
            case "RAFFLE" -> clickOn(logoRaffleResults);
            case "PICK 3" -> {
                swipeUp(1);
                clickOn(logoPick3Results);
            }
            case "RAPIDO" -> {
                swipeUp(1);
                clickOn(logoRapidoResults);
            }
            default -> throw new IllegalArgumentException(gameName);
        }
    }

    public void verifyNumericalOrder(String gameName) {
        switch (gameName) {
            case "LOTTO", "POWERBALL", "LOTTO PLUS 1", "POWERBALL PLUS", "LOTTO PLUS 2", "DAILY LOTTO" -> Assert.assertEquals("NUMERICAL ORDER", labelNumericalOrder.getText());
            default -> System.out.println("NOT A DRAW BASES GAME");
        }
    }

    public void verifyMoreInfo(String gameName) {
        swipeUp(1);
        swipeUp(1);
        switch (gameName) {
            case "LOTTO", "POWERBALL", "LOTTO PLUS 1", "POWERBALL PLUS", "LOTTO PLUS 2" -> {
                Assert.assertEquals("MORE INFO", labelMoreIfo.getText());

                Assert.assertEquals("ROLLOVER AMOUNT", labelRollOverAmount.getText());
                logger(labelRollOverAmount.getText());
                logger(labelRollOverAmountData.getText());

                Assert.assertEquals("ROLLOVER NO", labelRollOverNo.getText());
                Assert.assertEquals("TOTAL PRIZE POOL", labelTotalPrizePool.getText());
                Assert.assertEquals("TOTAL SALES", labelTotalSales.getText());
                Assert.assertEquals("NEXT JACKPOT", labelNextJackpot.getText());
                Assert.assertEquals("DRAW MACHINE", labelDrawMachine.getText());
                Assert.assertEquals("NEXT DRAW DATE", labelNextDrawDate.getText());
            }
            default -> System.out.println("NOT A DRAW BASES GAME");
        }


    }

    public void clickHistoricalResults() {
        clickOn(buttonHistoricalResults);
    }

    public void clickHistoricalResultsSS() {
        clickOn(buttonHistoricalResultsSS);
    }

    public void clickHistoricalResultsRaffle() {
        clickOn(buttonHistoricalResultsRaffle);
    }

    public void clickHistoricalResultsRapido() {
        clickOn(buttonHistoricalResultsRapido);
    }

    int clicks;

    public void enterStartDate(String day, String month, String year) {
        int monthInt = Integer.parseInt(month);
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month_ = cal.get(Calendar.MONTH);
        int actual_month = month_ + 1;
        clickOn(dateStart);
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

    public void enterEndDate(String day, String month, String year) {
        int monthInt = Integer.parseInt(month);
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month_ = cal.get(Calendar.MONTH);
        int actual_month = month_ + 1;
        clickOn(dateEnd);
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

    public void clickSearchResults() {
        clickOn(buttonSearchDates);
    }

    public void verifyHistoryWithDetailedView(String gameName) {
        switch (gameName) {
            case "LOTTO", "LOTTO PLUS 1", "LOTTO PLUS 2" -> {
                for (int i = 0; i < 8; i++) {
                    logger($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[2]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[" + (i + 1) + "]").getText());
                }
                clickOn(buttonMoreInfo);
                logger(" ");
                logger("MORE INFORMATION:");
                for (int i = 0; i < ballsHistoryList.size(); i++) {
                    System.out.println(ballsHistoryList.get(i).getText());
                }

                SLEEP(2700);
                logger(" ");
                logger("SIZE: " + ballsHistoryList.size());
                for (int i = 0; i < 2; i++) {
                    logger(ballsHistoryList.get(i + 4).getText());
                }
                logger(" ");
            }
            case "POWERBALL", "POWERBALL PLUS" -> {
                for (int i = 0; i < 7; i++) {
                    logger($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[2]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[" + (i + 1) + "]").getText());
                }
                clickOn(buttonMoreInfo);
                logger(" ");
                logger("MORE INFORMATION:");
                for (int i = 0; i < ballsHistoryList.size(); i++) {
                    logger(ballsHistoryList.get(i).getText());
                }

                SLEEP(2700);
                logger(" ");
                logger("SIZE: " + ballsHistoryList.size());
                for (int i = 0; i < 2; i++) {
                    logger(ballsHistoryList.get(i + 4).getText());
                }
                logger(" ");
            }

            case "DAILY LOTTO" -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println((i + 1));
                    logger($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[2]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[" + (i + 1) + "]").getText());
                }
                clickOn(buttonMoreInfo);
                logger(" ");
                logger("MORE INFORMATION:");
                for (int i = 0; i < ballsHistoryList.size(); i++) {
                    logger(ballsHistoryList.get(i).getText());
                }

                SLEEP(2700);
                logger(" ");
                logger("SIZE: " + ballsHistoryList.size());
                for (int i = 0; i < 2; i++) {
                    logger(ballsHistoryList.get(i + 3).getText());
                }
                logger(" ");
            }

            case "PICK 3" -> {
                SLEEP(1000);
                for (int i = 0; i < ballsHistoryListPick3.size(); i++) {
                    logger(ballsHistoryListPick3.get(i).getText());
                }
            }
            case "RAPIDO" -> {
                for (int i = 0; i < ballsHistoryListRapido.size(); i++) {
                    logger(ballsHistoryListRapido.get(i).getText());
                }
            }
            default -> throw new SkipStepException(gameName);
        }
    }

    public void verifyDisclaimer() {
        swipeUp(2);
        Assert.assertEquals("Disclaimer: Although ITHUBA takes every care to ensure the accuracy of information containing the National Lottery results, ITHUBA cannot take any responsibility for any errors, mistakes or omissions contained herein. The National Lottery results contained in the official records maintained by ITHUBA's Central Lottery system will prevail and all games Rules and Regulations shall be applicable.", textDisclaimer.getText());
    }

    List<String> a = new ArrayList<>();
    List<String> b = new ArrayList<>();

    public void clickPlayNumbers(String gameName) {
        SLEEP(3000);
        if (gameName.equalsIgnoreCase("DAILY LOTTO")) {
            for (int i = 0; i < 5; i++) {
                logger($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[" + (i + 1) + "]").getText());
                a.add($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[" + (i + 1) + "]").getText());
            }
        } else {
            for (int i = 0; i < 6; i++) {
                logger($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[" + (i + 1) + "]").getText());
                a.add($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[" + (i + 1) + "]").getText());
            }
        }

        System.out.println(" ");
        clickOn(buttonPlayNumbers);
        for (int i = 0; i < ballsReplayWinNumbers.size(); i++) {
            logger(ballsReplayWinNumbers.get(i).getText());
            b.add(ballsReplayWinNumbers.get(i).getText());
        }
//        Assert.assertEquals(a, b);
    }

    public void clickSaveNumbers() {
        clickOn(buttonSaveNumbers);
    }

}
