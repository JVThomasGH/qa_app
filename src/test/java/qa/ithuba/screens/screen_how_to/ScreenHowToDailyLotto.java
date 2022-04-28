package qa.ithuba.screens.screen_how_to;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.utilities.HelperUtil;

public class ScreenHowToDailyLotto extends HelperUtil {

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.nationallottery.ithuba:id/game_img' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoHowToDailyLotto;

    @AndroidFindBy(xpath = """
            //*[@class = 'android.view.View' and (@text = 'QUICK PICK OPTION: You can play the DAILY LOTTO game by choosing a Quick Pick option where the lottery processing system randomly chooses 5 lucky numbers for you.
                        
            or' or . = 'QUICK PICK OPTION: You can play the DAILY LOTTO game by choosing a Quick Pick option where the lottery processing system randomly chooses 5 lucky numbers for you.
                        
            or')]""")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP1HowToDailyLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'You can manually choose your lucky numbers by following these easy steps.' or . = 'You can manually choose your lucky numbers by following these easy steps.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP2HowToDailyLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Select a board.' or . = 'Select a board.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP3HowToDailyLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Choose 5 numbers from 1 to 36.' or . = 'Choose 5 numbers from 1 to 36.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP4HowToDailyLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Click submit to save your numbers on the board.' or . = 'Click submit to save your numbers on the board.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP5HowToDailyLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Select another board and repeat the process.  You can also save your numbers for future use.' or . = 'Select another board and repeat the process.  You can also save your numbers for future use.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP6HowToDailyLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Add to cart and make payment.  You can also save your ticket to My Saved Tickets for future payments if you wish.' or . = 'Add to cart and make payment.  You can also save your ticket to My Saved Tickets for future payments if you wish.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP7HowToDailyLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'The games results are drawn every day at 21h00. Results are available at retailers and online.' or . = 'The games results are drawn every day at 21h00. Results are available at retailers and online.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP8HowToDailyLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'You can play as many boards as you want.' or . = 'You can play as many boards as you want.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP9HowToDailyLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'You can choose a Multi-Draw option which allows you to play the same numbers over multiple draws.' or . = 'You can choose a Multi-Draw option which allows you to play the same numbers over multiple draws.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP10HowToDailyLotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'A single DAILY LOTTO play will cost you R3.00 VAT incl.' or . = 'A single DAILY LOTTO play will cost you R3.00 VAT incl.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP11HowToDailyLotto;

    public void verifyHowToDailyLottoText() {
        Assert.assertEquals("""
                QUICK PICK OPTION: You can play the DAILY LOTTO game by choosing a Quick Pick option where the lottery processing system randomly chooses 5 lucky numbers for you.
                                
                or""", textP1HowToDailyLotto.getText());
        Assert.assertEquals("You can manually choose your lucky numbers by following these easy steps.", textP2HowToDailyLotto.getText());
        Assert.assertEquals("Select a board.", textP3HowToDailyLotto.getText());
        Assert.assertEquals("Choose 5 numbers from 1 to 36.", textP4HowToDailyLotto.getText());
        Assert.assertEquals("Click submit to save your numbers on the board.", textP5HowToDailyLotto.getText());
        Assert.assertEquals("Select another board and repeat the process.  You can also save your numbers for future use.", textP6HowToDailyLotto.getText());
        Assert.assertEquals("Add to cart and make payment.  You can also save your ticket to My Saved Tickets for future payments if you wish.", textP7HowToDailyLotto.getText());
        Assert.assertEquals("The games results are drawn every day at 21h00. Results are available at retailers and online.", textP8HowToDailyLotto.getText());
        swipeUp(1);
        Assert.assertEquals("You can play as many boards as you want.", textP9HowToDailyLotto.getText());
        Assert.assertEquals("You can choose a Multi-Draw option which allows you to play the same numbers over multiple draws.", textP10HowToDailyLotto.getText());
        Assert.assertEquals("A single DAILY LOTTO play will cost you R3.00 VAT incl.", textP11HowToDailyLotto.getText());
    }
}
