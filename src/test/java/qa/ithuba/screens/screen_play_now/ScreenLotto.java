package qa.ithuba.screens.screen_play_now;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import qa.ithuba.screens.screen_base.ScreenBase;
import qa.ithuba.utilities.HelperUtil;

import java.util.List;

public class ScreenLotto extends HelperUtil {

    ScreenBase screenBase;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/btn_submit")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSubmit;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txt_amount']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade summaryPrice;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/txt_board_num")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelOnBoard;


    @AndroidFindBy(id = "com.nationallottery.ithuba:id/btn_choose")
//    @iOSXCUITFindBy (id = "")
    private List<WebElementFacade> listChooseBoard;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/btn_choose")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade chooseBoard;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/radiobtn_game_1")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade checkLottoPlus1;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/radiobtn_game_2")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade checkLottoPlus2;


    public void selectLottoBalls(List<String> balls) {
        for (String ball : balls) {
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[" + ball + "]/android.widget.ImageView[1]"));
        }
        SLEEP(1200);
        clickOn(buttonSubmit);
    }

    public void selectDailyLottoNumbers(int boards, List<String> balls) {
        switch (boards) {
            case 1 -> {
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[2]"));
                selectLottoBalls(balls);
            }
            case 2 -> {
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[2]"));
                selectLottoBalls(balls);
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[2]/android.widget.TextView[2]"));
                selectLottoBalls(balls);
            }
            case 3 -> {
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[2]"));
                selectLottoBalls(balls);
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[2]/android.widget.TextView[2]"));
                selectLottoBalls(balls);
                swipeUp(1);
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[2]/android.widget.TextView[2]"));
                selectLottoBalls(balls);
            }
            case 4 -> {
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[2]"));
                selectLottoBalls(balls);
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[2]/android.widget.TextView[2]"));
                selectLottoBalls(balls);
                swipeUp(1);
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[2]/android.widget.TextView[2]"));
                selectLottoBalls(balls);
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[3]/android.widget.TextView[2]"));
                selectLottoBalls(balls);
            }
            case 5 -> {
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[2]"));
                selectLottoBalls(balls);
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[2]/android.widget.TextView[2]"));
                selectLottoBalls(balls);
                swipeUp(1);
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[2]/android.widget.TextView[2]"));
                selectLottoBalls(balls);
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[3]/android.widget.TextView[2]"));
                selectLottoBalls(balls);
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[4]/android.widget.TextView[2]"));
                selectLottoBalls(balls);
            }
            default -> throw new IllegalArgumentException(String.valueOf(boards));
        }
    }

    public void selectLottoNumbers(List<String> balls, String gameName) {
        if (gameName.equalsIgnoreCase("LOTTO PLUS 1")) {
            clickOn(checkLottoPlus1);
        } else if (gameName.equalsIgnoreCase("LOTTO PLUS 2")) {
            clickOn(checkLottoPlus2);
        }
        try {
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[2]"));
            screenBase.clickShakeOK();
            for (String ball : balls) {
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[" + ball + "]/android.widget.ImageView[1]"));
            }
            SLEEP(1200);

        } catch (NoSuchElementException e) {
            System.err.println("\n\nBOARD LIMIT REACHED\n\n");
        }
    }

    public void clickOnBoard(int boardNumber) {
        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + boardNumber + "]/android.widget.TextView[2]"));
    }

    public void clickChooseBoard() {
        clickOn(chooseBoard);
        screenBase.clickShakeOK();
        logger("CURRENTLY ON BOARD: " + labelOnBoard.getText());
    }

    public void selectLottoNumbers(int boards, List<String> balls, String gameName) {
        if (gameName.equalsIgnoreCase("LOTTO PLUS 1")) {
            clickOn(checkLottoPlus1);
        } else if (gameName.equalsIgnoreCase("LOTTO PLUS 2")) {
            clickOn(checkLottoPlus2);
        }
        switch (boards) {
            case 1, 2, 3 -> {
                logger("PLAYING " + boards + " BOARDS");
                for (int i = 0; i < boards; i++) {
                    clickChooseBoard();
                    selectLottoBalls(balls);
                }
            }
            case 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 -> {
                logger("PLAYING " + boards + " BOARDS");
                for (int i = 0; i < 3; i++) {
                    clickChooseBoard();
                    selectLottoBalls(balls);
                }
                for (int i = 0; i < boards - 3; i++) {
                    swipeUp(1300, 1700);
                    clickChooseBoard();
                    selectLottoBalls(balls);
                }
            }
            default -> throw new IllegalArgumentException(String.valueOf(boards));
        }


//
//
//        try {
//            for (int i = 1; i < boards + 1; i++) {
//                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + i + "]/android.widget.TextView[2]"));
//                screenBase.clickShakeOK();
//                for (String ball : balls) {
//                    clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[" + ball + "]/android.widget.ImageView[1]"));
//                }
//                SLEEP(1200);
//                clickOn(buttonSubmit);
//                System.out.println("I is: " + i);
//                if(i >= 2) {
//                    swipeUp(1);
//                }
//            }
//        } catch (NoSuchElementException e) {
//            System.err.println("\n\nBOARD LIMIT REACHED\n\n");
//        }
    }

    public void calculateTotalTicket(int ticketPrice, int boards, int draws) {
        double tP = ticketPrice * boards * draws;
        String expectedTp = String.format("R%.2f", tP).replace(",", ".");
        String actualTp = summaryPrice.getText();
        logger("Total expected price of ticket is: " + expectedTp);
        logger("Total actual price of ticket is: " + actualTp);
        Assert.assertEquals("❌ Ticket price is incorrect", expectedTp, actualTp);
    }
}

