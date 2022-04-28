package qa.ithuba.step_definitions.steps_login;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Assert;
import qa.ithuba.screens.screen_home.ScreenLogin;
import qa.ithuba.utilities.HelperUtil;

public class StepsLogin extends HelperUtil {

    ScreenLogin screenLogin;
    AndroidDriver androidDriver = ((AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver());

    @When("Player navigates to login form")
    public void playerClicksLoginIcon() {
        androidDriver.resetApp();
        screenLogin.clickSecurityCheck();
    }

    @And("Player enters user name as {string}")
    public void playerEntersUserNameAs(String userName) {
        screenLogin.enterUserName(userName);
    }

    @When("Player enters password as {string}")
    public void playerEntersPasswordAs(String userPassword) {
        screenLogin.enterPassword(userPassword);
    }

    @When("Player clicks LOGIN button")
    public void playerLogin() {
        screenLogin.clickLoginBtn();
        SLEEP(1000);
    }

    @Then("login should fail with an error {string} {string}")
    public void loginShouldFailWithAnError(String err, String tcDescr) {
        switch (tcDescr) {
            case "Invalid Username" -> Assert.assertEquals(err, screenLogin.getErrTxtUserIDField());
            case "Invalid Password", "Verify whether user can enter more than 5 digits pin", "Verify whether user is able to login with an invalid email address", "Verify whether user is able to login with a valid Email but invalid password" -> {
                Assert.assertEquals(err, screenLogin.getErrPwdUidPopUp());
                screenLogin.clickErrPwdUidPopUpOK();
            }
            case "Verify when user does not enter any Number or leave it blank in Mobile Number" -> {
                Assert.assertEquals(err, screenLogin.verifyUserIDFieldError());
            }
            case "Verify whether user can enter more than 10 digits in the Mobile number field", "Verify if user click on LOGIN button with invalid inputs" -> Assert.assertEquals(err, screenLogin.verifyUserIDFieldError());
            case "Verify when user does not enter any Number or leave it blank in PIN" -> Assert.assertEquals(err, screenLogin.verifyPasswordFieldError());

            default -> throw new IllegalArgumentException("Invalid option provided: " + err);
        }
    }


    @Then("Player should see home page with title {string}")
    public void playerShouldSeeHomePageWithTitle() {
    }

    @And("Player clicks pre-login {string} icon")
    public void playerClicksPreLoginIcon(String icon) {
        switch (icon) {
            case "LOGIN" -> screenLogin.clickLoginIcon();
            case "PLAY" -> screenLogin.clickPlayIcon();
            case "RESULTS" -> screenLogin.clickResultsIcon();
            case "HOW TO" -> screenLogin.clickHowToIcon();
            case "CONTACT US" -> screenLogin.clickContactUsIcon();
            case "ABOUT US" -> screenLogin.clickAboutUsIcon();
            case "MEDIA" -> screenLogin.clickMediaIcon();
            case "MESSAGES" -> screenLogin.clickMessagesIcon();
            default -> throw new IllegalArgumentException("Invalid Option " + icon);
        }
    }

    @Then("Player clicks on the Forget PIN link")
    public void playerClicksOnTheForgetPINLink() {
        screenLogin.clickForgotPin();
    }

    @Then("Player clicks the REGISTER button")
    public void playerClicksTheREGISTERButton() {
        screenLogin.clickRegisterButton();
    }


}
