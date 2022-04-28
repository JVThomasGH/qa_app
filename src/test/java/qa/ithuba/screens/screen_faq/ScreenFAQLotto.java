package qa.ithuba.screens.screen_faq;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import qa.ithuba.utilities.HelperUtil;

public class ScreenFAQLotto extends HelperUtil {


//    #################################
//    ####### QUESTIONS ###############
//    #################################

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What is LOTTO?' or . = 'What is LOTTO?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq1Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How does the LOTTO/ LOTTO PLUS 1/LOTTO PLUS 2 Game work?' or . = 'How does the LOTTO/ LOTTO PLUS 1/LOTTO PLUS 2 Game work?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq2Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Where and when may I purchase a LOTTO /LOTTO PLUS1 and LOTTO PLUS2 Game?' or . = 'Where and when may I purchase a LOTTO /LOTTO PLUS1 and LOTTO PLUS2 Game?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq3Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What is a Random Number Generator (RNG)?' or . = 'What is a Random Number Generator (RNG)?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq4Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What are the odds of winning a LOTTO PLUS1 and LOTTO PLUS2 prize?' or . = 'What are the odds of winning a LOTTO PLUS1 and LOTTO PLUS2 prize?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq5Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How many times can a LOTTO / LOTTO Plus1 / LOTTO Plus2  Jackpot roll over to the next draw?' or . = 'How many times can a LOTTO / LOTTO Plus1 / LOTTO Plus2  Jackpot roll over to the next draw?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq6Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What happens when a rollover coincides with a guaranteed jackpot?' or . = 'What happens when a rollover coincides with a guaranteed jackpot?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq7Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How do Rollovers of Jackpots work?' or . = 'How do Rollovers of Jackpots work?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq8Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What is the difference between an estimated and guaranteed Jackpot prize?' or . = 'What is the difference between an estimated and guaranteed Jackpot prize?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq9Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How do I claim the LOTTO Plus1 and / or LOTTO Plus 2 Prize?' or . = 'How do I claim the LOTTO Plus1 and / or LOTTO Plus 2 Prize?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq10Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Are the draws conducted live?' or . = 'Are the draws conducted live?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq11Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Are the balls and draw machines tested?' or . = 'Are the balls and draw machines tested?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq12Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Is there a time period in which to claim prizes?' or . = 'Is there a time period in which to claim prizes?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq13Lotto;

    public void expandAndVerifyQuestionsLotto() {
        SLEEP(1500);
        swipeUp(2);
        SLEEP(1000);
        clickOn(faq13Lotto);
        clickOn(faq12Lotto);
        clickOn(faq11Lotto);
        clickOn(faq10Lotto);
        clickOn(faq9Lotto);
        swipeDown(1);
        clickOn(faq8Lotto);
        clickOn(faq7Lotto);
        clickOn(faq6Lotto);
        clickOn(faq5Lotto);
        clickOn(faq4Lotto);
        clickOn(faq3Lotto);
        clickOn(faq2Lotto);
        clickOn(faq1Lotto);
    }
}
