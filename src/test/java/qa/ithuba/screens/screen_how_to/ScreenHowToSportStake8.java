package qa.ithuba.screens.screen_how_to;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.utilities.HelperUtil;

public class ScreenHowToSportStake8 extends HelperUtil {

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.nationallottery.ithuba:id/game_img' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoHowToSportStake8;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'To play SportStake 8 players must predict first and second half results of eight predetermined soccer matches drawn from various FIFA regions.' or . = 'To play SportStake 8 players must predict first and second half results of eight predetermined soccer matches drawn from various FIFA regions.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP1HowToSportStake8;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Obtain an applicable Fixture List for the SPORTSTAKE 8' or . = 'Obtain an applicable Fixture List for the SPORTSTAKE 8')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP2HowToSportStake8;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Mark your first and second half predictions in the applicable tick box for each relevant fixture.' or . = 'Mark your first and second half predictions in the applicable tick box for each relevant fixture.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP3HowToSportStake8;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = '1 - for a Home Win' or . = '1 - for a Home Win')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP4HowToSportStake8;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = '2 - for a Draw' or . = '2 - for a Draw')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP5HowToSportStake8;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = '3 - for an Away Win' or . = '3 - for an Away Win')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP6HowToSportStake8;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'You can also play SPORTSTAKE 8' or . = 'You can also play SPORTSTAKE 8')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP7HowToSportStake8;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = ' by choosing the PROPICK' or . = ' by choosing the PROPICK')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP8HowToSportStake8;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = '. With the PROPICK' or . = '. With the PROPICK')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP9HowToSportStake8;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = concat(' option, the system will, on your behalf generate boards based on a mix of experts' , \"'\" , ' and random selections.') or . = concat(' option, the system will, on your behalf generate boards based on a mix of experts' , \"'\" , ' and random selections.'))]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP10HowToSportStake8;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'A single board costs R2.00.' or . = 'A single board costs R2.00.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP11HowToSportStake8;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Multi-Play bet cost is calculated by multiplying number of boards with R2.00.' or . = 'Multi-Play bet cost is calculated by multiplying number of boards with R2.00.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP12HowToSportStake8;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'You can select single or multiple outcome result for each half.' or . = 'You can select single or multiple outcome result for each half.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP13HowToSportStake8;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'A valid wager must consist of at least one selection per half.' or . = 'A valid wager must consist of at least one selection per half.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP14HowToSportStake8;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'A Minimum price per wager is R2 and maximum spend per transaction is R2000' or . = 'A Minimum price per wager is R2 and maximum spend per transaction is R2000')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP15HowToSportStake8;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = concat('There' , \"'\" , 's no multi-draw option.') or . = concat('There' , \"'\" , 's no multi-draw option.'))]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP16HowToSportStake8;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Each single entry wager will cost you R2, including VAT.' or . = 'Each single entry wager will cost you R2, including VAT.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP17HowToSportStake8;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = concat('SPORTSTAKE 8 results are considered as the score at the end of each 45 minute half, including the referee' , \"'\" , 's added time but excludes extra-time or penalty shootouts.') or . = concat('SPORTSTAKE 8 results are considered as the score at the end of each 45 minute half, including the referee' , \"'\" , 's added time but excludes extra-time or penalty shootouts.'))]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP18HowToSportStake8;


    public void verifyHowToSportStake8Text() {
        Assert.assertEquals("To play SportStake 8 players must predict first and second half results of eight predetermined soccer matches drawn from various FIFA regions.", textP1HowToSportStake8.getText());
        Assert.assertEquals("Obtain an applicable Fixture List for the SPORTSTAKE 8", textP2HowToSportStake8.getText());
        Assert.assertEquals("Mark your first and second half predictions in the applicable tick box for each relevant fixture.", textP3HowToSportStake8.getText());
        Assert.assertEquals("1 - for a Home Win", textP4HowToSportStake8.getText());
        Assert.assertEquals("2 - for a Draw", textP5HowToSportStake8.getText());
        Assert.assertEquals("3 - for an Away Win", textP6HowToSportStake8.getText());
        Assert.assertEquals("You can also play SPORTSTAKE 8", textP7HowToSportStake8.getText());
        Assert.assertEquals(" by choosing the PROPICK", textP8HowToSportStake8.getText());
        swipeUp(1);
        Assert.assertEquals(". With the PROPICK", textP9HowToSportStake8.getText());
        Assert.assertEquals(" option, the system will, on your behalf generate boards based on a mix of experts' and random selections.", textP10HowToSportStake8.getText());
        Assert.assertEquals("A single board costs R2.00.", textP11HowToSportStake8.getText());
        Assert.assertEquals("Multi-Play bet cost is calculated by multiplying number of boards with R2.00.", textP12HowToSportStake8.getText());
        Assert.assertEquals("You can select single or multiple outcome result for each half.", textP13HowToSportStake8.getText());
        Assert.assertEquals("A valid wager must consist of at least one selection per half.", textP14HowToSportStake8.getText());
        Assert.assertEquals("A Minimum price per wager is R2 and maximum spend per transaction is R2000", textP15HowToSportStake8.getText());
        swipeUp(1);
        Assert.assertEquals("There's no multi-draw option.", textP16HowToSportStake8.getText());
        Assert.assertEquals("Each single entry wager will cost you R2, including VAT.", textP17HowToSportStake8.getText());
        Assert.assertEquals("SPORTSTAKE 8 results are considered as the score at the end of each 45 minute half, including the referee's added time but excludes extra-time or penalty shootouts.", textP18HowToSportStake8.getText());
    }
}
