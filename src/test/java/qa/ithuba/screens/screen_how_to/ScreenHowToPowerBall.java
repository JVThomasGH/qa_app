package qa.ithuba.screens.screen_how_to;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.utilities.HelperUtil;

public class ScreenHowToPowerBall extends HelperUtil {

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.nationallottery.ithuba:id/game_img' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoHowToPowerBall;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'You can play the PowerBall / PowerBall Plus games on the App by choosing a Quick Pick option where the Lottery processing system randomly chooses 6 lucky numbers for you.\n" +
            "\n" +
            "or' or . = 'You can play the PowerBall / PowerBall Plus games on the App by choosing a Quick Pick option where the Lottery processing system randomly chooses 6 lucky numbers for you.\n" +
            "\n" +
            "or')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP1HowToPowerBall;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'You can manually choose your lucky numbers by following these easy steps.' or . = 'You can manually choose your lucky numbers by following these easy steps.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP2HowToPowerBall;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Select a board.' or . = 'Select a board.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP3HowToPowerBall;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Choose 5 numbers from 1 to 50 and 1 extra number from 1 to 20.' or . = 'Choose 5 numbers from 1 to 50 and 1 extra number from 1 to 20.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP4HowToPowerBall;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Click submit to save your numbers on the board. Select another board and repeat the process. You can also save your numbers for future use.' or . = 'Click submit to save your numbers on the board. Select another board and repeat the process. You can also save your numbers for future use.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP5HowToPowerBall;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Add to cart and make payment. You can also save your ticket to My Saved Tickets for future payments if you so wish.' or . = 'Add to cart and make payment. You can also save your ticket to My Saved Tickets for future payments if you so wish.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP6HowToPowerBall;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Look out for the PowerBall winning numbers which will be broadcast on etv Tues/Fri at 21H00 to see if you have won, or visit our website or Mobile App.' or . = 'Look out for the PowerBall winning numbers which will be broadcast on etv Tues/Fri at 21H00 to see if you have won, or visit our website or Mobile App.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP7HowToPowerBall;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'You can play as many boards as you want.' or . = 'You can play as many boards as you want.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP8HowToPowerBall;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'You can choose a Multi-Draw option which allows you to play the same numbers over multiple draws.' or . = 'You can choose a Multi-Draw option which allows you to play the same numbers over multiple draws.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP9HowToPowerBall;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Ticket sales close at 8:30pm on any given draw day.' or . = 'Ticket sales close at 8:30pm on any given draw day.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP10HowToPowerBall;

    public void verifyHowToPowerBallText() {
        Assert.assertEquals("""
                You can play the PowerBall / PowerBall Plus games on the App by choosing a Quick Pick option where the Lottery processing system randomly chooses 6 lucky numbers for you.
                                
                or""", textP1HowToPowerBall.getText());
        Assert.assertEquals("You can manually choose your lucky numbers by following these easy steps.", textP2HowToPowerBall.getText());
        Assert.assertEquals("Select a board.", textP3HowToPowerBall.getText());
        Assert.assertEquals("Choose 5 numbers from 1 to 50 and 1 extra number from 1 to 20.", textP4HowToPowerBall.getText());
        Assert.assertEquals("Click submit to save your numbers on the board. Select another board and repeat the process. You can also save your numbers for future use.", textP5HowToPowerBall.getText());
        Assert.assertEquals("Add to cart and make payment. You can also save your ticket to My Saved Tickets for future payments if you so wish.", textP6HowToPowerBall.getText());
        Assert.assertEquals("Look out for the PowerBall winning numbers which will be broadcast on etv Tues/Fri at 21H00 to see if you have won, or visit our website or Mobile App.", textP7HowToPowerBall.getText());
        swipeUp(1);
        Assert.assertEquals("You can play as many boards as you want.", textP8HowToPowerBall.getText());
        Assert.assertEquals("You can choose a Multi-Draw option which allows you to play the same numbers over multiple draws.", textP9HowToPowerBall.getText());
        Assert.assertEquals("Ticket sales close at 8:30pm on any given draw day.", textP10HowToPowerBall.getText());
    }
}
