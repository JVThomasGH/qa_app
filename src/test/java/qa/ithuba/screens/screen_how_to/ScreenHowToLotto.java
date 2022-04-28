package qa.ithuba.screens.screen_how_to;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.utilities.HelperUtil;

public class ScreenHowToLotto extends HelperUtil {

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.nationallottery.ithuba:id/game_img' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoHowToLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'You can play the LOTTO / LOTTO Plus 1 / LOTTO Plus 2 games on the App by choosing a Quick Pick where the Lottery processing system randomly chooses 6 lucky numbers for you.' or . = 'You can play the LOTTO / LOTTO Plus 1 / LOTTO Plus 2 games on the App by choosing a Quick Pick where the Lottery processing system randomly chooses 6 lucky numbers for you.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP1HowToLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'You can manually choose your lucky numbers by following these easy steps.' or . = 'You can manually choose your lucky numbers by following these easy steps.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP2HowToLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Select a board.' or . = 'Select a board.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP3HowToLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Choose 6 numbers from 1 to 52.' or . = 'Choose 6 numbers from 1 to 52.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP4HowToLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Click submit to save your numbers on the board. Select another board and repeat the process. You can also save your numbers for future use.' or . = 'Click submit to save your numbers on the board. Select another board and repeat the process. You can also save your numbers for future use.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP5HowToLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Add to cart and make payment. You can also save your ticket to My Saved Tickets for future payments if you so wish.' or . = 'Add to cart and make payment. You can also save your ticket to My Saved Tickets for future payments if you so wish.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP6HowToLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Look out for the LOTTO winning numbers which will be broadcast on SABC 2 Wed/Sat at 20H57 to see if you have won, or visit our website or Mobile App.' or . = 'Look out for the LOTTO winning numbers which will be broadcast on SABC 2 Wed/Sat at 20H57 to see if you have won, or visit our website or Mobile App.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP7HowToLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'You can play as many boards as you want.' or . = 'You can play as many boards as you want.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP8HowToLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'To play LOTTO Plus 1, simply mark off the LOTTO Plus 1 option on the board screen.' or . = 'To play LOTTO Plus 1, simply mark off the LOTTO Plus 1 option on the board screen.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP9HowToLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'To play LOTTO Plus 2, simply mark off the LOTTO Plus 2 option on the board screen.' or . = 'To play LOTTO Plus 2, simply mark off the LOTTO Plus 2 option on the board screen.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP10HowToLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'In order to play LOTTO Plus 2, LOTTO and LOTTO Plus 1 has to be played.' or . = 'In order to play LOTTO Plus 2, LOTTO and LOTTO Plus 1 has to be played.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP11HowToLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'You can choose a Multi-Draw option which allows you to play the same numbers over multiple draws.' or . = 'You can choose a Multi-Draw option which allows you to play the same numbers over multiple draws.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP12HowToLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'A single LOTTO play will cost you R5.00 VAT incl. A single cost of LOTTO Plus 1 will be R2.50 and a single cost of LOTTO Plus 2 will be R2.50 VAT incl.' or . = 'A single LOTTO play will cost you R5.00 VAT incl. A single cost of LOTTO Plus 1 will be R2.50 and a single cost of LOTTO Plus 2 will be R2.50 VAT incl.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP13HowToLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Ticket sales close at 8:30pm on any given draw day.' or . = 'Ticket sales close at 8:30pm on any given draw day.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP14HowToLotto;

    public void verifyHowToLottoText() {
        Assert.assertEquals("You can play the LOTTO / LOTTO Plus 1 / LOTTO Plus 2 games on the App by choosing a Quick Pick where the Lottery processing system randomly chooses 6 lucky numbers for you.", textP1HowToLotto.getText());
        Assert.assertEquals("You can manually choose your lucky numbers by following these easy steps.", textP2HowToLotto.getText());
        Assert.assertEquals("Select a board.", textP3HowToLotto.getText());
        Assert.assertEquals("Choose 6 numbers from 1 to 52.", textP4HowToLotto.getText());
        Assert.assertEquals("Click submit to save your numbers on the board. Select another board and repeat the process. You can also save your numbers for future use.", textP5HowToLotto.getText());
        Assert.assertEquals("Add to cart and make payment. You can also save your ticket to My Saved Tickets for future payments if you so wish.", textP6HowToLotto.getText());
        Assert.assertEquals("Look out for the LOTTO winning numbers which will be broadcast on SABC 2 Wed/Sat at 20H57 to see if you have won, or visit our website or Mobile App.", textP7HowToLotto.getText());
        swipeUp(1);
        Assert.assertEquals("You can play as many boards as you want.", textP8HowToLotto.getText());
        Assert.assertEquals("To play LOTTO Plus 1, simply mark off the LOTTO Plus 1 option on the board screen.", textP9HowToLotto.getText());
        Assert.assertEquals("To play LOTTO Plus 2, simply mark off the LOTTO Plus 2 option on the board screen.", textP10HowToLotto.getText());
        swipeUp(1);
        Assert.assertEquals("In order to play LOTTO Plus 2, LOTTO and LOTTO Plus 1 has to be played.", textP11HowToLotto.getText());
        Assert.assertEquals("You can choose a Multi-Draw option which allows you to play the same numbers over multiple draws.", textP12HowToLotto.getText());
        Assert.assertEquals("A single LOTTO play will cost you R5.00 VAT incl. A single cost of LOTTO Plus 1 will be R2.50 and a single cost of LOTTO Plus 2 will be R2.50 VAT incl.", textP13HowToLotto.getText());
        Assert.assertEquals("Ticket sales close at 8:30pm on any given draw day.", textP14HowToLotto.getText());
        swipeUp(1);
    }
}
