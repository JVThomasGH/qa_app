package qa.ithuba.screens.screen_popups;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.utilities.HelperUtil;

public class ScreenPopUps extends HelperUtil {

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Please select any 5 numbers ' or . = 'Please select any 5 numbers ') and @resource-id = 'android:id/message']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade pleaseSelectAny5Numbers;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Please select any 6 numbers ' or . = 'Please select any 6 numbers ') and @resource-id = 'android:id/message']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade pleaseSelectAny6Numbers;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Ticket Saved Successfully' or . = 'Ticket Saved Successfully') and @resource-id = 'android:id/message']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade ticketSavedSuccessfully;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Board Max Reached' or . = 'Board Max Reached') and @resource-id = 'android:id/message']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade boardMaxReached;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Please select any 5 numbers  and 1 powerball' or . = 'Please select any 5 numbers  and 1 powerball') and @resource-id = 'android:id/message']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade pleaseSelectAny5NumbersAndOnePowerBall;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'You have successfully added ticket to your cart.' or . = 'You have successfully added ticket to your cart.') and @resource-id = 'android:id/message']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade successAddToCart;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'OK' or . = 'OK') and @resource-id = 'android:id/button1']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonOkPopUp;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Your saved ticket is deleted. If required, please save it again.' or . = 'Your saved ticket is deleted. If required, please save it again.') and @resource-id = 'android:id/message']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade savedTicketDeleted;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Ticket Deleted Successfully.' or . = 'Ticket Deleted Successfully.') and @resource-id = 'android:id/message']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade ticketDeleted;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Please select at least one result from each row' or . = 'Please select at least one result from each row') and @resource-id = 'android:id/message']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade selectMoreSSResults;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Price is greater than R2000.00' or . = 'Price is greater than R2000.00') and @resource-id = 'android:id/message']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade priceGreater2K;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Price is greater than R2,000.00' or . = 'Price is greater than R2,000.00') and @resource-id = 'android:id/message']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade priceGreater2KSS4;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Price is greater than R2000.00' or . = 'Price is greater than R2000.00') and @resource-id = 'android:id/message']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade priceGreater2KSS8;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Amount should be in between R1.00 to R10,000.00' or . = 'Amount should be in between R1.00 to R10,000.00') and @resource-id = 'android:id/message']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade amountShouldBetween1_10k;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'android:id/message']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade successVoucher;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'android:id/message']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade messagePopUp;

    public void popUpRemoveTicketOrBoard() {
    }

    public void popUpSuccessPlay() {
    }

    public void close() {
        clickOn(buttonOkPopUp);
    }

    public String ticketNumber() {
//        return getTicketNumber.getText();
        return null;
    }

    public void popUpSaveNumbers() {
    }

    public void popUpSaveTicketDeleted() {
        Assert.assertTrue(savedTicketDeleted.isDisplayed());
    }

    public void confirmPopUpTicketDeleted() {
    }

    public void confirmPopUpTicketResumePlay() {
    }

    public void popUpTicketSaved() {
        Assert.assertTrue(ticketSavedSuccessfully.isDisplayed());
    }

    public void popUpNumbersSaved() {
    }

    public void popUpPleaseSelectAny6Numbers() {
        Assert.assertTrue(pleaseSelectAny6Numbers.isDisplayed());
    }

    public void popUpPleaseSelectAny5NumbersAndOnePowerBall() {
        Assert.assertTrue(pleaseSelectAny5NumbersAndOnePowerBall.isDisplayed());
        logger("FOUND POPUP: " + pleaseSelectAny5NumbersAndOnePowerBall.getText());
    }

    public void popUpPleaseSelectAny5Numbers() {
        Assert.assertTrue(pleaseSelectAny5Numbers.isDisplayed());
    }

    public void popUpBoardMaxReached() {
        Assert.assertTrue(boardMaxReached.isDisplayed());
        logger("FOUND POPUP: " + boardMaxReached.getText());
    }

    public void noTransactionDetailsFound() {
    }

    public void noTransactionDetailsFoundForDateRange() {
    }

    public void successAddToCart() {
        Assert.assertTrue(successAddToCart.isDisplayed());
        logger("FOUND POPUP: " + successAddToCart.getText());
    }

    public void priceIsGreaterThan2kSS4() {
        Assert.assertTrue(priceGreater2KSS4.isDisplayed());
        logger("FOUND POPUP: " + priceGreater2KSS4.getText());
    }

    public void priceIsGreaterThan2k() {
        Assert.assertTrue(priceGreater2K.isDisplayed());
        logger("FOUND POPUP: " + priceGreater2K.getText());
    }

    public void priceIsGreaterThan2kSS8() {
        Assert.assertTrue(priceGreater2KSS8.isDisplayed());
        logger("FOUND POPUP: " + priceGreater2KSS8.getText());
    }

    public void amountShouldBeBetween1_10k() {
        Assert.assertTrue(amountShouldBetween1_10k.isDisplayed());
        logger("FOUND POPUP: " + amountShouldBetween1_10k.getText());
    }

    public void priceIsGreaterThan2kSS13() {
    }

    public void selectMoreRows() {
        Assert.assertTrue(selectMoreSSResults.isDisplayed());
        logger("FOUND POPUP: " + selectMoreSSResults.getText());
    }

    public void selectMoreRowsDefect() {
    }

    public void networkDown() {
    }

    public void confirmPopUpSavedTicketDeleted() {
        logger("FOUND POPUP: " + ticketDeleted.getText());
        Assert.assertTrue(ticketDeleted.containsText("Ticket Deleted Successfully"));
    }
    public void confirmPopUpSuccessVoucher() {
        logger("FOUND POPUP: " + successVoucher.getText());
        Assert.assertTrue(successVoucher.containsText("Thanks for transacting with us. We have updated your account with current transaction "));
    }
    public void confirmPopUpNoAtm() {
        logger("FOUND POPUP: " + messagePopUp.getText());
        Assert.assertTrue(messagePopUp.containsText("Please be advised that ATM withdrawals are currently not available"));
    }

    public void confirmPopUp(String popUsMessage) {
        Assert.assertEquals(popUsMessage, messagePopUp.getText());
        logger("FOUND POPUP: " + messagePopUp.getText());
    }
}
