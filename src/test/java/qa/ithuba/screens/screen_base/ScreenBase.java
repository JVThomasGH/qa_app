package qa.ithuba.screens.screen_base;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import qa.ithuba.utilities.HelperUtil;

public class ScreenBase extends HelperUtil {

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/btn_close")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSecurityCheck;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'OK' or . = 'OK') and @resource-id = 'android:id/button1']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonLogoutOk;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'OK, GOT IT' or . = 'OK, GOT IT') and @resource-id = 'com.nationallottery.ithuba:id/txt_skip']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonShakeOK;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'NEVER SHOW AGAIN' or . = 'NEVER SHOW AGAIN') and @resource-id = 'com.nationallottery.ithuba:id/txt_hide']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonNeverShowAgain;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/ib_back")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade arrowBack;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'ALLOW' or . = 'ALLOW') and @resource-id = 'com.android.permissioncontroller:id/permission_allow_button']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonAllow;

    public void clickBackArrow() {
        arrowBack.waitUntilEnabled();
        clickOn(arrowBack);
    }

    public void clickLogoutSuccess() {
        clickOn(buttonLogoutOk);
    }

    public void clickShakeOK() {
        clickOn(buttonShakeOK);

    }

    public void clickNeverShowAgain() {
        clickOn(buttonNeverShowAgain);
    }


    public void clickAllowButton() {
        clickOn(buttonAllow);
    }

    public void navigateBackOnDevice() {
        getDriver().navigate().back();
    }


}
