package qa.ithuba.screens.screen_how_to;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.utilities.HelperUtil;

public class ScreenHowToRaffle extends HelperUtil {

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.nationallottery.ithuba:id/game_img' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoHowToRaffle;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'RAFFLE is a game in which participants obtain numbered tickets, each ticket having the chance of winning a prize. The winning ticket numbers are drawn using a Random Number Generator (RNG) which contains all the ticket entries. The RNG system draws the winning numbers randomly from the pool of RAFFLE ticket numbers sold. The drawn tickets are checked against a collection of prizes which are assigned to specific winning divisions, and the holder of the selected ticket wins the prize in the drawn division.' or . = 'RAFFLE is a game in which participants obtain numbered tickets, each ticket having the chance of winning a prize. The winning ticket numbers are drawn using a Random Number Generator (RNG) which contains all the ticket entries. The RNG system draws the winning numbers randomly from the pool of RAFFLE ticket numbers sold. The drawn tickets are checked against a collection of prizes which are assigned to specific winning divisions, and the holder of the selected ticket wins the prize in the drawn division.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP1HowToRaffle;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'You can play RAFFLE by following these easy steps:' or . = 'You can play RAFFLE by following these easy steps:')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP2HowToRaffle;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Simply choose your desired number of tickets.' or . = 'Simply choose your desired number of tickets.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP3HowToRaffle;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Add to cart and make payment.' or . = 'Add to cart and make payment.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textP4HowToRaffle;

    public void verifyHowToRaffleText() {
        Assert.assertEquals("RAFFLE is a game in which participants obtain numbered tickets, each ticket having the chance of winning a prize. The winning ticket numbers are drawn using a Random Number Generator (RNG) which contains all the ticket entries. The RNG system draws the winning numbers randomly from the pool of RAFFLE ticket numbers sold. The drawn tickets are checked against a collection of prizes which are assigned to specific winning divisions, and the holder of the selected ticket wins the prize in the drawn division.", textP1HowToRaffle.getText());
        Assert.assertEquals("You can play RAFFLE by following these easy steps:", textP2HowToRaffle.getText());
        Assert.assertEquals("Simply choose your desired number of tickets.", textP3HowToRaffle.getText());
        Assert.assertEquals("Add to cart and make payment.", textP4HowToRaffle.getText());
    }
}
