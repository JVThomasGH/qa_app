package qa.ithuba.screens.screen_faq;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import qa.ithuba.utilities.HelperUtil;

public class ScreenFAQDailyLotto extends HelperUtil {


//    #################################
//    ####### QUESTIONS ###############
//    #################################

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What is DAILY LOTTO?' or . = 'What is DAILY LOTTO?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq1Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How does the DAILY LOTTO Game work?' or . = 'How does the DAILY LOTTO Game work?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq2Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Manual Selection' or . = 'Manual Selection')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq3Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Where and when may I purchase a DAILY LOTTO Game?' or . = 'Where and when may I purchase a DAILY LOTTO Game?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq4Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What time is the draw' or . = 'What time is the draw')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq5Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What are the odds of winning the DAILY LOTTO prize?' or . = 'What are the odds of winning the DAILY LOTTO prize?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq6Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Herewith the odds of winning a prize on DAILY LOTTO:' or . = 'Herewith the odds of winning a prize on DAILY LOTTO:')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq7Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How many times can a DAILY LOTTO Jackpot roll over to the next draw?' or . = 'How many times can a DAILY LOTTO Jackpot roll over to the next draw?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq8Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What is the difference between an estimated and guaranteed Jackpot prize?' or . = 'What is the difference between an estimated and guaranteed Jackpot prize?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq9Lotto;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How do I claim the DAILY LOTTO Prize?' or . = 'How do I claim the DAILY LOTTO Prize?')]")
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

    public void expandAndVerifyQuestionsDailyLotto() {
        swipeUp(2);
        clickOn(faq13Lotto);
        clickOn(faq12Lotto);
        clickOn(faq11Lotto);
        clickOn(faq10Lotto);
        clickOn(faq9Lotto);
        clickOn(faq8Lotto);
        clickOn(faq7Lotto);
        swipeDown(1);
        clickOn(faq6Lotto);
        clickOn(faq5Lotto);
        clickOn(faq4Lotto);
        clickOn(faq3Lotto);
        clickOn(faq2Lotto);
        clickOn(faq1Lotto);
    }
}
