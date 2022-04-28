package qa.ithuba.screens.screen_play_now;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import qa.ithuba.screens.screen_base.ScreenBase;
import qa.ithuba.utilities.HelperUtil;

import java.util.List;

public class ScreenDailyLotto extends HelperUtil {

    ScreenBase screenBase;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/btn_submit")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSubmit;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txt_amount']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade summaryPrice;


    @AndroidFindBy(id = "com.nationallottery.ithuba:id/btn_choose")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade chooseBoard;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/txt_board_num")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelOnBoard;


    public void selectDailyLottoBalls(List<String> balls) {
        for (String ball : balls) {
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[" + ball + "]/android.widget.ImageView[1]"));
        }
        SLEEP(1200);
        clickOn(buttonSubmit);
    }

    public void selectLottoBalls(List<String> balls) {
        for (String ball : balls) {
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[" + ball + "]/android.widget.ImageView[1]"));
        }
        SLEEP(1200);
        clickOn(buttonSubmit);
    }


    public void clickChooseBoard() {
        clickOn(chooseBoard);
        screenBase.clickShakeOK();
        logger("CURRENTLY ON BOARD: " + labelOnBoard.getText());
    }

        public void selectDailyLottoNumbers(int boards, List<String> balls) {
        switch (boards) {
            case 1, 2, 3 -> {
                logger("PLAYING " + boards + " BOARDS");
                for (int i = 0; i < boards; i++) {
                    clickChooseBoard();
                    selectLottoBalls(balls);
                }
            }
            case 4, 5 -> {
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


    public void selectDailyLottoNumbers(List<String> balls) {
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

    public void calculateTotalTicket(double ticketPrice, int boards, int draws) {
        double tP = ticketPrice * boards * draws;
        String expectedTp = String.format("R%.2f", tP).replace(",", ".");
        String actualTp = summaryPrice.getText();
        logger("Total expected price of ticket is: " + expectedTp);
        logger("Total actual price of ticket is: " + actualTp);
        String actTp = actualTp.replace(",", "");
        Assert.assertEquals("❌ Ticket price is incorrect", expectedTp, actTp);
    }
}

