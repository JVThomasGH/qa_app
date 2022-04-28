package qa.ithuba.screens.screen_register;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.utilities.HelperUtil;

public class ScreenRegister extends HelperUtil {

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/txt_register")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade titleRegisterScreen;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/btn_register_cancel")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonCancel;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/btn_register_submit")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonRegister;

    public ScreenRegister() {
    }

    public void verifyRegisterScreen(String screenName) {
        Assert.assertEquals(screenName, titleRegisterScreen.getText());
    }

    public void clickCancelButton() {
        swipeUp(1);
        clickOn(buttonCancel);
    }
}
