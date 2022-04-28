package qa.ithuba.screens.screen_play_lotto;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.utilities.HelperUtil;

import java.util.List;

public class ScreenSportStake extends HelperUtil {

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'SPORTSTAKE 8' or . = 'SPORTSTAKE 8') and @resource-id = 'com.nationallottery.ithuba:id/title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade headingSS8;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'SPORTSTAKE 13' or . = 'SPORTSTAKE 13') and @resource-id = 'com.nationallottery.ithuba:id/title']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade headingSS13;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'You can play the SPORTSTAKE 8 game\n" +
                           "in one of the following two ways.' or . = 'You can play the SPORTSTAKE 8 game\n" +
                           "in one of the following two ways.') and @resource-id = 'com.nationallottery.ithuba:id/play_description']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade p1SS8;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'You can play the SPORTSTAKE 13 game\\n\" +\n" +
                           "            \"in one of the following two ways.' or . = 'You can play the SPORTSTAKE 13 game\\n\" +\n" +
                           "            \"in one of the following two ways.') and @resource-id = 'com.nationallottery.ithuba:id/play_description']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade p1SS13;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'TICKET' or . = 'TICKET') and @resource-id = 'com.nationallottery.ithuba:id/ticket_lbl']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade greenLabel1;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.nationallottery.ithuba:id/game_icon' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoSS;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Play in one of TWO ways' or . = 'Play in one of TWO ways') and @resource-id = 'com.nationallottery.ithuba:id/pay_in_ways']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade greenLabel2SS8;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'MANUAL OPTION:' or . = 'MANUAL OPTION:') and @resource-id = 'com.nationallottery.ithuba:id/manual_option']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade p2SS;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Predict your outcome for each of the 8 soccer matches. Make your prediction in the applicable tick box for each relevant fixture:\n" +
                           "\n" +
                           "[1] - for a Home Win\n" +
                           "[x] - for a Draw\n" +
                           "[2] - for an Away Win' or . = 'Predict your outcome for each of the 8 soccer matches. Make your prediction in the applicable tick box for each relevant fixture:\n" +
                           "\n" +
                           "[1] - for a Home Win\n" +
                           "[x] - for a Draw\n" +
                           "[2] - for an Away Win') and @resource-id = 'com.nationallottery.ithuba:id/manual_description']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade p3SS;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'PLAY MANUAL SELECT' or . = 'PLAY MANUAL SELECT') and @resource-id = 'com.nationallottery.ithuba:id/play_manual']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade greenLabel3SS;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'PROPICKTM OPTION:' or . = 'PROPICKTM OPTION:') and @resource-id = 'com.nationallottery.ithuba:id/pro_pick_option']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade p4SS8;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'To play PROPICKTM simply choose the board you wish to play e.g. PROPICKTM boards 4 or 8 or 16 etc. The PROPICKTM selections are displayed in a green box on the betslip and from your National Lottery electronic wallet.' or . = 'To play PROPICKTM simply choose the board you wish to play e.g. PROPICKTM boards 4 or 8 or 16 etc. The PROPICKTM selections are displayed in a green box on the betslip and from your National Lottery electronic wallet.') and @resource-id = 'com.nationallottery.ithuba:id/pro_pick_description']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade p5SS;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'PLAY PROPICKTM' or . = 'PLAY PROPICKTM') and @resource-id = 'com.nationallottery.ithuba:id/play_propick']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonPlayProPick;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/checkBoxHome")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade boxHomeList;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/checkBoxDraw")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade boxDrawList;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/checkBoxAway")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade boxAwayList;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.RadioButton[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade proPick4;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[2]/android.widget.RadioButton[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade proPick8;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[3]/android.widget.RadioButton[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade proPick16;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[4]/android.widget.RadioButton[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade proPick24;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[5]/android.widget.RadioButton[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade proPick32;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[6]/android.widget.RadioButton[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade proPick64;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[5]/android.widget.RadioButton[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade proPick128;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[6]/android.widget.RadioButton[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade proPick256;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = '1 Board(s)/1 Draw(s)' or . = '1 Board(s)/1 Draw(s)') and @resource-id = 'com.nationallottery.ithuba:id/boards_count']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade topCartItem;

    public void verifyPageContents(String gameName) {
        switch (gameName) {
            case "SPORTSTAKE 8" -> {
                Assert.assertEquals("SPORTSTAKE 8", headingSS8.getText());
                Assert.assertEquals("You can play the SPORTSTAKE 8 game\n" +
                                    "in one of the following two ways.", p1SS8.getText());
                Assert.assertEquals("TICKET", greenLabel1.getText());
                Assert.assertTrue(logoSS.isDisplayed());
                Assert.assertEquals("Play in one of TWO ways", greenLabel2SS8.getText());
                Assert.assertEquals("MANUAL OPTION:", p2SS.getText());
                Assert.assertEquals("""
                        Predict your outcome for each of the 8 soccer matches. Make your prediction in the applicable tick box for each relevant fixture:
                                        
                        [1] - for a Home Win
                        [x] - for a Draw
                        [2] - for an Away Win""", p3SS.getText());
                Assert.assertEquals("PLAY MANUAL SELECT", greenLabel3SS.getText());
                Assert.assertEquals("PROPICKTM OPTION:", p4SS8.getText());
                Assert.assertEquals("To play PROPICKTM simply choose the board you wish to play e.g. PROPICKTM boards 4 or 8 or 16 etc. The PROPICKTM selections are displayed in a green box on the betslip and from your National Lottery electronic wallet.", p5SS.getText());
                Assert.assertEquals("PLAY PROPICKTM", buttonPlayProPick.getText());

            }
            case "SPORTSTAKE 13" -> {
                Assert.assertEquals("SPORTSTAKE 13", headingSS13.getText());
                Assert.assertEquals("You can play the SPORTSTAKE 13 game\n" +
                                    "in one of the following two ways.", p1SS13.getText());
                Assert.assertEquals("TICKET", greenLabel1.getText());
                Assert.assertTrue(logoSS.isDisplayed());
                Assert.assertEquals("Play in one of TWO ways", greenLabel2SS8.getText());
                Assert.assertEquals("MANUAL OPTION:", p2SS.getText());
                Assert.assertEquals("""
                        Predict your outcome for each of the 8 soccer matches. Make your prediction in the applicable tick box for each relevant fixture:
                                        
                        [1] - for a Home Win
                        [x] - for a Draw
                        [2] - for an Away Win""", p3SS.getText());
                Assert.assertEquals("PLAY MANUAL SELECT", greenLabel3SS.getText());
                Assert.assertEquals("PROPICKTM OPTION:", p4SS8.getText());
                Assert.assertEquals("To play PROPICKTM simply choose the board you wish to play e.g. PROPICKTM boards 4 or 8 or 16 etc. The PROPICKTM selections are displayed in a green box on the betslip and from your National Lottery electronic wallet.", p5SS.getText());
                Assert.assertEquals("PLAY PROPICKTM", buttonPlayProPick.getText());
            }
        }

    }

    public void clickPlayManual() {
        clickOn(greenLabel3SS);
    }

    public void capturePredictions1stHalfSS4(int numPredictions, String flag, List<String> predictions) {
        if (flag.equalsIgnoreCase("single")) {
            switch (numPredictions) {
                case 1, 2, 3, 4 -> {
                    SLEEP(500);
                    for (int i = 0; i < numPredictions; i++) {
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[" + predictions.get(i) + "]"));
                    }
                }
            }
        } else if (flag.equalsIgnoreCase("multi")) {
            switch (numPredictions) {
                case 1, 2, 3, 4 -> {
                    SLEEP(500);
                    for (int i = 0; i < numPredictions; i++) {
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[1]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[2]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[3]"));
                    }
                    swipeDown(0.50, 0.70);
                    SLEEP(500);
                }
            }
        }
    }

    public void capturePredictions1stHalfSS4reset(int numPredictions, String flag, List<String> predictions) {
        if (flag.equalsIgnoreCase("single")) {
            switch (numPredictions) {
                case 1, 2, 3, 4 -> {
                    SLEEP(500);
                    for (int i = 0; i < numPredictions; i++) {
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[" + predictions.get(i) + "]"));
                    }
                }
            }
        } else if (flag.equalsIgnoreCase("multi")) {
            switch (numPredictions) {
                case 1, 2, 3, 4 -> {
                    SLEEP(500);
                    for (int i = 0; i < numPredictions; i++) {
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[1]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[2]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[3]"));
                    }
                    swipeDown(0.50, 0.70);
                    SLEEP(500);
                }
            }
        }
    }

    public void capturePredictions2ndHalfSS4reset(int numPredictions, String flag, List<String> predictions) {
        if (flag.equalsIgnoreCase("single")) {
            switch (numPredictions) {
                case 1, 2, 3, 4 -> {
                    swipeUp(1);
                    SLEEP(500);
                    for (int i = 0; i < numPredictions; i++) {
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[" + predictions.get(i) + "]"));
                    }
                }
            }
        } else if (flag.equalsIgnoreCase("multi")) {
            switch (numPredictions) {
                case 1, 2, 3, 4 -> {
                    swipeUp(1);
                    SLEEP(500);
                    for (int i = 0; i < numPredictions; i++) {
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[1]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[2]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[3]"));
                    }
                }
            }
        }
    }

    public void capturePredictions2ndHalfSS4(int numPredictions, String flag, List<String> predictions) {
        if (flag.equalsIgnoreCase("single")) {
            switch (numPredictions) {
                case 1, 2, 3, 4 -> {
                    swipeUp(1);
                    SLEEP(500);
                    for (int i = 0; i < numPredictions; i++) {
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[" + predictions.get(i) + "]"));
                    }
                }
            }
        } else if (flag.equalsIgnoreCase("multi")) {
            switch (numPredictions) {
                case 1, 2, 3, 4 -> {
                    swipeUp(1);
                    SLEEP(500);
                    for (int i = 0; i < numPredictions; i++) {
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[1]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[2]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[3]"));
                    }
                }
            }
        }
    }

    public void capturePredictions1stHalfSS8(int numPredictions, String flag, List<String> predictions) {
        if (flag.equalsIgnoreCase("single")) {
            switch (numPredictions) {
                case 1, 2, 3, 4, 5, 6, 7, 8 -> {
                    swipeUp(0.85, 0.72);
                    SLEEP(500);
                    for (int i = 0; i < numPredictions; i++) {
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[" + predictions.get(i) + "]"));
                    }
                    swipeDown(0.50, 0.70);
                    SLEEP(500);
                }
            }
        } else if (flag.equalsIgnoreCase("multi")) {
            switch (numPredictions) {
                case 1, 2, 3, 4, 5, 6, 7, 8 -> {
                    swipeUp(0.85, 0.72);
                    SLEEP(500);
                    for (int i = 0; i < numPredictions; i++) {
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[1]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[2]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[3]"));
                    }
                    swipeDown(0.50, 0.70);
                    SLEEP(500);
                }
            }
        }
    }

    public void capturePredictions2ndHalfSS8(int numPredictions, String flag, List<String> predictions) {
        if (flag.equalsIgnoreCase("single")) {
            switch (numPredictions) {
                case 1, 2, 3, 4, 5, 6, 7 -> {
                    swipeUp(1);
                    swipeUp(0.85, 0.68);
                    SLEEP(500);
                    for (int i = 0; i < numPredictions; i++) {
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[" + predictions.get(i) + "]"));
                    }
                }
                case 8 -> {
                    swipeUp(1);
                    swipeUp(0.85, 0.68);
                    SLEEP(500);
                    for (int i = 0; i < numPredictions - 1; i++) {
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[" + predictions.get(i) + "]"));
                    }
                    swipeUp(0.85, 0.72);
                    SLEEP(500);
                    clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[8]/android.widget.Button[" + predictions.get(7) + "]"));
                }
            }
        } else if (flag.equalsIgnoreCase("multi")) {
            switch (numPredictions) {
                case 1, 2, 3, 4, 5, 6, 7 -> {
                    swipeUp(1);
                    swipeUp(0.85, 0.68);
                    SLEEP(500);
                    for (int i = 0; i < numPredictions; i++) {
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[1]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[2]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[3]"));
                    }
                }
                case 8 -> {
                    swipeUp(1);
                    swipeUp(0.85, 0.68);
                    SLEEP(500);
                    for (int i = 0; i < numPredictions - 1; i++) {
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[1]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[2]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[3]"));
                    }
                    swipeUp(0.85, 0.72);
                    SLEEP(500);
                    clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[8]/android.widget.Button[1]"));
                    clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[8]/android.widget.Button[2]"));
                    clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[8]/android.widget.Button[3]"));
                }
            }
        }
    }

    public void capturePredictionsSS13(int numPredictions, String flag, List<String> predictions) {
        if (flag.equalsIgnoreCase("single")) {
            switch (numPredictions) {
                case 1, 2, 3, 4, 5, 6, 7 -> {
                    for (int i = 0; i < numPredictions; i++) {
                        SLEEP(1000);
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[" + predictions.get(i) + "]"));
                    }
                }
                case 8, 9, 10, 11, 12, 13 -> {
                    for (int i = 0; i < 7; i++) {
                        SLEEP(1000);
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[" + predictions.get(i) + "]"));
                    }
                    swipeUp(1);
                    swipeUp(1);
                    SLEEP(1000);
                    for (int i = 0; i < numPredictions - 7; i++) {
                        SLEEP(1000);
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[" + predictions.get(i) + "]"));
                    }
                }
            }
        } else if (flag.equalsIgnoreCase("multi")) {
            switch (numPredictions) {
                case 1, 2, 3, 4, 5, 6, 7 -> {
                    for (int i = 0; i < numPredictions; i++) {
                        SLEEP(1000);
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[1]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[2]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[3]"));
                    }
                }
                case 8, 9, 10, 11, 12, 13 -> {
                    for (int i = 0; i < 7; i++) {
                        SLEEP(1000);
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[1]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[2]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[3]"));
                    }
                    swipeUp(1);
                    SLEEP(1000);
                    for (int i = 0; i < numPredictions - 7; i++) {
                        SLEEP(1000);
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[1]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[2]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[3]"));
                    }
                }
            }
        }
    }

    public void capturePredictionsSSRugby(int numMatches, String flag, List<String> predictions) {
        if (flag.equalsIgnoreCase("single")) {
            switch (numMatches) {
                case 1, 2, 3, 4, 5 -> {
                    for (int i = 0; i < numMatches; i++) {
                        SLEEP(200);
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[" + predictions.get(i) + "]"));
                    }
                }
                case 6, 7, 8, 9, 10 -> {
                    for (int i = 0; i < numMatches - 5; i++) {
                        SLEEP(200);
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[" + predictions.get(i) + "]"));
                    }
                    swipeUp(1);
//                    swipeUp(1);
                    SLEEP(1000);
                    for (int i = 0; i < numMatches - 5; i++) {
                        SLEEP(200);
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[" + predictions.get(i) + "]"));
                    }
                }
            }
        } else if (flag.equalsIgnoreCase("multi")) {
            switch (numMatches) {
                case 1, 2, 3, 4, 5 -> {
                    for (int i = 0; i < numMatches; i++) {
                        SLEEP(100);
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[1]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[2]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[3]"));
                    }
                }
                case 6, 7, 8, 9, 10 -> {
                    for (int i = 0; i < numMatches - 5; i++) {
                        SLEEP(100);
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[1]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[2]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[3]"));
                    }
                    SLEEP(100);
                    swipeUp(1);
                    SLEEP(100);
                    for (int i = 0; i < numMatches - 5; i++) {
                        SLEEP(100);
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[1]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[2]"));
                        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[3]"));
                    }
                }
            }
        }
    }

    public void selectDeselectSS4() {
        swipeUp(0.85, 0.72);
        SLEEP(500);
        for (int i = 0; i < 4; i++) {
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[1]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[2]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[3]"));
        }
        swipeUp(1);
        SLEEP(500);
        for (int i = 0; i < 4; i++) {
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[1]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[2]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[3]"));
        }
        swipeDown(0.50, 0.70);
        swipeDown(0.50, 0.70);
        swipeDown(0.50, 0.70);
        swipeDown(0.50, 0.70);


        swipeUp(0.85, 0.72);
        SLEEP(500);
        for (int i = 0; i < 4; i++) {
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[1]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[2]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[3]"));
        }
        swipeUp(1);
        SLEEP(500);
        for (int i = 0; i < 4; i++) {
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[1]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[2]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[3]"));
        }
    }

    public void selectDeselectSS8() {
        swipeUp(0.85, 0.72);
        SLEEP(500);
        for (int i = 0; i < 8; i++) {
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[1]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[2]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[3]"));
        }
        swipeDown(0.50, 0.70);
        SLEEP(500);
        swipeUp(1);
        swipeUp(0.85, 0.68);
        SLEEP(500);
        for (int i = 0; i < 8 - 1; i++) {
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[1]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[2]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[3]"));
        }
        swipeUp(0.85, 0.72);
        SLEEP(500);
        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[8]/android.widget.Button[1]"));
        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[8]/android.widget.Button[2]"));
        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[8]/android.widget.Button[3]"));
        swipeDown(0.50, 0.70);
        swipeDown(0.50, 0.70);
        swipeDown(0.50, 0.70);
        swipeDown(0.50, 0.70);
        swipeDown(0.50, 0.70);


        swipeUp(0.85, 0.72);
        SLEEP(500);
        for (int i = 0; i < 8; i++) {
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[1]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[2]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[3]"));
        }
        swipeDown(0.50, 0.70);
        SLEEP(500);
        swipeUp(1);
        swipeUp(0.85, 0.68);
        SLEEP(500);
        for (int i = 0; i < 8 - 1; i++) {
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[1]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[2]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[3]"));
        }
        swipeUp(0.85, 0.72);
        SLEEP(500);
        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[8]/android.widget.Button[1]"));
        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[8]/android.widget.Button[2]"));
        clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[8]/android.widget.Button[3]"));
    }

    public void selectDeselectSS13() {
        SLEEP(1000);
        for (int i = 0; i < 7; i++) {
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[1]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[2]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[3]"));
        }
        swipeUp(1);
        SLEEP(1000);
        for (int i = 0; i < 6; i++) {
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[1]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[2]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[3]"));
        }
        swipeDown(0.50, 0.70);
        swipeDown(0.50, 0.70);
        swipeDown(0.50, 0.70);
        swipeDown(0.50, 0.70);

        for (int i = 0; i < 7; i++) {
            SLEEP(1000);
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[1]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[2]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 2) + "]/android.widget.Button[3]"));
        }
        swipeUp(1);
        SLEEP(1000);
        for (int i = 0; i < 6; i++) {
            SLEEP(1000);
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[1]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[2]"));
            clickOn($("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[" + (i + 1) + "]/android.widget.Button[3]"));
        }
    }

    public void clickProPick() {
        clickOn(buttonPlayProPick);
    }

    public void clickProPickOption(String propick) {
        switch (propick) {
            case "4" -> clickOn(proPick4);
            case "8" -> clickOn(proPick8);
            case "16" -> clickOn(proPick16);
            case "24" -> clickOn(proPick24);
            case "32" -> clickOn(proPick32);
            case "64" -> clickOn(proPick64);
            case "128" -> {
                swipeUp(1);
                clickOn(proPick128);
            }
            case "256" -> {
                swipeUp(1);
                clickOn(proPick256);
            }
        }
    }

    public void verifyTicketInCart() {
        Assert.assertEquals("1 Board(s)/1 Draw(s)", topCartItem.getText());
    }

    public void swipeToTop() {
        swipeDown(0.50, 0.70);
    }
}