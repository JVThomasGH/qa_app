package qa.ithuba.screens.screen_home;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import qa.ithuba.utilities.HelperUtil;

import java.util.List;

@RunWith(SerenityRunner.class)
public class ScreenLogin extends PageObject {

    @Managed
    WebDriver driver;

    HelperUtil helperUtil;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/btn_close")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSecurityCheck;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"LOGIN\")")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconLogin;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"PLAY\")")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconPlay;

//    @AndroidFindBy(id = "com.nationallottery.ithuba:id/dashboard_title")
////    @iOSXCUITFindBy (id = "")
//    private List<WebElementFacade> iconsPreLogin;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"RESULTS\")")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconResults;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"HOW TO\")")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconHowTo;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"CONTACT US\")")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconContactUs;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"ABOUT US\")")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconAboutUs;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"MEDIA\")")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconMedia;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"MESSAGES\")")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconMessages;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/edit_mobile")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade usernameTxtFld;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/edit_pin")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade passwordTxtFld;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/btn_login")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade loginBtn;

    @AndroidFindBy(id = "android:id/message")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textInvalidPwdUid;

    @AndroidFindBy(id = "android:id/button1")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonInvalidPwdUid;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/txt_login")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade titleLoginPage;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/dashboard_icon")
//    @iOSXCUITFindBy (id = "")
    private List<WebElementFacade> iconsHome;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/dashboard_title")
//    @iOSXCUITFindBy (id = "")
    private List<WebElementFacade> iconsTextHome;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/btn_forgot_pin")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade linkForgotPin;
    
    @AndroidFindBy(id = "com.nationallottery.ithuba:id/btn_register")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonRegister;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/btn_cancel")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonCancel;


    public void clickSecurityCheck() {
        clickOn(buttonSecurityCheck);
    }

    public void enterUserName(String username) {
        typeInto(usernameTxtFld, username);
    }

    public void enterPassword(String password) {
        typeInto(passwordTxtFld, password);
    }

    public void clickLoginBtn() {
        clickOn(loginBtn);
    }

    public void login(String username, String password) throws InterruptedException {
        enterUserName(username);
        enterPassword(password);
    }


    public String getErrTxtUserIDField() {
        return usernameTxtFld.getText();
    }

    public String getErrInvalidPwdUid() {
        return usernameTxtFld.getText();
    }

    public void verifyLoginScreen(String screenName) {
        Assert.assertEquals(screenName, titleLoginPage.getText());
    }

    public void verifyHomeScreen(String screenName) {
        Assert.assertEquals(screenName, iconsTextHome.get(0).getText());
    }

    public String getErrPwdUidPopUp() {
        return textInvalidPwdUid.getText();
    }

    public void clickErrPwdUidPopUpOK() {
        clickOn(buttonInvalidPwdUid);
    }

    public String verifyUserIDFieldError() {
        return usernameTxtFld.getText();
    }

    public String verifyPasswordFieldError() {
        return passwordTxtFld.getText();
    }

    public void clickForgotPin() {
        clickOn(linkForgotPin);
    }

    public void clickRegisterButton() {
        clickOn(buttonRegister);
    }

    public void clickLoginIcon() {
        clickOn(iconLogin);
    }

    public void clickPlayIcon() {
        clickOn(iconPlay);
    }

    public void clickResultsIcon() {
        clickOn(iconResults);
    }

    public void clickHowToIcon() {
        clickOn(iconHowTo);
    }

    public void clickContactUsIcon() {
        clickOn(iconContactUs);
    }

    public void clickAboutUsIcon() {
        clickOn(iconAboutUs);
    }

    public void clickMediaIcon() {
        clickOn(iconMedia);
    }

    public void clickMessagesIcon() {
        clickOn(iconMessages);
    }

    public void clickCancelButton() {
        clickOn(buttonCancel);
    }
}
