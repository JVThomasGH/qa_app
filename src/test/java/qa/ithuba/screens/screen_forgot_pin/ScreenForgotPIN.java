package qa.ithuba.screens.screen_forgot_pin;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.utilities.HelperUtil;

public class ScreenForgotPIN extends HelperUtil {

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/txt_forgot_pin")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade titleForgotPINPage;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.nationallottery.ithuba:id/forgot_pin_img_logo' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade bannerLotto;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/btn_forgot_pin_cancel")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonCancel;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/edit_forgot_pin_mobile_no")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade inputMobileNo;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/edit_forgot_pin_rsaid")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade inputRSAID;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/btn_send_pin")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSendPIN;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/btn_forgot_pin_register")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonRegister;

    public ScreenForgotPIN() {
    }

    public void verifyForgotPINScreen(String screenName) {
        Assert.assertEquals(screenName, titleForgotPINPage.getText());
    }

    public void clickCancelButton() {
        clickOn(buttonCancel);
    }

    public void enterMobileNumber(String mobileNumber) {
        typeInto(inputMobileNo, mobileNumber);
    }

    public void enterRSAID(String rsaID) {
        typeInto(inputRSAID, rsaID);
    }

    public void clickSendPINButton() {
        clickOn(buttonSendPIN);
    }

    public void verifyBanner() {
        Assert.assertTrue(bannerLotto.isDisplayed());
    }
}
