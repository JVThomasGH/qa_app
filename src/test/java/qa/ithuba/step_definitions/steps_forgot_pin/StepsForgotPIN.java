package qa.ithuba.step_definitions.steps_forgot_pin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import qa.ithuba.screens.screen_register.ScreenRegister;
import qa.ithuba.screens.screen_forgot_pin.ScreenForgotPIN;
import qa.ithuba.screens.screen_home.ScreenLogin;

public class StepsForgotPIN {

    ScreenLogin screenLogin;
    ScreenForgotPIN screenForgotPIN;
    ScreenRegister screenRegister;

    @Then("Click {string} CANCEL button")
    public void clickCANCELButton(String page) {
        switch (page) {
            case "LOGIN" -> screenLogin.clickCancelButton();
            case "FORGOT PIN" -> screenForgotPIN.clickCancelButton();
            case "REGISTER NOW!" -> screenRegister.clickCancelButton();
            default -> throw new IllegalArgumentException("Invalid option: " + page);
        }
    }

    @And("Player clicks on field of mobile number and Enter the {string}")
    public void playerClicksOnFieldOfMobileNumberAndEnterTheMobile_number(String mobileNumber) {
        screenForgotPIN.enterMobileNumber(mobileNumber);
    }

    @And("Player clicks on field of RSA ID and enter the {string}")
    public void playerClicksOnFieldOfRSAIDAndEnterTheRsa_ID(String rsaID) {
        screenForgotPIN.enterRSAID(rsaID);
    }

    @Then("Player clicks on the SEND PIN button")
    public void playerClicksOnTheSUBMITButton() {
        screenForgotPIN.clickSendPINButton();
    }

    @And("Player verifies that the banner is present on the forget pin page")
    public void playerVerifiesThatTheBannerIsPresentOnTheForgetPinPage() {
        screenForgotPIN.verifyBanner();
    }
}
