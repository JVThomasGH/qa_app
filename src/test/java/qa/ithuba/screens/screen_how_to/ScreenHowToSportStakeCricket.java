package qa.ithuba.screens.screen_how_to;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.utilities.HelperUtil;

public class ScreenHowToSportStakeCricket extends HelperUtil {

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.nationallottery.ithuba:id/game_img' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoHowToSportStakeCricket;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'You can play the SPORTSTAKE CRICKET game by predicting outcomes of 10 predetermined cricket fixtures drawn from various league/tournaments and other identified professional sources across the globe.' or . = 'You can play the SPORTSTAKE CRICKET game by predicting outcomes of 10 predetermined cricket fixtures drawn from various league/tournaments and other identified professional sources across the globe.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP1HowToSportStakeCricket;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Obtain an applicable fixture list for the SPORTSTAKE CRICKET game and predict full time outcomes for each cricket matches featured in match list of 10.' or . = 'Obtain an applicable fixture list for the SPORTSTAKE CRICKET game and predict full time outcomes for each cricket matches featured in match list of 10.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP2HowToSportStakeCricket;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Mark your full time predictions in the applicable tick box for each relevant fixture.' or . = 'Mark your full time predictions in the applicable tick box for each relevant fixture.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP3HowToSportStakeCricket;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = '1 - for a Home win.' or . = '1 - for a Home win.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP4HowToSportStakeCricket;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'X - for a Draw.' or . = 'X - for a Draw.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP5HowToSportStakeCricket;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = '2 - for an Away win' or . = '2 - for an Away win')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP6HowToSportStakeCricket;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'A single board costs R5.00.' or . = 'A single board costs R5.00.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP7HowToSportStakeCricket;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'There will be 1 draw per week every Sunday.' or . = 'There will be 1 draw per week every Sunday.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP8HowToSportStakeCricket;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'You can select a single outcome result for each fixture.' or . = 'You can select a single outcome result for each fixture.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP9HowToSportStakeCricket;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'A valid wager must consist of at least one selection per fixture.' or . = 'A valid wager must consist of at least one selection per fixture.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP10HowToSportStakeCricket;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'A minimum price per wager per board is R5.00 vat incl, and a maximum wager per on-line betslip is R2,000.00.' or . = 'A minimum price per wager per board is R5.00 vat incl, and a maximum wager per on-line betslip is R2,000.00.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP11HowToSportStakeCricket;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'You can also play on our website at nationallottery.co.za.' or . = 'You can also play on our website at nationallottery.co.za.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP12HowToSportStakeCricket;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'In order to play in this draw, the player would need to participate in the SPORTSTAKE CRICKET main draw.' or . = 'In order to play in this draw, the player would need to participate in the SPORTSTAKE CRICKET main draw.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP13HowToSportStakeCricket;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'The cost to enter the supplementary draw is R2.50.' or . = 'The cost to enter the supplementary draw is R2.50.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP14HowToSportStakeCricket;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'There will be a supplementary draw where the player can choose to determine who wins the toss between opposing teams.' or . = 'There will be a supplementary draw where the player can choose to determine who wins the toss between opposing teams.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP15HowToSportStakeCricket;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'In order to win the jackpot for this draw, the player will need to predict 10 correct outcomes from the 10 tosses.' or . = 'In order to win the jackpot for this draw, the player will need to predict 10 correct outcomes from the 10 tosses.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP16HowToSportStakeCricket;

    public void verifyHowToSportStakeCricketText() {
        Assert.assertEquals("You can play the SPORTSTAKE CRICKET game by predicting outcomes of 10 predetermined cricket fixtures drawn from various league/tournaments and other identified professional sources across the globe.", textP1HowToSportStakeCricket.getText());
        Assert.assertEquals("Obtain an applicable fixture list for the SPORTSTAKE CRICKET game and predict full time outcomes for each cricket matches featured in match list of 10.", textP2HowToSportStakeCricket.getText());
        Assert.assertEquals("Mark your full time predictions in the applicable tick box for each relevant fixture.", textP3HowToSportStakeCricket.getText());
        Assert.assertEquals("1 - for a Home win.", textP4HowToSportStakeCricket.getText());
        Assert.assertEquals("X - for a Draw.", textP5HowToSportStakeCricket.getText());
        Assert.assertEquals("2 - for an Away win", textP6HowToSportStakeCricket.getText());
        Assert.assertEquals("A single board costs R5.00.", textP7HowToSportStakeCricket.getText());
        Assert.assertEquals("There will be 1 draw per week every Sunday.", textP8HowToSportStakeCricket.getText());
        swipeUp(1);
        Assert.assertEquals("You can select a single outcome result for each fixture.", textP9HowToSportStakeCricket.getText());
        Assert.assertEquals("A valid wager must consist of at least one selection per fixture.", textP10HowToSportStakeCricket.getText());
        Assert.assertEquals("A minimum price per wager per board is R5.00 vat incl, and a maximum wager per on-line betslip is R2,000.00.", textP11HowToSportStakeCricket.getText());
        Assert.assertEquals("You can also play on our website at nationallottery.co.za.", textP12HowToSportStakeCricket.getText());
        Assert.assertEquals("In order to play in this draw, the player would need to participate in the SPORTSTAKE CRICKET main draw.", textP13HowToSportStakeCricket.getText());
        Assert.assertEquals("The cost to enter the supplementary draw is R2.50.", textP14HowToSportStakeCricket.getText());
        Assert.assertEquals("There will be a supplementary draw where the player can choose to determine who wins the toss between opposing teams.", textP15HowToSportStakeCricket.getText());
        Assert.assertEquals("In order to win the jackpot for this draw, the player will need to predict 10 correct outcomes from the 10 tosses.", textP16HowToSportStakeCricket.getText());
    }
}
