package qa.ithuba.screens.screen_faq;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import qa.ithuba.utilities.HelperUtil;

public class ScreenFAQSportStakeCricket extends HelperUtil {


//    #################################
//    ####### QUESTIONS ###############
//    #################################

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What is SPORTSTAKE CRICKET?' or . = 'What is SPORTSTAKE CRICKET?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq1;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How does the game work?' or . = 'How does the game work?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq2;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Where and when may I purchase a SPORTSTAKE CRICKET game?' or . = 'Where and when may I purchase a SPORTSTAKE CRICKET game?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq3;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Where do I obtain the SPORTSTAKE CRICKET fixtures to select the outcomes to predict?' or . = 'Where do I obtain the SPORTSTAKE CRICKET fixtures to select the outcomes to predict?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq4;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How do I win the SPORTSTAKE CRICKET game?' or . = 'How do I win the SPORTSTAKE CRICKET game?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq5;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How do I claim my SPORTSTAKE CRICKET winnings?' or . = 'How do I claim my SPORTSTAKE CRICKET winnings?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq6;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What are the odds of winning SPORTSTAKE CRICKET?' or . = 'What are the odds of winning SPORTSTAKE CRICKET?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq7;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What happens to the jackpot prize division if there are no winners?' or . = 'What happens to the jackpot prize division if there are no winners?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq8;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How does the SPORTSTAKE CRICKET Toss work?' or . = 'How does the SPORTSTAKE CRICKET Toss work?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq9;


    public void expandAndVerifyQuestionsSportStakeCricket() {
        swipeUp(2);
        clickOn(faq9);
        clickOn(faq8);
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
