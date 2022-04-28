package qa.ithuba.screens.screen_how_to;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.utilities.HelperUtil;

public class ScreenHowToSportStake4 extends HelperUtil {

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.nationallottery.ithuba:id/game_img' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoHowToSportStake4;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'You can play the SPORTSTAKE 4 game by predicting the first half (45 minutes) and the full time score (90 minutes) (1,X,2) of 4 predetermined fixtures drawn from various leagues and other identified professional soccer leagues across the globe.' or . = 'You can play the SPORTSTAKE 4 game by predicting the first half (45 minutes) and the full time score (90 minutes) (1,X,2) of 4 predetermined fixtures drawn from various leagues and other identified professional soccer leagues across the globe.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP1HowToSportStake4;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = '\n" +
            "HOW TO PLAY' or . = '\n" +
            "HOW TO PLAY')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP2HowToSportStake4;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Obtain an applicable fixture list for the SPORTSTAKE 4 game and predict both 1st half and full time outcomes for each one of the four soccer matches featured in match list.' or . = 'Obtain an applicable fixture list for the SPORTSTAKE 4 game and predict both 1st half and full time outcomes for each one of the four soccer matches featured in match list.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP3HowToSportStake4;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Mark your first and full time predictions in the applicable tick box for each relevant fixture.' or . = 'Mark your first and full time predictions in the applicable tick box for each relevant fixture.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP4HowToSportStake4;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = '1 - for a Home win.' or . = '1 - for a Home win.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP5HowToSportStake4;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'X - for a Draw.' or . = 'X - for a Draw.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP6HowToSportStake4;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = '2 - for an Away win' or . = '2 - for an Away win')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP7HowToSportStake4;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'A single board costs R2.00.' or . = 'A single board costs R2.00.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP9HowToSportStake4;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'There will be 2 draws per week, on a Monday and Thursday.' or . = 'There will be 2 draws per week, on a Monday and Thursday.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP11HowToSportStake4;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'You can select a single outcome result for result in the first half and for the full time result.' or . = 'You can select a single outcome result for result in the first half and for the full time result.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP12HowToSportStake4;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'A valid wager must consist of at least one selection per game per half.' or . = 'A valid wager must consist of at least one selection per game per half.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP13HowToSportStake4;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'A minimum price per wager is R2.00 and maximum spend per transaction is R2,000.00.' or . = 'A minimum price per wager is R2.00 and maximum spend per transaction is R2,000.00.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP14HowToSportStake4;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Each single entry wager will cost you R2.00, including VAT.' or . = 'Each single entry wager will cost you R2.00, including VAT.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP15HowToSportStake4;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = concat('SPORTSTAKE 4 results are considered as the score at the end of the first 45 minute half and full time score, including the referee' , \"'\" , 's added time but excludes extra-time or penalty shootouts.') or . = concat('SPORTSTAKE 4 results are considered as the score at the end of the first 45 minute half and full time score, including the referee' , \"'\" , 's added time but excludes extra-time or penalty shootouts.'))]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP16HowToSportStake4;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'You can also play on our website at nationallottery.co.za.' or . = 'You can also play on our website at nationallottery.co.za.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP17HowToSportStake4;

    public void verifyHowToSportStake4Text() {
        Assert.assertEquals("You can play the SPORTSTAKE 4 game by predicting the first half (45 minutes) and the full time score (90 minutes) (1,X,2) of 4 predetermined fixtures drawn from various leagues and other identified professional soccer leagues across the globe.", textP1HowToSportStake4.getText());
        Assert.assertEquals("\n" +
                "HOW TO PLAY", textP2HowToSportStake4.getText());
        Assert.assertEquals("Obtain an applicable fixture list for the SPORTSTAKE 4 game and predict both 1st half and full time outcomes for each one of the four soccer matches featured in match list.", textP3HowToSportStake4.getText());
        Assert.assertEquals("Mark your first and full time predictions in the applicable tick box for each relevant fixture.", textP4HowToSportStake4.getText());
        Assert.assertEquals("1 - for a Home win.", textP5HowToSportStake4.getText());
        Assert.assertEquals("X - for a Draw.", textP6HowToSportStake4.getText());
        Assert.assertEquals("2 - for an Away win", textP7HowToSportStake4.getText());
        Assert.assertEquals("A single board costs R2.00.", textP9HowToSportStake4.getText());
        swipeUp(1);
        Assert.assertEquals("There will be 2 draws per week, on a Monday and Thursday.", textP11HowToSportStake4.getText());
        Assert.assertEquals("You can select a single outcome result for result in the first half and for the full time result.", textP12HowToSportStake4.getText());
        Assert.assertEquals("A valid wager must consist of at least one selection per game per half.", textP13HowToSportStake4.getText());
        Assert.assertEquals("A minimum price per wager is R2.00 and maximum spend per transaction is R2,000.00.", textP14HowToSportStake4.getText());
        Assert.assertEquals("Each single entry wager will cost you R2.00, including VAT.", textP15HowToSportStake4.getText());
        Assert.assertEquals("SPORTSTAKE 4 results are considered as the score at the end of the first 45 minute half and full time score, including the referee's added time but excludes extra-time or penalty shootouts.", textP16HowToSportStake4.getText());
        Assert.assertEquals("You can also play on our website at nationallottery.co.za.", textP17HowToSportStake4.getText());
    }
}
