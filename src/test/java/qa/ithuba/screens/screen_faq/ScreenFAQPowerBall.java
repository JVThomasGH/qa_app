package qa.ithuba.screens.screen_faq;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import qa.ithuba.utilities.HelperUtil;

public class ScreenFAQPowerBall extends HelperUtil {


//    #################################
//    ####### QUESTIONS ###############
//    #################################

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What is PowerBall/PowerBall Plus?' or . = 'What is PowerBall/PowerBall Plus?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq1;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How does the PowerBall/PowerBall Plus game work?' or . = 'How does the PowerBall/PowerBall Plus game work?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq2;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What is a Random Number Generator (RNG)?' or . = 'What is a Random Number Generator (RNG)?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq3;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Are the draws conducted live?' or . = 'Are the draws conducted live?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq4;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Are the balls and draw machines tested?' or . = 'Are the balls and draw machines tested?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq5;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Where and when may I purchase a PowerBall Game?' or . = 'Where and when may I purchase a PowerBall Game?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq6;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What are the odds of winning a PowerBall prize? ' or . = 'What are the odds of winning a PowerBall prize? ')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq7;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How many times can a PowerBall Jackpot roll over to the next draw? ' or . = 'How many times can a PowerBall Jackpot roll over to the next draw? ')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq8;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What happens when a rollover coincides with a guaranteed jackpot? ' or . = 'What happens when a rollover coincides with a guaranteed jackpot? ')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq9;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How do Rollovers of Jackpots work? ' or . = 'How do Rollovers of Jackpots work? ')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq10;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What is the difference between an estimated and guaranteed Jackpot prize? ' or . = 'What is the difference between an estimated and guaranteed Jackpot prize? ')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq11;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How do I claim the PowerBall Prize?' or . = 'How do I claim the PowerBall Prize?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq12;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Is there a time period in which to claim prizes?' or . = 'Is there a time period in which to claim prizes?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq13;

    public void expandAndVerifyQuestionsPowerBall() {
        SLEEP(1500);
        swipeUp(2);
        SLEEP(1000);
        clickOn(faq13);
        clickOn(faq12);
        clickOn(faq11);
        clickOn(faq10);
        clickOn(faq9);
        clickOn(faq7);
        swipeDown(2300, 650);
        SLEEP(1000);
        clickOn(faq6);
        clickOn(faq5);
        clickOn(faq4);
        clickOn(faq3);
        clickOn(faq2);
        clickOn(faq1);
    }
}
