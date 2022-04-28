package qa.ithuba.screens.screen_faq;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import qa.ithuba.utilities.HelperUtil;

public class ScreenFAQRaffle extends HelperUtil {


//    #################################
//    ####### QUESTIONS ###############
//    #################################

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What is a RAFFLE?' or . = 'What is a RAFFLE?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq1;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'When does the RAFFLE game ticket sales start?' or . = 'When does the RAFFLE game ticket sales start?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq2;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How does the RAFFLE game work?' or . = 'How does the RAFFLE game work?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq3;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What is a Random Number Generator (RNG)?' or . = 'What is a Random Number Generator (RNG)?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq4;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Are the draws conducted live?' or . = 'Are the draws conducted live?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq5;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What are my limits when buying RAFFLE tickets?' or . = 'What are my limits when buying RAFFLE tickets?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq6;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Why does the ticket count exceed the amount of allocated RAFFLE tickets?' or . = 'Why does the ticket count exceed the amount of allocated RAFFLE tickets?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq7;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Can I select/choose my own combination of numbers?' or . = 'Can I select/choose my own combination of numbers?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq8;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Am I able to cancel a ticket after I have bought it?' or . = 'Am I able to cancel a ticket after I have bought it?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq9;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How long do I wait to receive my vehicle?' or . = 'How long do I wait to receive my vehicle?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq10;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Does the vehicle include any insurance?' or . = 'Does the vehicle include any insurance?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq11;

    public void expandAndVerifyQuestionsRaffle() {
        swipeUp(2);
        clickOn(faq11);
        clickOn(faq10);
        clickOn(faq9);
        clickOn(faq7);
        swipeDown(1);
        clickOn(faq6);
        clickOn(faq5);
        clickOn(faq4);
        clickOn(faq3);
        clickOn(faq2);
        clickOn(faq1);
    }
}
