package qa.ithuba.screens.screen_play_now;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import qa.ithuba.screens.screen_base.ScreenBase;
import qa.ithuba.utilities.HelperUtil;

import java.util.List;

public class ScreenPowerBall extends HelperUtil {

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
    private WebElementFacade checkPowerBallPlus;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/radiobtn_game_2")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade checkPowerBallPlus2;


    public void selectPowerBallBalls(List<String> balls) {
        for (String ball : balls.subList(0, 5)) {
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[" + ball + "]/android.widget.ImageView[1]"));
            logger("POWERBALL: " + ball);
        }
//        swipeUp(1300, 1700);
        swipeUp(1);
        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[2]/android.widget.RelativeLayout[" + balls.get(5) + "]"));
        logger("BONUS BALL: " + balls.get(5));
        SLEEP(1200);
        clickOn(buttonSubmit);
    }


    public void selectPowerBallNumbers(int boards, List<String> balls, String gameName) {
        if (gameName.equalsIgnoreCase("PowerBall PLUS 1")) {
            clickOn(checkPowerBallPlus);
        }
        switch (boards) {
            case 1, 2, 3 -> {
                logger("PLAYING " + boards + " BOARDS");
                for (int i = 0; i < boards; i++) {
                    clickChooseBoard();
                    selectPowerBallBalls(balls);
                }
            }
            case 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 -> {
                logger("PLAYING " + boards + " BOARDS");
                for (int i = 0; i < 3; i++) {
                    clickChooseBoard();
                    selectPowerBallBalls(balls);
                }
                for (int i = 0; i < boards - 3; i++) {
                    swipeUp(1300, 1700);
                    clickChooseBoard();
                    selectPowerBallBalls(balls);
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

    public void selectOneBoardPowerBallNumbers(List<String> balls, int numberOfBalls, String gameName) {
        if (gameName.equalsIgnoreCase("POWERBALL PLUS")) {
            clickOn(checkPowerBallPlus);
            logger("SELECTED POWERBALL PLUS");
        }

        try {
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[2]"));
            screenBase.clickShakeOK();
            for (String ball : balls.subList(0, numberOfBalls)) {
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[" + ball + "]"));
                logger("POWERBALL: " + ball);
            }
            if (numberOfBalls < 6) {
                swipeUp(1);
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[2]/android.widget.RelativeLayout[" + balls.get(5) + "]"));
                logger("BONUS BALL: " + balls.get(5));
                SLEEP(1200);
            }

        } catch (NoSuchElementException e) {
            System.err.println("\n\nBOARD LIMIT REACHED\n\n");
        }
    }

    public void selectPowerBallNumbersDups(List<String> balls, String gameName) {
        if (gameName.equalsIgnoreCase("POWERBALL PLUS")) {
            clickOn(checkPowerBallPlus);
        }
        try {
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[2]"));
            screenBase.clickShakeOK();
            for (String ball : balls.subList(0, 5)) {
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[" + ball + "]"));
                logger("POWERBALL: " + ball);
            }
            swipeUp(1300, 1700);
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[2]/android.widget.RelativeLayout[" + balls.get(5) + "]"));
            logger("BONUS BALL: " + balls.get(5));
            SLEEP(1200);

            swipeDown(0.60, 0.75);

            for (String ball : balls.subList(0, 5)) {
                clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[" + ball + "]"));
                logger("POWERBALL: " + ball);
            }
            swipeUp(1300, 1700);
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[2]/android.widget.RelativeLayout[" + balls.get(5) + "]"));
            logger("BONUS BALL: " + balls.get(5));
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

    public void calculateTotalTicket(int ticketPrice, int boards, int draws) {
        double tP = ticketPrice * boards * draws;
        String expectedTp = String.format("R%.2f", tP).replace(",", ".");
        String actualTp = summaryPrice.getText();
        logger("Total expected price of ticket is: " + expectedTp);
        logger("Total actual price of ticket is: " + actualTp);
        Assert.assertEquals("❌ Ticket price is incorrect", expectedTp, actualTp);
    }
}

